package io.github.temporalrift.events.scoring;

import java.util.List;
import java.util.UUID;

import io.github.temporalrift.events.shared.Faction;

/**
 * All faction scoring rules evaluated and points applied.
 * Privacy: Public — delivered to all players
 */
public record ScoresUpdated(UUID gameId, int eraNumber, List<ScoreUpdate> updates) {

    public record ScoreUpdate(UUID playerId, Faction faction, int pointsDelta, String reason, int newTotal) {}
}
