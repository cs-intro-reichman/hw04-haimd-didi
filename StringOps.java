import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static char toUpperCase (char letter) {
        // only if the char is a lowercase is transform to capital letter
        if(letter>=97&&letter<=122){
            letter-=32;
        }        
        
        return letter;
    }

    public static char toLowerCase (char letter) {
         // only if the char is a upperCase is transform to a lowerCase letter
        if(letter>=65&&letter<=90){
            letter+=32;
        }        
        
        return letter;
    }

    public static String capVowelsLowRest (String string) {
        String str="";
        String vowels = "aeiou";

        for(int i=0;i<string.length();i++){
            if(vowels.indexOf(string.charAt(i))!=-1||vowels.indexOf(string.charAt(i)+32)!=-1){
                str+=toUpperCase(string.charAt(i));
            } else str+=toLowerCase(string.charAt(i));
        }
        return str;
    }

    public static String camelCase (String string) {
        String str="";
        boolean isSpace = false;
        boolean isFirstLetter = true;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!=32){
                if(isSpace&&!isFirstLetter){
                    str+=toUpperCase(string.charAt(i));
                    isSpace = false;
                } else{
                str+=toLowerCase(string.charAt(i));
                if(isSpace) isSpace = false;
                }
                isFirstLetter = false;
            } else isSpace = true;
        }        
            return str;
    }

    public static int[] allIndexOf (String string, char chr) {
        int size = 0;
        int index = 0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==chr){
                size++;
            }
        }
        int [] array = new int[size];
        

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==chr){
                
                array[index++] = i;
            }
        }

        return array ;
    }
}
