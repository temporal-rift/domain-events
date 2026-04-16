package io.github.temporalrift.events.session;

import java.util.UUID;

/**
 * The lobby was disbanded before the game started.
 * Emitted either explicitly via a CloseLobby command or implicitly when the host
 * leaves as the sole remaining player.
 * Privacy: Public — delivered to all players
 */
public record LobbyClosed(UUID lobbyId, UUID gameId) {}
