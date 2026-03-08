package com.temporalrift.events.action;

import com.temporalrift.events.shared.Faction;
import com.temporalrift.events.shared.SpecialAction;
import java.util.UUID;

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
    UUID targetPlayerId
) {
}
