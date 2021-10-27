/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

/**
 *
 * @author Adeel Khilji
 */
public class PasswordValidator 
{
    protected static boolean checkLength(String password)
    {
        return (password.length() >= 8);
    }
    protected static boolean checkSpecialChars(String password)
    {
        boolean isTrue = false;
        char[] specialChars = {'@','$','+','!','#','?','%','&'};
        for(char s: specialChars)
        {
            for(char p: password.toCharArray())
            {
                if(s == p)
                {
                    isTrue = true;
                }
            }    
        }
        return isTrue;
    }
    
    protected static boolean checkUpperCaseChars(String password)
    {
        boolean isUpper = false;
        String passToUpper = password.toUpperCase();
        for(char p: password.toCharArray())
        {
            for(char pToUpper: passToUpper.toCharArray())
            {
                if(p == pToUpper)
                {
                    isUpper = true;
                }
            }
        }
        return isUpper;
    }
    
    protected static boolean checkDigits(String password)
    {
        boolean hasDigit = false;
        char[] digits = {'1','2','3','4','5','6','7','8','9','0'};
        for(char d: digits)
        {
            for(char p: password.toCharArray())
            {
                if(d == p)
                {
                    hasDigit = true;
                }
            }
        }
        return hasDigit;
    }
    
    public static boolean validatePassword(String password)
    {
        boolean isValid = false;
        if(checkLength(password) == true && checkDigits(password) == true && checkSpecialChars(password) == true && checkUpperCaseChars(password))
        {
            isValid = true;
        }
        
        return isValid;
    }
}
