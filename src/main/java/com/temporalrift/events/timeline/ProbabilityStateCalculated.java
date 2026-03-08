package com.temporalrift.events.timeline;

import java.util.List;
import java.util.UUID;

/**
 * Final probabilities computed for all 3 events.
 * Privacy: Filtered — only the Scan card grants a player access to exact probabilities.
 */
public record ProbabilityStateCalculated(
    UUID gameId,
    int eraNumber,
    List<EventState> eventStates
) {
    
    public record EventState(
        UUID eventId,
        List<OutcomeState> outcomes
    ) {
    }
    
    public record OutcomeState(
        UUID outcomeId,
        int probability,
        boolean isAnnihilated,
        boolean isSealed
    ) {
    }
}
