import java.util.ArrayList;
class lambdaExp{
	public static void main(String as[]){
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		a.forEach(n -> System.out.println(n));
		a.forEach(n->{if(n%2==0)System.out.println(n);});
	}
}