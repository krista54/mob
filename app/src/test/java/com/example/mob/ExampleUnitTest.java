package com.example.mob;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Min1() {
        assertEquals(MainActivity.Min(2,1),1);
    }
    @Test
    public void Min2() {
        assertEquals(MainActivity.Min(1,2),1);
    }
    @Test
    public void Min3() {
        assertEquals(MainActivity.Min(2,-1),-1);
    }
    @Test
    public void Min4() {
        assertEquals(MainActivity.Min(-2,-1),-2);
    }
    @Test
    public void Max1() {
        assertEquals(MainActivity.Max(2,1),2);
    }
    @Test
    public void Max2() {
        assertEquals(MainActivity.Max(1,2),2);
    }
    @Test
    public void Max3() {
        assertEquals(MainActivity.Max(-2,1),1);
    }
    @Test
    public void Max4() { assertEquals(MainActivity.Max(-2,-1),-1); }
}