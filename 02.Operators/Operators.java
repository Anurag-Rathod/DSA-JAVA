public class Operators {
    public static void main(String[] args) {
        /****************************************************************
         * 1. Arithmetic Operators
        ****************************************************************/
        int a = 10;
        int b = 3;
        System.out.println(a + b);   //13
        System.out.println(a - b);   //7
        System.out.println(a * b);   //30
        System.out.println(a / b);   //3
        System.out.println(a % b);   //1

        /*
        Integer Division
        10/3 = 3
        10.0/3 = 3.3333

        Always remember:
        int/int -> int
        */

        /****************************************************************
         * 2. Unary Operators
         ****************************************************************/
        int x = 5;
        System.out.println(+x);      //5
        System.out.println(-x);      //-5
        System.out.println(++x);     //6 (Pre Increment)
        System.out.println(x++);     //6 (Post Increment)
        System.out.println(x);       //7
        System.out.println(--x);     //6 (Pre Decrement)
        System.out.println(x--);     //6 (Post Decrement)
        System.out.println(x);       //5

        /****************************************************************
         * Pre vs Post Increment
         ****************************************************************/
        int i = 5;
        int ans1 = ++i;
        //i = 6
        //ans1 = 6
        int j = 5;
        int ans2 = j++;
        //ans2 = 5
        //j = 6

        /****************************************************************
         * 3. Assignment Operators
         ****************************************************************/
        int n = 10;
        n += 5;     //15
        n -= 3;     //12
        n *= 2;     //24
        n /= 4;     //6
        n %= 5;     //1

        /****************************************************************
         * 4. Relational Operators
         ****************************************************************/
        System.out.println(5 == 5);      //true
        System.out.println(5 != 3);      //true
        System.out.println(5 > 2);       //true
        System.out.println(5 < 2);       //false
        System.out.println(5 >= 5);      //true
        System.out.println(5 <= 6);      //true

        /****************************************************************
         * 5. Logical Operators
         ****************************************************************/
        boolean p = true;
        boolean q = false;
        System.out.println(p && q);      //false
        System.out.println(p || q);      //true
        System.out.println(!p);          //false
        /*
        AND (&&)
        true && true = true
        true && false = false
        false && true = false
        false && false = false
        */

        /*
        OR (||)
        true || true = true
        true || false = true
        false || true = true
        false || false = false
        */

        /*
        NOT (!)
        !true = false
        !false = true
        */

        /****************************************************************
         * Short Circuit Evaluation
         ****************************************************************/
        int num = 5;
        if(num > 0 && num++ > 5){
            //Second condition not executed
        }
        System.out.println(num);//5

        /****************************************************************
         * 6. Bitwise Operators
         ****************************************************************/
        int m = 5;
        int k = 3;
        System.out.println(m & k);
        System.out.println(m | k);
        System.out.println(m ^ k);
        System.out.println(~m);
        /*
        5 = 101
        3 = 011
        AND =001=1
        OR =111=7
        XOR=110=6
        */

        /****************************************************************
         * 7. Shift Operators
         ****************************************************************/
        System.out.println(5 << 1);      //10
        System.out.println(5 << 2);      //20
        System.out.println(20 >> 1);     //10
        System.out.println(20 >> 2);     //5
        /*
        <<
        Multiply by 2^k
        >>
        Divide by 2^k
        >>> Unsigned Right Shift
        */

        /****************************************************************
         * 8. Ternary Operator
         ****************************************************************/
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);

        /****************************************************************
         * Nested Ternary
         ****************************************************************/
        int marks = 82;
        String grade =
                (marks >= 90) ? "A" :
                (marks >= 75) ? "B" :
                (marks >= 60) ? "C" :
                "Fail";

        /****************************************************************
         * 9. instanceof Operator
         ****************************************************************/
        String str = "Hello";
        System.out.println(str instanceof String); //true


        /****************************************************************
         * 10. String Concatenation
        ****************************************************************/
        System.out.println("Hello " + "Java");
        System.out.println("Age : " + 20);
        System.out.println(5 + 10 + "Java");//15Java
        System.out.println("Java" + 5 + 10);//Java510

        /****************************************************************
         * 11. Comparison of Strings
         ****************************************************************/
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1.equals(s3));//true

        /****************************************************************
         * 12. Type Casting
        ***************************************************************/
        int value = 10;
        double d = value;//Implicit Casting
        double pi = 3.14;
        int integer = (int) pi;//Explicit Casting

        /*
        Arithmetic => +  Addition  , -  Subtraction  , *  Multiplication  , /  Division  , %  Modulus

        Unary =>  ++,  --,  +,  -,  !

        Assignment => = , += , -= , *= , /= , %=

        Relational =>  == , != , > , < , >= , <=

        Logical => &&, ||, !

        Bitwise => &, |, ^, ~

        Shift => <<, >>, >>>

        */

    }
}