package io.github.temporalrift.events.session;

import java.util.UUID;

/**
 * Emitted when a player's WebSocket disconnects during an active game. Notifies all remaining
 * players. A grace timer starts immediately after this event — see {@code PlayerReconnectSaga}.
 */
public record PlayerDisconnected(UUID gameId, UUID playerId) {}
