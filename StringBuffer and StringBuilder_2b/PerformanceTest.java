// 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
// appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
// your answer which one is better.

package assignment;

public class PerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;

        // Test with StringBuffer
        StringBuffer buffer = new StringBuffer();
        long startTimeBuffer = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            buffer.append("AIET");
        }
        long endTimeBuffer = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTimeBuffer - startTimeBuffer) + " ms");

        // Test with StringBuilder
        StringBuilder builder = new StringBuilder();
        long startTimeBuilder = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            builder.append("AIET");
        }
        long endTimeBuilder = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTimeBuilder - startTimeBuilder) + " ms");

        // Justification
        if ((endTimeBuilder - startTimeBuilder) < (endTimeBuffer - startTimeBuffer)) {
            System.out.println("StringBuilder is faster and better for single-threaded operations.");
        } else {
            System.out.println("StringBuffer is safer for multithreaded environments but slower.");
        }
    }
}
