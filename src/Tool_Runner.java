import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Tool_Runner {

	/**
	 * This is our tester method, it is simply used to test things in this class.
	 * Largely, we will be accessing the methods in a different class. 
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//$BT.slowPrintln("Hello World", 500);
		//$BT.takeInteger("hello563");
		int[] arr = {100, 5, 4, 7, 9, 11, 28, 56, 34, 9};
		System.out.println(Arrays.toString(arr));
		$BT.selectSort(arr);
		System.out.println("Sorted array: "+Arrays.toString(arr));
		System.out.println("At index: "+$BT.linearSearch(arr, 11));
		int[][] arr2d =  { {1, 3, 5, 2}, {2, 5, 4, 7} };
		System.out.println("Sum: "+$BT.sum2D(arr2d));
		int[] arr2 = {1, 2, 3};
		System.out.println(Arrays.toString(arr2));
		$BT.flipArray(arr2);
		System.out.println("Sorted array: "+Arrays.toString(arr2));
		System.out.println($BT.fitsIn("hellohellohellohello", "hellohello"));
		
		System.out.println(Arrays.toString($BT.makeArray(5)));
	
		
	//	ArrayList<String> list = $BT.readWords();
	//	System.out.println(list);
		
		
	} //main
	
	//CORRECTIONS FOR TEST #1
	public static String front3(String str) {
		int l = str.length();
		if (l > 3) {
			return str.substring(0, 3)+str.substring(0, 3) + str.substring(0, 3);
		}
		return str.substring(0, l) + str.substring(0, l) + str.substring(0, l);
	} //end front3
	
	public static String delDel(String str) {
		int l = str.length();
		if (str.substring(1,4) == "del") {
			return str.charAt(0) + str.substring(4, l);
		}
		return str;
	} //end delDel
	
	public static String[] biggerTwo(String[] a, String[] b) {
		int suma = a[0].length() + a[1].length();
		int sumb = b[0].length() + b[1].length();
		
		if (suma > sumb) {
			return a;
		}
		else if (sumb > suma) {
			return b;
		}
		return a;
	} //end biggerTwo
	
	public static int[] middleWay(int[] a, int[] b) {
		int [] arr = new int[2];
		int mida = a.length/2;
		int midb = b.length/2;
		arr[0] = a[mida];
		arr[1] = b[midb];
		return arr;		
	} //end middleWay
	
} //class
