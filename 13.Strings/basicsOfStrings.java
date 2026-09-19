public class basicsOfStrings {
    public static void main(String[] args){
        // String s = "Anurag";
        // System.out.println(s.indexOf("A"));//output : 0
        // System.out.println(s.indexOf("R"));//output : -1
        // System.out.println(s.indexOf("Anu"));//output : 0

        /*The compareTo() method is case-sensitive. For example, "apple".compareTo("Apple") will return a positive integer because 'a' has a higher Unicode value than 'A'.
        -If you want to perform a case-insensitive comparison, you can use compareToIgnoreCase() instead. */
        String str1 = "apple";
        String str2 = "Banana";
        String str3 = "apple";
        // System.out.println(str1.compareTo(str2)); // Negative value (str1 < str2)
        // System.out.println(str1.compareTo(str3)); // 0 (str1 == str3)
        // System.out.println(str2.compareTo(str1)); // Positive value (str2 > str1)

        System.out.println(str1.contains("pp"));//true
        System.out.println(str1.contains("xyz"));//false
        System.out.println(str1.startsWith("app"));//true
        System.out.println(str1.endsWith("ple"));//true
        System.out.println(str3.toUpperCase());//APPLE
        System.out.println(str2.toLowerCase());//banana

        //concatenation of string
        String s = "Hello";
        s = s + "xyz";// now s = Helloxyz
        System.out.println(s);
        s += 'A';// now s = HelloxyzA (A(char) pehle string me convert honga fir s(string) ke shat concate ho jayega)
        System.out.println(s);
        s += 1;// now s = HelloxyzA (1(int) pehle string me convert honga fir s(string) ke shat concate ho jayega)
        System.out.println(s);
        //== and .equals()
        // == opeator compares references (memory location).
        String a = "hi";
        String b = "hi";
        String c = new String("hi");
        System.out.println(a==b);//true (same reference in string pool)
        System.out.println(a==c);// false (different references)
        // .equals() compares actual content of the strings.
        System.out.println(a.equals(b));// true (same content)
        System.out.println(a.equals(c));// true (same content)
    }
}