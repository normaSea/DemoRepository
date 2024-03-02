package com.jtdev.glink;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

public class ExampleUnitTest {

    @Test
    public void UserCredentialChecker(){
        //Mock Data
        String username = "johndoe123@example.com";
        String password = "J0nesEms!";

        AccountService ln = new AccountService();
        boolean check = ln.UserCredentialChecker(username, password);
        assertTrue(check);

    }
    @Test
    public void checkWhiteSpace(){
        String password = "1234 5678";

        // boolean check = signUp.WhiteSpacePass(password);
        // assertTrue(check);
    }
    @Test
    public void checkEmailifTaken(){
        String email = "johnpatrick@gmail.com";

        //boolean check = signUp.emailComparison(email);
        // assertTrue(check);
    }
    @Test
    public void testAgeThrowsImputMismatch() {

        boolean thrown = false;

        try {
            //signUp.validAge();
        } catch (InputMismatchException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

}
