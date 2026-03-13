import java.io.*;
import java.util.*;
public class ReadWrite {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            System.out.println("enter a line of text");
            String text=sc.nextLine();
            try{
                FileWriter fw=new FileWriter("abc.txt");
                fw.write(text);
                fw.close();
                FileReader fr=new FileReader("abc.txt");
                int ch;
                while((ch=fr.read())!=-1){
                    System.out.print((char)ch);
                }
                fr.close();
            }
            catch(Exception ex){
                System.out.println(ex);
            }
    }
}
