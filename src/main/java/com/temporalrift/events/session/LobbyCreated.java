package com.temporalrift.events.session;

import java.time.Instant;
import java.util.UUID;

/**
 * A player creates a lobby.
 * Privacy: Public — delivered to all players
 */
public record LobbyCreated(UUID lobbyId, UUID hostPlayerId, Instant createdAt) {}
