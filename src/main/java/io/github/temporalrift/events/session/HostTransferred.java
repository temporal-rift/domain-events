package io.github.temporalrift.events.session;

import java.util.UUID;

/**
 * The host role was transferred to another player in the lobby.
 * Emitted when the host leaves a lobby that still has other players — always followed
 * by {@link PlayerLeftLobby} for the previous host in the same transaction.
 * Privacy: Public — delivered to all players in the lobby
 */
public record HostTransferred(UUID lobbyId, UUID previousHostId, UUID newHostId) {}
