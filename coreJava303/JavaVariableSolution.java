package coreJava303;

public class JavaVariableSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that declares 2 integer variables, assigns an integer to
		 * each, and adds them together. Assign the sum to a variable. Print out the
		 * result.
		 */
		System.out.println("");
		System.out.println(" 1st question");
		System.out.println("");
int A = 2,  B = 3;
int sum = A+B ;
System.out.println("the sum of the integer is " +sum);

/*
 * Write a program that declares an integer variable and a double variable,
 * assigns numbers to each, and adds them together. Assign the sum to a
 * variable. Print out the result. What variable type must the sum be? the answer is a double
 */
System.out.println("");
System.out.println(" 2nd question");
System.out.println("");
int G = 4;
double U = 7.4;
double L = G;
double Total = L + U;
System.out.println("the sum of the integer L and double Y is " +Total);

/*
 * Write a program that declares 2 integer variables, assigns an integer to
 * each, and divides the larger number by the smaller number. Assign the result
 * to a variable. Print out the result. Now change the larger number to a
 * decimal. What happens? What corrections are needed? it's saying that the variable is duplicated, I will have to give it another name.
 */
System.out.println("");
System.out.println(" 3nd question");
System.out.println("");
int M = 60,  N = 20;
int Div = M/N;
// double M =60.7;
System.out.println("the Division of the integer M and  N is " +Div);

/*
 * Write a program that declares two integer variables, x, and y, and assigns 5
 * to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now,
 * cast y to a double and assign it to q. Print q again.
 */
System.out.println("");
System.out.println(" 4th question");
System.out.println("");
int x = 5 , y= 6;
double q = y/x ;
System.out.println("before casting q is equal to " +q);
double yy = y;
q =  yy; 
System.out.println("before casting q is equal to " +q);

//Write a program that declares a named constant and uses it in a calculation. Print the result.
System.out.println("");
System.out.println(" 5th question");
System.out.println("");

final double PI = 3.14;
double radius = 4.0;
double area = radius * radius * PI;


System.out.println("The area for the circle of radius " + radius + " is equal to " + area);

	}

	
}

