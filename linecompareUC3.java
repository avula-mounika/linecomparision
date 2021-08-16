
public class linecompareUC3 {

	public static void main(String[] args) {
		int x1 = 1, y1 = 1;
		int x2 = 5, y2 = 5;
		int a1 = 1, b1 = 1;
		int a2 = 5, b2 = 5;
		
		double length1 = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
		System.out.println("length of a line1 : " + length1);
		double length2 = Math.sqrt((a2-a1) * (a2-a1) + (b2-b1) * (b2-b1));
		System.out.println("length of a line2 : " + length2);
		
		String myStr1 = Double.toString(length1);
		String myStr2 = Double.toString(length2);
		float name = (myStr1.compareTo(myStr2));
		System.out.println(name);
		if(length1 == length2)  
			System.out.println("The line lengths are equal");
		else if (length1 > length2)
			System.out.println("The line1 length is greater than line2 length");
		else 
			System.out.println("The line1 length is less than line2 length");
	}
}
