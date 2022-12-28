package RegexExamples;

import java.util.Scanner;

public class UserRegestration {
    Scanner sc  = new Scanner(System.in);
    private void validFirstName(){
        System.out.println("Enter First Name : ");

        String firstName = sc.next();
        String pattern = "^[A-Z][a-z]{2}[a-z]+";
        if(firstName.matches(pattern)){
            System.out.println("This is Valid First Name");
        }
        else{
            System.out.println("invalid First Name");
        }
    }
    public void validLastName(){
        System.out.println("Enter Last Name : ");
        String lastName = sc.next();
        String pattern = "^[A-Z]{1}[a-z]{2,}";
        if(lastName.matches(pattern)){
            System.out.println("This is Valid Last Name");
        }
        else{
            System.out.println("invalid last Name");
        }
    }
    private void validEmail(){
        System.out.println("Enter Your Email : ");
        String email = sc.next();
        String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        if(email.matches(pattern)){
            System.out.println("This is Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }
    }
    private void validNumber(){
        System.out.println("Enter Your Mobile Number : ");
        String num = sc.next();
        String pattern = "^([0-9]{2}[ ][1-9]{1}[0-9]{9})$";
        if(num.matches(pattern)){
            System.out.println("Valid Mobile Number ");
        }
        else {
            System.out.println("Invalid Mobile Number ");
        }
    }
    private void validPasswordEightDigit(){
        System.out.println("Enter Your PassWord ");
        String pass = sc.next();
        String pattern = "[a-zA-Z0-9]{8,}";
        if(pass.matches(pattern)){
            System.out.println("This is Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
    private void validPasswordUpperCase(){
        System.out.println("Enter Your PassWord ");
        String pass = sc.next();
        String pattern = "^[A-Z]{1}[a-zA-Z0-9]{8,}$";
        if(pass.matches(pattern)){
            System.out.println("This is Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
    private void validPasswordOneNumeric(){
        System.out.println("Enter Your PassWord ");
        String pass = sc.next();
        String pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}";
        if(pass.matches(pattern)){
            System.out.println("This is Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }

    }
    private void validPasswordSpecialChar(){
        System.out.println("Enter Your PassWord ");
        String pass = sc.next();
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
        if(pass.matches(pattern)){
            System.out.println("This is Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
    public static void main(String[] args) {
        UserRegestration obj = new UserRegestration();
        obj.validFirstName();
        obj.validLastName();
        obj.validEmail();
        obj.validNumber();
        obj.validPasswordEightDigit();
        obj.validPasswordUpperCase();
        obj.validPasswordOneNumeric();
        obj.validPasswordSpecialChar();
        obj.validPasswordOneNumeric();
    }
}
