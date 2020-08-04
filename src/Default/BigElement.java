package Default;
import java.util.ArrayList;
import java.util.List;

public class BigElement {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>();
		lst.add(10);
		lst.add(30);
		lst.add(20);
		lst.add(70);		
		lst.add(16);
		int big=lst.get(0);
		for (int i = 1; i < lst.size(); i++) 
		{
			if(big<lst.get(i))
			{
				big=lst.get(i);
			}
		}
		System.out.println("biigest element is "+big);
	}

}
