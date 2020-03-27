package sample;

public class ignore {
		public static void main(String args[]){  
		String s1="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";  
		System.out.println(s1.equalsIgnoreCase(s2)); 
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));

		try {
			int i=10;
			int j=10/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
}
}