
public class Reservation {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
				t.setName("shavani");
				System.out.println("Reservatio counter started Working...."+t.getName());
				ReservationCounter central= new ReservationCounter();
				Thread deepa=new Thread (new BookingJob(central,1000),"deepa");
				Thread dharani=new Thread(new BookingJob(central,500),"dharani");
				deepa.start();
				dharani.start();
				

	}

}

class BookingJob implements Runnable{
	ReservationCounter central;int amt;
	public BookingJob(ReservationCounter central,int amt) {
		this.central=central;
		this.amt=amt;
		
	}
	public void run() {
		central.bookTicket(amt);
		central.giveChange();
	}
}
	class ReservationCounter {
		int amt;
		public void bookTicket(int amt) {
			Thread t= Thread.currentThread();
			this.amt=amt;
			String name=t.getName();
			System.out.println(name+"has to come to book the ticket.....");
			System.out.println(name+"brought...."+(amt-100));
		}
		public void giveChange() {
			Thread t= Thread.currentThread();
			String name=t.getName();
			System.out.println("change given to...."+name);
			System.out.println(name+"takes...."+(amt-100));
		Runnable r=()->
		{
			System.out.println("reservation done successfully....");
		};
		new Thread(r).start();
		
		}
	}
