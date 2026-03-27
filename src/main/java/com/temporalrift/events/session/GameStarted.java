package com.temporalrift.events.session;

import java.util.List;
import java.util.UUID;

/**
 * Host starts the game, no more joins.
 * Privacy: Public — delivered to all players
 */
public record GameStarted(UUID gameId, UUID lobbyId, List<UUID> playerIds, int totalFactions, int deckSize) {}
