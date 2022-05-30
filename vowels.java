//task 5
public class Vowels {

	static int countVowels(String str){
        int result=0;
        char[] vowels = {'a','e','i','o','u'};
        char[] arr = str.toCharArray();

        for (int i=0;i<str.length();i++){
            char c = Character.toLowerCase(str.charAt(i));
            boolean isVowel = false;
            for (char v:vowels){
                if (c==v) isVowel = true;
            }
            if(isVowel) result++;
        }
        return result;
    }

    public static void main(String[] args) { 
        //change the parameters for different result
        String s = "abracadabra";

        System.out.println("The number of vowels in " + s + " is " + countVowels(s));
    }
}