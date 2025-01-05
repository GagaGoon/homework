package module1;

public class Ex27 {
    public static boolean isPalindrome(String text){
        String textReformed = new String(text.replaceAll("[^a-zA-Z0-9]", ""));
        String textReformedReversed = new String(new StringBuilder(textReformed).reverse());
        if(textReformed.equalsIgnoreCase(textReformedReversed)){
            return true;
        }
        else {
            return false;
        }
    }
}
