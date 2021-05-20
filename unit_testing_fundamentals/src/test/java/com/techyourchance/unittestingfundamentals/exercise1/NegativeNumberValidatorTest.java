package com.techyourchance.unittestingfundamentals.exercise1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class NegativeNumberValidatorTest {

    NegativeNumberValidator negativeNumberValidator;

    @Before
    public void setup(){
        negativeNumberValidator = new NegativeNumberValidator();
    }

    @Test
    public void negative_negativeNumber_trueReturned(){
        Assert.assertThat(negativeNumberValidator.isNegative(-1),is(true));
    }

    @Test
    public void negative_negativeNumber1_trueReturned(){
        Assert.assertThat(negativeNumberValidator.isNegative(-22),is(true));
    }

    @Test
    public void negative_positiveNumber_falseReturned(){
        Assert.assertThat(negativeNumberValidator.isNegative(0),is(false));
    }

    @Test
    public void negative_positiveNumber1_falseReturned(){
        Assert.assertThat(negativeNumberValidator.isNegative(10000),is(false));
    }



}