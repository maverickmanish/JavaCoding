package y2021;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListFiltering {

	public static void main(String[] args) {
		String paragraph = "Bob hit the ball twice and ball went up in the sky";
		String[] banned = { "hit","ball" };

		// String newString= String.join("",paragraph.split("hit"))

		List<String> bannedList = Arrays.asList(banned);
		List<String> list = Arrays.asList(paragraph.split(" "));

		String s = list.stream().filter(e -> !bannedList.contains(e)).collect(Collectors.joining(" "));

		// @formatter:on
		;

		System.out.println("the smallestElement element is : " + s);

		for(int i=0;i<15;i++)
		{
			System.out.println(i+"  yeahh ");
			System.out.println("break occurs");
		}
		
	}

}
