package revision;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ClassePrincipale {
	
	public static void Ecriture(ArrayList<?> liste){
		
		File fichier = new File("monFichier.txt");
		try {
			
			if(!fichier.exists()){
				fichier.createNewFile();
			}
			
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fichier)));
			oos.writeObject(liste);
			
			oos.close();
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static ArrayList<?> Lecture(){
		
		File fichier = new File("monFichier.txt");
		ArrayList<?> listeResultat = new ArrayList();
		
		try {
					
			ObjectInputStream oos = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fichier)));
			listeResultat = (ArrayList<?>) oos.readObject();
			
			oos.close();
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listeResultat;
		
	}

	public static void main(String[] args) {
		
		Cereale uneCereale = new Cereale();
		Cereale uneAutreCereale = new Cereale("sarrasin");
		Cereale cereale3 = new Cereale("orge");
		
		ArrayList<Cereale> listCereales = new ArrayList<Cereale>();
		
		uneCereale.setNom("riz");
		
		listCereales.add(uneCereale);
		listCereales.add(uneAutreCereale);
		listCereales.add(cereale3);
		
		Alcool monPtitVerre = new Alcool();
		Alcool unePtiteFrette = new Alcool("Sang d'Encre", "noire", 7.5, listCereales);
		
		System.out.println("iterer dans une boucle d'objets pour aller chercher un champ de l'objet");
		/*
		for(Cereale cer : listCereales){
			System.out.println(cer.getNom());
		}
		*/
		// les deux boucles sont equivalentes
		for(int i = 0; i < listCereales.size(); i++){
			System.out.println(listCereales.get(i).getNom());
		}
		
		//System.out.println(listCereales.get(2).getNom());
				
		//System.out.println("Alcool = " + monPtitVerre);
		//System.out.println("Cereale = " + uneCereale.getNom());
		//System.out.println("2e Cereale = " + uneAutreCereale.getNom());
		
		unePtiteFrette.AfficherAlcool();
		
		Ecriture(listCereales);
		
		ArrayList<Cereale> test = new ArrayList();
		
		test = (ArrayList<Cereale>)Lecture();
		
		for(int i = 0; i < test.size(); i++){
			
			System.out.println(test.get(i).getNom());
		}
		
		for(Cereale cer : test){
			System.out.println(cer.getNom());
		}
		

	}

}
