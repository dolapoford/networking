package network;

public class Reverse {

    public static void main(String[] args) throws NumberFormatException{
//        int intValue;
//        String words = "ABC123";
//        String rev="";
//        for (int i=words.length()-1; i>=0; i--){
//
//        }
//
//        try {
//            intValue = Integer.parseInt(words);
//            System.out.println("true");
//        } catch (NumberFormatException e) {
//            System.out.println("Input String cannot be parsed to Integer.");
//        }
////
//        int intValue ;
//        String words ="ABC123";


        String words = "ABC123";

        char ch[]=words.toCharArray();
      char b ='v';

        String rev="";
        for(int i=ch.length-1;i>=0;i--){


            if (Character.isDigit(ch[i])){

                continue;
            }
            System.out.println(rev+=ch[i]);


        }

    }
}
