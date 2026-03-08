package com.temporalrift.events.session;

import java.util.List;
import java.util.UUID;

/**
 * All factions revealed to all players at game end.
 * Privacy: Public — delivered to all players
 */
public record FactionRevealed(
    UUID gameId,
    List<PlayerFactionResult> reveals
) {
    
    public record PlayerFactionResult(
        UUID playerId,
        String faction
    ) {
    }
}
