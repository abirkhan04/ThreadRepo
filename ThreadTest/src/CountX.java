public class CountX extends Thread {
	private static int X=0;	
		
	public CountX() {
		// TODO Auto-generated constructor stub			
				
	}
	
	@Override
	public void run() {
		int i=0;
		// TODO Auto-generated method stub
		for( i=0;i<10000;i++){
			 X = X+1; 
		}
	}
	
	public static void main(String args[]){
		  Thread test[] = new CountX[5];
		  for(int i=0;i<test.length;i++){
			  test[i] = new CountX();
			  test[i].start();
			  System.out.println(X);
			  
			  System.out.println("This is a change");
			  
		  }
		  System.out.println("final"+X);
	}
}