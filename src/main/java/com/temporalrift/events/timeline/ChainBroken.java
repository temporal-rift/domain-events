package com.temporalrift.events.timeline;

import java.util.UUID;

/**
 * Another player Unravels a Weaver chain.
 * Privacy: Public — delivered to all players
 */
public record ChainBroken(
    UUID gameId,
    UUID chainId,
    UUID brokenByPlayerId,
    UUID targetPlayerId,
    int chainLengthAtBreak
) {
}
