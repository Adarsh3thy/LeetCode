package stack;
import java.util.*;


public class Parenthesis {
	 public static boolean isValid(String s) {
		 HashMap<Character,Character> braces=new HashMap<>();
		 braces.put(')', '(');
		 braces.put(']', '[');
		 braces.put('}', '{');
		 
		 Stack<Character> braceStack=new Stack<>();
		 
		 for(int i=0;i<s.length();i++) {
			 if(!braces.containsKey(s.charAt(i))) {
				 braceStack.add(s.charAt(i));
			 }else {
				 if(!braceStack.isEmpty() && braceStack.peek()==braces.get(s.charAt(i)))
					 braceStack.pop();
				 else
					 return false;
				
			 }
			 
		 }
		 
		 if(braceStack.isEmpty())
			 return true;
		 else
			 return false;
		 
	    }
	 
	 public static void main(String[] args) {
		System.out.println(isValid("}"));
	}
}
