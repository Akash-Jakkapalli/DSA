package OOPs;
public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        Student s2 = new Student("Aksh");
        System.out.println(s2.name);
        Student s3 = new Student(21);
        System.out.println(s3.age);
    }        
}

class Student{
    // Properties
    String name;
    int age;

    Student(){
        System.out.println("Constrator is calling....");   // non-parameterized Constroctor
    }

    Student(String name ){     // parameterized Constroctor
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }
}
