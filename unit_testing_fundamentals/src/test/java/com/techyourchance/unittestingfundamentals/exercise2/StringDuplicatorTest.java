package com.techyourchance.unittestingfundamentals.exercise2;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class StringDuplicatorTest {
    
    StringDuplicator stringDuplicator;
    
    @Before
    public void setup() {
        stringDuplicator = new StringDuplicator();
    }

    @Test
    public void duplicate_emptyString_emptyStringReturned() {
        assertThat(stringDuplicator.duplicate(""), CoreMatchers.is(""));
    }

    @Test
    public void duplicate_smallString_duplicateStringReturned() {
        assertThat(stringDuplicator.duplicate("abc"),CoreMatchers.is("abcabc"));
    }

    @Test
    public void duplicate_longString_duplicateStringReturned() {
        assertThat(stringDuplicator.duplicate("AkashBisariya"),CoreMatchers.is("AkashBisariyaAkashBisariya"));
    }



}