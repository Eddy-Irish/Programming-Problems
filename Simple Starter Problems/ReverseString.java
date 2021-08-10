public class ReverseString {

    // This method works, but it isn't very efficient because of strings being immutable
    // in Java.  On each iteration of the loop, a new String must be constructed.
    public static String reverseString(String str){
        String output = "";
        for(int i = str.length() - 1; i >= 0; i--){
            output += str.charAt(i);
        }
        return output;
    }

    // This method is a more efficient way of accomplishing the same problem
    public static String betterReverseString(String str){
        int len = str.length();
        StringBuilder output = new StringBuilder(len);

        for(int i = len - 1; i >= 0; i--){
            output.append( str.charAt(i));
        }

        return output.toString();

    }
    
    public static void main(String[] args){

        String test = "Wittgenstein";
        ReverseString obj = new ReverseString();
        String reverse = obj.betterReverseString(test);
        System.out.print(reverse);
    }
}
