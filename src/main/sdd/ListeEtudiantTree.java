package main.sdd;

import java.util.TreeSet;

public class ListeEtudiantTree {

	private TreeSet<Etudiant> listeEtudiant = new TreeSet<Etudiant>();
	
	public ListeEtudiantTree(int nbrEtudiant){
		for (int i=0; i< nbrEtudiant; i++) {
			Etudiant tmp = new Etudiant(i,"Je suis l'objet"+i, 3.14);
			this.listeEtudiant.add(tmp);
		}
	}
	
	
}
