import java.io.*;

public class FileReader {

	// private FileInputStream fIn = null;
	private BufferedReader bInReader= null;
	// private String string = null;

	public void initFileReader(String location) {
		try {
			// in = new FileInputStream("text/test.text");
			// 直接使用 FileReader 可能导致乱码
			bInReader = new BufferedReader(new InputStreamReader(new FileInputStream(location),"UTF-8"));
			// bInReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("指定文件不存在");
		} catch (UnsupportedEncodingException e2) { //需要注意这里捕获的异常
			System.out.println("指定字符集错误");
		}
	}

	public String readLine() {
		String string = null;

		try{
			string = this.bInReader.readLine();

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("读取文件出错2");
		}

		return string;
	} 

	public String readAll() {
		String stringBuf = "";
		String string = null;
		try {
			for(string = this.bInReader.readLine();string != null;string = this.bInReader.readLine()) {
				stringBuf = stringBuf + string + "\n" ;
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("读取文件出错2");
		}

		return stringBuf;
	}

	// 文件读取完毕后必须调用，用来关闭所有的管道
	public void close() {
		try {
			this.bInReader.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读取管道关闭失败");
		} 
	}

/*	public static void main(String args[]) {

		FileReader tRF = new FileReader();

		tRF.inintFileReader();

		try {
			while((tRF.string = tRF.bInReader.readLine()) != null) {
				System.out.println(tRF.string);
			}
			// System.out.println(tRF.bInReader.readLine());
			tRF.bInReader.close();
		} catch (IOException e) {
				System.out.println("读取文件出错2");
		}
	}*/
}
