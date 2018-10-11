import java.util.*;
import java.io.*;
class qus1
{
    public static void main(String[] args)
    {	
        int x;
    	try{
    	    FileInputStream f1 =new FileInputStream("First.txt");
    	    FileOutputStream f2 =new FileOutputStream("Last.txt");

    	    byte[] b = new byte[10];
            x=f1.read(b);
    	    while (x!=-1){
    	    	f2.write(b,0,x);
                x=f1.read(b);
    	    }
    	    f1.close();
    	    f2.close();
    	    System.out.println("File copied successfully!");
    	   }
           catch(IOException e){
    		e.printStackTrace();
           }
    }
}