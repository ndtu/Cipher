import java.util.Scanner;

public class Cipher {

    private static boolean isLowerCase(char letter) {
        Scanner next1 = new Scanner(System.in);
        char first = next1.nextLine().toCharArray()[0];
        boolean second = Character.isLowerCase(first);
        if(second) {
            return true;
        }
        else{
            return false;
    
} 
}
    private static boolean isLowerCase(String str) {
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

