package classes;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle bike = new Bicycle();
		bike.setCadence(5);
		bike.setSpeed(10);
		
		MountainBike mBike = new MountainBike(1, 2, 3, 4);
		//mBike.setCadence(1);
		
		MountainBike mBike2 = new MountainBike();
		
		int vitesse = mBike.getSpeed();
		
		mBike.setSpeed(10);
		
		vitesse = mBike.getSpeed();
		
		//MountainBike mBike2 = new MountainBike(5, 6, 7, 8);
		
		TroisRoues tr = new TroisRoues(9, 10, 11, 12);
		
		tr.setHeight(1);
		
		Bicycle monGrosBike;
		
		monGrosBike = new Bicycle();
		monGrosBike.setCadence(100);
		
		monGrosBike = new Bicycle();
		
		//System.out.println(mBike.cadence);
		//System.out.println(mBike.speed);
		//System.out.println(mBike.cadence + " " + mBike.speed);
	}

}
