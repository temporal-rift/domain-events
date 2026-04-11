package io.github.temporalrift.events.action;

import java.util.UUID;

/**
 * All players submitted or timer expired.
 * Privacy: Public — delivered to all players
 */
public record ActionRoundClosed(UUID gameId, int eraNumber, int roundNumber, String closedReason, int totalActions) {}
