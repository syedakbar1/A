package p1;

public class A {
	
	/*public static void main(String[] args) {
		
		int[] arr1 = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key1 = 3;
		
		search(arr1,key1);
	}

	private static void search(int[] arr1, int key1) {
		 
		int low = 0;
		int high = arr1.length;
		
		while(low<=high) {
			
			int mid = low+(high-low)/2;
			
			if(arr1[mid]==key1) {
				return mid;
			}
			
		}*/
	
	static A a1=null;
	
	private A() {
		
	}
	
	public static A getInstanceOfA() {
		if(a1==null) {
			a1= new A();
		}
		
		return a1;
	}
		
		
	}
	
	


