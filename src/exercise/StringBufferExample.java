package exercise;

public class StringBufferExample {

	public static void main(String[] args) {
		// 1. Mutable
		// StringBuffer --> sequence of the character
		// Thread = safe
		// object --> new StringBuffer class
		
		//class --> coming from JRE System library
		
		StringBuffer str = new StringBuffer ("Hello");
		
		System.out.println("string: " + str);
		
		// size
		
		int length = str.length();  // size

		System.out.println("String Length: "+length);
		
		// Method --> .capacity
		
		int capacity =str.capacity();  // number
		
		System.out.println("String Capacity: "+capacity);
		
		// Method --> append()
		
		
		str.append(" Rainbow");
		System.out.println("String with Append: "+str);
		
		System.out.println("String size: "+str.length());
		
		
		
		
		str.insert(1, "h");
		System.out.println(str);
		
		// .delete()
		
		str.delete(0,1);
		System.out.println(str);
		
		str.delete(0,1);
		System.out.println(str);
		
		str.insert(0, "h");
		System.out.println(str);
		
		// other methods
		
		str.replace(10, 13, " Test");
		System.out.println(str);
		
		StringBuffer t = new StringBuffer("Java");
		System.out.println("Java character: "+t.length());
		
		t.replace(1, 2, "A");
		System.out.println(t);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
