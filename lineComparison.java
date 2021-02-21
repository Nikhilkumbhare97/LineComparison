//Welcome to Line Comparison Computation
import java.util.Scanner;

public class lineComparison {

	public static void main (String[] args) {
	int x1,y1,x2,y2;
	Scanner input = new Scanner(System.in);
		System.out.println("Co-ordinates for Line1");
		System.out.println("Enter x1: ");
		x1 = input.nextInt();
		System.out.println("Enter y1: ");
      y1 = input.nextInt();
		System.out.println("Enter x2: ");
      x2 = input.nextInt();
		System.out.println("Enter y2: ");
      y2 = input.nextInt();

		double length1 = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
		System.out.println("Length of Line1: "+length1);
	}
}
