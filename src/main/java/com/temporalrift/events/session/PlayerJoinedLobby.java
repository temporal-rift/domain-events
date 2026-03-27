package com.temporalrift.events.session;

import java.util.UUID;

/**
 * A player joins an existing lobby.
 * Privacy: Public — delivered to all players
 */
public record PlayerJoinedLobby(UUID lobbyId, UUID playerId, String playerName) {}
