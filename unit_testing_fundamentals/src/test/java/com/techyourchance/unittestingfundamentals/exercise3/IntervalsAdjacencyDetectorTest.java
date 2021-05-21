package com.techyourchance.unittestingfundamentals.exercise3;

import com.techyourchance.unittestingfundamentals.example3.Interval;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class IntervalsAdjacencyDetectorTest {

    IntervalsAdjacencyDetector intervalsAdjacencyDetector;

    @Before
    public void setUp() throws Exception {
        intervalsAdjacencyDetector = new IntervalsAdjacencyDetector();
    }

    //adjacent to start
    @Test
    public void isAdjacent_adjacentToStart_true() {
        Interval interval1 = new Interval(2,5);
        Interval interval2 = new Interval(1,2);
        assertThat(intervalsAdjacencyDetector.isAdjacent(interval1,interval2), CoreMatchers.is(true));
    }

    //adjacent to end
    @Test
    public void isAdjacent_adjacentToEnd_true() {
        Interval interval1 = new Interval(2,5);
        Interval interval2 = new Interval(5,10);
        assertThat(intervalsAdjacencyDetector.isAdjacent(interval1,interval2), CoreMatchers.is(true));
    }

    //interval 1 contains interval 2
    @Test
    public void isAdjacent_interval1ContainsInterval2_false() {
        Interval interval1 = new Interval(2,5);
        Interval interval2 = new Interval(3,4);
        assertThat(intervalsAdjacencyDetector.isAdjacent(interval1,interval2), CoreMatchers.is(false));
    }

    //interval 1 within interval 2
    @Test
    public void isAdjacent_interval1WithinInterval2_false() {
        Interval interval1 = new Interval(2,5);
        Interval interval2 = new Interval(-1,10);
        assertThat(intervalsAdjacencyDetector.isAdjacent(interval1,interval2), CoreMatchers.is(false));
    }

    //equal interval
    @Test
    public void isAdjacent_interval1EqualInterval2_false() {
        Interval interval1 = new Interval(2,10);
        Interval interval2 = new Interval(2,10);
        assertThat(intervalsAdjacencyDetector.isAdjacent(interval1,interval2), CoreMatchers.is(false));
    }

    //interval1 before interval2
    @Test
    public void isAdjacent_interval1BeforeInterval2_false() {
        Interval interval1 = new Interval(3,5);
        Interval interval2 = new Interval(-1,1);
        assertThat(intervalsAdjacencyDetector.isAdjacent(interval1,interval2), CoreMatchers.is(false));
    }

    //interval1 after interval2
    @Test
    public void isAdjacent_interval1AfterInterval2_false() {
        Interval interval1 = new Interval(3,5);
        Interval interval2 = new Interval(8,10);
        assertThat(intervalsAdjacencyDetector.isAdjacent(interval1,interval2), CoreMatchers.is(false));
    }

}