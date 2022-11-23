package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public static void printByteBinary(byte b) {
        // We first want to print the bit in the one's place
    	
        // Shift b seven bits to the right
    	
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
    	
        // Print the result using System.out.print (NOT System.out.println)
    	
        //Use this method to print the remaining 7 bits of b
    	
    	System.out.print((b & 0b10000000) >> 7);
    	System.out.print((b & 0b01000000) >> 6);
    	System.out.print((b & 0b00100000) >> 5);
    	System.out.print((b & 0b00010000) >> 4);
    	System.out.print((b & 0b00001000) >> 3);
    	System.out.print((b & 0b00000100) >> 2);
    	System.out.print((b & 0b00000010) >> 1);
    	System.out.print((b & 0b00000001) >> 0);
    }

    public static void printShortBinary(short s) {
        // Create 2 byte variables

        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte

        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    	
    	byte byte1 = (byte)(s >> 8);
    	byte byte2 = (byte)((s << 8) >> 8);
    	
    	printByteBinary(byte1);
    	printByteBinary(byte2);
    }

    public static void printIntBinary(int i) {
        // Create 2 short variables
    	short short1 = (short)(i >> 16);
    	short short2 = (short)((i << 16) >> 16);
    	
    	printShortBinary(short1);
    	printShortBinary(short2);
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short

        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    }

    public static void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	int int1 = (int)(l >> 32);
    	int int2 = (int)((l << 32) >> 32);
    	
    	printIntBinary(int1);
    	printIntBinary(int2);
    }

    public static void main(String[] args) {
        // Test your methods here
    	printByteBinary((byte)(255));
    	System.out.println();
    	printShortBinary((short)(256));
    	System.out.println();
    	printIntBinary(2147483647);
    	System.out.println();
    	printLongBinary(9223372036854775807l);
    }
}
