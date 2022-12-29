package ex16;

public class Ex04Board {

		private String noticeTitle;
		private String noticeContents;
		private String noticeWrite;
		private String noticeWriteDay;
		private int noticeNum;
		private int noticeViewCnt;
		public String getNoticeTitle() {
			return noticeTitle;
		}
		public void setNoticeTitle(String noticeTitle) {
			this.noticeTitle = noticeTitle;
		}
		public String getNoticeContents() {
			return noticeContents;
		}
		public void setNoticeContents(String noticeContents) {
			this.noticeContents = noticeContents;
		}
		public String getNoticeWrite() {
			return noticeWrite;
		}
		public void setNoticeWrite(String noticeWrite) {
			this.noticeWrite = noticeWrite;
		}
		public int getNoticeNum() {
			return noticeNum;
		}
		public void setNoticeNum(int noticeNum) {
			this.noticeNum = noticeNum;
		}
		public int getNoticeViewCnt() {
			return noticeViewCnt;
		}
		public void setNoticeViewCnt(int noticeViewCnt) {
			this.noticeViewCnt = noticeViewCnt;
		}
		
		public String getNoticeWriteDay() {
			return noticeWriteDay;
		}
		public void setNoticeWriteDay(String noticeWriteDay) {
			this.noticeWriteDay = noticeWriteDay;
		}
		@Override
		public String toString() {
			return "Ex04Board [noticeTitle=" + noticeTitle + ", noticeContents=" + noticeContents + ", noticeWrite="
					+ noticeWrite + ", noticeWriteDay=" + noticeWriteDay + ", noticeNum=" + noticeNum
					+ ", noticeViewCnt=" + noticeViewCnt + "]";
		}

}
