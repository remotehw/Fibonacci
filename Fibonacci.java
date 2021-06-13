
public class Fibonacci {
/**
 * This program will generate Fibonacci sequences of different lengths
 * iteratively and recursively and clock the runtime in nanoseconds for comparison.
 * 
 */
	public static void main(String[] args)
	{
		 long startTime = 0;
		 
		 // The value returned from the initial call to System.nanoTime is inaccurate due to a known bug at the OS level
		 startTime = System.nanoTime();
		 System.out.print("After 5 iterations: ");
		 System.out.println(iterativeFib(5));
		 System.out.print("Run time: ");
		 System.out.println(System.nanoTime() - startTime);
		 
		 startTime = System.nanoTime();
		 System.out.print("After 10 iterations: ");
		 System.out.println(iterativeFib(10));
		 System.out.print("Run time: ");
		 System.out.println(System.nanoTime() - startTime);
		 
		 startTime = System.nanoTime();
		 System.out.print("After 20 iterations: ");
		 System.out.println(iterativeFib(20));
		 System.out.print("Run time: ");
		 System.out.println(System.nanoTime() - startTime);
		 
		 startTime = System.nanoTime();
		 System.out.print("After 5 recursive calls: ");
		 System.out.println(recursiveFib(5));
		 System.out.print("Run time: ");
		 System.out.println(System.nanoTime() - startTime);
		 
		 startTime = System.nanoTime();
		 System.out.print("After 10 recursive calls: ");
		 System.out.println(recursiveFib(10));
		 System.out.print("Run time: ");
		 System.out.println(System.nanoTime() - startTime);
		 
		 startTime = System.nanoTime();
		 System.out.print("After 20 recursive calls: ");
		 System.out.println(recursiveFib(20));
		 System.out.print("Run time: ");
		 System.out.println(System.nanoTime() - startTime);
		 
	}
	
	/**
	 * The iterativeFib method generates the Fibonacci sequence iteratively with a for loop.
	 * The runtime of this method should be O(n)
	 * 
	 * @param length the length of the sequence to generate
	 * @return the final number of the generated sequence
	 */
	
	public static long iterativeFib(int length)
	{
		
		long fibResult = 0, num1 = 0, num2 = 1;
		for (int i = 0; i < length; i++)
		{
			num1 = num2;
			num2 = fibResult;
			fibResult = num1 + num2;
			
		}
		return fibResult;
	}
	
	/**
	 * The recursiveFib method generates the Fibonacci sequence recursively.
	 * The runtime of this method is roughly O(2^n) when length > 1
	 * 
	 * @param length the length of the sequence to generate
	 * @return the final number of the generated sequence
	 */
	
	public static long recursiveFib(long length)
	{
		long sequence = 0;
		if ((length == 0) || (length == 1))
		{
			return length;
		}
		
		sequence = recursiveFib(length - 1) + recursiveFib(length - 2);
		return sequence;
    }

}
