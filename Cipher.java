/** This is the file for the cipher assignment.
    In this file, the methods that are used takes the scanner input 
    and checks if the input consist of lowercase letters.
    Norman Tu, email: ndtu@ucsd.edu
**/
import java.util.Scanner;


/**
The purpose of this class is to have the two methods where they
check if the inputs are lowercased.
**/
public class Cipher {

 /**
 The purpose of this method is to take the first letter of the char scanner input and check
if it is lowercased. If it is, then it returns true, if not, it returns false.
 **/
    public static boolean isLowerCase(char letter) {
        Scanner next1 = new Scanner(System.in);
        char first = next1.nextLine().toCharArray()[0];
        boolean second = Character.isLowerCase(first);
        if(second) {
            return true;
        }
        else{
            return false;
    
} 
 /**
 The purpose of this method is to check the entire string input 
 and check if the entire string is lowercased using a for loop and an 
 array.
 **/
}
    public static boolean isLowerCase(String str) {
        Scanner next2 = new Scanner(System.in);
        String third = next2.nextLine();
        char[] CharacterArray = third.toCharArray();
        for(int i = 0; i < CharacterArray.length; i ++) {
            if(Character.isLowerCase(CharacterArray[i])) {
            return true;
        }
       
}
          return false;
}
}

