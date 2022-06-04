package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListPractice {

	public static void main(String[] args) {
		
	
				Student [] students = new Student[] {new Student("tuhin",25,"tuhin@mail.com"),
						new Student("atik",23,"atik@mail.com"),
						new Student("dipro",28,"dipro@mail.com"),
						new Student("hasinur",28,"hasinur@mail.com"),
						new Student("Pepul",31,"Pepul@mail.com"),
						new Student("shanto",29,"shanto@mail.com"),
						new Student("monir",33,"monir@mail.com"),
						new Student("akash",30,"akash@mail.com"),
						new Student("ayon",30,"ayon@mail.com"),
						new Student("nur",38,"nur@mail.com"),
						new Student("anika",24,"anika@mail.com"),
						new Student("sanjida",26,"sanjida@mail.com"),
						new Student("suchi",26,"suchi@mail.com"),
						new Student("suzan",34,"suzan@mail.com"),
						new Student("anika",26,"anika@mail.com"),
						new Student("kanak",236,"kanak@mail.com")};
				
				
//				List<String> stringList = new ArrayList<>();
//				
//				//program to an interface , this gives us maximum generality
//				// method binding in compile time
//				Collection<String> stringArrayList = new ArrayList<>();
//				List<Student> studentList = new ArrayList<>();
//				System.out.println("StudentList: Before: "+studentList.size());
//				studentList.add(1, new Student("Shahajada",46,"shahajada@mail.com"));
//				System.out.println("StudentList: After"+studentList);
//				
				
			
				List<Integer> firstIntList = new ArrayList<>();
				List<Integer> secondIntList = new ArrayList<>();
				
				firstIntList.add(10);
				firstIntList.add(15);
				firstIntList.add(20);
				firstIntList.add(25);
				firstIntList.add(30);
				firstIntList.add(35);
				
				
				secondIntList.add(30);
				secondIntList.add(35);
				secondIntList.add(40);
				secondIntList.add(45);
				secondIntList.add(55);
				
				
//				secondIntList.addAll(firstIntList.subList(2, 4));
//				List<Integer> subList = firstIntList.subList(2, 4);
				System.out.println(secondIntList);
				
				
				//======================= ArrayList=========  
				//1 List Operations
				//1.1.1 Bulk  operation
				//1.1.2 search operation
				//1.1.3 iteration operation
				//1.1.4  position specific method
				
				// difference between add(index, value) and set(index, value)
				
				/*
				 * First Fail - concurrent modification exception
				 */
				
				
				/*==================Exception in thread "main" java.util.ConcurrentModificationException==============
				 * List<Student> studentList = new ArrayList<>();
				studentList.addAll(Arrays.asList(students));
				System.out.println("AAA");
				for(Student student : studentList) {
					if(student.getAge() == 31) {
//						studentList.remove(student);
						studentList.add(new Student("Torikul Rahman Dipro", 28,"torikulDipro@gmail.com"));
					}
				}
				 */

/*
 * next()
 * hasNext()
 * remove()
 * forEachRemaining()
 * 
 * 
 * ======================= List Iterator Interface =======================
 * hasNext() - returns true if there exists an element in the list
next() - returns the next element of the list
nextIndex() returns the index of the element that the next() method will return
previous() - returns the previous element of the list
previousIndex() - returns the index of the element that the previous() method will return
remove() - removes the element returned by either next() or previous()
set()- replaces the element returned by either next() or previous() with the specified element
 */
	}
	
	

}
