import java.util.*;
import java.util.stream.*;

class JavaStreamApi {
	public static void main(String[] args) {
		
		/* filtering even and odd numbers using streams */
		Integer[] numbers = new Integer[]{1,2,3,4,5,6,7,8,9,10};

		List<Integer> evenNumberList = Arrays.stream(numbers).filter(x -> x % 2 ==0).collect(Collectors.toList());		
		System.out.println("Even Numbers-" + evenNumberList);

		List<Integer> oddNumberList = Arrays.stream(numbers).filter(x -> !(x % 2 == 0)).collect(Collectors.toList());
		System.out.println("Odd Numbers-" + oddNumberList);
		// String[] studentNames = {"hariharan","suzuka","daniel","rakesh","prabhu"};

		/*filtering list elements using stream operations*/
		List<String> list = new ArrayList<String>();

		list.add("rohit");
		list.add("yamuna");
		list.add("suzuka");
		list.add("daniel");
		list.add("hariharan");
		list.add("rakesh");
		list.add("prabhu");

		System.out.println("Student names : " + list);

		List<String> newList = list.stream().sorted().filter(x -> x.startsWith("r")).collect(Collectors.toList());
		System.out.println("After pipelined stream operations -" + newList);



	}
}