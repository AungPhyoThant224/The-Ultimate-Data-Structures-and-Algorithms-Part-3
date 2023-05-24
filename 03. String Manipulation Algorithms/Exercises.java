import java.util.Arrays;

public class Exercises {

    // --------------1----------------
    public int numbersOfVowels(String input){
        input = input.toLowerCase();
        char[] chars = input.toCharArray();
        int count = 0;
        for(var ch: chars){
            if(isVowel(ch)){
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // --------------2----------------
    public String reverseString(String input){
        char[] chars = input.toCharArray();
        input = "";
        for(int i = chars.length - 1; i >= 0; i--){
            input += chars[i];
        }
        return input;
    }
    
    // --------------3----------------
    public String reverseSentence(String input){
        String[] strs = input.split(" ");
        input = "";
        for(int i = strs.length - 1; i >= 0; i--){
            if(i == strs.length - 1){
                input += strs[i];
            }
            else{
                input = input + " " + strs[i];
            }
        }
        return input;
    }

    // -------------------4------------------
    public boolean rotationOfAnother(String str1, String str2){
        char[] chars1 = str1.toCharArray();
        int comparePoint = str2.indexOf(chars1[0]);
        char[] chars2 = str2.toCharArray();

        for(int i = 0; i < chars1.length; i++){
            if(chars1[i] != chars2[comparePoint]){
                return false;
            }
            comparePoint++;
            if(comparePoint == chars2.length){
                comparePoint = 0;
            }
        }
        
        return true;
    }
}
