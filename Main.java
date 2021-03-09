package kz.aitu.oop.assignment6;
public class Main {
	public static void main(String[] args) {
		Logs one = createLogistics("Truck");
		Transport beep = one.createTransport();
		one.planDelivery();
		beep.delivering();
	}
	public static Logs createLogistics(String transport){
		switch (transport) {
		case "Ship" : return new SeaLogs();
		case "Truck" : return new RoadLogs();
		default: return null;
		}
	};
}