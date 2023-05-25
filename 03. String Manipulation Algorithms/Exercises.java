import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
    //     if(input == null){
    //         return "";
    //     }

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
        if(input == null){
            return "";
        }
        String[] strs = input.trim().split(" ");
        Collections.reverse(Arrays.asList(strs));
        return String.join(" ", strs);
    }

    // -------------------4------------------
    // public boolean rotationOfAnother(String str1, String str2){
    //     if(str1 == null || str2 == null){
    //         return false;
    //     }
        
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
    // public String removeDuplicate(String input){
    //     if(input == null){
    //         return "";
    //     }
    //     StringBuilder newStr = new StringBuilder();
    //     for(int i = 0; i < input.length(); i++){
    //         var word = String.valueOf(input.charAt(i));
    //         if(!newStr.toString().contains(word)){
    //             newStr.append(word);
    //         }
    //     }
    //     return newStr.toString();
    // }

    //Mosh Solution
    public String removeDuplicate(String input){

        if(input == null){
            return "";
        }

        StringBuilder str = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for(var ch : input.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                str.append(ch);
            }
        }

        return str.toString();
    }

    // ------------------6-----------------
    // public char mostRepeated(String input){
    //     if(input == null){
    //         throw new IllegalArgumentException();
    //     }
    //     HashMap<Character, Integer> map = new HashMap<>();
    //     for(int i = 0; i < input.length(); i++){
    //         var word = input.charAt(i);
    //         var value = map.get(word) == null ? 1 : map.get(word) + 1;
    //         map.put(word, value);
    //     }

    //     char res = input.charAt(0);
    //     for(var ch : map.keySet()){
    //         if(map.get(ch) > map.get(res)){
    //             res = ch;
    //         }
    //     }
    //     return res;
    // }

    //Mosh Solution
    public char mostRepeated(String input){
        if(input == null){
            throw new IllegalArgumentException();
        }

        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];
        for(var ch : input.toCharArray()){
            frequencies[ch]++;
        }

        int max = 0;
        char result = ' ';
        for(int i = 0; i < frequencies.length; i++){
            if(frequencies[i] > max){
                max = frequencies[i];
                result = (char) i;
            }
        }

        return result;
    }

    // ------------------7-----------------
    // public String capitalizeFirstLetter(String input){

    //     if(input == null){
    //         return "";
    //     }
    //     String[] words = input.split(" ");
    //     input = "";
    //     int i = 0;
    //     boolean isUpper = true;
    //     while(i < words.length){
    //         if(words[i] != null && words[i] != "" && words[i] != " "){
    //             if(isUpper){
    //                 var temp = words[i].toUpperCase();
    //                 input += temp.charAt(0);
    //                 words[i] = words[i].substring(1).toLowerCase();
    //                 isUpper = false;
    //             }else{
    //                 if(i == words.length - 1){
    //                     input += words[i];
    //                 }else{
    //                     input += words[i] + " ";
    //                 }
    //                 i++;
    //                 isUpper = true;
    //             }
    //         }else{
    //             i++;
    //         }
    //     }
    //     return input;
    // }

    // Mosh Solution
    public String capitalizeFirstLetter(String input){

        if(input == null || input.trim().isEmpty()){
            return "";
        }

        String[] words = input
                        .trim()
                        .replaceAll(" +", " ")
                        .split(" ");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0, 1).toUpperCase()
                        + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

    // ------------------8-----------------
    // public boolean anagram(String input1, String input2){
    //     if(input1 == null || input2 == null){
    //         return false;
    //     }

    //     if(input1.length() != input2.length()){
    //         return false;
    //     }

    //     input1 = input1.toLowerCase();
    //     input2 = input2.toLowerCase();
    //     for(int i = 0; i < input1.length(); i++){
    //         if(!input2.contains(Character.toString(input1.charAt(i)))){
    //             return false;
    //         }
    //     }

    //     return true;
    // }

    // Mosh Solution (With Sort)
    public boolean anagramSort(String input1, String input2){
        if(input1 == null || input2 == null){
            return false;
        }

        var array1 = input1.toLowerCase().toCharArray();
        Arrays.sort(array1);

        var array2 = input2.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    // Mosh Solution (With Histogramming)
    public boolean anagramHisto(String input1, String input2){
        if(input1 == null || input2 == null){
            return false;
        }

        final int ENGLISH_ALPHABET = 26;
        int[] frequencies = new int[ENGLISH_ALPHABET]; 

        input1 = input1.toLowerCase();
        for (int i = 0; i < input1.length(); i++) {
            frequencies[input1.charAt(i) - 'a']++;
        }

        input2 = input2.toLowerCase();
        for (int i = 0; i < input2.length(); i++) {
            var index = input2.charAt(i) - 'a';
            if(frequencies[index] == 0){
                return false;
            }
            frequencies[index]--;
        }

        return true;
    }

    // ------------------9-----------------
    // public boolean palindrome(String input){
    //     if(input == null){
    //         return false;
    //     }
    //     var middle = (input.length() - 1) / 2;
    //     var reverseIndex = input.length() - 1;
    //     for(int i = 0; i <= middle; i++){
    //         if(input.charAt(i) != input.charAt(reverseIndex)){
    //             return false;
    //         }
    //         reverseIndex--;
    //     }
    //     return true;
    // }

    // Mosh Solution 1
    // public boolean palindrome(String input){
    //     if(input == null){
    //         return false;
    //     }
    //     var string = new StringBuilder(input);
    //     return string.reverse().toString().equals(input);
    // }

    // Mosh Solution 2
    public boolean palindrome(String input){
        if(input == null){
            return false;
        }
        var left = 0;
        var right = input.length() - 1;

        while(left < right){
            if(input.charAt(left++) != input.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
