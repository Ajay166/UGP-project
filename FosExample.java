import java.io.*;
class FosExample{

   public static void main(String[] args) throws FileNotFoundException,IOException{

     FileOutputStream fos=new FileOutputStream("bbc.txt");
     
     fos.write(4); 
    
     System.out.println("Data is Saved");
     
     fos.close(); 
   }
}