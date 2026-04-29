package io.github.temporalrift.events.session;

import java.util.UUID;

/**
 * Game ended due to an abnormal condition (deck exhausted, resolution failure, all players abandoned).
 * Privacy: Public — delivered to all players
 */
public record GameEndedAbnormally(UUID gameId, String reason) {}
