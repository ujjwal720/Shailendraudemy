package shailendrajava;

public class csa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * rotate array
		 */

		int n = 2;
		int[] im = { 1, 2, 3, 4, 5 };
		int count = 0;
		int count1 = n;
		int[] xm = new int[im.length];
		int count3 = 0;

		for (int i = im.length-1; i >= 0; i--) {

			if (i >= n) {
				
				xm[count3]=im[count1];
				count1++;
				count3++;

			}
			else {
				
				xm[count3]=im[count];
				count3++;
				count++;
				
				
			}

		}
		
		im=xm;
		System.out.println(im[0]);

	}

}
