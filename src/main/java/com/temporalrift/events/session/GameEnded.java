package com.temporalrift.events.session;

import java.util.List;
import java.util.UUID;

/**
 * Game over, final state recorded.
 * Privacy: Public — delivered to all players
 */
public record GameEnded(UUID gameId, String endReason, List<PlayerScoreResult> finalScores) {

    public record PlayerScoreResult(UUID playerId, String faction, int score) {}
}
