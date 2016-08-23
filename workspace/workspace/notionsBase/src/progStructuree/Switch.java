/**
 * 
 */
package progStructuree;

/**
 * @author ycourteau
 *
 */
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mois = 4;
		String moisLong = "";

		System.out.println("mois = " + mois);
		/*
		 * if (mois == 1) { moisLong = "Janvier"; } else if (mois == 2) {
		 * moisLong = "Fevrier"; } else if (mois == 3) { moisLong = "Mars"; }
		 * else { moisLong = "invalide"; }
		 */
		switch (mois) {

			case 1:
				moisLong = "Janvier";
				break;
			case 2:
				moisLong = "Fevrier";
				break;
			case 3:
				moisLong = "Mars";
				break;
			case 4:
				moisLong = "Avril";
				// break;
			case 5:
				moisLong = "Mai";
				// break;
			case 6:
				moisLong = "Juin";
				break;
			case 7:
				moisLong = "Juillet";
				break;
			default:
				moisLong = "invalide";
				break;
		}

		System.out.println("moisLong = " + moisLong);

		// serait penible de faire tous les cas de 0 a 100 pour verifier des
		// plages de valeurs
		// le if-else est plus approprie car il permet de verifier des plages
		// completes de valeurs
		// par contre on peut regrouper plusieurs cas ensemble avec le
		// fallthrough - cascade
		int note = 94;
		char cote;
		// cote = ' ';

		switch (note) {
			case 100:
			case 99:
			case 98:
			case 97:
			case 95:
				cote = 'A';
				break;
			default:
				cote = ' ';
				break;
		}

		System.out.println("note = " + note + " cote = " + cote);

		int month = 2;
		int year = 2016;
		int numDays = 0;

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDays = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numDays = 30;
				break;
			case 2:
				if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
					numDays = 29;
				} else {
					numDays = 28;
				}
				break;
			default:
				System.out.println("Invalid month.");
				break;
		}
		System.out.println("Number of Days = " + numDays);
		
		
		int monthNumber = 0;
		String strMonth = "january";


        switch (strMonth.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default: 
                monthNumber = 0;
                break;
        }
        
        System.out.println(strMonth);
        System.out.println(monthNumber);

	}

}
