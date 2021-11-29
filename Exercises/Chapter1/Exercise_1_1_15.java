//Exercise 1.1.15
public class Exercise_1_1_15 {
	public static int[] histogram(int[] a, int M) {
		int[] b = new int[M];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				if (i == a[j]) {
					b[i]++;
				}
			}
		}

		return b;
	}

	public static void main(String[] args) {
		int[] a = { 0, 0, 3, 4, 5, 0, 7, 8, 8, 9};

		int b[] = histogram(a, 10);

		for (int i = 0; i < 10; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
