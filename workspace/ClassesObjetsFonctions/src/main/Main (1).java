package main;

import librairie.ClasseFinale;
import librairie.MaClasse;
import librairie.MonObjet;

public class Main {

	public static void main(String[] args) {
		
		MaClasse.uneFonction();
		int test = MaClasse.uneVariable;
		
		MaClasse.uneVariable = 200;
				
		int test2 = MaClasse.uneVariable;
		double test3 = Math.PI;
		test3 = Math.random();
		int test4 = MaClasse.constante;
		//MaClasse.constante = 2; //modification impossible car constante
		
		MonObjet obj1 = new MonObjet();
		obj1.id = 200;
		obj1.compteur++;// += 1; //obj1.compteur = obj1.compteur +1
		//obj1.constante = 1;//modification impossible car constante
		int test5 = obj1.constante;
		
		MonObjet obj2 = new MonObjet();
		obj2.id = 300;
		obj2.compteur++;
		
		ClasseFinale obj3 = new ClasseFinale();
		//System.out.println(obj3.constante2);
		
		ClasseFinale obj4 = new ClasseFinale(9);
		//System.out.println(obj4.constante2);
		
		obj1.fontionDeux(9, 10);

	}

}
