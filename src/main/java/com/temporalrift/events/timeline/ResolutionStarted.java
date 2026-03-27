package com.temporalrift.events.timeline;

import java.util.UUID;

/**
 * All 3 rounds complete, resolution begins.
 * Privacy: Public — delivered to all players
 */
public record ResolutionStarted(UUID gameId, int eraNumber) {}
