package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class MDAO {

	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	ArrayList<Member> list;
	Member mem = new Member();
	Util u = new Util();

	public MDAO() {
		this.list = new ArrayList<>();
	}

	public ArrayList<Member> getList() {
		return list;
	}

	public void setList(ArrayList<Member> list) {
		this.list = list;
	}

	public void insert(Member mem) {
		list.add(mem);
	}

	public void insert() {

		mem = new Member();
		String name = u.nameCk();
		mem.setName(name);
		while (true) {
			System.out.print("Id : ");
			String id = sc.nextLine();
			boolean idCkOk = idCk(id); // 회원가입아이디 = 가입된아이디
			if (idCkOk == false) { // false값 =!
				mem.setId(id);
				break;
			}

		}
		System.out.print("Pw : ");
		String pw = sc.nextLine();
		mem.setPw(pw);
		mem.setPoint(0);
		list.add(mem);

	}

	public void enter() {
		int cnt = 0;
		long go = System.currentTimeMillis();
		long end = go + 5 * 1000;
		while (System.currentTimeMillis() < end) {
			System.out.println("Press Enter");
			sc.nextLine();
			cnt++;

		}
		mem.setPoint(mem.getPoint() + (cnt * 10));
		System.out.println("입력횟수 : " + cnt);
		System.err.println("획득 포인트 : " + (cnt * 10) + "점");
		System.out.println("게임종료");
	}

	public ArrayList<Member> rank() {
		for (int i = 0; i < list.size(); i++) {
			int count = 1;
			for (int j = 0; j < list.size(); j++) {
				// 같은 대상이 아니면
				if (i != j) {
					if (list.get(i).getPoint() < list.get(j).getPoint()) {
						count++;
					}
				}
			}
			list.get(i).setRank(count);
		}

		Collections.sort(list, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				if (o1.getRank() > o2.getRank())
					return 1;
				else if (o1.getRank() == o2.getRank())
					return 0;
				else
					return -1;
			}
		});

		for (Member s : list) {
			System.out.println(s.toString());
		}
		return list;

	}

	public void typing() {
		int cnt = 0;
		int poin = 0;
		boolean run = true;
		long beforeTime = System.currentTimeMillis();
		while (run) {
			
			String[] type = { "산기슭", "산토끼", "강아지", "호랑이", "사자", "쓰레기", "아카데미", "발로란트", "초코렛", "막대사탕", "에너지", "메가커피",
					"구구단", "매", "독수리", "카페인", "나무꾼", "꽃사슴", "수박", "박수", "양꼬치", "삼겹살", "항정살", "가브리살", "스테이크", "먹고싶다" };
			double random = Math.random();
			int num = (int) Math.round(random * (type.length - 1));
			System.out.println(type[num]);
			String answer = sc.nextLine();
			if (type[num].equals(answer)) {
				cnt++;
				if (cnt == 5) {
					run = false;
				}
			}

		}
		long afterTime = System.currentTimeMillis();
		long secDiffTime = (afterTime - beforeTime) / 1000;

		if (secDiffTime <= 4) {
			poin = 500;
		} else if (secDiffTime <= 6 && secDiffTime > 4) {
			poin = 300;
		} else if (secDiffTime <= 8 && secDiffTime > 6) {
			poin = 150;
		} else {
			poin = 100;
		}
		mem.setPoint(mem.getPoint() + poin);
		System.out.println("걸린시간 : " + secDiffTime + "초");
		System.err.println("획득 포인트 : " + poin + "점");
		System.out.println("게임종료");

	}

	public Member loginCk(String newid, String newpw) {

		for (Member m : list) {
			if (m.getId().equals(newid) && m.getPw().equals(newpw)) {
				mem = m;
				break;
			} else {
				mem = null;
			}
		}

		return mem;
	}

	public boolean idCk(String newid) {
		boolean idCk = false;
		for (Member m : list) {
			if (m.getId().equals(newid)) {
				System.err.println("중복된 아이디입니다.");
				idCk = true;
				break;
			}
		}

		return idCk;
	}
}
