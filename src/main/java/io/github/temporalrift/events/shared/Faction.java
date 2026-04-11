package io.github.temporalrift.events.shared;

import java.util.Set;

/**
 * Factions in the game with their special actions.
 * Each faction has 3 unique special actions that define their playstyle.
 */
public enum Faction {
    ERASERS(Set.of(SpecialAction.ANNIHILATE, SpecialAction.CORRUPT, SpecialAction.CASCADE)),
    PROPHETS(Set.of(SpecialAction.FORESIGHT, SpecialAction.SEAL, SpecialAction.FULFILLMENT)),
    REVISIONISTS(Set.of(SpecialAction.REWRITE, SpecialAction.MIMIC, SpecialAction.OBSCURE)),
    WEAVERS(Set.of(SpecialAction.THREAD, SpecialAction.TAPESTRY, SpecialAction.UNRAVEL)),
    ACTIVISTS(Set.of(SpecialAction.RALLY, SpecialAction.EXPOSE, SpecialAction.MOMENTUM));

    private final Set<SpecialAction> specialActions;

    Faction(Set<SpecialAction> specialActions) {
        this.specialActions = specialActions;
    }

    public Set<SpecialAction> getSpecialActions() {
        return specialActions;
    }

    public boolean hasSpecialAction(SpecialAction specialAction) {
        return specialActions.contains(specialAction);
    }
}
