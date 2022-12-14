package arraysandhashing;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	 public static List<String> fizzBuzz(int n) {
		 
		 List<String> output=new ArrayList<>();
		 
		 for(int i=1;i<=n;i++) {
			 if(i%3==0 && i%5==0)
				 output.add("FizzBuzz");
			else {
			 if(i%3==0)
				 output.add("Fizz");
			 if(i%5==0)
				 output.add("Buzz");
			 if(i%3!=0 && i%5!=0)
				 output.add(String.valueOf(i));
			}
		 }
		 
		 return output;
	        
	    }
	 	
	 public static void main(String[] args) {
		System.out.println(fizzBuzz(15).toString());
	}
}
