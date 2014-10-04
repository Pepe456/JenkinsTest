import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

	public static List<Integer> generate(int input) {
		List<Integer> result = new ArrayList<>();

		if (input == 0 || input == 1) {
			return asList(input);
		}

		int currentNumber = input;
		for (int i = 2; i < input; i++) {
			while (currentNumber % i == 0) {
				result.add(i);
				currentNumber = currentNumber / i;
			}
		}

		return result;
	}

}
