package ex15;

public class Ex01User {
	private String userName;
	private String userId;
	private String userPw;
	private int userMoney;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return this.userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public int getUserMoney() {
		return this.userMoney;
	}

	public void setUserMoney(int userMoney) {
		this.userMoney = userMoney;
	}

	@Override
	public String toString() {
		return "{" +
				" userName='" + getUserName() + "'" +
				", userId='" + getUserId() + "'" +
				", userPw='" + getUserPw() + "'" +
				", userMoney='" + getUserMoney() + "'" +
				"}";
	}

}
