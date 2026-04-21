package io.github.temporalrift.events.session;

import java.util.UUID;

/**
 * Faction assignment failed midway — all assignments rolled back, lobby returns to WAITING.
 * Privacy: Public — delivered to all players
 */
public record GameStartFailed(UUID gameId, UUID lobbyId, String reason) {}
