package chaining;

public class TestMyHash {

	public static void main(String[] args) {
		MyHash m=new MyHash(7);
		
		m.insert(51);
		m.insert(65);
		m.insert(58);
		m.insert(52);
		
		System.out.println(m.search(52));
		System.out.println(m.toString());
	}

}
