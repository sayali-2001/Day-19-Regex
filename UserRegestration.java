package RegexExamples;

import java.util.Scanner;

public class UserRegestration {
    Scanner sc  = new Scanner(System.in);
    //UC1
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
    //UC2
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
    //UC3
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
    //UC4
    private void validNumber(){
        System.out.println("Enter Your Mobile Number : ");
        String num = sc.next();
        String pattern = "^(0/91)?[7-9][0-9]{9}$";
        if(num.matches(pattern)){
            System.out.println("Valid Mobile Number ");
        }
        else {
            System.out.println("Invalid Mobile Number ");
        }
    }
    //UC5
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
    //UC6
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
    //UC7
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
    //UC 8
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
        
    }
}
//[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+(@)[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+