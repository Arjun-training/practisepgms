import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeat {
	
	 public static void main(String[] args) {
	        // Declare and initialize a string variable.
	        String str1 = "hellowelcome";
	        
	        // Print the original string.
	        System.out.println("The given string is: " + str1);
	        
	        // Loop through each character of the string.
	        for (int i = 0; i < str1.length(); i++) {
	            // Assume the character at index 'i' is unique initially.
	            boolean unique = true;
	            
	            // Loop through the string again to compare characters.
	            for (int j = 0; j < str1.length(); j++) {
	                // Check if the characters at positions 'i' and 'j' are the same but not at the same index.
	                if (i != j && str1.charAt(i) == str1.charAt(j)) {
	                    // If found, set unique to false and break the loop.
	                    unique = false;
	                    break;
	                }
	            }
	            
	            // If the character at index 'i' is unique, print it and exit the loop.
	            if (unique) {
	                System.out.println("The first non-repeated character in the String is: " + str1.charAt(i));
	                break;
	            }
	        }
	        

	    	String s1="hellowelcome";
			List<String> ls=Arrays.stream(s1.split("")).collect(Collectors.toList());
	        
	    	System.out.println("First non repeated");
	    	
	    	Map<String,Long> ms2=ls.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	    	//System.out.println(ms1);
	    	
	    	
	    	
	    	for(Map.Entry<String, Long> m1:ms2.entrySet()) {
	    		//if(m1.getValue()>1)
	    			//System.out.println(m1.getKey()+"---> "+m1.getValue());
	    		if(m1.getValue()==1)
	    			System.out.println("non repat " +m1.getKey());
	    		break;
	    	}
	    	System.out.println("non repeat using single line ");
	    	String nonRepeat=ls.stream().collect(Collectors.groupingBy(Function.identity()
	    			,LinkedHashMap::new,Collectors.counting())).entrySet().stream()
	    			.filter(p1->p1.getValue()==1).map(p1->p1.getKey()).findFirst().get();
	    	System.out.println(nonRepeat);
	    	
	    	System.out.println();
	    	System.out.println("first repeated");
	    	String repeated=ls.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	    	.entrySet().stream().filter(p3->p3.getValue()>1).map(p3->p3.getKey()).findFirst().get();
	    	System.out.println(repeated);
	    	
	    	System.out.println();
	    	System.out.println("most repeated");
	    	Map.Entry<String,Long> most=ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	    	    	.entrySet().stream().max(Map.Entry.comparingByValue()).get();
	    	    	System.out.println(most.getKey());
	    	    	
	    	    	
	    }

}
