package com.temporalrift.events.timeline;

import java.util.UUID;

/**
 * Weaver successfully threads a causal link.
 * Privacy: Public — delivered to all players
 */
public record ChainLinkAdded(
    UUID gameId,
    UUID chainId,
    UUID playerId,
    UUID linkedEventId,
    UUID linkedOutcomeId,
    int chainLength,
    UUID previousLinkEventId
) {
}
