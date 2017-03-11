public class Bottles{
	public static void main(String[] args){
		int x=99;
		String word="bottles";
		while(x>0){
			if(x==1)
			{
				 word="bottle";
			}
			System.out.println(x+" "+word+" of beer on the wall");
			System.out.println(x+" "+word+" of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around");
			x=x-1;
			System.out.println(x+" "+word+ " of beer on the wall");
		}

	}
}