package main.sdd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		listeEtudiantHash ListeEtudiant1 = new listeEtudiantHash();
		
		for (int i=0; i< 100; i++) {
			Etudiant tmp = new Etudiant(i,"Je suis l'objet"+i, 3.14);
			ListeEtudiant1.ListeContains(tmp);
	}
		ListeEtudiant1.idM().forEach(System.out::println);
		
		ListeEtudiant1.idI().forEachRemaining(System.out::println);
}}
