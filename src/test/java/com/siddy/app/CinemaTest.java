package com.siddy.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CinemaTest {

    @Test
    public void checkSeatsAllocated(){
        // Arrange
        Cinema cinema = new Cinema();
        // Act
        int allocated = cinema.allocateSeats(2);
        // Assert
        assertEquals(2, allocated);
    }
}
