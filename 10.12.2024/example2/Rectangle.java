package example2;

public class Rectangle {
	
	private int a;
	
	private int b;
	
	public Rectangle(int a, int b) {
		if(a < 0) {
			this.setA(0);
		} else {
			this.setA(a);
		}
		if(b < 0) {
			this.setB(0);
		} else {
			this.setB(b);
		}
	}
	
	public int getPerimeter() {
		return a*2 + b*2;
	}
	
	public int getPloshad() {
		return a * b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		if(a < 0) {
			this.a = 0;
		} else {
			this.a = a;
		}
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		if(b < 0) {
			this.b = 0;
		} else {
			this.b = b;
		}
	}
	
	public String toString() {
		return "[" + a + ":" + b + "]";
	}
}
