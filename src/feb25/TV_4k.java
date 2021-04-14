package feb25;

public class TV_4k extends ColorTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			TV_4k obj = new TV_4k();
			obj.channel();
			obj.volume();
			obj.wifiWith4G();
			obj.PictureTube4k();
			System.out.println("TV4k is successfully Created");
	}
	
	void wifiWith4G() {
		System.out.println("Wifi4g Is Enabled");
	}
	
	void PictureTube4k() {
		System.out.println("4k Picture tube added");
	}

}
