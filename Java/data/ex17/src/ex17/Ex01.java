package ex17;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		String[] name = new String[10];
		name[0] = "홍길동";
		for (int i = 0; i < name.length; i++) {
			String string = name[i];
			System.out.println(string);
		}
		for (String string : name) {
			if (string != null)
				System.out.println(string);
		}
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add(name[0]);
		list.add("이순신");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}

		for (String str : list) {
			System.out.println(str);
		}
		System.out.println(list.contains("이순신"));
		list.remove("이순신");
		System.out.println(list.indexOf("홍길동"));
		list.add(list.indexOf("홍길동"), "아이언맨");
		for (String string : list) {
			System.out.println(string);
		}
		List<String> list1 = new ArrayList<>();
		list.add("홍길동");
		list.add(name[0]);
		list.add("이순신");
		list1.addAll(list);
	}

}
