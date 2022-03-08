/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;
import java.util.Scanner;


/**
 * The signIn page for UnoOnline. Takes in a user name and password and then
 * validates the password before creating a new user in the list of possible
 * users. To be used as the beginning code for MidtermReview C.
 *
 * @author Divya, 2022
 */
public class UnoOnline {

    public static void main(String[] args) {
        PasswordValidator pass = new PasswordValidator();
        pass.run();
        
    }
    /**
     * method that takes in the User's name and chosen password and then
     * continues prompting until the password is valid based on the following
     * two rules: 1. The password must be at least length 8 2. The password must
     * contain at least one "special character"
     *
     */

}//end class
