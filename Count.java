import java.io.*;
public class Count {
    public static void main(String[] args) {
        int v=0,c=0;
        try{
            FileReader fr=new FileReader("abc.txt");
            int ch;
            while((ch=fr.read())!=-1){
                char n=(char)ch;
                if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
                {
                    v++;
                }
                else{
                    c++;
                }
            }
            fr.close();
            System.out.println("vowels= "+v);
            System.out.println("consonants= "+c);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
