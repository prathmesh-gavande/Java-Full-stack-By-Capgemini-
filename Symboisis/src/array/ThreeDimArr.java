package array;

public class ThreeDimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][][]= {
				{{60,70,75},{80,85,90},{55,78,90}},
				{{20,50,85},{80,84,95},{54,77,70}},
				{{61,79,72},{70,87,50},{25,71,80}}
		};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k < arr.length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
