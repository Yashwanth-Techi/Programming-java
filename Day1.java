import java.util.Scanner;

//Q1 given 3 input values write program to get the sum of pairs???  

//import java.util.Scanner;
//public class Day1 {
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int input1 = scan.nextInt();
//		int input2 = scan.nextInt();
//		int input3 = scan.nextInt();
//		
//		System.out.println((input1+input2)+" "+(input1+input3)+" "+(input2+input3));
//			
//		scan.close();
//	}
//
//}

// Q2 write a program to convert given input  Celsius to Fahrenheit ???

//import java.util.Scanner;
//public class Day1{
//	public static void main(String[]args) {
//		Scanner scan=new Scanner(System.in);
//		
//		int c = scan.nextInt();
//		
//		float F = (c * 9.0f/5) + 32;
//		System.out.println(F);
//		
//	}
//}


// Q3 write a program to check the given number is even or odd???

//import java.util.Scanner;
////
//class Day1{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int input1 = scan.nextInt();
//		
//		if (input1 % 3 == 0) {
//			System.out.println("The number is even");
//		}
//		else {
//			System.out.println("The number  is odd");
//		}
//		scan.close();
//	}
//}


// check the give is multiple of 10 ??

//import java.util.Scanner;
//
//class Day1{
//	public static void main(String[]args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int input1 = scan.nextInt();
//		
//		if (input1 % 2 == 0 || input1 % 10 == 0) {
//			System.out.println("yes");
//		}
//		else
//		{
//			System.out.println("No");
//		}
//		scan.close();
//	}
//}

//class Day1{
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int input1 = scan.nextInt();
//		
//		if (input1 % 2 == 0 && input1 % 3 == 0 && input1 % 7 == 0) {
//			System.out.println("yes");
//		}
//		else
//		{
//			System.out.println("no");
//		}
//		
//	}
//}

// Q7 check the given number is ending with '0' ??

//class Day1{
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int input1  = scan.nextInt();
//		
//		if (input1 % 10 == 0) {
//			System.out.println("yes it is ending with 0");
//		}
//		else
//		{
//			System.out.println("No it not ending with 0");
//		}
//		scan.close();
//		
//	}
//}


// Q8 check the number is ending  with 7 


//class Day1{
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int input = scan.nextInt();
//		
//		if (i % 10 == 7 ) {
//			System.out.println("yes number is ending with 7");
//		}
//		else
//		{
//			System.out.println("!No number is ending with 7");
//		}
//		scan.close();
//	}
//}

//Q9  write a program to remove last digit of the  number N??

//class Day1{
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int ip = scan.nextInt();
//		
//		System.out.println(ip/10);
//      System.out.println(ip/100);  #to remove last 2 digits
//      System.out.println(ip/1000); # to remove last 3 digits
//		
//	}
//}


//Q10 write a program to check whether give number is a two digits number are not ??

//class Day1{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int input1 = scan.nextInt();
//		
//		if (input1 > 9 && input1 < 100) {
//			System.out.println("yes it have 2 digits ");
//		}
//		else {
//			System.out.println("no it don't have 2 digits ");
//			
//		}
//	}
//}

//Q11  check the given number is unicode value of uppercase character or not ??

//class Day1{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		int input1 = scan.nextInt();
//
//		if (input1 >= 65 && input1 <=90) {
//			System.out.println("It is belong to Upper case");
//		}
//		else
//		{
//			System.out.println("It is not belonging to Upper case");
//		}
//
//	}
//}

// check is it is lowerCase are not??

//class Day1{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		int input1 = scan.nextInt();
//
//		if(input1 >= 97 && input1 <= 122) {
//
//			System.out.println("It is belonging to lower case");
//		}
//		else 
//		{
//			System.out.println("It is not Lower Case");
//		}
//
//	}
//}


//Q12 print equivalent character for the give unicode value

//class Day1{
//public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//	
//	int input1 = scan.nextInt();
//	
//	System.out.println((char)input1);
//	
//	}
//}

//Q13 given an intiger representing a Unicode Value write a program to determine whether it 
//coresponds to an upperCase Letter or LowerCase Letter or Numeric Digit or None of the above(N/A) ???

//class Day1{
//public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//	
//	int input1 = scan.nextInt();
//	
//	if (input1 >=65 && input1 <=90) {
//		System.out.println("it is Uppercase letter");
//	}
//	else if(input1 >=97 && input1 <= 122 ) {
//		System.out.println("It is LowerCase letter");
//	}
//	else if(input1 >=48 && input1 <= 57) {
//		System.out.println("it is numeric value");
//	}
//	else 
//	{
//		System.out.println("!Invalid Input");
//	}
//	
//	}
//}


// write a program to print the grade for the give marks refer the grading System ??

// example :- input(91-100 = A+),(81-90= A),(71-80 = B+),(61-70 = B),(51 - 60 = C+) (35-50 = C),(0-35 = fail!)

//class Day1{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		int input1 = scan.nextInt();
//
//		if(input1 >= 91 && input1 <=100) {
//			System.out.println("A+");
//		}
//		else if(input1 >= 81 && input1 <= 90){
//			System.out.println("A");
//		}
//		else if(input1 >= 71 && input1 <=80) {
//			System.out.println("B+");
//		}
//		else if(input1 >= 61 && input1 <= 70) {
//			System.out.println("B");
//		}
//		else if(input1 >= 51 && input1 <= 60) {
//			System.out.println("C+");
//		}
//		else if (input1 >= 35 && input1 <= 50) {
//			System.out.println("C");
//		}
//		else
//		{
//			System.out.println("fail!");
//		}
//
//	}
//}

//class Day1{
//public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//	
//	int input1 = scan.nextInt();
//	
//	}
//}


