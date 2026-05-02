# Temporal Rift Domain Events

Shared domain event contracts for Temporal Rift game services.

## Requirements

- Java 25+
- Maven 3.11+

## Usage

Add as dependency in your service's `pom.xml`:

```xml

<dependency>
    <groupId>io.github.temporal-rift</groupId>
    <artifactId>domain-events</artifactId>
    <version>1.0.7</version>
</dependency>
```

No `~/.m2/settings.xml` configuration needed — `domain-events` is published to Maven Central and resolves automatically.

## Event Packages

### `io.github.temporalrift.events.session`

| Event | Fields | Description |
|-------|--------|-------------|
| `LobbyCreated` | `lobbyId`, `hostPlayerId`, `createdAt` | Lobby opened by host |
| `PlayerJoinedLobby` | `lobbyId`, `playerId`, `playerName` | Player joined lobby |
| `PlayerLeftLobby` | `lobbyId`, `playerId` | Player left lobby before start |
| `HostTransferred` | `lobbyId`, `oldHostId`, `newHostId` | Host left, host transferred |
| `LobbyClosed` | `lobbyId`, `gameId` | Lobby closed (all players left) |
| `FactionAssigned` | `gameId`, `playerId`, `faction` | Faction assigned at game start |
| `FactionsDrawn` | `gameId`, `lobbyId`, `factionNames` | All factions assigned |
| `GameStarted` | `gameId`, `lobbyId`, `playerIds`, `playerCount`, `deckSize` | Game started |
| `GameStartCancelled` | `gameId`, `lobbyId` | Start cancelled (player disconnected) |
| `GameStartFailed` | `gameId`, `lobbyId`, `reason` | Start failed with error |
| `EraStarted` | `gameId`, `eraNumber`, `cascadedEventIds`, `playerIds` | Era began |
| `EraEnded` | `gameId`, `eraNumber` | Era ended normally |
| `EraFailed` | `gameId`, `eraNumber`, `reason` | Era ended abnormally |
| `FactionRevealed` | `gameId`, `assignments` | Factions revealed at game end |
| `GameEnded` | `gameId`, `triggerType`, `finalScores` | Game ended normally |
| `GameEndedAbnormally` | `gameId`, `reason` | Game ended abnormally |
| `TimelineCollapsed` | `gameId`, `eraNumber`, `winners`, `losers` | Timeline collapsed |
| `TimelineStabilized` | `gameId`, `eraNumber` | Timeline stabilized |
| `WinConditionMet` | `gameId`, `eraNumber`, `winnerIds` | Win condition reached |
| `PlayerDisconnected` | `gameId`, `playerId` | Player WebSocket disconnected during active game |
| `PlayerAbandoned` | `gameId`, `playerId` | Grace timer expired; player auto-skipped |

## Publishing

Pushing to `main` triggers GitHub Actions automatically. Publishing only occurs when the version in `pom.xml` has
changed and is not yet present in Maven Central. A git tag is created for each published version.

For manual publishing (requires `SONATYPE_USERNAME`/`SONATYPE_PASSWORD` and a GPG key in `~/.m2/settings.xml`):

```bash
mvn clean deploy -Pcentral
```
