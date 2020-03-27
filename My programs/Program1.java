package sample;
import java.io.FileOutputStream;  


public class Program1 {

	public static void main(String[] args) {
        try{    
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
            String s="shrush...";    
            byte b[]=s.getBytes();
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}    

	}

}
