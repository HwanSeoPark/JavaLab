package com.intheeast.inheritance.interfaces;

public interface Flyer {

	default public String identifyMyself() {
        return "I am able to fly.";
    }
}
