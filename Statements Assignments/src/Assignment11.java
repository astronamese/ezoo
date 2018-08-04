
public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		for (int count = 0; count < intArray.length; count++) {
			for (int i = 1; i <= 10; i++) {
				int x = intArray[count] * i;
				System.out.println(intArray[count] + "*" + i + "=" + x);
			}
		}
	}

}
