/**
 * 
 */
package classes;

/**
 * @author ycourteau
 *
 */
public class MaClasse {
	
	public int monChampPublic;
	private int monChampPrive;
	
	// constructeur par defaut, existe meme si on ne le specifie pas
	public MaClasse(){
		System.out.println("MaClasse()");
		monChampPrive = 10;
		monChampPublic = 15;
	}
	
	public MaClasse(int monChampPrive){
		this.monChampPrive = monChampPrive;
		System.out.println("MaClasse(int champAAffecter)");
	}
	
	public int multiplier(){
		//int a = 3;
		//int b = 5;
		//int total = a * b;
		int total = multiplierPriver();
		return total;
	}
	
	private int multiplierPriver(){
		int a = 10;
		int b = 5;
		int total = a * b;
		
		return total;
		
	}
	
	public int multiplierAvecParam(int a, int b){
		
		return a * b;
	}
	
	public double multiplierAvecParam(double a, double b){
		
		double test = a * b;
		return test;
	}
	
	public double multiplierAvecParam(double a, int b){
		
		double test = a * 10;
		return test;
	}
	
	public void mutiplierSansRetour(int a, int b){
		monChampPrive = a * b;
		System.out.println("public void mutiplierSansRetour(int a, int b)");
	}
	

}
