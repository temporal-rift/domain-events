package com.temporalrift.events.action;

import com.temporalrift.events.shared.CardType;
import java.util.List;
import java.util.UUID;

/**
 * Each player receives 5 cards.
 * Privacy: Private — delivered only to the receiving player
 */
public record HandDealt(
    UUID gameId,
    int eraNumber,
    UUID playerId,
    List<CardInstance> cards
) {
    
    public record CardInstance(
        UUID cardInstanceId,
        CardType cardType
    ) {
    }
}
