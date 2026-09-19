class bank{
    public String name;
    private int passward;

    int getpassward(){//Getter: Retrieves the value of a private field
        return passward;
    }
    void setpassward(int x){//Setter: Sets or updates the value of a private field.
        passward = x;
    }
    void setpassward2(int passward){
        this.passward = passward;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        bank user1 = new bank();
        user1.name = "Anurag";
        System.out.println(user1.name);

        user1.setpassward(999);
        System.out.println(user1.getpassward());//999
        user1.setpassward2(123);
        System.out.println(user1.getpassward());//123
    }
}
