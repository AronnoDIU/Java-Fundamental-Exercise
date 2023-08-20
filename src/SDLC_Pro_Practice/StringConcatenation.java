package SDLC_Pro_Practice;

/*
* We can use "StringBuilder" to concat our string for better performance.
It also makes memory efficiency.
* */

public class StringConcatenation {
    public static void main(String[] args){

        // Wrong way of String Concatenation

        /*
        * long startTime = System.currentTimeMillis();

        String string = "Hello world ";

        for (int i=0; i<100_000; i++){
            string += "program ";
            string += "by ";
            string += "Java ";
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");
        * */

        /*
        *  Output: Profiling started 18856 ms
        * */


        // Right way of String Concatenation


        long startTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("Hello world ");

        for (int i=0; i<100_000; i++){
            stringBuilder.append("program ");
            stringBuilder.append("by ");
            stringBuilder.append("Java ");
        }
        System.out.println(System.currentTimeMillis() - startTime + " ms");
    }
}
