package udemy.in28minutes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

public class Java11 {

	public static void main(String[] args) throws IOException {
		/*
		 * kdfjkjdf
		 * 
		 */	
		System.out.println("  ".isBlank());
		System.out.println(" ".isEmpty());
//		repeat , strip , leading and trailing and lines  , Optional.isEmpty() c
		System.out.println(StringUtils.isNotEmpty(null));
		Collection collection = null;
		System.out.println(CollectionUtils.isEmpty(collection));
		Files.writeString(Path.of("example.csv"), "GeeksForGeeks!");
		System.out.println(Files.readString(Path.of("text.txt")));
		Files.isSameFile(Path.of("text.txt"), Path.of("text.txt"));

		 Predicate<String> strr = Pattern.compile("aba").asMatchPredicate();

		System.out.println(strr.test("aabb"));

		System.out.println(strr.test("aba"));

	}

}
