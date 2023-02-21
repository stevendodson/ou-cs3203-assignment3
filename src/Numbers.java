import java.util.ArrayList;

public class Numbers {
	public int getListSum(ArrayList<Integer> arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
}
