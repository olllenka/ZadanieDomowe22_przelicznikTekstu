public class TextStats {

    public static int numberOfWords(String text){
        String[] words = text.split(" ");
        return words.length;
    }

    public static  int numberOfAllChars(String text){
        return text.length();
    }

    public static int numberOfChars(String text){
        String textWithoutSpaces = text.replace(" ", "");
        return textWithoutSpaces.length();
    }

    public static boolean isPalindrom(String text){
        String lowerCaseTextWithoutSpaces = text.replace(" ", "").toLowerCase();
        char[] chars = lowerCaseTextWithoutSpaces.toCharArray();

        for(int i=0; i<chars.length/2; i++){
            if(chars[i]!=chars[chars.length-1-i])
                return false;
        }
        return true;
    }
}
