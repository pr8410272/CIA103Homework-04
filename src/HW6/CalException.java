package HW6;

public class CalException extends Exception{
		public CalException() {}

		public CalException(String msg) {
			System.out.println(msg);
		}
}