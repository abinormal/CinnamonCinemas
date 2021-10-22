package com.siddy.app;

import java.util.Arrays;

public class Cinema {

    private int[][] seatingArray = new int[3][5];
    private final int seatsLeft = 15;
    private final int maxSeatsAlloc = 3;

    public Cinema() {
        for (int[] row : seatingArray) {
            Arrays.fill(row, 0);
        }
    }

    public int allocateSeats(int seats) {
        // Check seats allowed are only 1-3
        if (seats < 1 || seats > maxSeatsAlloc) {
            return 0;
        }
        return addToArray(seats);
    }

    private int addToArray(int seatsRequested) {
        int seatsAllocated = 0;
        if (seatsLeft >= seatsRequested) {
            // Break label
            breakOutOfNestedLoop:
            for (int[] row : seatingArray) {
                for (int seat : row) {
                    if (seat == 0) {
                        seat = 45;
                        seatsAllocated++;
                        seatsRequested--;
                        System.out.print("Seat:" + seat + " ");
                    }
                    if (seatsRequested <= 0) {
                        break breakOutOfNestedLoop;
                    }
                }
            }
        }
        return seatsAllocated;
    }
}

