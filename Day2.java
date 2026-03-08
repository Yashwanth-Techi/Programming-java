                                                                     // Loop's 
import java.util.Scanner;



//Q1 given an interger value write a program to print all the even number of 'n'??
//public class Day2 {
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			if (i%2==0) {
//				System.out.println(i);
//			}
//		}
//		
//		
//	}
//
//}

// annother opproch

//public class Day2 {
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		for(int i=2;i<=n;i=i+2) {
//			System.out.println(i);
//		}
//	}
//}


//Q2 given an integer value n write a program to print all the odd numbers till 'n'??

//public class Day2 {
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int input1 = scan.nextInt();
//		
//		for(int i=1;i<=input1;i++) {
//			if(i%2!=0) {
//				System.out.println(i);
//			}
//		}
//	}
//}

// opproch 2

//public class Day2 {
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int input1 = scan.nextInt();
//		
//		for(int i=1;i<=input1;i=i+2) {
//			System.out.println(i);
//		}
//	}
//}


//Q3 write program to print all add numbers in revers order??


//public class Day2 {
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int input1 = scan.nextInt();
//		
//		if (input1%2==0) {          
//			input1 = input1-1;
//		}
//		
//		for(int i=input1;i>=1;i=i-2) {
//			System.out.println(i);
//			
//		}
//	}
//}

//opproch 2

//public class Day2 {
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int input1 = scan.nextInt();
//		for(int i=((input1%2==0)?input1-1:input1);i>=1;i=i+2){
//			System.out.println(i);
//		}
//	}
//
//}


//Q4 Given three integer value 'n' a and B. write a program to print all the multiples of a and b till "n"??


//Given intiger value 'n' write program to print the multipication table of n till 10 ??



//Q9) given two integer value "n" & "m" write a program to print all the prime number b/w  "n" & "m"??/


//class Day2{
//	
//	
//	public static void  PrimeBetween(int n,int m){
//		
//		for(int i=2;i<m;i++) {
//			if(checkPrime(i)) {
//				System.out.print(i+" ");
//			}
//		}
//		
//	}
//	public static  boolean checkPrime(int n) {
//		
//		if(n<=1) {
//			return false;
//		}
//		for(int i=2;i*i<=n;i++) {
//			if(n%i==0) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	
//	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.print("enter the integer n: ");
//		int n= sc.nextInt();
//		System.out.print("enter the ineger m: ");
//		int m=sc.nextInt();
//		
//		PrimeBetween(n,m);
//		
//		
//	}
//}


//Q10) given an integer value "n" write a program to print the first n prime numbers??

//class Day2{
//	
//	public static void PrintPrime(int n){
//		
//		int count = 0;
//		for(int i=2;count<n;i++) {
//			if(checkPrime(i)) {
//				System.out.print(i+" ");
//				count++;
//			}
//		}
//		
//	}
//	
//	public static boolean checkPrime(int n){
//		
//		if(n<=1) {
//			return false;
//		}
//		for(int i=2;i*i<=n;i++) {
//			if(n%i==0) {
//				return false;
//			}
//		}
//		return true;
//		
//	}
//	
//	
//	public static void main(String[]args) {
//		
//		Scanner sc=new Scanner(System.in);
//		
//		
//		System.out.println("enter the integer n: ");
//		int n = sc.nextInt();
//		
//		PrintPrime(n);
//		
//	}
//}


//Q11)  given an integer n & x . write a program to print n till x???



//class Day2{
//	
//	
//	public static void multiples(int x, int n){
//		for(int i=1;i<=x;i++) {
//			if(i%n==0) {
//				System.out.println(i);
//			}
//		}
//	}
//	public static void main(String[]args) {
//		
//		Scanner sc=new Scanner(System.in);
//		int x=sc.nextInt();
//		int n=sc.nextInt();
//		
//		
//		multiples(x,n);
//	}
//}


//optimize


//class Day2{
//	
//	public static void multiples(int x, int n){
//		
//		for(int i=n;i<=x;i=i+n) {
//			
//			System.out.println(i);
//			
//		}
//	}
//	public static void main(String[]args) {
//		
//		Scanner sc=new Scanner(System.in);
//		int x = sc.nextInt();
//		int n = sc.nextInt();
//		
//		multiples(x,n);
//	}
//}


//Q12) given three integer value n,a,&b write a program to print the first n common multiple of a & b??

//class Day2{
//	
//	public static void firstCommonMultiples(int n, int a, int b){
//		
//		int count = 0;
//		for(int i=1;count<n;i++) {
//			if(i%a==0 && i%b==0) {
//				System.out.println(i);
//				count++;
//			}
//		}
//	}
//	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		
//		firstCommonMultiples(n,a,b);
//	
//	}
//}

//Q13)given two intiger value n1 & n2 write a program to print all the common factors  of both n1 & n2??

//class Day2{
//	
//	public static void allCommonMultiples(int a , int b){
//		
//		for(int i=1;i<a;i++) {
//			if(a%i==0 && b%i==0) {
//				System.out.println(i);
//			}
//		}
//	}
//	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//		
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		
//		allCommonMultiples(n1,n2);
//		 
//	}
//}


//12.1) optimaize code reverse the answer

//class Day2{
//
//public static void allCommonMultiples(int a , int b){
//	
//	for(int i=n2;i>0;i--) {
//		if(a%i==0 && b%i==0) {
//			System.out.println(i);
//		}
//	}
//}
//public static void main(String[]args) {
//	Scanner sc=new Scanner(System.in);
//	
//	int n1=sc.nextInt();
//	int n2=sc.nextInt();
//	
//	allCommonMultiples(n1,n2);
//	 
//}
//}


// Q12.2) print only one factor number that mltiple of a & b

//class Day2{
//
//public static void allCommonMultiples(int a , int b){
//	
//	for(int i=1;i<a;i++) {
//		if(a%i==0 && b%i==0) {
//			System.out.println(i);
//			break;
//		}
//	}
//}
//public static void main(String[]args) {
//	Scanner sc=new Scanner(System.in);
//	
//	int n1=sc.nextInt();
//	int n2=sc.nextInt();
//	
//	allCommonMultiples(n1,n2);
//	 
//}
//}


//13) given two intiger value n1 & n2 write a program to print the least common mltiple of n1 & n2??

//class Day2{
//	 
//	public static void listCommonMultiples(int n1 , int n2 ) {
//		
//		for(int i=1;true;i++) {
//			if(i%n1==0 && i%n2==0) {
//				System.out.print(i);
//				break;
//			}
//		}
//	}
//	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//		
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		
//		listCommonMultiples(n1,n2);

//	}
//}


// Reverse String 

//class Day2{
//	public static void main(String[]args) {
//		String str = "Hello";
//		
//		String rev = "";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
//	}
//}


// check palindrom 

//class Day2{
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String str = sc.nextLine();
//		String rev="";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev = rev+str.charAt(i);
//		}
//		if(str.equals(rev)) {
//			System.out.println("it is palindrom");
//		}
//		else
//		{
//			System.out.println("it is not palindrom");
//		}
//		
//		
//	}
//}


// Fibonochii

//class Day2{
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int  n = sc.nextInt();
//		
//		int a=0,b=1;
//		
//		for(int i=1;i<=n;i++) {
//			System.out.print(a+" ");
//			int next = a+b;
//			a=b;
//			b=next;
//		}
//		
//	}
//}


//factorial number

//class Day2{
//	public static void main(String[]args) {
//		int n=5,fact=1;
//		
//		for(int i=1;i<=n;i++) {
//			fact*=i;
//		}
//		
//		System.out.println(fact);
//	}
//}


//swap 2 numbers

//class Day2{
//	public static void main(String[]args) {
//		int a=10,b=20;
//		
//		a = a + b;
//		b= a - b;
//		a = a - b;
//		
//		System.out.println(a+" "+b);
//		
//	}
//}


//Find Largest Element in Array

//class Day2{
//	public static void main(String[]args) {
//		int[] arr = {1,2,4,3};
//		
//		int max=arr[0];
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
//	}
//}

//check prime number

//class Day2{
//	public static void main(String[]args) {
//		int n = 7;
//		int count = 0;
//		
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println(n+" prime");
//		}
//		else
//		{
//			System.out.println(n+" not! prime");
//		}
//	}
//}


//count charecter in string
//class Day2{
//	public static void main(String[]args) {
//		String str="ganapathi";
//		
//		System.out.println(str.length());
//	}
//}

//remove dupicate from array

//class Day2{
//	public static void main(String[]args) {
//		
//		int[] arr= {1,2,3,4,4};
//		
//		int temp=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					arr[j]=-1;
//				}
//			}
//		}
////		System.out.println(temp);
//	}
//}

//find second larger value 
//
//class Day2{
//	public static void main(String[]args) {
//		
//		int[] arr= {10,20,40,30,50};
//		int larger=0,second=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>larger) {
//				second = larger;
//				larger = arr[i];
//			}
//		}
//		System.out.print(second);
//		
//	}
//}

//

//class Day2{
//	public static void main(String[]args) {
//		int[] arr= {10,20,30,50,40};
//		int larger=0,second=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>larger) {
//				second=larger;
//				larger=arr[i];
//			}
//		}
//		System.out.print(second);
//		
//	}
//}


//class Day2{
//	public static void main(String[]args) {
//		int arr[] = {10, 20, 60, 50};
//		int larger = 0,second = 0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>larger) {
//				second = larger;
//				larger = arr[i];
//			}
//			else if(arr[i]>second && arr[i]!=larger) {
//				second = arr[i];
//			}
//			
//		}
//
//		    System.out.print(second);
//	}
//}


//class Day2{
//	public static void main(String[]args) {
//		int arr[]={5,2,9,1};
//		
//		
//
//		for(int i=0;i<arr.length;i++){
//		    for(int j=i+1;j<arr.length;j++){
//		        if(arr[i]>arr[j]){
//		            int temp=arr[i];
//		            arr[i]=arr[j];
//		            arr[j]=temp;
//		            
//		        }
//		    }
//		    
//		}
//	}
//}

//duplicate charecter 
//
//class Day2{
//	public static void main(String[]args) {
//		String str = "programmer";
//		
//		for(int i=1;i<str.length();i++) {
//			for(int j=i+1;j<str.length();j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					System.out.print(str.charAt(j));
//				}
//			}
//		}
//	}
//}
