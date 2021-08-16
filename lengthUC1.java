
public class lengthUC1 {

	public static void main(String[] args) {
		int x1 = 1, y1 = 1;
		int x2 = 5, y2 = 5;
		
		double length = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
		System.out.println("length of a line between two points : " + length);
	}

}
