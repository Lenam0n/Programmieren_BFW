package LA04;

import utils.ArrayUtils;

public class LA04_02_2 {
    private Integer[] arr;

    public LA04_02_2(Integer... args) {
        this.arr = ArrayUtils.createArray(Integer[]::new, args.length);

        for (int i = 0; i < args.length; i++) {
            this.arr[i] = args[i];
        }
    }

    public void print(boolean dir) {
        if(dir) { 
	    	for(int i = 0; i < this.arr.length;i++) {
	    		System.out.println(i);
	    	}
    	}else {
    		for(int i = this.arr.length; i >= 0; i--) {
    			System.out.println(i);
    		}
    		
    	}
    }
    
    public double average() {
        int sum = 0;
        for(int i = 0; i < this.arr.length; i++) {
        	sum += this.arr[i];
        }
        return ((double) sum / this.arr.length);
    }

}
