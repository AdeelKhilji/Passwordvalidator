/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adeel Khilji
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLength-Good");
        String password = "Password123!";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals("Password meets the requirement", expResult, result);
        
    }
    
    @Test
    public void testCheckLengthBad() {
        System.out.println("checkLength-Bad");
        String password = "Passwrd";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals("Password does not meets the requirement", expResult, result);
        
    }
    
    @Test
    public void testCheckLengthBoundaryIn() {
        System.out.println("checkLength-BoundaryIn");
        String password = "Password123456!";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals("Password meets the requirement", expResult, result);
        
    }
    
    @Test
    public void testCheckLengthBoundaryOut() {
        System.out.println("checkLength");
        String password = "Pass12!";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals("Password does not meets the requirement", expResult, result);
        
    }

    @Test
    public void testCheckSpecialCharsGood() {
        System.out.println("checkSpecialChars-Good");
        String password = "Password123!";
        boolean expResult = true;
        boolean result = PasswordValidator.checkSpecialChars(password);
        assertEquals("Password meets the requirement", expResult, result);

    }
    
    @Test
    public void testCheckSpecialCharsBad() {
        System.out.println("checkSpecialChars-Bad");
        String password = "Password123";
        boolean expResult = false;
        boolean result = PasswordValidator.checkSpecialChars(password);
        assertEquals("Password does not meets the requirement", expResult, result);

    }
    
    @Test
    public void testCheckSpecialCharsBoundaryIn() {
        System.out.println("checkSpecialChars-BoundaryIn");
        String password = "Password!@#$!";
        boolean expResult = true;
        boolean result = PasswordValidator.checkSpecialChars(password);
        assertEquals("Password meets the requirement", expResult, result);

    }
    
    @Test
    public void testCheckSpecialCharsBoundaryOut() {
        System.out.println("checkSpecialChars-BoundaryOut");
        String password = "password";
        boolean expResult = false;
        boolean result = PasswordValidator.checkSpecialChars(password);
        assertEquals("Password does not meets the requirement", expResult, result);

    }

    @Test
    public void testCheckUpperCaseCharsGood() {
        System.out.println("checkUpperCaseChars-Good");
        String password = "Password123!";
        boolean expResult = true;
        boolean result = PasswordValidator.checkUpperCaseChars(password);
        assertEquals("Password meets the requirement", expResult, result);
        
    }
    
    @Test
    public void testCheckUpperCaseCharsBad() {
        System.out.println("checkUpperCaseChars-Bad");
        String password = "password";
        boolean expResult = false;
        boolean result = PasswordValidator.checkUpperCaseChars(password);
        assertEquals("Password does not meets the requirement", expResult, result);
        
    }
    
    @Test
    public void testCheckUpperCaseCharsBoundaryIn() {
        System.out.println("checkUpperCaseChars-BoundaryIn");
        String password = "PaSSword123!";
        boolean expResult = true;
        boolean result = PasswordValidator.checkUpperCaseChars(password);
        assertEquals("Password meets the requirement", expResult, result);
        
    }
    
    @Test
    public void testCheckUpperCaseCharsBoundaryOut() {
        System.out.println("checkUpperCaseChars-BoundaryOut");
        String password = "password";
        boolean expResult = false;
        boolean result = PasswordValidator.checkUpperCaseChars(password);
        assertEquals("Password does not meets the requirement", expResult, result);
        
    }
    
    

    @Test
    public void testCheckDigitsGood() {
        System.out.println("checkDigits-Good");
        String password = "Password123!";
        boolean expResult = true;
        boolean result = PasswordValidator.checkDigits(password);
        assertEquals("Password meets the requirement", expResult, result);
        
    }
    
    @Test
    public void testCheckDigitsBad() {
        System.out.println("checkDigits-Bad");
        String password = "Password";
        boolean expResult = false;
        boolean result = PasswordValidator.checkDigits(password);
        assertEquals("Password does not meets the requirement", expResult, result);
        
    }
    
    @Test
    public void testCheckDigitsBoundaryIn() {
        System.out.println("checkDigits-BoundaryIn");
        String password = "Password123";
        boolean expResult = true;
        boolean result = PasswordValidator.checkDigits(password);
        assertEquals("Password meets the requirement", expResult, result);
        
    }
    
    @Test
    public void testCheckDigitsBoundaryOut() {
        System.out.println("checkDigits-BoundaryOut");
        String password = "Password!@#%^";
        boolean expResult = false;
        boolean result = PasswordValidator.checkDigits(password);
        assertEquals("Password does not meets the requirement", expResult, result);
        
    }

    @Test
    public void testValidatePasswordGood() {
        System.out.println("validatePassword-Good");
        String password = "Password123!";
        boolean expResult = true;
        boolean result = PasswordValidator.validatePassword(password);
        assertEquals("Password meets the requirement", expResult, result);
    }
    
    @Test
    public void testValidatePasswordBad() {
        System.out.println("validatePassword-Bad");
        String password = "password";
        boolean expResult = false;
        boolean result = PasswordValidator.validatePassword(password);
        assertEquals("Password does not meets the requirement", expResult, result);
    }
    
    @Test
    public void testValidatePasswordBoundaryIn() {
        System.out.println("validatePassword-BoundaryIn");
        String password = "Password12345!";
        boolean expResult = true;
        boolean result = PasswordValidator.validatePassword(password);
        assertEquals("Password meets the requirement", expResult, result);
    }
    
    @Test
    public void testValidatePasswordBoundaryOut() {
        System.out.println("validatePassword-BoundaryOut");
        String password = "Pass12!";
        boolean expResult = false;
        boolean result = PasswordValidator.validatePassword(password);
        assertEquals("Password does not meets the requirement", expResult, result);
    }
    
}
