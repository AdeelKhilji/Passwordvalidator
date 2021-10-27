/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import static passwordvalidator.PasswordValidator.*;

/**
 *
 * @author Adeel Khilji
 */
public class PasswordSimulation 
{
    public static void main(String[] args)
    {
        String passwordRegular = "Password123!";
        String passwordExceptional = "password";
        String passwordBoundaryIn = "Password123456!";
        String passwordBoundaryOut = "Pass12!";
        
        System.out.println("REGULAR");
        System.out.println(checkLength(passwordRegular));
        System.out.println(checkSpecialChars(passwordRegular));
        System.out.println(checkUpperCaseChars(passwordRegular));
        System.out.println(checkDigits(passwordRegular));
        System.out.println();
        
        System.out.println("EXCEPTINAL");
        System.out.println(checkLength(passwordExceptional));
        System.out.println(checkSpecialChars(passwordExceptional));
        System.out.println(checkUpperCaseChars(passwordExceptional));
        System.out.println(checkDigits(passwordExceptional));
        System.out.println();
        
        System.out.println("BROUNDARY IN");
        System.out.println(checkLength(passwordBoundaryIn));
        System.out.println(checkSpecialChars(passwordBoundaryIn));
        System.out.println(checkUpperCaseChars(passwordBoundaryIn));
        System.out.println(checkDigits(passwordBoundaryIn));
        System.out.println();
        
        System.out.println("BOUNDARY OUT");
        System.out.println(checkLength(passwordBoundaryOut));
        System.out.println(checkSpecialChars(passwordBoundaryOut));
        System.out.println(checkUpperCaseChars(passwordBoundaryOut));
        System.out.println(checkDigits(passwordBoundaryOut));
        System.out.println();
        
        System.out.println("VALIDATED");
        System.out.println(validatePassword(passwordRegular));
        System.out.println(validatePassword(passwordExceptional));
        System.out.println(validatePassword(passwordBoundaryIn));
        System.out.println(validatePassword(passwordBoundaryOut));      
    }
}
