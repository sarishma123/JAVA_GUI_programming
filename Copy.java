import java.io.*;
public class Copy {
    public static void main(String[] args) {
        
        try{
            FileOutputStream fout=new FileOutputStream("bcd.txt");
        FileInputStream fin=new FileInputStream("abc.txt");
            int ch;
            while((ch=fin.read())!=-1){
                fout.write(ch);
            }
            fin.close();
            fout.close();
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
