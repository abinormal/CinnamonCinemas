package com.siddy.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CinemaTest {

    Cinema cinema;

    @Before
    public void setup(){
        cinema = new Cinema();
    }

    @Test
    public void checkZeroSeatsRequest(){
        // Act
        int allocated = cinema.allocateSeats(0);
        // Assert
        assertEquals(0, allocated);
    }

    @Test
    public void checkTooManySeatsRequest(){
        // Act
        int allocated = cinema.allocateSeats(4);
        // Assert
        assertEquals(0, allocated);
    }

    @Test
    public void checkSeatsAllocated(){
        // Act
        int allocated = cinema.allocateSeats(2);
        // Assert
        assertEquals(2, allocated);
    }


}
