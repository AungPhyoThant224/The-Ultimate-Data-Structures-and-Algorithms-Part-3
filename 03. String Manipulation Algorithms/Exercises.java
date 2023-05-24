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
    
}