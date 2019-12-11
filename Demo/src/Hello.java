
public class Hello {

	public static void main(String[] args) {
		
		int i = 2;
		int j = 3;
		int k = i+j;
		System.out.println(k);
		
		System.out.println("HelloWorld");
		System.out.println("Hello AShmita Kanojia");
		
		System.out.println("Hello AShmita Kanojia");
		try {
		 i = 2/0;
		
		}
		catch(Exception e) {
			
			//e.printStackTrace();
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		//System.out.println(i);
	}
}
