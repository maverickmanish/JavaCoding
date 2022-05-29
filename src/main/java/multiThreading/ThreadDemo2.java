package multiThreading;



class ThreadDemo2 {
	public static void main(String ar[]) {
		System.out.println(hello());
	}

	private static int hello() {
		try {
			throw new RuntimeException("dwed");
		} finally {
			return 10;
		}

	}
}