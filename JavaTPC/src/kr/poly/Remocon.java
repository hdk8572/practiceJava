package kr.poly;

public interface Remocon {	// 객체생성 X; Remocon r = new Remocon(); (X)
	
	public static final int MAXCH = 100;
	public static final int MINCH = 1;
	
	// 추상메서드 
	public void chUp();
	public void chDown();
	public void internet();
}
