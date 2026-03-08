package com.temporalrift.events.session;

import java.util.List;
import java.util.UUID;

/**
 * 5th era ended with no winner.
 * Privacy: Public — delivered to all players
 */
public record TimelineStabilized(
    UUID gameId,
    List<PlayerFactionResult> winners,
    List<PlayerFactionResult> losers
) {
    
    public record PlayerFactionResult(
        UUID playerId,
        String faction,
        Integer activeChainLength
    ) {
    }
}
