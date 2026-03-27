package com.temporalrift.events.timeline;

import java.util.List;
import java.util.UUID;

import com.temporalrift.events.shared.ParadoxType;

/**
 * One or more paradox conditions found.
 * Privacy: Public — delivered to all players
 */
public record ParadoxDetected(UUID gameId, int eraNumber, List<Paradox> paradoxes) {

    public record Paradox(
            UUID paradoxId,
            ParadoxType type,
            UUID affectedEventId,
            List<UUID> affectedOutcomeIds,
            String description) {}
}
