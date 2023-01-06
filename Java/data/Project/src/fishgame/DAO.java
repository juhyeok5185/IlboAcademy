package fishgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class DAO {
	ArrayList<Member> list;
	Member mem;
	Scanner sc;
	Util util;
	Random rand;
	public DAO() {
		list = new ArrayList<>();
		mem = new Member();
		sc = new Scanner(System.in);
		util = new Util();
		rand = new Random();
	}

	public void information() { // 내 정보
		System.out.println(mem.getName() + "님의 정보");
		System.out.println("현재 보유금액: " + mem.getMoney()+"원");
		System.out.println("현재 보유미끼 개수: " + mem.getBaitcnt()+"개");

		fishcntlist();

		if (mem.getFishingRod() == null) {
			System.out.println("현재 낚싯대: 없음");
		} else {
			System.out.println("현재 낚싯대: " + mem.getFishingRod());
		}
	}

	public void regi() { // 회원가입
		Member newMem = new Member();
		newMem.setName(joinname());
		newMem.setId(joinid());
		newMem.setPw(joinpw());
		newMem.setMoney(10000);
		newMem.setBaitcnt(10);
		list.add(newMem);
		System.out.println("등록 완료");
	}

	public String joinname() { // 회원가입 닉네임 체크
		String regna = "";
		boolean b = true;
		while (b) {
			System.out.print("닉네임: ");

			regna = sc.nextLine();
			if (regna.trim().length() == 0) {
				System.out.println("닉네임을 입력해주세요");
				continue;
			}
			if (regna.length() < 2) {
				System.out.println("닉네임은 2자 이상이여야합니다.");
				continue;
			}

			if (list.size() != 0) {
				for (Member member : list) {
					if (regna.equals(member.getName())) {
						System.out.println("닉네임이 중복됩니다.");
						continue;
					} else {
						b = false;
					}
				}
			} else {
				b = false;
			}
		}
		return regna;
	}

	public String joinid() { // 회원가입 아이디 체크
		String regid = "";
		boolean b = true;
		while (b) {
			System.out.println("아이디: ");
			regid = sc.nextLine();
			if (regid.trim().length() == 0) {
				System.out.println("아이디를 입력해주세요");
				continue;
			}
			if (regid.length() < 4) {
				System.out.println("아이디는 4자 이상이여야 합니다.");
				continue;
			}

			if (list.size() != 0) {
				for (Member member : list) {
					if (regid.equals(member.getId())) {
						System.out.println("아이디가 중복됩니다.");
						continue;
					} else {
						b = false;
					}
				}
			} else {
				b = false;
			}
		}
		return regid;
	}

	public String joinpw() { // 회원가입 비밀번호 체크
		String a = "";
		boolean b = true;
		while (b) {
			System.out.println("비밀번호: ");
			a = sc.nextLine();
			if (a.trim().length() == 0) {
				System.out.println("비밀번호를 입력해주세요");
				continue;
			}
			if (a.length() < 4) {
				System.out.println("비밀번호는 4자 이상이여야 합니다.");
				continue;
			}
			b = false;
		}
		return a;
	}

	public void gameStart() { // 게임 시작
		if (mem.getFishingRodType() != 0 && mem.getBaitcnt() != 0) {
			mem.setBaitcnt(mem.getBaitcnt() - 1);
			int wait = rand.nextInt(7) + 1;
			String fishName = "";
			boolean catchFish = false;
			System.out.println("Enter를 눌러 낚싯대를 세팅해주세요.");
			sc.nextLine();
			for (int i = 0; i < wait; i++) {
				System.out.println("                   	     ‿︵‿︵‿︵‿︵								");
				System.out.println("‿︵‿︵‿︵‿︵											‿︵‿︵‿︵‿︵");
				System.out.println("                 		 ‿︵‿︵‿︵‿︵");
				System.out.println("			‿︵‿︵‿︵‿︵											");
				System.out.println("‿︵‿︵‿︵‿︵		.... 아무런 미동이 없다 ....		‿︵‿︵‿︵‿︵");

				System.out.println("                   	     ‿︵‿︵‿︵‿︵");
				System.out.println("‿︵‿︵‿︵‿︵											‿︵‿︵‿︵‿︵");
				try {
					Thread.sleep(5000); // 5초 대기하는 메서드
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			int fishCall = rand.nextInt(99) + 1; // 랜덤으로 물고기 종류를 생성하는 메서드
			int fishSizeMaker = rand.nextInt(10) + 1; // 물고기의 크기를 결정하는 메서드
			int fishSize = 0;
			if (fishSizeMaker == 10) {
				fishSize = 5;
			} else if (fishSizeMaker == 9) {
				fishSize = 4;
			} else if (fishSizeMaker > 6) {
				fishSize = 3;
			} else if (fishSizeMaker > 4) {
				fishSize = 2;
			} else {
				fishSize = 1;
			}
			fishCall = 100;
			if (fishCall == 100) {
				fishName = "고래상어";
				System.out.println("음 . . . 뭐지 . . ?");
				for (int i = 0; i < rand.nextInt(3) + 1; i++) {
					try {
						Thread.sleep(2000); // 2초 대기하는 메서드
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(". . .");
				}

				System.out.println(". . . ! !");

				String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
						"r", "s", "t", "u", "v", "w", "x", "y", "z" };

				int fishingRod = mem.getFishingRodType();// 낚싯대 타입 값

				for (int i = 0; i < fishingRod; i++) {
					String input = alpha[rand.nextInt(26)] + alpha[rand.nextInt(26)] + alpha[rand.nextInt(26)]
							+ alpha[rand.nextInt(26)];
					System.out.println("바다 위에 글자들이 나타났다? " + input);
					System.out.println("위의 문자를 똑같이 입력하세요.");
					long start = System.currentTimeMillis();
					String inputTest = sc.nextLine();
					long end = System.currentTimeMillis();
					double fishing = (double) ((end - start) * 0.001);

					if (fishing < 3 && input.equals(inputTest)) {// ~초 안에 눌러야 성공
						catchFish = true;
						mem.setBossck(true);
						continue;
					} else {
						catchFish = false;
						break;
					}
				}
			} else {
				if (fishCall > 95) {
					fishName = "참돔";
				} else if (fishCall > 85) {
					fishName = "바다장어";
				} else if (fishCall > 75) {
					fishName = "삼치";
				} else if (fishCall > 60) {
					fishName = "고등어";
				} else if (fishCall > 40) {
					fishName = "멸치";
				} else if (fishCall > 20) {
					fishName = "장화";
				} else {
					fishName = "바위";
				}

				int fishingRod = mem.getFishingRodType();// 낚싯대 타입 값
				System.out.println("신호가 왔다! ! !");
				for (int i = 0; i < fishingRod; i++) {
					System.out.println("Enter를 눌러 낚싯대를 당겨주세요.");
					long start = System.currentTimeMillis();
					sc.nextLine();
					long end = System.currentTimeMillis();
					double fishing = (double) ((end - start) * 0.001);

					if (fishing < 1) {// ~초 안에 눌러야 성공
						catchFish = true;
						continue;
					} else {
						catchFish = false;
						break;
					}
				}
			}

			if (catchFish && fishCall > 40) {
				util.getFishView(fishName, fishSize);
				if (fishCall == 100) { // 물고기를 mem의 물고기 배열에 넣는 행위
					mem.setWhaleShark(mem.getWhaleShark() + 1);
				} else if (fishCall > 95) {
					mem.getRedSeaBream().add(fishSize);
				} else if (fishCall > 85) {
					mem.getSeaEel().add(fishSize);
				} else if (fishCall > 75) {
					mem.getjMackerel().add(fishSize);
				} else if (fishCall > 60) {
					mem.getMackerel().add(fishSize);
				} else if (fishCall > 40) {
					mem.getAnchovy().add(fishSize);
				}
//				fishSize를 돈으로 여기서 바꿔야함 =>
				int score = util.fishprice(fishName, fishSize); // 사이즈 계산 메서드 넣어야함 == 돈으로 치환되는 거
				mem.setScore(mem.getScore() + score);

			} else if (catchFish && fishCall > 0 && fishCall < 40) {
				System.out.printf("아. . . %s였다 %n", fishName);
			} else if (!catchFish) {
				System.out.println("물고기가 도망가버렸습니다 ㅜㅜ");
				System.out.println("다시 도전해주세요 !");
			}

		} else if (mem.getFishingRodType() == 0) {
			System.out.println("낚시터에 낚싯대를 가져가야 할 것 같다.");
		} else if (mem.getBaitcnt() == 0) {
			System.out.println("어 . . 미끼가 없네 . . 미끼를 사와야 될 것 같다.");
		}
	}

	public boolean login(boolean login) { // 로그인

		System.out.println("아이디 입력:");
		String loginid = sc.nextLine();
		System.out.println("비밀번호 입력:");
		String loginpw = sc.nextLine();
		for (Member fishing : list) {
			if (loginid.equals(fishing.getId()) && loginpw.equals(fishing.getPw())) {
				System.out.println("로그인 완료");
				mem = fishing;
				login = true;

			}
		}
		if (!login) {
			System.out.println("로그인 실패");
		}
		return login;
	}

	public void buyfishingrod() { // 낚싯대 구매 메서드
		if (mem.getFishingRod()==null) {
			System.out.println("현재 낚싯대: 없음");
		}else {
			System.out.println("현재 낚싯대:"+mem.getFishingRod());
		}
		String rodName = "";
		if (mem.getFishingRodType()==0) {
			rodName = "나무 낚싯대";
		}else if (mem.getFishingRodType()==5) {
			rodName = "플라스틱 낚싯대";
		}else if (mem.getFishingRodType()==4) {
			rodName = "쇠 낚싯대";
		}else if(mem.getFishingRodType()==3) {
			rodName = "강철 낚싯대";
		}else if(mem.getFishingRodType()==2) {
			rodName = "티타늄 낚싯대";
		}
		if (mem.getFishingRodType()==1) {
			System.out.println("더 이상 업그레이드 할 수 없습니다.");
		}else {
			System.out.println("업그레이드 낚싯대: "+rodName);
			System.out.println("낚싯대를 업그레이드 하려면 1번, 아니면 2번을 눌러주세요");
			int num = util.numcheck();
			String fishingrod = "";
			int price = 0;
			int type = 0;
			if (num == 1) {
				if (mem.getFishingRod()==null) {
					fishingrod = "나무";
					price = 4000;
					type = 5;
				} else if (mem.getFishingRod().contains("나무")) {
					fishingrod = "플라스틱";
					price = 50000;
					type = 4;
				} else if (mem.getFishingRod().contains("플라스틱")) {
					fishingrod = "쇠";
					price = 100000;
					type = 3;
				} else if (mem.getFishingRod().contains("쇠")) {
					fishingrod = "강철";
					price = 300000;
					type = 2;
				} else if (mem.getFishingRod().contains("강철")) {
					fishingrod = "티타늄";
					price = 1000000;
					type = 1;
				}
			} else {
				System.out.println("취소");
			}

			if (num==1) {
				if (moneycheck(price)) {
					mem.setFishingRodType(type);
					mem.setFishingrod(fishingrod);

					System.out.println(mem.getFishingRod() + " 구매 완료");
					System.out.println("현재 보유 금액: " + mem.getMoney()+"원");
					System.out.println("현재 낚싯대: " + mem.getFishingRod());
				}
			}
		}
	}

	public void buybait() { // 미끼 구매 메서드
		System.out.println("미끼가격(200)");
		System.out.print("수량: ");
		int cnt = sc.nextInt();
		sc.nextLine();
		
		if (moneycheck(cnt * 200)) {
			mem.setBaitcnt(mem.getBaitcnt() + cnt);
			System.out.println("미끼 " + cnt + "개 구매 완료");
			System.out.println("현재 보유 금액: " + mem.getMoney()+"원");
			System.out.println("현재 보유 미끼 개수: " + mem.getBaitcnt()+"개");
		}
	}

	boolean moneycheck(int price) { // 보유 금액 체크 메서드
		boolean moneycheck = false;
		if (mem.getMoney() < price) {
			System.out.println("보유 금액이 부족합니다.");
		} else {
			mem.setMoney(mem.getMoney() - price);
			moneycheck = true;
		}
		return moneycheck;
	}

	public void sellfish() { // 물고기 판매 메서드
		out: while (true) {
			fishcntlist();
			String fishname = "";
			System.out.println();
			if (mem.getBossck()==true) {
				System.out.println("1.멸치 2.고등어 3.삼치 4.바다장어 5.참돔 6.고래상어(보스) 0.종료");
			} else {
				System.out.println("1.멸치 2.고등어 3.삼치 4.바다장어 5.참돔 6.??????(보스) 0.종료");
			}
			int num = util.numcheck();
			switch (num) {
			case 1:
				fishname = "멸치";
				fishlist(fishname, num, mem.getAnchovy().size());
				mem.setAnchovy(mem.getAlist());
				break;
			case 2:
				fishname = "고등어";
				fishlist(fishname, num, mem.getMackerel().size());
				mem.setMackerel(mem.getAlist());
				break;
			case 3:
				fishname = "삼치";
				fishlist(fishname, num, mem.getjMackerel().size());
				mem.setjMackerel(mem.getAlist());
				break;
			case 4:
				fishname = "바다장어";
				fishlist(fishname, num, mem.getSeaEel().size());
				mem.setSeaEel(mem.getAlist());
				break;
			case 5:
				fishname = "참돔";
				fishlist(fishname, num, mem.getRedSeaBream().size());
				mem.setRedSeaBream(mem.getAlist());
				break;
			case 6:
				if (mem.getBossck()==true) {
					fishname = "고래상어(보스)";
				} else {
					System.out.println("아직 보스를 잡지 못했습니다.");
				}
				fishlist(fishname, num, mem.getWhaleShark());
				break;
			case 0:
				System.out.println("종료");
				break out;
			default:
				System.out.println("번호확인");
				break;
			}
		}
	}

	public void fishcntlist() { // 보유 물고기 출력 메서드
		System.out.println("종류\t\t개수");
		System.out.println("-----------------------------");
		System.out.println("멸치\t\t" + mem.getAnchovy().size() + "개");
		System.out.println("고등어\t\t" + mem.getMackerel().size() + "개");
		System.out.println("삼치\t\t" + mem.getjMackerel().size() + "개");
		System.out.println("바다장어\t" + mem.getSeaEel().size() + "개");
		System.out.println("참돔\t\t" + mem.getRedSeaBream().size() + "개");

		// 보스전에서 성공해서 잡았을 시 고래상어의 불리언값이 트루일때 고래상어의 ???가 해금
		if (mem.getBossck()==true) {
			System.out.println("고래상어\t" + mem.getWhaleShark() + "개");
		} else {
			System.out.println("????????");
		}
	}

	public void fishlist(String fishname, int a, int b) { // 물고기 판매 메서드
		// 물고기의 인트값을 받아서 출력
		System.out.println("번호 종류\t크기\t가격");
		System.out.println("---------------------------------");
		for (int i = 0; i < b; i++) {
			switch (a) {
			case 1:
				mem.setAlist(mem.getAnchovy());

				break;
			case 2:
				mem.setAlist(mem.getMackerel());

				break;
			case 3:
				mem.setAlist(mem.getjMackerel());

				break;
			case 4:
				mem.setAlist(mem.getSeaEel());

				break;
			case 5:
				mem.setAlist(mem.getRedSeaBream());

				break;
			case 6:

				break;
			}
			if (a != 6) {
				System.out.println((i + 1) + ".  " + fishname + "\t" + util.fishsize(fishname, mem.getAlist().get(i))
						+ "cm\t" + util.fishprice(fishname, mem.getAlist().get(i))+"원");
			}
		}
			if (a == 6) {
				if(mem.getBossck()==true) {
				System.out.println("현재 보유 개수: " + mem.getWhaleShark() + "개");
				System.out.print("판매 마리 수: ");
				int sell = util.numcheck();
				mem.setWhaleShark(mem.getWhaleShark() - sell);
				mem.setMoney(mem.getMoney()+1000000*sell);
				System.out.println("현재 보유 액:" + mem.getMoney()+"원");}else {
					System.out.println("보스를 잡지 못했습니다.");
					
				}
			} else {
				System.out.println("팔고 싶은 물고기 선택");
				System.out.println("번호 입력: ");
				int f = util.numcheck();

				if (f - 1 <= b) {
					mem.setMoney(mem.getMoney() + util.fishprice(fishname, mem.getAlist().get(f-1)));
					mem.getAlist().remove(f - 1);
				} else {
					System.out.println("없는 번호입니다.");
				}
				System.out.println("현재 보유 액: " + mem.getMoney()+"원");
			}

	}

	public ArrayList<Member> rank() { // 랭킹 메서드
		for (int i = 0; i < list.size(); i++) {
			int count = 1;
			for (int j = 0; j < list.size(); j++) {
				// 같은 대상이 아니면
				if (i != j) {
					if (list.get(i).getScore() < list.get(j).getScore()) {
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
		System.out.println("[명예의 전당]");
		System.out.println("순위\t닉네임\t\t점수\t\t낚싯대");
		System.out.println("-------------------------------------------------");
		for (Member s : list) {
			System.out.println(s.toString());// 출력문
		}
		System.out.println("-------------------------------------------------");
		return list;
	}

}
