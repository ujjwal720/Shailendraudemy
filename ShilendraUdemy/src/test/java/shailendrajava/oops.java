package shailendrajava;

public class oops {

	public static void main(String[] args) {
		
		sam b=new sam();
		b.a=10;
		b.ms();
		dam d=new dam();
		d.hj();
		
		
		
		

	}

}

class dell {

	int a;

}


class sam extends dell{
	
	
	public void ms() {
		
		
		System.out.println(a);
	}
	
	
	
}


class dam extends dell{
	
	public void hj() {
		
		System.out.println(a);
	}
}

