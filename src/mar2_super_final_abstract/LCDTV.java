package mar2_super_final_abstract;

public class LCDTV extends ColorTV {

	int price = 25000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCDTV obj = new LCDTV();
		
		/*obj.channel();
		obj.volume();
		obj.LEDTube();		
		obj.SmartFeature();
		System.out.println("Creation of LED TV is done successfully");
		*/
		System.out.println();
		
		System.out.println("20k TV buying");
		obj.channel();
		obj.volume();
		obj.LEDTube();
		obj.SmartFeature();
		
	}
	
	void price() {
		System.out.println("price of the TV is " + price);
		System.out.println("price of the TV is " + super.price);
	}
	
	void LEDTube() {
		super.volume();
		volume();
		System.out.println("LED Tube creation is done");
	}
	
	void SmartFeature() {
		System.out.println("Smart features ex: youtube, wifi are added");
	}

	void volume() {
		System.out.println("Volume Up and Down Created");
		System.out.println("Woofer is added");
		System.out.println("Dolby System/sound is added");
		System.out.println("Hometheater is added");
	}
	
	public LCDTV() {
		System.out.println("Congratulation you are buying LCD TV");
	}
	
}
