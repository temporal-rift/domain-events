package com.temporalrift.events.action;

import java.util.UUID;

import com.temporalrift.events.shared.Faction;
import com.temporalrift.events.shared.SpecialAction;

/**
 * Player submits a faction special.
 * Privacy: Private in transit.
 */
public record SpecialActionPlayed(
        UUID gameId,
        int eraNumber,
        int roundNumber,
        UUID playerId,
        Faction faction,
        SpecialAction specialAction,
        UUID targetEventId,
        UUID targetOutcomeId,
        UUID targetPlayerId) {}
