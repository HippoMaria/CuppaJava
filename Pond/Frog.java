public class Frog{

    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet = true;
    private static String species = "Rare Pepe";

    public static final int defaultAge=5;
    public static final double defaultTongueSpeed=5;

    public Frog(String initName) { // A constructor that takes in just a name
        this(initName, defaultAge, defaultTongueSpeed);
        if (age >= 7) {
            isFroglet = false;
        }
        }

    public Frog(String initName, double ageInYears, double initTongueSpeed) { 
        name = initName;
        age = (int) ageInYears*12;
        tongueSpeed=initTongueSpeed;
        if (age >= 7) {
            isFroglet = false;
        }
        }


    public Frog(String initName, int initAge, double initTongueSpeed) { // A constructor that takes name, age, and tongueSpeed 
        name = initName;
        age = initAge;
        tongueSpeed=initTongueSpeed;
        if (age >= 7) {
            isFroglet = false;
        }
        }

    public void grow(int addedMonth){
        age = age + addedMonth;
        if (age <= 12) {
            tongueSpeed = tongueSpeed + addedMonth;
        } else if (age > 12 && (age-addedMonth)<=12 ) {
            tongueSpeed = tongueSpeed + (12-(age-addedMonth));
        } else if (age >= 30 && tongueSpeed > 5 ) {
            tongueSpeed = tongueSpeed - (age-30);
            if(tongueSpeed <= 5 ) {
            tongueSpeed = 5;
            }
        }

        if (age >= 7) {
            isFroglet = false;
        }
    }

    public void grow(){
        age = age + 1;
        if (age < 12) {
            tongueSpeed = tongueSpeed + 1;
        } else if (age >= 30 & tongueSpeed > 5 ) {
            tongueSpeed = tongueSpeed - 1;
        } else if (age >= 30 & tongueSpeed <= 5 ) {
            tongueSpeed = 5;
        }

        if (age >= 7) {
            isFroglet = false;
        }
    }

    
    public void eat(Fly aFly){
        double flyMass = aFly.getMass();
        double flySpeed = aFly.getSpeed();
        
        if(aFly.isDead() == false){
            if(tongueSpeed > flySpeed && flyMass >=0.5*age){
                grow();
                aFly.setMass(0);
            }else{
                aFly.grow(1);
            }
        } 

    }
    

    public String toString(){
        if (isFroglet==true){
            return "My name is "+ name +" and I’m a rare froglet! I’m " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
        } else{
            return "My name is "+ name +" and I’m a rare frog. I’m " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
        }
    }

    public static String getSpecies() {
        return Frog.species;
        }
    public static void setSpecies(String species) {
        Frog.species = species;
        }

}