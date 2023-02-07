package tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules{
	public static void main(String[] args) {
		CommonManInChennai sus = new CommonManInChennai();
		sus.goByBicycle();
		sus.goByDieselVehicle();
		
	}

	@Override
	public void goByDieselVehicle() {
		System.out.println("go by diesel vehicle");
		
	}

	@Override
	public void goByBicycle() {
		System.out.println("go by bicycle");

		
	}

}
