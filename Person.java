
import newpackage.Student;

//Create a class Person with the following private data members:
//
//String firstName
//
//String lastName
//
//int age
//
//Define a parameterized constructor in the Person class to initialize all data members.
//
//Create a method showInfo() in the Person class that displays the person's details.
//
//Create a subclass Student that inherits from Person and includes:
//
//An additional data member String faculty
//
//A parameterized constructor
//
//An overridden showInfo() method that displays both person details and faculty.
//
//Create another subclass Teacher that inherits from Person and includes:
//
//An additional data member double salary
//
//A parameterized constructor
//
//An overridden showInfo() method that displays both person details and salary.
//
//Create a Test class containing the main() method to:
//
//Create objects of Student and Teacher
//
//Call the showInfo() method for each object.

// Person.java
class Person {
    private String firstName;
     private String lastName;
     private int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

     public void showInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String faculty;

    Student(String firstName, String lastName, int age, String faculty) {
        super(firstName, lastName, age);
        this.faculty = faculty;
    }

     public void showInfo() {
        super.showInfo();
        System.out.println("Faculty: " + faculty);
    }
}

class Teacher extends Person{
    double salary;
    Teacher (String firstname,String lastname,int age,double salary){
        super(firstname,lastname,age);
        this.salary=salary;
    }
    public void showinfo(){
            System.out.println("Salary:"+salary);
}
}

class Test{
    public static void main(String[] args) {
        Student S=new Student("Bikram","thapa",20,"BCA");
        S.showInfo();
        
        Teacher T=new Teacher("subash","pyakural",28,55000);
        T.showInfo();
    }
}



