public class pw{
    public static class student{ // student class
        String name;
        int marks;
    }
    public static void fun(String s){
        System.out.println(s);
    }
    public static void main(String[] args){
        student s1 = new student();//declaration
        s1.name = "Anurag";//initialization
        s1.marks = 90;//initialization
        System.out.println(s1.name);
        System.out.println(s1.marks);

        fun(s1.name);//calling function

        bank person1 = new bank("Anurag",45);
        person1.getClass();

        System.out.println(person1.bankName);//Union bank of india
    }
}
class bank {
    public String name;
    private int passward;
    // the final keyword ensures that the variable's value cannot be changed once it is initialized
    final String bankName = "Union bank of india";
    int getpassward(){//getter method
        return passward;
    }
    int setpassward(int x){//setter method
        return passward = x;
    }

    public bank(String naam, int pass){//Constructor
        name = naam;
        passward = pass;
    }
}
