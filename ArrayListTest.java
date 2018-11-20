import java.util.*;

public class ArrayListTest{
	
	public static void main (String[] args){

		List<String> myListJava = new ArrayList<String>();
		myListJava.add("Anabelle");
		myListJava.add("Alexis");
		myListJava.add("Tony");
		myListJava.add("Mohammed K");
		myListJava.add("Erwan");
		myListJava.add("Tantely");
		myListJava.add("Moka");
		myListJava.add("Marthe");
		myListJava.add("Lucas");
		myListJava.add("Justine");
		myListJava.add("Gaëtan");
		myListJava.add("Nicolas");

		List<String> myListJS = new ArrayList<String>();
		myListJS.add("Mathieu");
		myListJS.add("Michel");
		myListJS.add("Robin");
		myListJS.add("Fabien");
		myListJS.add("Florentin");
		myListJS.add("Gauthier");
		myListJS.add("Leuthsouline");
		myListJS.add("Charles");
		myListJS.add("Benoît");
		myListJS.add("Quentin");
		myListJS.add("Mickaël");




		Iterator<String> iteratorJS = myListJS.iterator();
		while (iteratorJS.hasNext()) {
			System.out.println(iteratorJS.next());  
		}


		Iterator<String> iteratorJava = myListJava.iterator();
		while (iteratorJava.hasNext()) {
			System.out.println(iteratorJava.next());  
		}

		Map<String, List<String>> myMap = new HashMap<String, List<String>>();

		myMap.put("Java", myListJava);
		myMap.put("JS", myListJS);

		for (Map.Entry<String, List<String>> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
	
}