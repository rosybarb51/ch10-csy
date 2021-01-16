package ch10;

public class Question1 {
	private int num1;
	private int num2;
	
	public Question1() {
		this("0", "0");
	}
	
	public Question1(String num1, String num2) {
		try {
			this.setNum1(num1);
			this.setNum2(num2);
		}
		catch (Question1Exception e) {
			System.out.println(e.getStackTrace() + " 에서 오류가 발생했습니다.");
			System.out.println(e.getMessage());
		}
	}
	
	public int getNum1() {
		return num1;
	}

//	Question1Exception을 직접 처리하지 않고 setNum1 메서드를 호출한 곳에서 처리하도록 예외 넘기기를 함
	public void setNum1(String num1) throws Question1Exception {
		try {
//			String 타입의 매개변수를 정수형으로 변환
//			정수로 변환이 안될 경우 오류 발생
			this.num1 = Integer.parseInt(num1);
		}
		catch (Exception e) {
//			오류 발생 시 사용자 정의 Exception 인 Question1Exception 예외를 발생 시킴
			throw new Question1Exception("숫자를 입력하세요");
		}
	}

	public int getNum2() {
		return num2;
	}

//	Question1Exception을 직접 처리하지 않고 setNum1 메서드를 호출한 곳에서 처리하도록 예외 넘기기를 함
	public void setNum2(String num2) throws Question1Exception {
		try {
//			String 타입의 매개변수를 정수형으로 변환
//			정수로 변환이 안될 경우 오류 발생
			this.num2 = Integer.parseInt(num2);
		}
		catch (Exception e) {
//			오류 발생 시 사용자 정의 Exception 인 Question1Exception 예외를 발생 시킴
			throw new Question1Exception("숫자를 입력하세요");
		}
	}

	public void plus() {
		int result = 0;
		try {
			result = num1 + num2;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
		
	}
	
	public void minus() {
		int result = 0;
		try {
			result = num1 - num2;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
	}
	
	public void multi() {
		int result = 0;
		try {
			result = num1 * num2;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
	}
	
	public void divide() {
		int result = 0;
		try {
			result = num1 / num2;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
	}
}
