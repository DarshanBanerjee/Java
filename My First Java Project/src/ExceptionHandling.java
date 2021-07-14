import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        /*
        There are 3 types of Errors :-
            1. Compile-Time Errors
            2. Logical Errors
            3. Run-Time Errors

            I. Compile-Time Errors :-
                Syntax Errors (Wrong Spellings, Missing Symbols etc)

            II. Logical Errors :-
                No Compile-Time Errors, but Errors that are not expected. (Ex. :- 2 + 2 = 5 Here, it might be 5 in some cases,
                                                                                            but it is not expected by us.)
            III. Run-Time Errors :-
                No Compile-Time Errors (All Syntax is correct), No Logical Errors (We are getting the right output), But
                there might be any issue at the Run-Time. (Ex. :- Any Problem with the user input -> (Ex. :- Division by Zero),
                                                                  Any Webpage is to open but it is not reachable -> (Ex. :- Error 404),
                                                                  Any File is to open but it doesn't exist (Ex. :- File is deleted) etc.)
                It depended on any input or file but that is wrong, so the application will stop in between.



         The easiest Error to solve is Compile-Time Error, because we get in which line the error is if we use an IDE.

         Logical Errors can be solved at the time of Testing.

         Run-Time Errors are not usually got at the developer side. It mostly occurs on the user side.
         Then how to solve it?
         Here, Exception Handling is used.
         The place where an Error is likely to occur is written under a "try" block.
         Only if there is a Run-Time Error, with the statements in the try block, the statements under the "except" block is executed.
         And the statements under the "finally" block are executed in both the conditions.

         There are 2 types of Exceptions :-
            1. Checked Exception
            2. Unchecked Exception

            I. Checked Exceptions :-
              These Exceptions are already known to your Compiler. They will give a prompt on run-time to create try-catch blocks.
              So, it is mandatory to handle those Exceptions.

            II. Unchecked Exception :-
              These Exceptions are not known to the Compiler. So, it is the job of the developer to handle this on their own.

        We can also create Exceptions on our own. These are called User-Defined/Custom Exceptions.

        Let us see all these an example with one of the most famous run-time Errors - 'The Zero Division Error'
        and also, the "NullPointer Exception"...
         */

        int i = 9;
        Scanner sc = new Scanner(System.in);
        System.out.print("What do you want to divide with 9 : ");
        int divisor = sc.nextInt();
        String name = null;

        try { // Try Block
            System.out.println("The answer is - " + (9 / divisor));
            System.out.println(name.length()); // Here, it will not execute this statement if there is an exception before.
                                               // It will directly jump out of the try block.
        }

        catch(ArithmeticException e)  // Catching if it gives an Error.
        { // Exception Block

            System.out.println("Sorry, You can't divide a number by Zero. The Error is - '" + e + "'");
        }
        catch(NullPointerException f)
        {
            System.out.println("Null Object");
        }
        finally {
            sc.close();
            System.out.println("Bye!");
        }
        /*
        If we want to do the same task for multiple Exceptions, we can use the "OR" Logical Operator ("|" Symbol).
         */
            int j = 9;
            Scanner scan = new Scanner(System.in);
            System.out.print("What do you want to divide with 9 : ");
            int divisor2 = sc.nextInt();
            String name2 = null;
            /*
            IF WE WRITE "System.exit();" UNDER TRY BLOCK, THE STATEMENTS UNDER THE FINALLY BLOCK WILL NOT BE EXECUTED (Try it!).
             */

            try { // Try Block
                System.out.println("The answer is - " + (j / divisor2));
                System.out.println(name2.length()); // Here, it will not execute this statement if there is an exception before.
                // It will directly jump out of the try block.
            }

            catch(ArithmeticException | NullPointerException e)  // Multiple Exc
            { // Exception Block

                System.out.println("Oops! Error...");
            }
            finally {
                scan.close();
                System.out.println("Bye!");
            }
        }
    }
}
