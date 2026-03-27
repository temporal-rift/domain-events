package com.temporalrift.events.action;

import java.util.List;
import java.util.UUID;

/**
 * Action types (no targets) published to all players.
 * Privacy: Public — delivered to all players
 */
public record RoundSummaryPublished(UUID gameId, int eraNumber, int roundNumber, List<ActionSummary> actionSummaries) {

    public record ActionSummary(UUID playerId, String actionCategory, String actionFamily, boolean skipped) {}
}
