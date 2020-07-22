package chapter8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator2 {
    private String username;
    private String password;

    private static Scanner scanner = new Scanner(System.in);

    public PasswordValidator2(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args){
        var validator = login();
        boolean valid = true;

        do{
            String newPassword = validator.getNewPassword();
            valid = validator.isValid(newPassword, validator.password, validator.username);

        }while(!valid);

        scanner.close();
    }

    public static PasswordValidator2 login(){
        System.out.println("Enter your user name");
        String username = scanner.next();

        System.out.println("Enter your password");
        String password = scanner.next();

        return new PasswordValidator2(username, password);
    }

    public static String getNewPassword(){
        System.out.println("Enter new password: ");
        return scanner.next();
    }

    public static boolean isValid(String password, String oldPassword, String username){
        if (isAtLeast8CharLong(password) && isContainingSpecialChar(password) && isContainingUpperCase(password) && isNotContainingUsername(password, username) && isNotTheSameAsOldPassword(password, oldPassword)){
            System.out.println("New password is valid!");
            return true;
        }
        else {
            System.out.println("Password is invalid. Provide next password according to rules");
            return false;

        }
    }

    public static boolean isAtLeast8CharLong(String password){
        if(password.length() >= 8){
            return true;
        }
        else{
            System.out.println("\nPassword must have at least 8 chars");
            return false;
        }
    }

    public static boolean isContainingUpperCase(String password){
        for (int i=0; i<password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                return true;
            }
        }
        System.out.println("Password must contain upper case");
        return false;
    }

    public static boolean isContainingSpecialChar(String password){
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        boolean check = m.find();

        if (check){
            return true;
        }
        else{
            System.out.println("Password must contain special char");
            return false;
        }
    }

    public static boolean isNotContainingUsername(String password, String username){
        if (password.contains(username)){
            System.out.println("Password cannot contain username");
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isNotTheSameAsOldPassword(String password, String oldPassword){
        if(password.equals(oldPassword)){
            System.out.println("Password cannot be the same as current password");
            return false;
        }
        else{
            return true;
        }

    }

}
