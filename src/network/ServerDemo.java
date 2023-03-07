package network;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;

public class ServerDemo {


    public String reverseString(){

        return "";
    }

//        public static String createAnagramWord(String str){
//
//
//        String anagram = "";
//        String [] arr = str.split(" ");
//
//        for (String s : arr) {
//            anagram += createAnagramWord(s) + " ";
//        }
//        return anagram;
//    }
    public static void main(String[] args) throws MalformedURLException {
        URL url =new URL("https://swipe.ng/");
        System.out.println(url.getAuthority());
        System.out.println(url.getHost());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getProtocol());
        // write an inputStream to read a file

        Date  date = new Date();

        System.out.println(date.toString());

int intValue;
String string ="Av";
        try {
            intValue = Integer.parseInt(string);
            System.out.println("true");
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        String words = "ABC123";

        String rev="";
        for (int i=words.length()-1; i>=0; i--){
//            System.out.println(words.charAt(i));
            char result =words.charAt(i);

//            Integer.parseInt(words)
//            if (){
//
//            }
        }

//
//        System.out.println(createAnagramWord("ABC123"));

    }
}
