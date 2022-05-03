package Assessment;

public class for_while_do_while_loop {
	public static void main(String[] args) 
	{

	  // for loop
	  for(int i=1,j=1; i<10||j<10;i++,j++)
	  { 
		  j++;
		  System.out.println("i="+i+" and j="+j); 
	  }


	  // while loop 
		  int i=1,j=1;
		  while(i<10 || j<10)
		  { 
			  i++; j++;
		      System.out.println("i="+i+" and j="+j); 
		  }	
		
	// Do while loop
		int k=1, b=1;
		do {
			k++;
			b++;
			System.out.println("k=" + k + " and b=" + j);
		    } while (k < 10 || b < 10);
	}
}


