package rikkei.academy;

import rikkei.academy.validate.EmailExample;

public class EmailExampleTest {
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "#abc@hotmail.com"};

    public static String emailTest = "sonjapan7@gmail.com";
    private static EmailExample emailExample;

    public static void main(String[] args) {
        emailExample = new EmailExample();
        boolean checkemail = emailExample.validate(emailTest);
        System.out.println("- Email: "+emailTest+" check email: "+checkemail);
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("_ Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("+ Email is " + email + " is valid: " + isvalid);
        }
    }
}
