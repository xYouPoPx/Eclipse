package boucles;

public class ForDemo {

	public static void main(String[] args) {

		//int i;
		//int[] nbr = {1,2,3,4,5,6,7,8,9,10};
		int[][] nbr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		String[] str = {"adsf", "gfhs", "rgteyt"};
				
		//nbr[2] = 9;
		//str[0] = "bonjour";
		
		System.out.println("nbr[2] = " + nbr[2]);
		System.out.println("str[0] = " + str[0]);
		
		/*for(int i = 0; i <=  9; i++){
			
			System.out.println("nbr[" + i + "] = " + nbr[i] );
		}*/
		
		System.out.println(nbr.length);
		
		for(int i = 0; i <  nbr.length; i++){
			
			for(int j = 0; j < nbr[0].length; j++){
				System.out.println("nbr[" + i + "][ " + j + "] = " + nbr[i][j] );
			}
			
			//System.out.println("nbr[" + i + "] = " + nbr[i] );
		}
		
		/*for(int item : nbr){
			System.out.println("item = " + item );
		}*/
		
		/*for(i = 1; i < 11; i++){
            System.out.println("Count i is: " + i);
       }*/
		
		/*for(i = 0 ; i < 11 ; ){
			System.out.println("Count i is: " + i);
		}*/
		
		/*for(int j = 0; j < 25; j = j + 6){
			System.out.println("Count j is: " + j);
		}*/
		
		//System.out.println("Et maintenant: " + i);
	}

}
