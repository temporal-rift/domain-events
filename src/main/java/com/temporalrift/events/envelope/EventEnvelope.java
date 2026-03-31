package com.temporalrift.events.envelope;

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
     */
    public static EventEnvelope create(
            String eventType, UUID aggregateId, String aggregateType, UUID gameId, int version, Object payload) {
        return new EventEnvelope(
                UUID.randomUUID(), eventType, aggregateId, aggregateType, gameId, Instant.now(), version, payload);
    }
}
