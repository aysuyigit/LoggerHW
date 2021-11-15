package intro;

public class hw3 {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[j] <= A[i]) {
					int t = A[i];
					A[i] = A[j];
					A[j] = t;
				}
			}
		}

		for (int i = 0; i < A.length; i++) {
			System.out.println( A[i]);

		}

	}

}
