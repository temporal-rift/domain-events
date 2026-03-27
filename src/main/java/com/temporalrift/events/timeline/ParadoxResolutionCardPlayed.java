package com.temporalrift.events.timeline;

import java.util.UUID;

import com.temporalrift.events.shared.CardType;

/**
 * Player submits their single resolution card.
 * Privacy: Private — stored in full for resolution purposes.
 */
public record ParadoxResolutionCardPlayed(
        UUID gameId,
        int eraNumber,
        UUID playerId,
        UUID cardInstanceId,
        CardType cardType,
        UUID targetEventId,
        UUID targetOutcomeId) {}
