package ch10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceMain {

	public static void main(String[] args) {
		
		String file = "c:\\java\\reader.txt";
		
		FileInputStream fis1 = null;
		
		try {
			fis1 = new FileInputStream(file);
			fis1.read();
			throw new Exception(); // 강제 오류 발생
		}
		catch (Exception e) {
			System.out.println("일반 오류 처리가 실행되었습니다.");
		}
		finally {
			try {
				if (fis1 != null) {
					fis1.close();
				}
			}
			catch (Exception e) {
				System.out.println("finally 에서 오류 처리가 실행되었습니다.");
			}
		}
		
		
		
		System.out.println("\n----- Try With Resource -----\n");
		
//		try 에 () 를 추가하여 해당 괄호 안에 close() 를 사용할 객체를 생성
//		2라인 이상으로 입력할 경우 
//		(
//		FileInputStream fs1 = new FileInputStream();
//		FileInputStream fs2 = new FileInputStream()
//		)
//		형식으로 사용이 가능함
		try (FileInputStream fis2 = new FileInputStream(file)) {
			
			fis2.read();
			
			throw new Exception(); // 강제 오류 발생
		}
		catch (Exception e) {
			System.out.println("try with resource 예외 처리가 실행되었습니다.");
		}
	}

}







