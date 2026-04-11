package io.github.temporalrift.events.action;

import java.util.UUID;

import io.github.temporalrift.events.shared.Faction;
import io.github.temporalrift.events.shared.SpecialAction;

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
