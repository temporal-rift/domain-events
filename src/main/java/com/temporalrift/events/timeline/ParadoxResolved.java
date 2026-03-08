package com.temporalrift.events.timeline;

import java.util.UUID;

/**
 * Paradox cleared after resolution phase.
 * Privacy: Public — delivered to all players
 */
public record ParadoxResolved(
    UUID gameId,
    int eraNumber,
    UUID paradoxId,
    UUID resolvedByPlayerId
) {
}
