import java.util.Arrays;

public class Solution {
	public int solution(int[] A) {
		Arrays.sort(A);

		// нет в условии!
		if (A.length == 1)
			return A[0] == 1 ? 1 : 0;

		// нет в условии!
		int min = Arrays.stream(A).min().getAsInt();
		if (min != 1)
			return 0;

		for (int i = 1; i < A.length; i++) {
			if (A[i-1]+1 != A[i])
				return 0;
		}
		return 1;
	}

}
