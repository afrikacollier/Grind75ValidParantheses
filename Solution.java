import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> parantheses = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(!parantheses.isEmpty()){
                switch(s.charAt(i)){
                    case ')': if(parantheses.peek() == '('){
                        parantheses.pop();
                    }else{return false;} break;
                    case '}': if(parantheses.peek() == '{'){
                        parantheses.pop();
                    }else{return false;} break;
                    case ']': if(parantheses.peek() == '['){
                        parantheses.pop();
                    }else{return false;} break;
                    default: parantheses.push(s.charAt(i));
                }
            }else{
                parantheses.push(s.charAt(i));
            }
        }

        if(parantheses.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}