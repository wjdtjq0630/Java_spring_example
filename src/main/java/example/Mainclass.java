package example;

public class Mainclass {
	
	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		calculation.setFirstNum(10);
		calculation.setSecondNum(2);
		
		calculation.add();
		calculation.sub();
		calculation.mult();
		calculation.sub();
	}
}
