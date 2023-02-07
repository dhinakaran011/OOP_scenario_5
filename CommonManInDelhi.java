package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules {

	public static void main(String[] args) {
		CommonManInDelhi ds = new CommonManInDelhi();
		ds.dontGoByDieselVehicle();
		ds.goByBicycle();
		ds.goByDieselVehicle();

	}

	@Override
	public void dontGoByDieselVehicle() {
		System.out.println("dont go by diesel vehicle");		
	}

	@Override
	public void goByBicycle() {
		System.out.println("go by bicycle");		

		
	}

	@Override
	public void goByDieselVehicle() {
		System.out.println("go by diesel vehicle");		

		
	}

}
