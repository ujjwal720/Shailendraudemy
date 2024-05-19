package shailendrajava;

public class firstrepaeatingcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		firstrepaeatingcharacter a=new firstrepaeatingcharacter();
		int x=a.getname();
		System.out.println(x);

	}
	
	
	public int getname() {
		
		
		int[] a = { 1, 5 ,3, 4, 3, 5, 6};
		
		int flag = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			int count = 0;
			int num = a[i];

			for (int j = 0; j <= a.length - 1; j++) {

				if (a[j] == a[i]) {

					count++;

				}

			}

			if (count > 1) {
				
				return num;

			}

		}
		return -1;
	}

}
