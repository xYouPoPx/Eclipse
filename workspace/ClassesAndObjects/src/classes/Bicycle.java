package classes;

public class Bicycle {
	
	// the Bicycle class has
    // three fields
    private int cadence;
	private int gear;
    private int speed;
    
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public Bicycle(int startCadence) {
        //gear = startGear;
        cadence = startCadence;
        //speed = startSpeed;
    }
    
    public Bicycle() {
		// TODO Auto-generated constructor stub
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		int x;
		//this.speed = 9;
		this.speed = speed;
	}

	public int getCadence() {
		return cadence;
	}

	public int getGear() {
		return gear;
	}

        

    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }

}
