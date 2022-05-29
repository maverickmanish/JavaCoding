package y2021;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadandExecutors {

	public static void main(String[] args) throws Exception {
		Callable<Integer> foo=() -> {
			String threadName = Thread.currentThread().getName();
			TimeUnit.SECONDS.sleep(10);
			return 100;
		};
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Integer>future = executor.submit(foo);
		
		System.out.println(future.get(1, TimeUnit.SECONDS));
	}
}
