package io.github.temporalrift.events.action;

import java.util.List;
import java.util.UUID;

import io.github.temporalrift.events.shared.CardType;

/**
 * Each player receives 5 cards.
 * Privacy: Private — delivered only to the receiving player
 */
public record HandDealt(UUID gameId, int eraNumber, UUID playerId, List<CardInstance> cards) {

    public record CardInstance(UUID cardInstanceId, CardType cardType) {}
}
