package com.siddy.app;

public class Cinema {

    public int allocateSeats(int seats){
        // Check seats allowed are only 1-3
        if (seats < 1 || seats >3){
            return 0;
        }
        return 1;
    }
}
