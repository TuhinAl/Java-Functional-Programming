package generic;

public class GenericTheory {
	public static void main(String[] args) {
		/**
		 * ==> Benefits of Generics 
		 * ** Strongly Type check in compile time **
		 * ** Elimination of Cast 
		 * List list = new ArrayList();
		 *  list.add("hello"); 
		 *  String s = (String) list.get(0);
		 *  
		 *  When re-written to use generics, the code does not require casting:
		 *  
		 *  List<String> list = new ArrayList<String>();
			list.add("hello");
			String s = list.get(0);   // no cast
			
			** Enabling programmers to implement generic algorithms.
		 */
	}

}
