package com.intheeast.inheritance.interfaces;

public interface Mythical {

	default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
