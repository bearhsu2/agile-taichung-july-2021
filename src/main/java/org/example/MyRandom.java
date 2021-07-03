package org.example;

/**
 * Hello world!
 *
 */
public class MyRandom
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        System.out.println()
    }
    public int bet(int originMoney) {
     double p = genRandom();
     return randomGetMoney(originMoney, p);
    }
    public int randomGetMoney(int originMoney, double possibility) {
        if (possibility >= 0.01 && possibility  < 0.09) {
            return originMoney * 2;
        } else if (possibility < 0.01) {
            return originMoney * 5;
        }
        return 0;
    }
    public double genRandom() {
        return Math.random();
    }
}
