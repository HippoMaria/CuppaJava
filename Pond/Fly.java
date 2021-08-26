public class Fly{

    private double mass;
    private double speed;
    
    public static final double defaultMass=5;
    public static final double defaultSpeed=10;


    public Fly() { // A constructor that takes in no parameters
        this(defaultMass, defaultSpeed);
        }

    public Fly(double initMass) { // A constructor that takes in only mass
        this(initMass, defaultSpeed); 
        }


    public Fly(double initMass, double initSpeed) { // A constructor that takes in mass and speed of a Fly
        mass = initMass;
        speed = initSpeed;
        }

    public double getMass() { 
        return mass;
        }    

    public double getSpeed() { 
        return speed;
        }    

    public void setMass(double newMass){
        mass = newMass;
        }

    public void setSpeed(double newSpeed){
        speed = newSpeed;
        }

    public String toString(){
        if (mass==0){
            return "I’m dead, but I used to be a fly with a speed of " + speed +".";
        } else{
            return "I’m a speedy fly with " + speed + " speed and " + mass + " mass.";
        }
    }


    public void grow(int addedMass){
        mass = mass + addedMass;
        if (mass < 20) {
            speed = speed + addedMass;
        } else if (mass >= 20 && addedMass>0){
            speed = speed - 0.5*(mass-20);
        }
    }

    public boolean isDead(){
        if (mass==0){
            return true;
        } else{
            return false;
        }
    }
}