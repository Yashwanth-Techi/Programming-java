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

