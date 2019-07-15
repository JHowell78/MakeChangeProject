## Week 1: Make Change Project

Week 1 project for Skill Distillery Java Bootcamp

### Overview

A simple program to make change from an item purchased.  It asks the user to input the cost of the item purchased and the amount of money the customer is paying  with. It then calculates the correct change in each denomination (twenty dollar bills all the way through pennies).
The user input for the price and the amount tendered must be numbers.

### Technologies Used

* Java
* Eclipse
* Git
* Atom


### Plan of Attack 

For the making change method I converted the change amount into pennies divided the change in pennies by how many pennies per denomination (ex change/500 pennies for a 5 dollar bill) and calculated the remainder using the modulus of the divisor for each denomination (remainder = % 500 for a 5 dollar bill) and pass that new amount of change down to the next smallest denomination until the change equals zero.
