package kr.poly;

public class TV implements Remocon {

	int currCH = 70;
	
	@Override
	public void chUp() {
		if (currCH < Remocon.MAXCH) {
			currCH++;
			System.out.println("TV의 채널이 올라간다.:" + currCH);
		} else {
			currCH = 1;
			System.out.println("TV의 채널이 올라간다.:" + currCH);
		}
	}

	@Override
	public void chDown() {
		if (currCH > 1) {
			currCH--;
			System.out.println("TV의 채널이 내려간다.:" + currCH);		
		} else {
			currCH = 100;
			System.out.println("TV의 채널이 내려간다.:" + currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("인터넷이 된다.");		
	}

}
