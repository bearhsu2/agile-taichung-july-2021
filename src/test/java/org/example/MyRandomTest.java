package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MyRandomTest extends MyRandom
{
    /**
     * Rigorous Test :-)
     */
    public double possibility;


    @Test
    public void _2_times() {
        MyRandomTest my = new MyRandomTest();
        my.setRandom(0.08);
        Assert.assertEquals(20, my.bet(10));
    }
    @Test
    public void _5_times() {
        MyRandomTest my = new MyRandomTest();
        my.setRandom(0.005);
        Assert.assertEquals(50, my.bet(10));
    }
    @Override
    public double genRandom() {
        return possibility;
    }
    public void setRandom(double p) {
        possibility = p;
    }
}
