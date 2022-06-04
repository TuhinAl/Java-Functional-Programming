package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeInference {
	
	public static <U> void addBox(U u, List<Box<U>> boxes) {
		Box<U> box = new Box<>();
		box.set(u);
		boxes.add(box);
	}
	
	public static <U> void outputBox(List<Box<U>> boxes) {
		int counter = 0;
		for(Box<U> b : boxes) {
			U boxContent = b.get();
			System.out.println("Box #"+counter+" contains " +"["+boxContent.toString()+"]");
			counter++;
		}
	}
	
	
	public static void main(String[] args) {
		

		ArrayList<Box<Integer>> listOfBoxes = new ArrayList<>();
		
//		addBox(10, listOfBoxes);
//		addBox(20, listOfBoxes);
//		addBox(30, listOfBoxes);
//		outputBox(listOfBoxes);	
		
		GenericTypeInference.<Integer>addBox(10, listOfBoxes);
		GenericTypeInference.outputBox(listOfBoxes);
	}

}
