import java.util.Date;
public class Vaccine {
	public static void main(String[] args) {
		VaccinationCenter vc = new VaccinationCenter();
		Thread t = Thread.currentThread();
		t.setName("deepa");
		System.out.println(new Date());
		System.out.println("Before coming to class....");
		Thread Shavani = new Thread(new JobToShavani(vc),"shavani");
		Shavani.start();
		System.out.println("take class....for 7-9 golden batch...."+new Date());
		new Thread(()->System.out.println("vaccination")).getState();
		
		
	}

}
class JobToShavani implements Runnable{
	VaccinationCenter vc;
	public JobToShavani(VaccinationCenter vc) {
		this.vc=vc;
		
	}
	public void run() {
		System.out.println("the job given to shavani is executed from this method....");
		try {
			vc.getToken();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		};
	}
class VaccinationCenter{
	public void getToken() throws Exception{
		Thread t = Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"standing in queue for token...");
		Thread.sleep(10000);
		System.out.println("token received...."+new Date());
	}
}
