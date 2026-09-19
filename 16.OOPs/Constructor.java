public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();//here Non parameterized Constructor(Student()) is used
        s1.name = "Anurag";
        s1.rollNo = 45;
        
        Student s4 = new Student(s1);//here copy Constructor(Student(Student s1)) is used
        System.out.println(s4.name);
         
        Student s2 = new Student("Anurag",45);//here parameterized Constructor(Student(String name,int rollNo)) is used
        System.out.println(s2.name+" "+s2.rollNo);
        Student s3 = new Student("Anurag");//here parameterized Constructor(Student(String name)) is used
        System.out.println(s3.name);

    }
}
class Student{
    int rollNo;
    String name;

    //Types Constructors
    Student(){//Non aparameterized Constructor
        System.out.println("Constructor is called");
    }


    Student(String name,int rollNo){//parameterized Constructor
        this.name = name;
        this.rollNo = rollNo;
    }
    Student(String name){//parameterized Constructor
        this.name = name;
    }

    
    Student(Student s1){//copy Constructor
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }
}