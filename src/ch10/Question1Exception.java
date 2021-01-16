package ch10;

// 1, 2번 문제의 사용자 정의 예외 클래스
public class Question1Exception extends Exception {
	public Question1Exception() {
		
	}
	
	public Question1Exception(String msg) {
		super(msg);
	}
}
