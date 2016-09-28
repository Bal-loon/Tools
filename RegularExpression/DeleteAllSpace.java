public class DeleteAllSpace {
	public static void main(String[] args) {
		FileReader fR = new FileReader();
		fR.initFileReader("text/test.dat");

		// System.out.println(fR.readLine());
		// System.out.println(fR.readLine());
		// System.out.println("sdfwer");
		// System.out.println(fR.readLine());
		System.out.println(fR.readAll());
		fR.close();
	}
}