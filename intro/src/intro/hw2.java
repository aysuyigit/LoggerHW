package intro;

public class hw2 {

	public static void main(String[] args) {
		int[] dizi = { 1, 5, 7, 4, 1, 2, 3, 6, 2, 3, 4, 7, 9, 4 };

		for (int i = 0; i < dizi.length; i++) {
			int sayac = 0;

			for (int j = 0; j < i; j++) {
				if (dizi[i] == dizi[j]) {
					sayac = 1;
					break;
				}
			}
			if (sayac == 0) {
				System.out.println(dizi[i] + " ");
			}
		}

		System.out.println('\n');
	}

}
