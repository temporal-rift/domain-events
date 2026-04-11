package io.github.temporalrift.events.action;

import java.util.List;
import java.util.UUID;

/**
 * Round opens, timer starts.
 * Privacy: Public — delivered to all players
 */
public record ActionRoundStarted(
        UUID gameId, int eraNumber, int roundNumber, int timerSeconds, List<UUID> pendingPlayerIds) {}
