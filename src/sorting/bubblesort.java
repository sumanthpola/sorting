package sorting;

public class bubblesort {
	int arr[]= {3,56,1,6,5};
public void bubble(){
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if (arr[j]>arr[j+1]) {
				int k=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=k;
				}			
				
			}
		}
	for (int k=0;k<arr.length;k++) {
		System.out.println(arr[k]);
	}
	
	
}


	public static void main(String[] args) {
		bubblesort j=new bubblesort();
		j.bubble();
		
}}

