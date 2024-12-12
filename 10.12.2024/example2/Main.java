package example2;

public class Main {

	public static void main(String[] args) {
		/*Rectangle r1 = new Rectangle(15, 5);
		Rectangle r2 = new Rectangle(10, 10);
		Rectangle r3 = new Rectangle(7, -10);
		
		Rectangle[] rects = new Rectangle[3];
		rects[0] = r1;
		rects[1] = r2;
		rects[2] = r3;
		
		for(int i = 0; i < rects.length; i++) {
			System.out.println(rects[i].toString());
		}
		*/
		
		ComplexNumber cn1 = new ComplexNumber();
		ComplexNumber cn2 = new ComplexNumber();
		
		ComplexNumber cn3 = cn1.add(cn2);
		ComplexNumber cn4 = cn1.minus(cn2);
		ComplexNumber cn5 = cn1.pow(5);
	}

}
