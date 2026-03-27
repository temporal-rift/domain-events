package com.temporalrift.events.timeline;

import java.util.List;
import java.util.UUID;

/**
 * Paradox persisted, event carries forward to next era.
 * Privacy: Public — delivered to all players
 */
public record ParadoxCascaded(
        UUID gameId,
        int eraNumber,
        UUID paradoxId,
        UUID affectedEventId,
        List<ProbabilityState> carryForwardProbabilityState) {

    public record ProbabilityState(UUID outcomeId, int probability) {}
}
