package shailendrajava;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                                   1
		int rows = 3; // Adjust the number of rows as needed

        int counter = 1;

        for (int i = 1; i <= rows; i++) {
            int temp = counter;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
                counter++;
            }
            System.out.println();
        }
	
	}
}

