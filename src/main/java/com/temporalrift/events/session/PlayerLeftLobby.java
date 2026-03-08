package com.temporalrift.events.session;

import java.util.UUID;

/**
 * A player leaves before game starts.
 * Privacy: Public — delivered to all players
 */
public record PlayerLeftLobby(
    UUID lobbyId,
    UUID playerId
) {
}
