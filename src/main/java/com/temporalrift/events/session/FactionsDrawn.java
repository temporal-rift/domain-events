package com.temporalrift.events.session;

import java.util.List;
import java.util.UUID;

/**
 * N factions randomly selected for this game.
 * Privacy: Public — delivered to all players
 */
public record FactionsDrawn(UUID gameId, UUID lobbyId, List<String> factions) {}
