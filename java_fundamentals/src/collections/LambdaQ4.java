package collections;
interface WordCount{
	int count(String str);
}
public class LambdaQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount wc=(str)->{
			String[] words=str.trim().split("\\s+");
			return words.length;
		};
		String s="Mahesh babu is a good  actor";
		int res=wc.count(s);

		System.out.println(res);
	}
}


