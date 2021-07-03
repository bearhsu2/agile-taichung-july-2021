package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static int randomGetMoney(int originMoney, double p) {
        int result = 0;
//        int ratio = 0;
        if (p  < 0.09) {
            result = originMoney * 2;
        } else if (p < 0.01) {
            result = originMoney * 5;
        }
        return result;
    }
    public static double genRandom() {
        return Math.random();
    }
}
