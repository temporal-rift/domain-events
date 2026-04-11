package io.github.temporalrift.events.session;

import java.util.UUID;

/**
 * A faction secretly assigned to a specific player.
 * Privacy: Private — delivered only to the assigned player
 */
public record FactionAssigned(UUID gameId, UUID playerId, String faction) {}
