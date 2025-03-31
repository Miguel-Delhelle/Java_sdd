package main.sdd;

import java.util.Iterator;
import java.util.TreeSet;

public class ListeEtudiantTree extends TreeSet<Etudiant>{

	//TreeSet<Etudiant> listeEtudiant = new TreeSet<Etudiant>();
	
	public ListeEtudiantTree() {
		
	}
	
	public ListeEtudiantTree(int nbrEtudiant){
		for (int i=0; i< nbrEtudiant; i++) {
			Etudiant tmp = new Etudiant(i,"Je suis l'étudiant e"+i, Math.random()*21);
			this.add(tmp);
		}
	}
	
	public String afficherAllEtudiant() {
		Iterator<Etudiant> iteEtu = this.iterator();
		String allEtudiant = "";
		
		while (iteEtu.hasNext()) {
			allEtudiant = allEtudiant+iteEtu.next().toString();
		}
		return allEtudiant;
	}
	
	
	/*public void add(Etudiant e) {
		this.add(e);
	} */
	
	
}
