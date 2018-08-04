import java.util.Arrays;

public class Assignment8 {
//bonus assignment
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status = true;
		String x = "solar";
		String y = "orals";
		if (x.length() != y.length()) {
			status = false;
		}
		else {
			char[] cx = x.toCharArray();
			char[] cy = y.toCharArray();
			Arrays.sort(cx);
			Arrays.sort(cy);
			status = Arrays.equals(cx,cy);
		}
		if (status) {
			System.out.println("The two strings " + x + " and " + y + " are anagrams");
		}
		else {
			System.out.println("The two strings " + x + " and " + y + " are not anagrams");
		}
	}
}
