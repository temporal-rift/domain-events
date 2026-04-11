package io.github.temporalrift.events.action;

import java.util.List;
import java.util.UUID;

/**
 * 3 future events drawn from deck for this era.
 * Privacy: Public — delivered to all players
 */
public record EventsDrawn(UUID gameId, int eraNumber, List<FutureEvent> events) {

    public record FutureEvent(UUID eventId, String title, List<Outcome> outcomes, boolean isCascaded) {}

    public record Outcome(UUID outcomeId, String description, int initialProbability) {}
}
