package com.temporalrift.events.timeline;

import java.util.List;
import java.util.UUID;

/**
 * Weaver chain reaches 3 connected events.
 * Privacy: Public — delivered to all players
 */
public record ChainCompleted(UUID gameId, UUID chainId, UUID playerId, List<ChainLink> links) {

    public record ChainLink(UUID eventId, UUID outcomeId, int eraNumber) {}
}
