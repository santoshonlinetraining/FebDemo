package feb25;

public class LEDTV extends LCDTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LEDTV obj = new LEDTV();
		
		obj.volume();
		obj.channel();
		obj.SmartFeature();
		obj.LEDTube();
		obj.Android();
		
		System.out.println("Creation of LED TV is done successfully");
		
	}
	
	void LEDTube() {
		System.out.println("Creation of LED Tube is done");
	}
	
	void Android() {
		System.out.println("Android featured added to LED TV");
	}

}
