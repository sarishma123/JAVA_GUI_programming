package newpackage;

import java.io.*;
class Student implements Serializable{
    private String name,faculty;
    private int age;
    Student(String n, String f,int a){
        name=n;
        faculty=f;
        age=a;
    }
    public void show(){
        System.out.println(name+""+faculty+""+""+age);

    }
    
}
public class ReadWriteObject {
    public static void main(String[] args) {
        Student s1=new Student ("Ram","Bca",20);
        try{
            FileOutputStream fout=new FileOutputStream("student.txt");
            ObjectOutputStream out= new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.close();
            fout.close();
            
            
            FileInputStream fin=  new FileInputStream("student.txt");
            ObjectInputStream oin= new ObjectInputStream(fin);
            Student s2=(Student) oin.readObject();
            s2.show();
            oin.close();
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }



 }
    
}
