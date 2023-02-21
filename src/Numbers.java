import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> userArray = new ArrayList<Integer>();
		System.out.println("Enter integers to be added to the list. Press \"q\" to quit.");
		int input;
		while(scan.hasNextInt()) {
			input = scan.nextInt();
			userArray.add(input);
		}
		scan.close();
		System.out.println("The sum of the numbers is: " + getListSum(userArray));
		System.out.println("The product of the numbers is: " + getListProduct(userArray));
	}
	public static int getListSum(ArrayList<Integer> arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	public static int getListProduct(ArrayList<Integer> arr) {
		int product = 1;
		for (int i : arr) {
			product *= i;
		}
		return product;
	}
	public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arr) {
		ArrayList<Integer> result = new ArrayList<Integer>(arr.size());
		for (int i = arr.size()-1, arrIndex = 0; i <= 0; --i, ++arrIndex) {
			result.set(arrIndex, arr.get(i));
		}
		return result;
	}
}
