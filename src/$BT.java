
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This is my tools class, where I will put test corrections and demonstrate various skills I learned in this course. 
 * @author brian.tu
 *
 */
public class $BT {
	
	/**
	 * This method returns length n array of random strings.
	 * @param n
	 * @return
	 * @throws FileNotFoundException
	 */
	public static String[] makeArray(int n){
		
		String[] arr = new String[n];
		
		//Why not pull words from file? 
		//Answer: You can't jump around a file to randomly choose words.  Files are read
		//from top down. 
		//Solution: We create a dynamic data structure called an ArrayList and copy the 
		//whole file into it.  From there we randomly select from the arrayList. 
		
		ArrayList<String>list = readWords(); //create a list with every word in it. 
		
		for (int i = 0; i < n; i++) {
			int rand = (int)(Math.random()*list.size());
			arr[i] = list.get(rand);
		} 
		return arr;
	}
	
	/**
	 * This method finds takes two string and finds how 
	 * many times the smaller string occurs in the bigger string.
	 * @param a
	 * @param b
	 * @return
	 */
	public static int fitsIn(String a, String b) {
		int lena = a.length();
		int lenb = b.length();
		int high = 0;
		int low = 0;
		String strhi = "";
		String strlo = "";
		int ctr = 0;
		
		if (lena > lenb) {
			high = lena;
			low = lenb;
			strhi = a;
			strlo = b;
		} else {
			high = lenb;
			low = lena;
			strhi = b;
			strlo = a;
		}
		
		for (int i = 0; i < high - low; i++ ) {
			if (strhi.substring(i, i+low).equals(strlo)) {
				ctr++;
				i+= strlo.length()-1;
			}
		}
		return ctr+1;
	} //end fitsIn
	
	/**
	 * This method takes an array and reverses the order of the array.
	 * Ex. {1, 2, 3} => {3, 2, 1}
	 * @param arr
	 * @return
	 */
	public static int[] flipArray(int[] arr) {
		
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1] = temp;
		}
		return arr;
	} //end flipArray
	
	/**
	 * This method uses a different algorithm to sort an array if integers in increasing order.
	 * @param arr
	 */
	public static void selectSort(int arr[]) {
        // One by one move boundary of unsorted sub array
        for (int i = 0; i < arr.length-1; i++) {
        	int minindx = i;
            for (int j = minindx + 1; j < arr.length; j++) {
                if (arr[j] < arr[minindx]) {
                    minindx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minindx];
            arr[minindx] = arr[i];
            arr[i] = temp;
        }
    } //end selectSort
	
	/**
	 * This method finds the sum of integers in a 2D array.
	 * @param arr2d
	 * @return
	 */
	public static int sum2D(int[][] arr2d) {
		int sum = 0;
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				sum += arr2d[i][j];
			}
		}
		return sum;
	}
	
	/**
	 * This method finds the index of a integer in an array.
	 * @param arr
	 * @param n
	 */
	public static int linearSearch(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i; //returns index of found integer
				
			}
		}
		return -1; //returns -1 if integer is not found.
	} //end findInt
 	/**
	 * These series of methods takes an array of integers and sorts them in increasing order.
	 * This is one of the many algorithms to do this. 
	 * @param nums
	 */
	public static void quickSort(int[] arr) {
		sort(arr, 0, arr.length-1); //array of ints, first index, last index
	}
	private static void sort(int[] arr, int low, int high) {
		if (low < high + 1) {
			int p = partition(arr, low, high);
			sort(arr, low, p-1);
			sort(arr, p+1, high);
		}
	}
	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	private static int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high-low)+1) + low;
	}
	private static int partition(int[] arr, int low, int high) {
		swap(arr, low, getPivot(low, high));
		int border = low + 1;
		for (int i = border; i <= high; i++) {
			if (arr[i] < arr[low]) {
				swap(arr, i, border++);
			}
		}
		swap(arr, low, border-1);
		return border - 1;
	}
	
	/**
	 * This method takes a string and returns an integer input from user.
	 * @param prompt
	 * @return
	 */
	public static int takeInteger(String prompt) {
		
		while (true) {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println(prompt);
				int x = s.nextInt();
				return x;
			}
			catch (Exception e) {
				System.out.println("Please input an integer.");
			}
		}
	} //end takeInteger
	
	/**
	 * This method reads a text file.
	 * @param file
	 */
	public static String readTxtFile(String file) {
		
		String text = "";
		try {
			Scanner s = new Scanner(new File(file));
			while (s.hasNextLine()) {
				text += s.nextLine() + " ";
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
		
		return text;
	} //end readString
	
	/**
	 * This function simply reads in all the word from the file
	 * @return
	 */
	public static ArrayList<String> readWords() {
		
		ArrayList<String> list = new ArrayList<String>(); //construct an array list
		
		try {
			
			Scanner s = new Scanner(new File("20k.txt"));
			
			while (s.hasNextLine()) {
				
				list.add(s.nextLine());
				
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
		}
		return list;
	}
	
	/**
	 * This method prints the past string to this console. 
	 * @param s
	 */
	public static void print(String s) {
		System.out.print(s);
		
	} //end print
	/**
	 * 
	 * @param s
	 */
	public static void println(String s) {
		System.out.println(s);
		
	} //end println
	
	/**
	 * Pauses a code for a certain amount of time.
	 * @param delay
	 */
	public static void pause(int delay) {
		
		try {
			Thread.sleep(delay);
		}
		catch (Exception e) {
			
		}
	}
	
	/**
	 * This method will take two integers and print out 
	 * a box of "*" with width w and height h to the console.
	 * 
	 * For example: w = 5 and h = 4
	 * 
	 * 		*****
	 * 		*****
	 * 		*****
	 * 		*****
	 */
	public static void drawBox(int w, int h) {
	
		for (int j = 0; j < h; j++) {
			for (int i = 0; i < w; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	/**
	 * This method creates a string to be printed with a typing effect 
	 * where there is a time delay between each character.
	 * @param text
	 * @param delay
	 */
	public static void slowPrintln(String text, int delay) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			$BT.pause(delay);
		}
		System.out.println("");
	}

} //end class
