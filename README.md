# CS1400---Dice_Roll_Simulation

This program simulates rolls for two six-sided die, adding the values of each roll together. The user inputs the number of rolls they would like to simulate. The individual dice rolls are determined via random number generator. It then outputs a histogram showing what percentage of the total dice rolls were of a particular value ranging from 2 - 12. The histogram is represented using asterisks with each asterisk representing 1% of the total dice rolls. 

This is done using several different arrays. There is an array which keeps track of the number of times each die sum value occurs, and an array for each possible die sum value (2 - 12) which stores asterisks for displaying the histogram. Histogram results are calculated by dividing the value of each index of the die sum array by a value representing one percent of the total dice rolls (number of simulated rolls / 100). An appropriate number of asterisks are added to the corresponding result array, and the final results are then displayed to the user.

<b>Program Execution Screenshot</b>

![image](https://user-images.githubusercontent.com/70240084/231850260-9c9aa09b-2f34-448a-aeb8-7aa646471954.png)
