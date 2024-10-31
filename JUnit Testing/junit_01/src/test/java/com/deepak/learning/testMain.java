package com.deepak.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testMain {
    Main m=new Main();
    @Test
    public void test(){
        assertEquals(1,m.meth1());
    }
}
