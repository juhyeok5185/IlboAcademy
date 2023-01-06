package fishgame;

import java.util.ArrayList;

public class Member {
	private String name;
	private String id;
	private String pw;
	private int money;
	private int score;
	private String fishingRod;
	private int fishingRodType;
	private int baitcnt;
	private int rank;
	private int whaleShark;
	private boolean bossck;
	
	private ArrayList<Integer> mackerel = new ArrayList<>();
	private ArrayList<Integer> jMackerel = new ArrayList<>();
	private ArrayList<Integer> anchovy = new ArrayList<>();
	private ArrayList<Integer> redSeaBream = new ArrayList<>();
	private ArrayList<Integer> seaEel = new ArrayList<>();
	private ArrayList<Integer> alist= null;
	
	public Member() {
		
	}
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public ArrayList<Integer> getAlist() {
		return alist;
	}

	public void setAlist(ArrayList<Integer> alist) {
		this.alist = alist;
	}
	
	public void setMackerel(ArrayList<Integer> fishSize) {
		this.mackerel = fishSize;
	}

	public ArrayList<Integer> getMackerel() {
		return mackerel;
	}

	public ArrayList<Integer> getjMackerel() {
		return jMackerel;
	}

	public void setjMackerel(ArrayList<Integer> fishSize) {
		this.jMackerel = fishSize;
	}

	public ArrayList<Integer> getAnchovy() {
		return anchovy;
	}

	public void setAnchovy(ArrayList<Integer> fishSize) {
		this.anchovy = fishSize;
	}

	public ArrayList<Integer> getRedSeaBream() {
		return redSeaBream;
	}

	public void setRedSeaBream(ArrayList<Integer> fishSize) {
		this.redSeaBream = fishSize;
	}

	public ArrayList<Integer> getSeaEel() {
		return seaEel;
	}

	public void setSeaEel(ArrayList<Integer> fishSize) {
		this.seaEel = fishSize;
	}

	public int getWhaleShark() {
		return whaleShark;
	}

	public void setWhaleShark(int fishSize) {
		this.whaleShark = fishSize;
	}

	public int getRankmoney() {
		return score;
	}

	public void setRankmoney(int score) {
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getFishingRod() {
		return fishingRod;
	}

	public void setFishingrod(String fishingrod) {
		this.fishingRod = fishingrod + " 낚싯대";
	}

	public int getBaitcnt() {
		return baitcnt;
	}

	public void setBaitcnt(int baitcnt) {
		this.baitcnt = baitcnt;
	}
	public int getFishingRodType() {
		return fishingRodType;
	}
	public void setFishingRodType(int fishingRodType) {
		this.fishingRodType = fishingRodType;
	}

	@Override
	public String toString() {
		String a = "";
		if(fishingRod==null) {
			a=rank +"위\t"+name+"\t\t"+ score +"점\t\t"+"없음";
		}else {
			if(getBossck()==true) {
				a=rank +"위\t"+name+"\t\t"+ score +"점\t\t"+fishingRod+"*상어 살해자*";
			}else {
		a=rank +"위\t"+name+"\t\t"+ score +"점\t\t"+fishingRod;}}
		return a;
	}

	public boolean getBossck() {
		return bossck;
	}

	public void setBossck(boolean bossck) {
		this.bossck = bossck;
	}


	
	
	
	
	

}
