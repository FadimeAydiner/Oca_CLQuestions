package Questions;

import java.util.Scanner;

public class Question5_switch {
    /*
 5. Which statement is true about the switch statement?
A. It must contain the default section.
B. The break statement, at the end of each case block, is optional.
C. Its case label literals can be changed at runtime.
D. Its expression must evaluate to a collection of values*/

    /*
    The break statements are technically optional.
    The effect of a break is to make the computer jump to the end of the switch statement.
     If you leave out the break statement, the computer will just forge ahead after completing one case and will execute the statements associated with the next case label.
     This is rarely what you want, but it is legal.
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();

        switch (s){
            case "a" :
                System.out.println("a");break;
            case "b":
                System.out.println("b");
        }

        //whatever i write break or not it still working. but without break it continue working after find the true case.
    }
}
