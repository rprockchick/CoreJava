
public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month_days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("April has "+ month_days[3]+ " days");
		
		
		int twoD[][] = new int[4][5];
		int i,j,k=0;
		for(i=0;i<4;i++) 
		for(j=0;j<5;j++){
			
			twoD[i][j]=k;
			k++;
			
				
		}
		
		for(i=0;i<4;i++){
			for(j=0;j<5;j++)
				System.out.print(twoD[i][j]+" ");
				System.out.println();
		}
			
		
		

	}

}
