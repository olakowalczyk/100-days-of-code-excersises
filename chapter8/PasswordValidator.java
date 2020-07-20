package chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static String username = "Username";
    private static String oldPassword = "old_Password";
    private static String newPassword = "new_PasswordUser";

    public static void main (String[] args){

        isValid(newPassword, oldPassword, username);
    }

    public static boolean isValid(String password, String oldPassword, String username){
        if (isAtLeast8CharLong(password) && isContainingSpecialChar(password) && isContainingUpperCase(password) && isNotContainingUsername(password, username) && isNotTheSameAsOldPassword(password, oldPassword)){
            System.out.println("New password is valid!");
            return true;
        }
        else {
            System.out.println("Password is invalid. New password does not match the rules!");
            return false;

        }
    }

    public static boolean isAtLeast8CharLong(String password){
        if(password.length() >= 8){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isContainingUpperCase(String password){
        for (int i=0; i<password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                return true;
            }
        }
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
            return false;
        }
    }

    public static boolean isNotContainingUsername(String password, String username){
        if (password.contains(username)){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isNotTheSameAsOldPassword(String password, String oldPassword){
        if(password.equals(oldPassword)){
            return false;
        }
        else{
            return true;
        }

    }

}
