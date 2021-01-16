package ch10;

// AutoCloseable 인터페이스가 close() 메서드를 가지고 있어서 close() 필요한 부분을 자동으로 처리함
public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}

	public void read() {
		System.out.println(file + " 을 읽었습니다.");
	}
	
//	자동으로 리소스를 해제할 수 있게해주는 메서드 close()
	@Override
	public void close() throws Exception {
		System.out.println(file + " 을 닫습니다.");
	}
}
