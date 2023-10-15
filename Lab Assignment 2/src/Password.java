import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Password {

    public static String generator(int length, int symbols, int digits) {

          String OTHER_PUNCTUATION = "!@#&()–[{}]:;',?/*~$^+=<>";
          String Numbers = "0123456789";
          String Alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
          String Pass = "";

        Random random = new Random();


        for (int i = 0; i < symbols; i++) {
           int ranint =  random.nextInt(0, OTHER_PUNCTUATION.length()-1);
            Pass += ""+ OTHER_PUNCTUATION.charAt(ranint);
        }

        for (int i = 0; i < digits; i++) {
            Pass += Numbers.charAt(random.nextInt(0,9));
        }

        int lengOfChar = length - (symbols+digits);

        if(lengOfChar > 0 ){
            for (int i = 0; i < lengOfChar; i++) {
                Pass += Alphabets.charAt(random.nextInt(0,51));
            }
        }

        List<String> letters = Arrays.asList(Pass.split(""));
        Collections.shuffle(letters);
        String shuffled = "";
        for (String letter : letters) {
            shuffled += letter;
        }

        System.out.println(shuffled);


        return shuffled;

    }

    public static String validator (String p) {
        int Uppercase = 0;
        int Lowercase = 0;
        int Digit = 0;
        int Symbol = 0;
        String val ="";

        for (int i = 0; i <p.length();  i++) {
            // for each character in the string
            char L = p.charAt(i);
            // count if it is a Upper case letter
            if(L > 64 && L <91) {
                Uppercase++;
                //System.out.println("Uppercase is " + Uppercase);
            }
            //count if it is a Lower case letter
            else if(L > 96 && L < 123) {
                Lowercase++;
               // System.out.println(Lowercase);
            }


            //count if it is a digit
            else if(L > 47 && L < 58) {
                Digit++;
                //System.out.println("Digit is " + Digit);
            }
            //count if it is a symbol
            else  {
                Symbol++;
                //System.out.println("Symbol is " + Symbol);
            }


        }
//        System.out.println("Lower " + Lowercase);
//        System.out.println("Upper " + Uppercase);
//        System.out.println("Digit " + Digit);
//        System.out.println("Symbol " + Symbol);
        //System.out.println(p);

        //System.out.println(Length);

        if (p.length() >= 16 && Symbol > 4 && Digit > 4){
            val = "Password is Excellent";
            System.out.println(val);
        }

        else if (p.length() > 12 && Symbol > 3 && Digit > 3) {
            val = "Password is Good";
            System.out.println(val);
        }

        else if (p.length() > 8 && Symbol > 1 && Digit > 2) {
            val = "Password is ok";
            System.out.println(val);
        }

        else if(p.length() <= 8 && Symbol <= 1 && Digit <= 2) {
            val = "Password is Poor";
            System.out.println(val);
        }
        else {
            val = "Password is Poor";
            System.out.println(val);
        }
        return val;

    }


    public static void main(String[] args) {
        String Password = generator(15,3,2);
        validator(Password);

       validator("HelloWI40!*)(");

    }
}
