package main.sdd;

public class IamObject implements Comparable<IamObject>{
	
	private int id;
	private String name;
	private long nbrDattribut = 4;
	private double jeSuisUnNombre;
	
	
	public IamObject(int id, String name, double d) {
		super();
		this.id = id;
		this.name = name;
		this.nbrDattribut = 4;
		this.jeSuisUnNombre = d;
	}


	@Override
	public String toString() {
		return "IamObject [id=" + id + ", name=" + name + ", nbrDattribut=" + nbrDattribut + ", jeSuisUnNombre="
				+ jeSuisUnNombre + "]";
	}


	public int compareTo (IamObject other) {
        return Integer.compare(this.id, other.id); // Tri par id		return 0;
	}



	
	

}
