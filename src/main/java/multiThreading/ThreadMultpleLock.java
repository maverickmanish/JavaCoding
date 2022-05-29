package multiThreading;

class X {

	synchronized public void m() {
		X x = new X();
		synchronized (x) {
			X xx = new X();

			synchronized (xx) {

			}
		}
	}
}

public class ThreadMultpleLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
