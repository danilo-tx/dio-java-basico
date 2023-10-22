public class SingletonEager {

	private static final SingletonEager INSTANCE = new SingletonEager();

	private SingletonEager() {
		System.out.println("in the constructor"); // this will print first
	}

	public static SingletonEager getInstance() {
		return INSTANCE;
	}
	
	public void print() {
		System.out.println("hello from eager");
	}
	
	public static void main(String[] args) {
		System.out.println("main method start");
		
		SingletonEager.getInstance().print();;
		
		System.out.println("main end");
	}

}