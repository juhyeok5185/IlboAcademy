package ex13;

public class ex07 {

	public static void main(String[] args) {
		String name = "홍길동";
		String name1 = "홍길동";
		if(name == name1) {
			System.out.println("주소가 같다");
		}
		name = new String("홍길동") ;
		name1 = "홍길동";
		if(name == name1) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 틀리다");
		}
		
		if(name.equals(name1)) {
			System.out.println("같다");
		}else {
			System.out.println("틀리다");
		}
		
		if(name.equalsIgnoreCase(name1)) {
			
		}
		
		System.out.println(name.charAt(0));
	}

}
