package com.temporalrift.events.action;

import com.temporalrift.events.shared.CardType;
import java.util.UUID;

/**
 * Player submits a card action.
 * Privacy: Private in transit. Stored in full for resolution and Trace card purposes.
 */
public record CardPlayed(
    UUID gameId,
    int eraNumber,
    int roundNumber,
    UUID playerId,
    UUID cardInstanceId,
    CardType cardType,
    UUID targetEventId,
    UUID targetOutcomeId
) {
}
