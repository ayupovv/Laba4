package Laba4;

public class Calculation {
private double a, S = 0;
private String str;
public void seta(double value) {
	a = value;
}	
	public void calcSquare () {
		if (a > 0) {
			S = a * a;
		}else {
			str = "Не существует";
		}
	}
	
	public String toString() {
		if (a > 0 ) {
			str = String.valueOf("S = " + S + " см");
		}
		return str;
	
}
}