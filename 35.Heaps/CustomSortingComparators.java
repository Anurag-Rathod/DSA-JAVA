import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int rollNo;
    double cgpa;
    Student(String name, int rollNo, double cgpa){
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
    public int compareTo(Student s){
        return this.rollNo - s.rollNo;
    }
}
public class CustomSortingComparators {
    public static void main(String[] args) {
        Student s1 = new Student("Aarav", 101, 8.9);
        Student s2 = new Student("Priya", 102, 9.4);
        Student s3 = new Student("Rahul", 103, 7.8);
        Student s4 = new Student("Sneha", 104, 9.1);
        Student s5 = new Student("Karan", 105, 8.3);
        Student[] students = {s1, s2, s3, s4, s5};
        Arrays.sort(students);
        for(Student s : students){
            System.out.println(s.name+" "+s.rollNo+" "+s.cgpa);
        }
    }
}
