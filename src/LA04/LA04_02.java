package LA04;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import utils.ArrayUtils;

public class LA04_02 {
    private Integer[] arr;

    public LA04_02(Integer... args) {
        this.arr = ArrayUtils.createArray(Integer[]::new, args.length);

        for (int i = 0; i < args.length; i++) {
            this.arr[i] = args[i];
        }
    }

    public void print(boolean dir) { 
    	//import java.util.List;
    	//if (dir) { Stream<Integer> stream = Arrays.stream(this.arr);}
    	//else{ List<Integer> reversed = Arrays.asList(this.arr);
    	//    	Collections.reverse(reversed);
    	//    	stream = reversed.stream();
    	//	  }
        
    	String result = (	
    						dir 
			        		? Arrays.stream(this.arr) 
			        		: Arrays.stream(this.arr)
			        				.sorted( Collections.reverseOrder() )
		    			).map( String::valueOf )
			             .collect( Collectors.joining(", ") );

        System.out.println(result);
    }
    
    public double average() {
        return Arrays.stream(this.arr)
		             .mapToInt(Integer::intValue) // Integer → int
		             .average()
		             .orElse(0); // Falls Array leer ist
    }

}
