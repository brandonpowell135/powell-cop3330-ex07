/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Brandon Powell
 */

/*Exercise 7 - Area of a Rectangular Room
When working in a global environment, you’ll have to present information in both metric and Imperial units. And you’ll need to know when to do the conversion to ensure the most accurate results.

Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet. Then display the area in both square feet and square meters.

Example Output

What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters

The formula for this conversion is m2 = f2 × 0.09290304

Constraints

Keep the calculations separate from the output.
Use a constant to hold the conversion factor.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Create a new version of the program that allows you to choose feet or meters for your inputs.
Implement this program as a GUI program that automatically updates the values when any value changes.
 */
import java.util.Scanner;
public class ex07 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("What is the length of the room in feet? ");
        String string1 = in.nextLine();
        double length = Double.parseDouble(string1);

        System.out.print("What is the width of the room in feet? ");
        String string2 = in.nextLine();
        double width = Double.parseDouble(string2);

        System.out.println(String.format("You entered dimensions of %.0f feet by %.0f feet.",length, width));

        double sqft = length * width;
        double sqm = sqft * 0.09290304;
        System.out.print(String.format("The area is \n%.0f square feet\n%.3f square meters",sqft,sqm));
    }
}
