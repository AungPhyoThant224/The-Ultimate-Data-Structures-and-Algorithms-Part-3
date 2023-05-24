import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import javax.sound.sampled.SourceDataLine;

public class Exercises {

    // --------------1----------------
    public int numbersOfVowels(String input){
        if(input == null){
            return 0;
        }
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
        if(input == null){
            return "";
        }

        var reverseStr = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--){
            reverseStr.append(input.charAt(i));
        }
        return reverseStr.toString();
    }
    
    // --------------3----------------
    // public String reverseSentence(String input){
    //     String[] strs = input.trim().split(" ");
    //     StringBuilder reverse = new StringBuilder();
    //     for(int i = strs.length - 1; i >= 0; i--){
    //         if(i == strs.length - 1){
    //             reverse.append(strs[i]);
    //         }
    //         else{
    //             reverse.append(" " + strs[i]);
    //         }
    //     }
    //     return reverse.toString().trim();
    // }

    //Mosh Solution
    public String reverseSentence(String input){
        String[] strs = input.trim().split(" ");
        Collections.reverse(Arrays.asList(strs));
        return String.join(" ", strs);
    }

    // -------------------4------------------
    // public boolean rotationOfAnother(String str1, String str2){
    //     if(str1.length() != str2.length()){
    //         return false;
    //     }
    //     char[] chars1 = str1.toCharArray();
    //     int comparePoint = str2.indexOf(chars1[0]);
    //     char[] chars2 = str2.toCharArray();

    //     for(int i = 0; i < chars1.length; i++){
    //         if(chars1[i] != chars2[comparePoint]){
    //             return false;
    //         }
    //         comparePoint++;
    //         if(comparePoint == chars2.length){
    //             comparePoint = 0;
    //         }
    //     }
        
    //     return true;
    // }

    //Mosh Solution
    public boolean rotationOfAnother(String str1, String str2){
        if(str1 == null || str2 == null){
            return false;
        }
        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }

    // ------------------5-----------------
    public String removeDuplicate(String input){
        String newStr = "";
        for(int i = 0; i < input.length(); i++){
            var word = String.valueOf(input.charAt(i));
            if(!newStr.contains(word)){
                newStr += word;
            }
        }
        return newStr;
    }

    // ------------------6-----------------
    public Character mostRepeated(String input){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < input.length(); i++){
            var word = input.charAt(i);
            var value = map.get(word) == null ? 1 : map.get(word) + 1;
            map.put(word, value);
        }

        char res = input.charAt(0);
        for(var ch : map.keySet()){
            if(map.get(ch) > map.get(res)){
                res = ch;
            }
        }
        return res;
    }

    // ------------------7-----------------
    public String capitalizeFirstLetter(String input){
        String[] words = input.split(" ");
        input = "";
        int i = 0;
        boolean isUpper = true;
        while(i < words.length){
            if(words[i] != null && words[i] != "" && words[i] != " "){
                if(isUpper){
                    var temp = words[i].toUpperCase();
                    input += temp.charAt(0);
                    words[i] = words[i].substring(1);
                    isUpper = false;
                }else{
                    if(i == words.length - 1){
                        input += words[i];
                    }else{
                        input += words[i] + " ";
                    }
                    i++;
                    isUpper = true;
                }
            }else{
                i++;
            }
        }
        return input;
    }

    // ------------------8-----------------
    public boolean anagram(String input1, String input2){
        if(input1.length() != input2.length()){
            return false;
        }

        for(int i = 0; i < input1.length(); i++){
            if(!input2.contains(Character.toString(input1.charAt(i)))){
                return false;
            }
        }

        return true;
    }

    // ------------------9-----------------
    public boolean palindrome(String input){
        var middle = (input.length() - 1) / 2;
        var reverseIndex = input.length() - 1;
        for(int i = 0; i <= middle; i++){
            if(input.charAt(i) != input.charAt(reverseIndex)){
                return false;
            }
            reverseIndex--;
        }
        return true;
    }
}
