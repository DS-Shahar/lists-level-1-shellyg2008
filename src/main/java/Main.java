package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class list {

	public static void main(String[] args) {
		List r=randomList(1,10);
		System.out.println(r);
		List<Integer> list = Arrays.asList(1, 2, 3,3, 2, 4, 2, 5, 3, 3, 3);
		int c=times_in_list(list,3);
		System.out.println("apears "+c+" times");
	}

	    public static List<Integer> randomList(int min, int max) {
	        List<Integer> randomList = new ArrayList<>();
	        Random random = new Random();
	        for (int i = 0; i < 20; i++) {
	            int randomNum = random.nextInt(max - min + 1) + min;
	            randomList.add(randomNum);
	        }

	        return randomList;
	    }
	    
	  public static int times_in_list(List<Integer>list, int num) {
		    int count = 0;
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i) == num) {
		            count++;
		        }
		    }
		    return count;
		}
	    

}
