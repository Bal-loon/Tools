import java.io.*;

public class TestBufferInBufferedReader {
	public static void main(String[] args) {
		try {
			FileInputStream fIS = new FileInputStream("text/test.dat");
			InputStreamReader iSR = new InputStreamReader(fIS);
			BufferedReader bISR = new BufferedReader(iSR,2);

			// System.out.println(bISR.readLine());


			char[] buf = null;
			int off = 1;
			int len = 8;
			bISR.read(buf,off,len);
			System.out.println(buf.toString());


			bISR.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}