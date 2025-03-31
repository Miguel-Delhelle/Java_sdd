package main.sdd;

public class Etudiant implements Comparable<Etudiant>{
	private int id;
	private String name;
	private long nbrDattribut = 4;
	private double moyenneG;
	
	
	public Etudiant(int id, String name, double d) {
		super();
		this.id = id;
		this.name = name;
		this.nbrDattribut = 4;
		this.moyenneG = d;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMoyenneG() {
		return moyenneG;
	}


	public void setMoyenneG(double moyenneG) {
		this.moyenneG = moyenneG;
	}


	@Override
	public String toString() {
		return "IamObject [id=" + id + ", name=" + name + ", nbrDattribut=" + nbrDattribut + ", moyenneG="
				+ moyenneG + "]\n";
	}


	public int compareTo (Etudiant other) {
        return Integer.compare(this.id, other.id); // Tri par id		return 0;
	}

}
