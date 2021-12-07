import java.util.Scanner;

public class HW3_170517033 {

	public static void main(String[] args) {
		//------------------------------------------------------------------------------------
		// This program basically draws the coordinate system and some geometric shapes on the console screen. 
		// Firstly, the program asks what to draw. Then the user can choose one of three different shapes which can be a line, parabola, circle. 
		// After choosing the shape, the user enters the shape coefficients or required parameters. Then the calculated shape is printed on the axis 
		// and display on the console screen.
		//------------------------------------------------------------------------------------
		//Name / Surname: Yasin Alper BÝNGÜL
		//Number : 170517033
		
		Scanner input = new Scanner(System.in);
		
		//The variable that controls the program run or stops
		boolean exit = true;
		
		while(exit) {
			//Asking what would like to draw to user
			System.out.println("Which shape would you like to draw?");
			System.out.println("1. Line\n2. Parabola\n3. Circle\n4. Exit");
			int choose = input.nextInt();

			//Select the shape with switch-case statement
			switch(choose) {
			//If user select 1, then program prints a line.
			case 1:
				//Getting the coefficients from user
				System.out.println("\nLine formula is y = ax + b");
				System.out.print("Please enter coefficients a and b:");
				int a = input.nextInt();
				int b = input.nextInt();
				
				//This count variable is for print 'x' for the axis-x at the right time.
				int count = 0;
				
				System.out.printf("%11c\n",'y');
				//y_ax represents axis-y value
				//x_ax represents axis-x value
				for(int y_ax=10;y_ax>-11;y_ax--) {
					for(int x_ax=-10;x_ax<11;x_ax++) {
						//If the equation result is equal to axis-y value, then print '*'
						if(y_ax==a*x_ax+b){
							System.out.print("*");
							if(y_ax == 0) {
								//If when print '*'  at the value of 0 on the axis-y, then increase count variable by 1
								count++;
							}
						}
						//If value of axis-y is equals 0, then print '-'
						else if(y_ax == 0) {
							if(x_ax == 0) {
								System.out.print("|");
							}
							else {
								System.out.print("-");
							}
							
							//If value of axis-y is equals 0 and printing something, then increase count variable by 1
							count++;
							
							//If count variable can be divided by 21, then print 'x'
							if(count%21 == 0) {
								System.out.print("x");
							}
							
						}
						//If value of axis-x is equals 0, then print '|'
						else if(x_ax == 0) {
							System.out.print("|");
						}
						//If the conditions are failed, then print " "
						else {
							System.out.print(" ");
						}
					}
					//Go to new line
					System.out.println();
				}
				
				break;
				
			//If user select 2, then program prints a parabola.
			case 2:
				//Getting the coefficients from user
				System.out.println("\nParabola formula is y = ax^2 + bx + c");
				System.out.print("Please entercoefficients a, b and c:");
				a = input.nextInt();
				b = input.nextInt();
				int c = input.nextInt();
				
				//This count variable is for print 'x' at the right time.
				count = 0;
				
				System.out.printf("%11c\n",'y');
				//y_ax represents axis-y value
				//x_ax represents axis-x value
				for(int y_ax=10;y_ax>-11;y_ax--) {
					for(int x_ax=-10;x_ax<11;x_ax++) {
						//If the equation result is equal to axis-y value, then print '*'
						if(y_ax == a*(int)(Math.pow(x_ax, 2)) +b*x_ax + c ){
							System.out.print("*");
							//If when print '*'  at the value of 0 on the axis-y, then increase count variable by 1
							if(y_ax == 0) {
								count++;
							}
						}
						//If value of axis-y is equals 0, then print '-'
						else if(y_ax == 0) {
							if(x_ax == 0) {
								System.out.print("|");
							}
							else {
								System.out.print("-");
							}
							//If value of axis-y is equals 0 and printing something, then increase count variable by 1
							count++;
							//If count variable can be divided by 21, then print 'x'
							if(count%21 == 0) {
								System.out.print("x");
							}
							
						}
						//If value of axis-x is equals 0, then print '|'
						else if(x_ax == 0) {
							System.out.print("|");
						}
						//If the conditions are failed, then print " "
						else {
							System.out.print(" ");
						}
					}
					//Go to new line
					System.out.println();
				}
				break;
				
			//If user select 3, then program prints a circle.
			case 3:
				//Getting the coefficients or required parameters from user
				System.out.println("\nCircle formula is (x-a)^2 + (y-b)^2 = r^2");
				System.out.print("Please enter center's coordinates (a,b) and radius:");
				a = input.nextInt();
				b = input.nextInt();
				int r = input.nextInt();
				
				//This count variable is for print 'x' at the right time.
				count = 0;
				
				System.out.printf("%11c\n",'y');
				//y_ax represents axis-y value
				//x_ax represents axis-x value
				for(int y_ax=10;y_ax>-11;y_ax--) {
					for(int x_ax=-10;x_ax<11;x_ax++) {
						//If the equation result is equal to axis-y value, then print '*'
						if(Math.pow(r,2) == Math.pow(x_ax-a,2) + Math.pow(y_ax-b, 2)){
							System.out.print("*");
							//If when print '*'  at the value of 0 on the axis-y, then increase count variable by 1
							if(y_ax == 0) {
								count++;
							}
						}
						//If value of axis-y is equals 0, then print '-'
						else if(y_ax == 0) {
							if(x_ax == 0) {
								System.out.print("|");
							}
							else {
								System.out.print("-");
							}
							//If value of axis-y is equals 0 and printing something, then increase count variable by 1
							count++;
							//If count variable can be divided by 21, then print 'x'
							if(count%21 == 0) {
								System.out.print("x");
							}
							
						}
						//If value of axis-x is equals 0, then print '|'
						else if(x_ax == 0) {
							System.out.print("|");
						}
						//If the conditions are failed, then print " "
						else {
							System.out.print(" ");
						}
					}
					//Go to new line
					System.out.println();
				}
				break;
				
			//If user select 4, then program ends.
			case 4:
				exit = false;
				break;
			default:
			}
		}
	}
}
