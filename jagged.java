import java.util.*;
class jagged{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of 2D you want to take");
		int n=sc.nextInt();
		System.out.println("Enter dimension of the 2D arrays you want to take");
		int i,j,k,r=0;
		int d[]=new int[n];
		for(i=0;i<n;i++){
			d[i]=sc.nextInt();
			r=r+d[i];
		}
		int jag[][]=new int[r][];
		int t=r-1;
		for(i=0;i<n;i++){
			System.out.println("Enter element of "+(i+1)+"th array");
			for(j=0;j<d[i];j++){



				jag[t]=new int[d[i]];
				for(k=0;k<d[i];k++){
					
					jag[t][k]=sc.nextInt();
				}
				t--;
				
			}	
				
		}
		for(i=0;i<r;i++){
			for(j=0;j<jag[i].length;j++){
				System.out.print(jag[i][j]+"  ");	
			}
			System.out.println();
		}
	}
}