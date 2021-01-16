package ch10;

public class Answer1Main {

	public static void main(String[] args) {
		System.out.println("--- 1번 ---");
		Question1 q1 = new Question1("a10", "a20");
		q1.plus();
		q1.minus();
		q1.multi();
		q1.divide();
		
		
		System.out.println("--- 2번 ---");
		Question2 q2 = new Question2("20.5", "10.5");
		q2.plus();
		q2.minus();
		q2.multi();
		q2.divide();
	}

}
