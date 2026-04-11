package io.github.temporalrift.events.shared;

/**
 * Paradox types in the game.
 * Occurs when contradictory conditions exist on the same event at resolution time.
 */
public enum ParadoxType {
    DEAD_HEAT,
    IMPOSSIBLE_ERASURE,
    CHAIN_CONFLICT,
    SEAL_BREACH
}
