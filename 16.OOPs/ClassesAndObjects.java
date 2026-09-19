public class ClassesAndObjects {
    public static void main(String[] args){
        Student s1 = new Student();//created a student object called s1
        s1.name = "Anurag";
        s1.age = 20;
        s1.marks = 80;
        s1.grads = 'A';
        s1.persentage(96, 74, 76);
        System.out.println(s1.average);
    }
}
// in Java, it is a common convention to start class names with a capital letter.
class Student{//student class 
    String name;
    int age;
    float marks;
    char grads;
    float average;

    void persentage(int math,int phy,int chem){
        average = (math+phy+chem)/3;
    }
}       
