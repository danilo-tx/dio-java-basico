/**
 * Bill Pugh method
 * Lazily initialized since holder is an inner class and only created when getInstance() method is called.
 *
 */
public class SingletonHolder {
	
	private SingletonHolder() {
		System.out.println("in the constructor");
	}

	private static class Holder {
		private static final SingletonHolder INSTANCE = new SingletonHolder();
	}
	
	public static SingletonHolder getInstance() {
		return Holder.INSTANCE;
	}
	
	public void print() {
		System.out.println("hello from holder");
	}
	
	public static void main(String[] args) {
		System.out.println("main method start");
		
		SingletonHolder.getInstance().print();
		
		System.out.println("main end");
	}

}