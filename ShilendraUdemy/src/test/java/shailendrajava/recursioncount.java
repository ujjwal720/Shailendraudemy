package shailendrajava;

public class recursioncount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursioncount b = new recursioncount();
		String nums = Integer.toString(476436436);
		int x=b.count(nums.length(), 0);
		System.out.println(x);

	}

	public int count(int len, int i) {

		if (len == 0) {

			return i;
		}

		len--;
		i++;
		return count(len, i);

	}

}
