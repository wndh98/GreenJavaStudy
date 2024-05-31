package exception_basic;

public class FileInputStreamTest implements AutoCloseable{
	private String file;

	public FileInputStreamTest(String file) {
		this.file=file;
	}
	
	void read() {
		System.out.println(file + " read");
	}
	
	public void close() throws Exception{
		System.out.println(file + " close");
	}
	
}
