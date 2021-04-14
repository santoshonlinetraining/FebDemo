package feb25;

public class LCDTV extends ColorTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCDTV obj = new LCDTV();
		
		obj.channel();
		obj.LEDTube();
		obj.volume();
		obj.SmartFeature();
		System.out.println("Creation of LED TV is done successfully");
	}
	
	void LEDTube() {
		System.out.println("LED Tube creation is done");
	}
	
	void SmartFeature() {
		System.out.println("Smart features ex: youtube, wifi are added");
	}

}
