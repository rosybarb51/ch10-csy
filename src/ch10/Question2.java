package ch10;

public class Question2 {
	private int num1;
	private int num2;
	
	public Question2() {
		this("0", "0");
	}
	
	public Question2(String num1, String num2) {
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

	public void setNum1(String num1) throws Question1Exception {
		double result = 0.0;
		
		try {
			result = Double.parseDouble(num1);
		}
		catch (Exception e) {
			throw new Question1Exception("숫자를 입력하세요");
		}
		
		try {
			
			this.num1 = Integer.parseInt(num1);
		}
		catch (Exception e) {
			throw new Question1Exception("정수를 입력하세요");
		}
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(String num2) throws Question1Exception {
		double result = 0.0;
		try {
			result = Double.parseDouble(num2);
		}
		catch (Exception e) {
			throw new Question1Exception("숫자를 입력하세요");
		}
		
		try {
			
			this.num1 = Integer.parseInt(num2);
		}
		catch (Exception e) {
			throw new Question1Exception("정수를 입력하세요");
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
