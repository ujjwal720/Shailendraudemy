package Shalendra;

final class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 3;

		for (int i = 2; i <= 50; i++) {

			if (i % a == 0 && i % b == 0) {
				
				System.out.println(i);
                break;
			}

		}

	}

}
