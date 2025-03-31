package main.sdd;

public class Main {
	
	public static void main(String[] args) {

		ListeEtudiantTree listeAllEtudiant = new ListeEtudiantTree();
		listeEtudiantHash ListeEtudiant1 = new listeEtudiantHash();

		//System.out.println(uneTreeSet);
		
		for (int i=0; i< 1000; i++) {
			Etudiant tmp = new Etudiant(i,"Je suis l'étudiant e"+i, Math.random()*21);
			listeAllEtudiant.add(tmp);
			ListeEtudiant1.ListeContains(tmp);
		}
		// TreeSet
		System.out.println(listeAllEtudiant.afficherAllEtudiant());
		listeAllEtudiant.stream().forEach(System.out::println);
		
		// HashSet
		ListeEtudiant1.idM().forEach(System.out::println);
		
		ListeEtudiant1.idI().forEachRemaining(System.out::println);
}}
