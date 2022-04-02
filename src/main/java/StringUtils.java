public class StringUtils {

    public static String reverse(String inputStr){
        if(inputStr == null){
            return null;
        }

        if(inputStr.length() == 0){
            return "";
        }

        char[] charArray = inputStr.toCharArray();
        int leftPointer = 0;
        int rightPointer = inputStr.length() - 1;

        while(leftPointer < rightPointer){
            char temp = charArray[leftPointer];
            charArray[leftPointer] = charArray[rightPointer];
            charArray[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }

        return new String(charArray);
    }

}
