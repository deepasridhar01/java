import java.io.IOException;
public class Lambda1 {
	public static void main(String[] args) {
		Thread t=new Thread(()->
		{
			try {
			}
			finally {
				
			}
		    }
		    );
	

t.setName("this main thread...");
t.start();
t.setPriority(10);




      for(int i=0;i<5;i++) {
	     System.out.println("class started");
	     System.out.println(i);
	try {
		Thread.sleep(1000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	};
}
	}    

void Vaccinationcenter()throws Exception{
	System.out.println("method is called.....");
	Thread.sleep(5000);
}
}


