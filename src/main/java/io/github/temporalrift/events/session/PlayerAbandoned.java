package io.github.temporalrift.events.session;

import java.util.UUID;

/**
 * Emitted when the reconnect grace timer expires and the player has not reconnected. The player is
 * auto-skipped for all remaining action rounds. If this was the last remaining player, {@code
 * GameEndSaga} is triggered.
 */
public record PlayerAbandoned(UUID gameId, UUID playerId) {}
