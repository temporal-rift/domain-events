package com.temporalrift.events.action;

import java.util.List;
import java.util.UUID;

/**
 * Timer ran out before all players submitted.
 * Privacy: Public — delivered to all players
 */
public record ActionRoundTimerExpired(
    UUID gameId,
    int eraNumber,
    int roundNumber,
    List<UUID> missingPlayerIds
) {
}
