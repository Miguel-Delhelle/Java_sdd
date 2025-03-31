package main.sdd;

public class Main {
	
	public static void main(String[] args) {

		ListeEtudiantTree listeAllEtudiant = new ListeEtudiantTree();
		//System.out.println(uneTreeSet);
		
		for (int i=0; i< 1000; i++) {
			Etudiant tmp = new Etudiant(i,"Je suis l'étudiant e"+i, Math.random()*21);
			listeAllEtudiant.add(tmp);
		}
		System.out.println(listeAllEtudiant.afficherAllEtudiant());
		listeAllEtudiant.stream().forEach(System.out::println);
		
		
		
	}
	
	

}
