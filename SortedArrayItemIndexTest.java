public class SortedArrayItemIndexTest {
	public static void main(String[] args) {
		System.out.println("came inside");
		int[] sortedArray = new int[] {5,10,15,20,25,30};
		int item = 2;
		int index = -1;
		for(int i=0;i<sortedArray.length;i++){
			if(item<sortedArray[i]) {
				index = i+1;
				break;
			}else if(i == (sortedArray.length-1))
				index = sortedArray.length+1;
		}
		System.out.println(index);
	}
}