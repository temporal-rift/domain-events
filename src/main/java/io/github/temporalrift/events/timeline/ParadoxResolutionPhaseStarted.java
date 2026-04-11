package io.github.temporalrift.events.timeline;

import java.util.List;
import java.util.UUID;

/**
 * Paradox exists, resolution phase opens.
 * Privacy: Public — delivered to all players
 */
public record ParadoxResolutionPhaseStarted(UUID gameId, int eraNumber, List<UUID> paradoxIds, int timerSeconds) {}
