package Strings;

public class EqualBrackets {

    public static void main(String[] args){
        String angles = "><<<><>";
        char right = '>'; char left = '<';
        int count = 0; int start = 0;
        System.out.println(angles);

        //char[] angleChars = angles.toCharArray();
        
        if(angles.startsWith(">")){
            angles = left + angles;
            start = 2;
        }

        for(int i = start; i < angles.length(); i++){
            if(angles.charAt(i) == '<'){
                count--;
            }
            else {
                count++;
            }
        }

        while(count != 0){
            if(count < 0){
                angles = angles + right;
                count++;
            }
            if(count > 0){
                angles = angles + left;
                count--;
            }
        }
        
        System.out.println(angles);
    }
}
