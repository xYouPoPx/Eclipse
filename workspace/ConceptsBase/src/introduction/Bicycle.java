/**
 * 
 */
package introduction;

/**
 * @author YCourteau
 *
 */
public class Bicycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    boolean isMoving = false;
  
    
    static int numGears = 6;

    void changeCadence(int nouvelleValeur) {
    	int test;
    	test = 9;
         cadence = nouvelleValeur + test;
         
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;
         
         //if(isMoving == false){
        //	 isMoving = true;
         //}
    }

/*    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
*/
    void applyBrakes() {
        // the "if" clause: bicycle must be moving
        /*if (speed > 0){
            // the "then" clause: decrease current speed
            speed--;
            isMoving = true;
            System.out.println("isMoving = " + isMoving);
            System.out.println("speed =  " + speed);
        }*/
        
        if (isMoving) {
            speed--;
        } else {
            System.err.println("The bicycle has already stopped!");
        }
       
    }
    
    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear +
             " numGears = " + numGears);
         
    }
    
}