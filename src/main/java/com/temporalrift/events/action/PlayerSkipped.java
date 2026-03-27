package com.temporalrift.events.action;

import java.util.UUID;

/**
 * Player auto-skipped after timer expiry.
 * Privacy: Public — delivered to all players
 */
public record PlayerSkipped(UUID gameId, int eraNumber, int roundNumber, UUID playerId, String reason) {}
