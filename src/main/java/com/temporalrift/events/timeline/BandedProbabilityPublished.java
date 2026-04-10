package com.temporalrift.events.timeline;

import java.util.List;
import java.util.UUID;

/**
 * Low/Medium/High probability bands for all outcomes, published to all players after Action Round 2 closes.
 * Bands are derived from cumulative probability state of Rounds 1 and 2.
 * Privacy: Public — delivered to all players. Exact values remain private (Scan card only).
 */
public record BandedProbabilityPublished(UUID gameId, int eraNumber, List<EventBandState> eventStates) {

    public record EventBandState(UUID eventId, List<OutcomeBandState> outcomes) {}

    public record OutcomeBandState(UUID outcomeId, ProbabilityBand band) {}

    public enum ProbabilityBand {
        /** 0–30% probability */
        LOW,
        /** 31–60% probability */
        MEDIUM,
        /** 61–90% probability */
        HIGH
    }
}