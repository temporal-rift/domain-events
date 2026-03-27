package com.temporalrift.events.session;

import java.util.List;
import java.util.UUID;

/**
 * 3rd cascaded paradox triggered.
 * Privacy: Public — delivered to all players
 */
public record TimelineCollapsed(
        UUID gameId, int eraNumber, List<PlayerFactionResult> winners, List<PlayerFactionResult> losers) {

    public record PlayerFactionResult(UUID playerId, String faction) {}
}
