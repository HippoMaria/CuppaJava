import java.util.Arrays

public class RedAstronaut extends Player implements Imposter{

	private String skill;

	public static final int defaultSusLevel=15;
    public static final String defaultSkill="experienced";

	
	public RedAstronaut(String name) { // A constructor that takes in no parameters
        this(name, defaultSusLevel, defaultSkill); 
    }

	public RedAstronaut(String name, int susLevel, String skill){
    	super(name, susLevel); // "superclass" inherits the constructor method from the parent class
    	this.skill=skill;
	}

	public void emergencyMeeting(){

	}

}