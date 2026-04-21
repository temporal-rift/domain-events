package io.github.temporalrift.events.session;

import java.util.UUID;

/**
 * A player disconnected during game start steps 1–5 — start cancelled, lobby returns to WAITING.
 * Privacy: Public — delivered to all players
 */
public record GameStartCancelled(UUID gameId, UUID lobbyId) {}
