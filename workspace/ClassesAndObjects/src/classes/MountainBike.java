package classes;

public class MountainBike  extends Bicycle {
	
	 // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence,startSpeed, startGear);
        seatHeight = startHeight;
    } 
    
    public MountainBike(){

    }

        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    
    public void setHeight(){
    	seatHeight = 10;
    }

}
