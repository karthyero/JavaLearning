package exceptionLearning;
public class TryCatchFinally {
	public static void main(String[] args) {

		// array of size 4.
		int[] arr = new int[4];

		try {
			
			//int i = arr[4];
			throw new ArrayIndexOutOfBoundsException("index Oob");
			// this statement will never execute
			// as exception is raised by above statement
			//System.out.println("Inside try block");
		}

		catch (Exception ex) {
			System.out.println("Exception caught in catch block");
			ex.printStackTrace();
		}

		finally {
			System.out.println("finally block executed");
		}
		

		// rest program will be executed
		System.out.println("Outside try-catch-finally clause");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
