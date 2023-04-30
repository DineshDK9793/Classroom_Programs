package week1.day2;

public class FindDuplicateValue {

	public static void main(String[] args) {
		
		int[] values = {2, 5, 7, 7, 5, 9, 2, 3};
		
		int len = values.length;
		
		for (int i=0;i<len;i++) {
			for (int j=i+1;j<len;j++) {
				if(values[i]==values[j]) {
					
					System.out.println(values[i]);
				}
			}
		}
	}
}
