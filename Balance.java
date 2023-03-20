/**
 * Add your solution to Practice Exercise 1.4 in this file
 *
 * ALSO answer the questions in the comments below.  (You may add your answers as further comments.)
 *
 * Write a program that prints the balance of an account after the first, second, and third year.
 * The account has an initial balance of $1,000 and earns 5 percent interest per year.
 *
 */

public class Balance {
    public static void main(String[] args)
    {
        float P = 1000f;
        float R = 0.05f;

        for(int x = 1; x < 4; x++)
        {
            System.out.println("Year " + x + " balance: " + (P + (P * R * x)));
        }

        // QUESTION 1: Why does the program fail to run if you rename the class to something other than Balance?

        //The program fails to run because in java the class must have the same name as the file.
        //Any other filename MUST be the same as the class' name or vise versa, or the program won't run.

        // QUESTION 2: Why must the main method be declared as public static void? (Explain each keyword specifically.)

        //The public is an access specifier, meaning that the main method is public to the entire program.
        //The Static means that main can be accessed without creating an object of the class.
        //The void represents the return type (or lack thereof because it's void) of the method. Different methods can have
        //different return types, and this applies to all types.

        // QUESTION 3: Why must all variables you declare be declared with a type?

        //All variables must have a type assigned when they're declared because java is a statically typed language.
        //the JVM knows what to do with each individual type, and if a variable has no type, it doesn't know what to do
        // with it
    }
}
