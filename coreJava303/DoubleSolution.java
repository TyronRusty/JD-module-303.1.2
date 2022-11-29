package coreJava303;

public class DoubleSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that declares 2 double variables, assigns a number to each,
		 * and adds them together. Assign the sum to a variable. Print out the result.
		 */	
		System.out.println(" first question");
		System.out.println("");
		
			double C = 2.4, D = 3.5;
			double Sum = C+D;
		
			System.out.println("the sum of the Double is " +Sum);
			System.out.println("");
			
			/*
			 * Write a program that declares 2 double variables, assigns a number to each,
			 * and divides the larger by the smaller. Assign the result to a variable. Print
			 * out the result. Now, cast the result to an integer. Print out the result
			 * again.
			 */
			System.out.println("");
			System.out.println(" 2nd question");
			System.out.println("");
			double E = 767.7, F= 154.9;
			double div = E/F;
			System.out.println("the division of E and F is " +div);
			int P = (int) div;
			System.out.println("this is the answer after casting the result to an int " +P);
			
			/*
			 * Write a program where you create 3 variables that represent products at a
			 * cafe. The products could be beverages like coffee, cappuccino, espresso,
			 * green tea, etc. Assign prices to each product. Create 2 more variables called
			 * subtotal and totalSale and complete an “order” for 3 items of the first
			 * product , 4 items of the second product, and 2 items of the third product.
			 * Add them all together to calculate the subtotal. Create a constant called
			 * SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
			 * Be sure to format the results to 2 decimal places.
			 */
			System.out.println("");
			System.out.println(" 3rd question");
			System.out.println("");
			
		double coffee= 2.5 , cappuccino = 3.5 , espresso = 4.5;
		double subtotal , totalSale;
		final double SALES_TAX = 2.7 ;
		double coffeeOrder = coffee * 3;
		double cappuccinoOrder = cappuccino * 4 ;
		double espressoOrder = espresso * 2;
		subtotal = coffeeOrder + cappuccinoOrder + espressoOrder ;
		totalSale = SALES_TAX + subtotal;
		System.out.println("the total of the orders are "+totalSale);
	}

}
