public class Ethan {

    public static void main(String[] args) {
        factorGroup(100);
        factorGroup(55);
        plusSign("a+b+34+c+");
        plusSign("");

    }

    // Method to take in a string and reverse the case of every letter
    public static String reverseCase(String str) {
        String j = "";
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            j += str.charAt(i);
            if (!j.equals(j.toLowerCase())) {
                reverse += j.toLowerCase();
                j = "";
            } else if (!j.equals(j.toUpperCase())) {
                reverse += j.toUpperCase();
                j = "";
            }
        }
        System.out.println(reverse);
        return reverse;
    }

    // Method to take in an array and return boom if 7 appears.
    public static String sevenBoom(int[] arr) {
        String boom = "there is no 7 in the array";
        for (int num : arr){
            String number = String.valueOf(num);
            System.out.println(number);
            for (int i = 0; i < number.length(); i++){
                if (number.charAt(i) == '7'){
                    boom = "Boom!";
                    break;
                }
            }
        }
        System.out.println(boom);
        return boom;
    }

    //    Take a string and swap the first and last letter, unless they are the same, or the string is too short
    public static String flipEndChars(String s) {
        if (s.length() < 2) {
            System.out.println("Incompatible");
            return "Incompatible";
        } else  if (s.charAt(s.length() - 1) == (s.charAt(0)) && s.length() > 2) {
            System.out.println("Two's a pair.");
            return "Two's a pair.";
        } else {
            String swap = "";

            swap += s.charAt(s.length() - 1);

            for (int i = 1; i < s.length() - 1; i++){
                swap += s.charAt(i);
            }
            swap += s.charAt(0);
            System.out.println(swap);
            return swap;
        }
    }

////////////////////////////////////////////////WEEK TWO////////////////////////////////////////////////

    //    Create a function that returns "even" if a number has an even number of factors and "odd" if a number has an odd number of factors.


    public static String factorGroup(int num) {
        String answer = "even";
        double sqrt = Math.sqrt(num);
        if (sqrt % 1 == 0){
            answer = "odd";
        }
        System.out.println(answer);
        return answer;
    }

    //    Create a function that takes a string as an argument and returns true if each letter in the string is surrounded by a plus sign. Return false otherwise.
    public static boolean plusSign(String str) {
        boolean isPlus = false;
        int falseCount = 0;
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != '+' && i > 0 && i < str.length() - 1){
                for (int j = 0; j < letters.length(); j ++){
                    if (str.charAt(i) == letters.charAt(j)){
                        if (str.charAt(i - 1) == '+' && str.charAt(i + 1) == '+'){
                            isPlus = true;
                        } else {
                            isPlus = false;
                            falseCount++;
                        }
                    }
                }
            }
        }
        if (falseCount > 0){
            isPlus = false;
        }
        System.out.println(isPlus);
        return isPlus;
    }
}




