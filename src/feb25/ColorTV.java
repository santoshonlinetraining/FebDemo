package feb25;

public class ColorTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColorTV obj = new ColorTV();
		obj.pictureTube();
		obj.volume();
		obj.channel();
		System.out.println("Creation of Color TV is done successfully");
		
	}
	
	void volume() {
		System.out.println("Volume Up and Down Created");
	}
	
	
	void channel() {
		System.out.println("Changing channel creation is done");
	}
	
	void pictureTube() {
		System.out.println("CRT Picture Tube is created");
	}

}
