package main.sdd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {

		HashSet uneHashSet = new HashSet();
		TreeSet<IamObject> uneTreeSet = new TreeSet();
		HashMap uneHashMap = new HashMap();
		
		for (int i=0; i< 10000; i++) {
			IamObject tmp = new IamObject(i,"Je suis l'objet"+i, 3.14);
			uneTreeSet.add(tmp);
		}
		
		System.out.println(uneTreeSet);
		
	}
	
	

}
