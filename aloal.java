import java.util.*;
class aloal{	
	public static void main(String as[]){
		ArrayList<ArrayList<Integer>> alist=new ArrayList<ArrayList<Integer>>(3);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(10);
		a2.add(20);
		a2.add(30);
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(100);
		a3.add(200);
		a3.add(300);		
		a3.add(20);
		a3.add(3);
		alist.add(a1);
		alist.add(a2);
		alist.add(a3);
		for(int i=0;i<alist.size();i++){
			for(int j=0;j<alist.get(i).size();j++){
				System.out.print(alist.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}
}