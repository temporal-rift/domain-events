package io.github.temporalrift.events.envelope;

import java.time.Instant;
import java.util.UUID;

/**
 * Envelope that wraps all domain events in the system.
 * Provides consistent metadata for event processing, routing, and idempotency.
 *
 * @param eventId       Unique identifier for this event instance. Used for idempotency.
 * @param eventType     Fully qualified event name e.g. "session.GameStarted"
 * @param aggregateId   ID of the aggregate that produced this event
 * @param aggregateType Type of aggregate e.g. "Lobby", "FutureEvent"
 * @param gameId        Always present — used as Kafka partition key to guarantee ordering within a game
 * @param occurredAt    ISO-8601 timestamp of when the event occurred
 * @param version       Schema version for this event type. Consumers must handle unknown versions gracefully.
 * @param payload       Event-specific data — defined per event type
 */
public record EventEnvelope(
        UUID eventId,
        String eventType,
        UUID aggregateId,
        String aggregateType,
        UUID gameId,
        Instant occurredAt,
        int version,
        Object payload) {

    /**
     * Creates a new event envelope with the current timestamp.
     * The event type is derived from the payload class using the convention
     * "{package-last-segment}.{ClassName}" — e.g. a payload of type
     * {@code io.github.temporalrift.events.session.LobbyCreated} yields {@code "session.LobbyCreated"}.
     */
    public static EventEnvelope create(
            UUID aggregateId, String aggregateType, UUID gameId, int version, Object payload) {
        return new EventEnvelope(
                UUID.randomUUID(),
                deriveEventType(payload),
                aggregateId,
                aggregateType,
                gameId,
                Instant.now(),
                version,
                payload);
    }

    private static String deriveEventType(Object payload) {
        var pkg = payload.getClass().getPackageName();
        return pkg.substring(pkg.lastIndexOf('.') + 1) + "."
                + payload.getClass().getSimpleName();
    }
}
