package arraysandhashing;

public class ReverseString {
	
	  public static void reverseString(char[] s) {
		  
		  for(int i=0,j=s.length-1;i<s.length/2 && j>(s.length)/2;i++,j--) {
			  char temp=s[j];
			  s[j]=s[i];
			  s[i]=temp;
		  }
		  
		  for(int i=0;i<s.length;i++) {
			  System.out.print(s[i]+" ");
		  }
		 
	        
	    }
	  
	  public static void main(String[] args) {
		  reverseString(new char[] {'H','a','n','n','a','h'});
	}

}
