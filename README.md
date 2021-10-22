# Cinnamon Cinemas

TDD exercise to create a seat allocation system for a cinema.

## Future

If I were to extend this code to cover cinemas with different seating etc I would set the seatsLeft and maxSeatsAlloc variables in the Cinema constructor. 

## Task Description

### Setting the Scene
You have a special task from Cinnamon Cinemas to develop a program to allocate seats to customers purchasing tickets for a movie theatre.
Cinnamon Cinemas provided some criteria for how the program should be built.

### Business Requirements
The Cinnamon Cinemas Movie Theatre has 15 seats, arranged in 3 rows of 5
* Rows are assigned a letter from A to C
* Seats are assigned a number from 1 to 5

### User Story
**As a** Cinnamon Cinemas Movie Theatre Manager **I** want to allocate seats to customers **So that** I can control reserved seating for the theatre
* GIVEN a customer wants to request some tickets
* WHEN they request a number of seats between 1 and 3 for a movie
* THEN the customer should be allocated the required number of seat from the available seats on the seating plan
* AND the seats should be recorded as allocated
