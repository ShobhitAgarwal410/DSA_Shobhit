package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		filterAndMap();
//		flatMap();
//		minMax();
//		reduce();
//		sort();
	}

	private static void sort() {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().sorted().forEach(System.out::println);
		System.out.println("***************************");
		myList.stream().sorted((val1, val2) -> -1 * val1.compareTo(val2)).forEach(System.out::println);
	}

	private static void reduce() {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		Optional<Integer> op = myList.stream().reduce((val1, val2) -> val1 + val2);
		System.out.println(op);
		Integer[] arr = { 10, 15, 8, 49, 25, 98, 32 };
		Integer res = Stream.of(arr).reduce(10, Integer::sum);
		System.out.println(res);
	}

	private static void minMax() {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		Optional<Integer> maxOp = myList.stream().max((val1, val2) -> val1.compareTo(val2));
		Optional<Integer> minOp = myList.stream().min((val1, val2) -> val1.compareTo(val2));
		System.out.println(maxOp);
		System.out.println(minOp);
	}

	private static void flatMap() {
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(1, 2));
		list.add(Arrays.asList(3, 4));
		list.add(Arrays.asList(5, 6));
		list.add(Arrays.asList(7, 8));
		List<Integer> finalList = list.stream().flatMap((val) -> {
			return val.stream().filter(x -> x % 2 == 0).map((x) -> x * 2);
		}).collect(Collectors.toList());
		System.out.println(finalList);
	}

	private static void filterAndMap() {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList = myList.stream().filter(val -> val % 2 == 0).map(val -> val * 2)
				.peek(val -> System.out.println(val + "")).collect(Collectors.toList());
		System.out.println(myList);
		System.out.println(myList.stream().count());
		List<String> myList1 = Arrays.asList("Hello", "SHOBHIT", "HOW", "ARE");

		System.out.println(myList1.stream().collect(Collectors.joining("|")));
	}

}
