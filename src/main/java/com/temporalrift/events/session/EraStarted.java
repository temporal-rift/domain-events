package com.temporalrift.events.session;

import java.util.List;
import java.util.UUID;

/**
 * Era N begins.
 * Privacy: Public — delivered to all players
 */
public record EraStarted(
    UUID gameId,
    int eraNumber,
    List<UUID> cascadedEventIds
) {
}
