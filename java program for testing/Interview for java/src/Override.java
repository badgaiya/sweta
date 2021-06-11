
public class Override {
	void disp(){
		System.out.print("a");
	}

}
class Arun extends Override{
	void disp(){
		System.out.print("b");
	}
	public static void main(String args[]){
		Arun obj = new Arun();
		obj.disp();
		
	}
}

