package boucles;

public class MesTestsBoucle {

	public static void main(String[] args) {
		
		int[] tableaui = new int[10];
		int[] tableauj = new int[5];
		
		int[][] tableauii = new int[10][5];
		
		/*for(int i = 0; i < tableaui.length; i++){
			tableaui[i] = i;
			System.out.println(tableaui[i]);
		}*/
		
		for(int j = 0; j < tableauj.length; j++){
			tableauj[j] = j + 100;
			System.out.println(tableauj[j]);
		}
		
		for(int i = 0; i < tableauii.length; i++){
			
			System.out.println("------------ i = " + i);
			tableauii[i] = tableauj;
			System.out.println("tableauii[i] = " + tableauii[i]);
			
			for(int j = 0; j < tableauii[i].length; j++){
				
				tableauii[i][j] = i * 100 + j;
				System.out.println("---- j = " + j);
				System.out.println("tableauii[i][j] = " + tableauii[i][j]);
			}
		}


	}

}
