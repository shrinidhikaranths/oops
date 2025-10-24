 class Callme {

	 static void callme1(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
			
		}
		catch(InterruptedException e){
			System.out.println("Interrupted");
		}
		System.out.print("]");
		System.out.println();
	}
}
	class Callers extends Thread{
		String msg;
		public Callers(String s) {
			msg=s;
		}
		public void run() {
			Callme.callme1(msg);
		}
	}
public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callers c=new Callers("Learn");
		Callers c1=new Callers("Java");
		Callers c2=new Callers("Programming");
		c.start();
		c1.start();
		c2.start();
	}

}
