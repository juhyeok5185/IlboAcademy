import java.util.ArrayList;
import java.util.List;

public class Customer {

   private String name; // 고객명
   private int birth; // 생년월일
   private int gender; // 성별
   private String phoneNumber; // 전화번호
   private String genderName; // 성별체크
   private int period;// 숙박기간
   private String roomNum; // 방번호
   
   //추가
   private String date;
   
   //구현필요
   private String sNote = " "; //특이사항 //레저베이션 할떄도 필요
   
   private boolean vip; //기본리스트 뺴서 vip로 옮긴다.
   private boolean black; //기본리스트 뺴서 vip로 옮긴다.

   
public String getsNote() {
	return sNote;
}
public void setsNote(String sNote) {
	
	this.sNote = sNote;
}
//추가
public String getDate() {
	return date;
}
//추가
public void setDate(String date) {
	this.date = date;
}

public void setVip(boolean vip) {
	this.vip = true;
}
public Boolean getVip() {
	return vip;
}
public boolean isBlack() {
	return black;
}

public void setBlack(boolean black) {
	this.black = black;
}

public String getGenderName() {
      return genderName;
   }

   public String getRoomNum() {
      return roomNum;
   }

   public void setRoomNum(int i, int j) {
      String a = "";
      String b = "";
      this.roomNum = roomNum;
      a = Integer.toString(i);
      b = Integer.toString(j);
      roomNum = a + 0 + b;

   }

   public void setGenderName(String genderName) {
      this.genderName = genderName;
   }

   public int getPeriod() {
      return period;
   }

   public void setPeriod(int period) {
      this.period = period;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getBirth() {
      return birth;
   }

   public void setBirth(int birth) {
      this.birth = birth;
   }

   public int getGender() {
      return gender;
   }

   public void setGender(int gender) {
      this.gender = gender;
      if (this.gender == 1) {
         genderName = "남성";
      } else if (this.gender == 2) {
         genderName = "여성";
      }
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }
   
   @Override
	public String toString() {
		return "방번호 : " + roomNum + "\n" + "고객명 : " + name + "\n" + "생년월일 : " + birth + "\n" + "성별 : " + genderName + "\n"
				+ "숙박기간 : " + period + "일" + "\n" + "예약날짜 : " + date + "\n" + "특이사항 : " + sNote + "\n";
	}
  


}