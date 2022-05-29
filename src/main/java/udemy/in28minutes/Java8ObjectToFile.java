package udemy.in28minutes;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Dummy {
	private Integer id;
	private String content;

	public Dummy() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Dummy(Integer id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

}

public class Java8ObjectToFile {
	private final static String PATH_UI = "C:/Users/manishbhardwaj01/Documents";

	public static void main(String[] args) throws IOException {
		Path path = Path.of(PATH_UI);
		// Path path= Path.of("C:/Users/manishbhardwaj01/Downloads/");
		// FileCreation(creationDummyObjects(), path);

		/*
		 * Files.lines(Paths.get("text.txt")).map(str ->
		 * str.split(" ")).flatMap(Arrays::stream).distinct().sorted()
		 * .forEach(System.out::println);
		 */
		List<Dummy> list = creationDummyObjects();
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(Dummy::getId, Dummy::getContent, (old, neww) -> old));
		/*
		 * new HashMap<>(); list.forEach(e->map.put(e.getId(),e.getContent()));
		 */
		map.forEach((k, v) -> System.out.println(" k " + k + " v: " + v));

		String[][] array = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		List<String[]> collect = Stream.of(array).filter(x -> {
			for (String a : x) {
				return !("a".equals(a));
			}
			return true;
		}).collect(Collectors.toList());

		collect.forEach(System.out::println);

		for (String[] strings : collect) {
			System.out.println(Arrays.toString(strings));
		}

		List<String> collect2 = Arrays.stream(array).flatMap(Arrays::stream).filter(x -> !"a".equals(x))
				.collect(Collectors.toList());
		

	}

	private static void FileCreation(List<Dummy> dummyObjects, Path path) {

		/*
		 * if(Files.isDirectory(path)) throw new
		 * IllegalArgumentException("path doesn't exists !");
		 */
		dummyObjects.forEach(obj -> {
			try {
				String filename = "/" + obj.getId() + ".txt";
				System.out.println(Path.of(PATH_UI + filename));
				Files.write(Path.of(PATH_UI + filename), obj.getContent().getBytes(StandardCharsets.UTF_8));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

	}

	private static List<Dummy> creationDummyObjects() {
		
		return Arrays.asList(new Dummy(1, "this is for Manish !"), new Dummy(2, "this is for Rakesh !"),
				new Dummy(3, "this is for Mahesh !"), new Dummy(4, "this is for Tanu !"),
				new Dummy(4, "this is for Jyoti !"));
	}

}
