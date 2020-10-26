package lambdasinaction.appa;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Repeatable(Authors.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {

    String name();
    public class ContohPercabanganSwitch {

   public static void main(String args[]) {

      char grade = 'A';
        
      switch(grade) {
         case 'A' :
            System.out.println("Perfect!");
            // Statements
            break;
            // You can have any number of case statements.
         case 'B' :
            System.out.println("Excellent!");
            // Statements
            break;
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}
}
//

