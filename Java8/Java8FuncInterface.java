package Java8;
@FunctionalInterface
// annotation for functional interface
interface FuncInterface {
 
    public int multiply(int a, int b);
}
public class Java8FuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterface Total = (a, b) -> a * b;
        // simple operation of multiplication of 'a' and 'b'
        System.out.println("Result: "+Total.multiply(30, 60));
	}

}
