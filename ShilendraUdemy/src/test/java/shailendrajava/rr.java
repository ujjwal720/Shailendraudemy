package shailendrajava;

public class rr {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        
        // Swap the first and last elements
        int first = 0;
        int last = i.length - 1;
        int count=2;
        
        while(count!=i.length) {
        	
        	
        	int temp=i[first];
        	int temp2=i[last];
        	
        	i[first]=temp2;
        	i[last]=temp;
        	
        	first++;
        	last--;
        	count=count+2;
        	
        	
        	
        	
        }

        
    }
}