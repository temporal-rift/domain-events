package com.temporalrift.events.session;

import java.util.UUID;

/**
 * A player reached 20 points. Privacy: Public — delivered to all players
 */
public record WinConditionMet(UUID gameId, UUID winnerId, String faction, int finalScore, String winType) {}
