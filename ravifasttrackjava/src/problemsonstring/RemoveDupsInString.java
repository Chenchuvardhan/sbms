package problemsonstring;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDupsInString {
	public static void main(String[] args) {
		//removeDups();
		reverseString();
		duplicate();
	}

	private static void duplicate() {
    String original="Taj";
    StringBuilder reverse=new StringBuilder();
    original.chars().forEach(abc-> reverse.append((char)abc));
    System.out.println(reverse);
	}

	private static void reverseString() {
		String original = "Raj Kumar";
		StringBuilder reverse = new StringBuilder();
		/*
		 * original.chars().forEach(i->reverse.append((char)i));
		 * System.out.println(reverse);
		 */
		char[] charArray = original.toCharArray();
		IntStream.range(0, charArray.length).forEach(System.out::println);
		/*Stream<Character> mapToObj = IntStream.range(0, charArray.length)
				.mapToObj(i -> charArray[charArray.length - i - 1]);
	    //mapToObj.forEach(i->System.out.println(i));
		mapToObj.forEach(i->reverse.append(i));
		System.out.println(reverse);*/
	}

	/*@SuppressWarnings("unchecked")
	static <T> Stream<T> reverse(Stream<T> input) {
		Object[] temp = input.toArray();
		return (Stream<T>) IntStream.range(0, temp.length).mapToObj(i -> temp[temp.length - i - 1]);
	}*/

	private static void removeDups() {
		String str = "Programming";
		System.out.println(str);
		// output="Progamin"
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println("Output :" + sb1);

	}
}
