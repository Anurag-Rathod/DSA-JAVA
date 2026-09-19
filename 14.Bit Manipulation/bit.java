public class bit {
    public static void main(String[] args){
        // Important operators:
        // &  -> AND
        // |  -> OR
        // ^  -> XOR
        // ~  -> NOT
        // << -> Left Shift
        // >> -> Right Shift

        int a = 5;
        int b = 3;
        // AND:
        // Dono bits 1 hongi tabhi result 1 hoga.
        // 101
        // 011
        // ---
        // 001 = 1
        System.out.println(a & b);

        // OR:
        // Koi bhi ek bit 1 hai to result 1 hoga.
        // 101
        // 011
        // ---
        // 111 = 7
        System.out.println(a | b);

        // XOR:
        // Same bits -> 0
        // Different bits -> 1
        // 101
        // 011
        // ---
        // 110 = 6
        System.out.println(a ^ b);

        // NOT:
        // Har bit ko reverse karta hai.
        // ~5 = -6
        System.out.println(~a);

        // Left Shift:
        // Bits ko left shift karta hai.
        // 5 = 101
        // 5 << 1 = 1010 = 10
        // Generally x << 1 = x * 2
        System.out.println(5 << 1);

        // Right Shift:
        // Bits ko right shift karta hai.
        // 10 = 1010
        // 10 >> 1 = 0101 = 5
        // Generally positive number ke liye x >> 1 = x / 2
        System.out.println(10 >> 1);

        // Kth bit check:
        // Formula: (n & (1 << k)) != 0
        // Bit positions right se 0 se start hoti hain.
        int n = 10; // 1010
        int k = 1;

        if ((n & (1 << k)) != 0) {
            System.out.println("Bit is 1");
        } else {
            System.out.println("Bit is 0");
        }

        // Kth bit SET karna:
        // Set ka matlab kth bit ko 1 banana.
        // Formula: n | (1 << k)
        n = 10; // 1010
        k = 0;

        n = n | (1 << k);
        System.out.println(n); // 1011 = 11

        // Kth bit CLEAR karna:
        // Clear ka matlab kth bit ko 0 banana.
        // Formula: n & ~(1 << k)
        n = 10; // 1010
        k = 1;

        n = n & ~(1 << k);
        System.out.println(n); // 1000 = 8

        // Kth bit TOGGLE karna:
        // 0 -> 1
        // 1 -> 0
        // Formula: n ^ (1 << k)
        n = 10; // 1010
        k = 1;

        n = n ^ (1 << k);
        System.out.println(n); // 1000 = 8

        // Odd / Even check:
        // Last bit:
        // Even -> 0
        // Odd -> 1
        // Isliye n & 1 use kar sakte hain.
        n = 10;

        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Rightmost set bit remove karna:
        // Formula: n & (n - 1)
        // Ye rightmost 1 ko remove kar deta hai.
        // 12 = 1100
        // 11 = 1011
        //      1100
        //    & 1011
        //      ----
        //      1000 = 8
        n = 12;

        System.out.println(n & (n - 1));

        // Power of 2 check:
        // Power of 2 mein sirf ek set bit hoti hai.
        // 1  = 0001
        // 2  = 0010
        // 4  = 0100
        // 8  = 1000
        //
        // Formula:
        // n > 0 && (n & (n - 1)) == 0
        n = 16;

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not Power of 2");
        }

        // Count Set Bits:
        // Set bit ka matlab bit = 1.
        // n & (n - 1) har baar ek set bit remove karta hai.
        // Example: 13 = 1101
        // Isme 3 set bits hain.
        n = 13;
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println(count);

        // XOR ki important properties:
        // a ^ a = 0
        // a ^ 0 = a
        System.out.println(5 ^ 5); // 0
        System.out.println(5 ^ 0); // 5

        // Single Number:
        // [2,3,2,4,4]
        // Same numbers XOR hone par 0 ho jate hain.
        // 2 ^ 2 = 0
        // 4 ^ 4 = 0
        // Sirf 3 bachega.
        int[] nums = {2, 3, 2, 4, 4};

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        System.out.println(result);
    }
}
