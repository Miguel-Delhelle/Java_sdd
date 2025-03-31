package main.sdd;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

public class listeEtudiantHash {
	
	private HashSet<Etudiant> ListeEtudiant = new HashSet<Etudiant>();
	
	public listeEtudiantHash() {}
	
	public void ListeContains(Etudiant e) {
		if (! ListeEtudiant.contains(e))
			ListeEtudiant.add(e);
	}
	public Stream<Etudiant> idM() {
		return ListeEtudiant.stream();
	}
	
	public Iterator<Etudiant> idI(){
		return ListeEtudiant.iterator();
	}

}
