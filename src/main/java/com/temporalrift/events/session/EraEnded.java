package com.temporalrift.events.session;

import java.util.UUID;

/**
 * Era closes, win conditions checked. Privacy: Public — delivered to all
 * players
 */
public record EraEnded(
        UUID gameId,
        int eraNumber,
        int cascadedParadoxCount,
        int nextEraNumber
        ) {

}
