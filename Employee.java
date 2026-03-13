import java.io.*;
import java.util.*;
public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            FileOutputStream fout=new FileOutputStream("emp.txt");
            DataOutputStream dout=new DataOutputStream(fout);
            for(int i=1;i<=5;i++){
                System.out.println("enter name,address,salary");
                String name=sc.next();
                String address=sc.next();
                int salary=sc.nextInt();
                dout.writeUTF(name);
                dout.writeUTF(address);
                dout.writeInt(salary);
            }
            dout.close();
            fout.close();
            FileInputStream fin=new FileInputStream("emp.txt");
            DataInputStream din=new DataInputStream(fin);
            while(din.available()>0){
                System.out.println("Name: "+din.readUTF());
                System.out.println("Address: "+din.readUTF());
                System.out.println("Salary: "+din.readInt());
            }
            din.close();
            fin.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
       
    }
}
