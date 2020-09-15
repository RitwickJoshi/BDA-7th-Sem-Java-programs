import java.util.*; 
class MapDS 
{ 
	public static void main(String args[]) 
	{ 
		Map<Integer, String> hm1 = new HashMap<>(); 
		Map<Integer, String> hm2 = new HashMap<Integer, String>(); 
		hm1.put(1, "Hello"); 
		hm1.put(2, "Welcome"); 
		hm1.put(3, "Goodbye"); 

		hm2.put(new Integer(1), "Hello"); 
		hm2.put(new Integer(2), "Welcome"); 
		hm2.put(new Integer(3), "Goodbye"); 

		System.out.println("Insertion:");
		System.out.println(hm1); 
		System.out.println(hm2); 

		System.out.println("Deletion:");
		hm1.remove(new Integer(1)); 
		System.out.println(hm1);
	} 
} 