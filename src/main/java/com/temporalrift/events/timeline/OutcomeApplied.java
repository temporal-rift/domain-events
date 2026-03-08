package com.temporalrift.events.timeline;

import java.util.List;
import java.util.UUID;

/**
 * Winning outcome recorded for each event.
 * Privacy: Public — delivered to all players
 */
public record OutcomeApplied(
    UUID gameId,
    int eraNumber,
    UUID eventId,
    UUID winningOutcomeId,
    List<ProbabilityState> finalProbabilities
) {
    
    public record ProbabilityState(
        UUID outcomeId,
        int probability
    ) {
    }
}
