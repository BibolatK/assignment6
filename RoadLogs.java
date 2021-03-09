package kz.aitu.oop.assignment6;
public class RoadLogs extends Logs{
	public Transport createTransport() {
		return new Truck();
	};
	public void planDelivery () {
		System.out.println("Address isn't far, I'll choose truck delivery");
		};
}