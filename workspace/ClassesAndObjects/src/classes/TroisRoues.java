package classes;

public class TroisRoues extends MountainBike {

	public String typeSiege = "banane";

	public TroisRoues(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startHeight, startCadence, startSpeed, startGear);
		// TODO Auto-generated constructor stub
	}
	

	public String getTypeSiege() {
		return typeSiege;
	}


	public void setTypeSiege(String typeSiege) {
		this.typeSiege = typeSiege;
	}
	
	public void setTypeSiege(char typeSiege){
		
		this.typeSiege = "";
	}
	
	public void setHeight(int newValue) {
        seatHeight = newValue + 5;
    } 
	
	public void setHeight(){
		
	}


	public static void main(String[] args) {
	

	}

}
