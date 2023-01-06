
public class payment implements SuperPayment {
	String cardName;
	String cardNum;
	String cardExpairy;
	
	@Override
	public void cardName(String name) {
		this.cardName = cardName;
	}

	@Override
	public void cardNum(String num) {
		this.cardNum = cardNum;
	}

	@Override
	public void cardExpairy(String expairy) {
		this.cardExpairy = expairy;
		acess(cardName, cardNum, expairy);
	}

	@Override
	public void acess(String cardName, String cardNum, String cardExpairy) {
		System.out.println("결제가 완료되었습니다.");
	}

}
