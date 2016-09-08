package qs;
import java.util.Scanner;

	public class lab { 

		public static int partition(int[] arr, int left, int right, int pivotIndex) { 
		
			int pivotValue = arr[pivotIndex]; 
		   	int tmp = arr[pivotIndex]; 
		   	arr[pivotIndex] = arr[right]; 
		   	arr[right] = tmp; 
		   	int storeIndex = left; 

		       for(int i= left ; i< right ; i++) { 
		    	   if( arr[i] < pivotValue ) { 
		    		   tmp = arr[i]; 

		             arr[i] = arr[storeIndex]; 
		             arr[storeIndex] = tmp; 
		             storeIndex++;
		          } 
		       } 
		     
		       tmp = arr[storeIndex]; 
		       arr[storeIndex] = arr[right]; 
		       arr[right] = tmp; 
		       return storeIndex; 
		    } 

		 public static void quicksort(int[] arr, int left, int right) { 

			 if( right > left ) { 
		          int pivotIndex = left + (right-left)/2; 
		          int pivotNewIndex = partition(arr, left, right, pivotIndex); 

		          quicksort(arr, left, pivotNewIndex - 1); 
		          quicksort(arr, pivotNewIndex + 1, right); 

	       } 
	    } 

		   public static void main(String[] args) { 

		 Scanner scan = new Scanner(System.in);  
		 String line="";
		 System.out.println("임의의 정수들을 입력하세요.");
		 line = scan.nextLine();
		 String[] lineArr=line.split(" ");
		 int[] arr = new int[lineArr.length];
		 
		 for(int i=0; i<lineArr.length; i++){
			 arr[i] = Integer.parseInt(lineArr[i]);
		 }
		 
	       quicksort(arr, 0, arr.length-1); 
	       for(int i=0 ; i<arr.length ; ++i)  
	       System.out.print(arr[i] + " "); 
		 
	   } 

	} 


