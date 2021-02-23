import java.util.Scanner;
public class lineComparison {

	public static void main (String[] args) {

		System.out.println("Welcome to Line Comparison Computation Problem");

			int x1,y1,x2,y2,m1,n1,m2,n2;

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

			System.out.println("Co-ordinates for Line2");
			System.out.println("Enter m1: ");
			m1 = input.nextInt();
			System.out.println("Enter n1: ");
			n1 = input.nextInt();
			System.out.println("Enter m2: ");
			m2 = input.nextInt();
			System.out.println("Enter n2: ");
			n2 = input.nextInt();

			Double length1 = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
			System.out.println("Length of Line1: "+length1);

			Double length2 = Math.sqrt(((m2-m1)*(m2-m1)) + ((n2-n1)*(n2-n1)));
			System.out.println("Length of Line1: "+length2);

			boolean result = length1.equals(length2);
			int compare = length1.compareTo(length2);

			if(result) {
				System.out.println("Line1 and Line2 are equal in Length");
			}else {
				if (compare > 0) {
					System.out.println("Line1 is greater than Line2 in Length");
				}else{
					System.out.println("Line1 is less than Line2 in Length");
				}
			}
	}
}
