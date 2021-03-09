package kz.aitu.oop.assignment6;
public class SeaLogs extends Logs{
	public Transport createTransport() {
		return new Ship();
		};
	public void planDelivery () {
		System.out.println("Address is fenced off by the sea, I'll choose delivery by sea");
		};
}