package com.jumia.exercise.constants;


/**
 * This enum encapsulates the various statuses of a given employee.
 * 
 * @author Ahmed Hisham
 *
 */
public enum State {
	VALID("VALID"), INVALID("INVALID");
	
	private final String statucDescription;

    private State(String value) {
    	statucDescription = value;
    }

    public String getFieldDescription() {
        return statucDescription;
    }

}
