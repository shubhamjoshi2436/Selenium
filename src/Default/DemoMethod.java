package Default;

public class DemoMethod {

	public static void main(String[] args) {
			Integer i=15;
			System.out.println(i.getClass());
			System.out.println(i.toString().getClass());
			i.toString().equals(15);
			i.toString().substring(1).equals(1);
	}

}
