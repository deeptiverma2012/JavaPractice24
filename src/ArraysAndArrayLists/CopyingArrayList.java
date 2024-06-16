package ArraysAndArrayLists;
import java.util.ArrayList;

public class CopyingArrayList {
/*Copy Elements of One ArrayList to Another ArrayList in Java*/
	
//	public static void copyFromArrayListToArrayList()
//	{
//		ArrayList<String>arr = new ArrayList<String>();
//			
//			arr.add("Viana");
//			arr.add("Nidhi");
//			arr.add("Vaidehi");
//			arr.add("Torry");
//			arr.add("Sabestian");
//			
//			ArrayList<String>arr1  = arr;
//			
//			System.out.println(arr1);
//		
//			arr1.set(2,"Deepti");
//			System.out.println(arr1);
//			System.out.println(arr.get(2));
//			
//	}
	
	public static void copyArrayList() {
		ArrayList<String>arr = new ArrayList<String>();
		
		arr.add("Viana");
		arr.add("Nidhi");
		arr.add("Vaidehi");
		arr.add("Torry");
		arr.add("Sabestian");
		
		ArrayList<String> arr1 =new ArrayList<String>();
		
		for(int i=0; i<arr.size(); i++)
		{
			arr1.add(arr.get(i));
		}
		System.out.println(arr1);
		
		arr1.set(1,"Deepti");
		System.out.println(arr.get(1));
		System.out.println(arr1.get(1));
	}
	public static void main(String[] args) {
		//copyFromArrayListToArrayList();
		copyArrayList();
	}

}
