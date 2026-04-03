                                                     //Array Introduction 



// 1D array syntax :-
// 1) int[]arr= new int[size];
// 2) float[]arr = new float[size];
// 3) boolean[]arr=new boolean[size];
// 4) String[]arr = new String[size];


// 2D array Syntax :-
// 1) int[][]arr= new int[rows][columns];
// 2) float[][]arr = new float[rows][columns];
// 3) boolean[][]arr=new boolean[rows][columns];
// 4) String[][]arr = new String[rows][columns];


import java.util.Scanner;

//public class Day3{
//	public static void main(String[]args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr = new int[5];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//
//}


//1) Reversed the array

//class Day3{
//	public static void main(String[]args) {
//		Scanner sc= new Scanner(System.in);
//		
//		int[] arr=new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//}



//2) print all the Elements present in the even & odd index??

//class Day3{
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr = new int[5];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			if(i%2==0) {
//				System.out.print("Even "+arr[i]+" ");
//			}
//			else
//			{
//				System.out.print("Odd:- "+arr[i]+" ");
//			}
//		}
//	}
//}


// 3) write a program to  traversel from starting till "mid" of the array??
//
//class Day3{
//	public static void main(String[]args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] arr = new int[n];
//		
//		for(int i=0;i<arr.length;i++){
//			
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i=0;i<arr.length/2;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//}


// 4)write a program to traversel the array from "mid" to "till end"??
//class Day3{
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] arr = new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//			
//		}
//		
//		for(int i=arr.length/2;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//}


//5) write a program to traversel the array from last to till mid??

//class Day3{
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] arr=new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i=arr.length-1;i>=arr.length/2;i--) {
//			System.out.print(arr[i]+" ");
//		}
//		
//	}
//}

//6) write a program to traversel the array from mid to start ??

//class Day3{
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] arr= new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		for(int i=arr.length/2;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
//		
//	}
//}

//7) GIVEN AN ARRAY OF AN INTIGERS. WRITE A PROGRAM TO PRINT ALL SUM OF THE ELIMENTS PRESENT IN THE ARRAY??

//class Day3{
//	public static int sumOfArray(int[] arr){
//		int sum = 0;
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];
//		}
//		return sum;
//	}
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] arr=new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		
//		int output = sumOfArray(arr);
//		
//		System.out.print(output);
//
//	}
//}

// 8) Given an intigers write a program to print  product of the elements in Array??

//class Day3{
//	
//	public static int productOfElements(int[] arr) {
//		int pro = 1;
//		
//		for(int i=0;i<arr.length;i++) {
//			pro *= arr[i];
//		}
//		return pro;
//	}
//	
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] arr= new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int result = productOfElements(arr);
//		System.out.println(result);
//	}
//}


//9) Given an intigers. write a program to print larger element present in an array??

//class Day3{
//	
//	public static int largerNumber(int[]arr){
//		
//		int max = 0 ;
//		for(int i=0;i<arr.length;i++) {
//			
//				if (arr[i]>max) {
//					max = arr[i];	
//				}
//		}
//		return max;
//	}
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] arr=new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		
//		int output = largerNumber(arr);
//		System.out.print(output);
//		
//	}
//}


//optimized solution

//	class Day3{
//		
//		public static int largerElement(int[] arr) {
//			int res = Integer.MIN_VALUE;
//			
//			for(int i=0;i<arr.length;i++) {
//				if(arr[i] > res) {
//					res = arr[i];
//				}
//			}
//			return res;
//		}
//	
//	public static void main(String[]args){
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		int[]arr = new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//	}
//		
//		int output = largerElement(arr);
//		System.out.print(output);
//		
//	}
//}

//10) Given an 	array of the integers. write a program to print the index of the largest element present in the array ??

//class Day3{
//	
//	public static int indexOfLargerElement(int[] arr) {
//		int max = Integer.MIN_VALUE;
//		int index = 0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max =  arr[i];
//				index = i;
//			}
//		}
//		return index;
//	}
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] arr=new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int output = indexOfLargerElement(arr);
//		System.out.print(output);
//	}
//}

