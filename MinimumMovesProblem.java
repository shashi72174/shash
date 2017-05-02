package shashi;
public class MinimumMovesProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"1234","4321"};
		String[] b = {"2345","3214"};
		int totalMoves = 0;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				String aStr = a[i];
				String bStr = b[i];
				if(aStr.length()==bStr.length()) {
					for(int j=0;j<aStr.length();j++) {
						Integer aVal = new Integer(Character.toString(aStr.charAt(j)));
						Integer bVal = new Integer(Character.toString(bStr.charAt(j)));
						totalMoves = totalMoves+Math.abs(aVal-bVal);
					}
				}
			}
		}
		System.out.println(totalMoves);
	}
}
