public class NestedParentheses {

    public static boolean nestedCorrectly(String str){
        int counter = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == '('){
                counter--;
            }
            if(str.charAt(i) == ')'){
                counter++;
            }
        }
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){

        String testCase1 = "(()())";
        String testCase2 = "(((((()))";

        NestedParentheses obj = new NestedParentheses();
        boolean correct;
        correct = obj.nestedCorrectly(testCase2);
        if(correct) {
            System.out.print("The Parentheses were correctly nested");
        } else {
            System.out.println("The Parnetheses were NOT correctly nested...you bastard!!!");
        }   

    }
    
}
