import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Set<String> set, String ...values) {
		// add all the values to the set. 
		// print each one as you add it
		System.out.println("Adding element to set: ");
		for(String arg : values) {
			set.add(arg);
			System.out.println(" " + arg);
		}
	}
	
	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Set<String> set) {
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
		System.out.println("Set contains: ");
		Iterator<String> iter = set.iterator();
		while( iter.hasNext() ) {
			String str = iter.next();
			System.out.print(" " + str);
		}
		System.out.println();
	}
	
	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer( ) {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		Set<String> set = new HashSet<String>();
		addAll(set, "dog", "ant", "brid", "elephant", "cat");
		
		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do it.
		print(set);
		
		// 3. are the elements printed in same order than you added them? 
		// What does this tell you about Sets?
		System.out.println("Question: Are the element print in same order that you added them?");
		
		// 4. Remove all the elements from the set, using a method that 
		// defined in Set (and Collection). What is the method to use?
		System.out.println("Clearing the set");
		set.clear();
		
		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		addAll(set, "cat", "elephant", "brid", "ant", "dog");
		
		// 6. Print the elements in the set.  Is the order same as before?
		print(set);
		
		// 7. Add duplicate elements to the set.  Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
		System.out.println("Add duplicate items to the set ");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		
		
		// 8. Print the elements in set.  Are there any duplicates?
		// What property of Set does this demonstrate?
		print(set);
		
		
		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		//  What is different when you use TreeSet?
		
		// Hint: Use Polymorphism.  Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!
		Set<String> set2 = new TreeSet<String>();
		
		// 10. Repeat again using TreeSet with a Comparator.
		addAll(set2, "dog", "ant", "brid", "elephant", "cat");
		print(set2);
		System.out.println("Question: Are the element print in same order that you added them?");
		System.out.println("Clearing the set");
		set2.clear();
		addAll(set2, "cat", "elephant", "brid", "ant", "dog");
		print(set2);
		System.out.println("Add duplicate items to the set ");
		set2.add("cat");
		set2.add("dog");
		set2.add("ant");
		print(set2);
	}

	public static void main(String[] args) {
		setExplorer();
	}
}
