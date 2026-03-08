package com.temporalrift.events.shared;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Valid card types in the game.
 * Grouped by functional category as defined in the GDD.
 */
public enum CardType {
    
    // PROBABILITY_SHIFTER
    PUSH(CardCategory.PROBABILITY_SHIFTER),
    SUPPRESS(CardCategory.PROBABILITY_SHIFTER),
    SWING(CardCategory.PROBABILITY_SHIFTER),
    AMPLIFY(CardCategory.PROBABILITY_SHIFTER),
    
    // INFORMATION
    INTERCEPT(CardCategory.INFORMATION),
    SCAN(CardCategory.INFORMATION),
    TRACE(CardCategory.INFORMATION),
    DECOY(CardCategory.INFORMATION),
    
    // DISRUPTION
    JAM(CardCategory.DISRUPTION),
    STALL(CardCategory.DISRUPTION),
    REDIRECT(CardCategory.DISRUPTION),
    NULLIFY(CardCategory.DISRUPTION),
    
    // PARADOX
    COLLIDE(CardCategory.PARADOX),
    STABILIZE(CardCategory.PARADOX),
    DETONATE(CardCategory.PARADOX);
    
    private final CardCategory category;
    
    CardType(CardCategory category) {
        this.category = category;
    }
    
    public CardCategory getCategory() {
        return category;
    }
    
    public static Set<CardType> byCategory(CardCategory category) {
        return Arrays.stream(values())
                .filter(c -> c.category == category)
                .collect(Collectors.toUnmodifiableSet());
    }
}
