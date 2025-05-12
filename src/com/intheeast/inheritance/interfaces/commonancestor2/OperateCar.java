package com.intheeast.inheritance.interfaces.commonancestor2;

public interface OperateCar {

	// ...
    default public int startEngine() {
        // Implementation
    	return 0;
    }
}
