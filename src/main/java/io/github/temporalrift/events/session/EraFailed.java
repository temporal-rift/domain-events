package io.github.temporalrift.events.session;

import java.util.UUID;

/**
 * An era could not complete due to a resolution failure.
 * Privacy: Public — delivered to all players
 */
public record EraFailed(UUID gameId, int eraNumber, String reason) {}
