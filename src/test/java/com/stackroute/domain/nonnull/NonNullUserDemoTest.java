package com.stackroute.domain.nonnull;

import org.junit.Test;

public class NonNullUserDemoTest {
    private NonNullUserDemo nonNullUserDemo;

    @Test(expected = NullPointerException.class)
    public void testNonNullOnConstruuctorParameter() {
        nonNullUserDemo = new NonNullUserDemo(50, null, 25);
    }
}