import java.util.ArrayList;

public class Numbers {
	public int getListSum(ArrayList<Integer> arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	public int getListProduct(ArrayList<Integer> arr) {
		int product = 1;
		for (int i : arr) {
			product *= i;
		}
		return product;
	}
}
