import org.junit.Test;

public class TestClass {

	
	@Test
	public void add(){
		Number  number = new Number();
		int result = 12;
		int n = 13;
		int num = number.add(n,result);
		System.out.println("����֮�ͣ�"+num);
	}
@Test
   public void sub(){
	    Number  number = new Number();
	    int result = 12;
	    int n = 13;
	    int sub = number.sub(n, result);
	    System.out.println("����֮�"+sub);
   }
}
