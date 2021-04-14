package feb26_constructor_static_subClass;

class SubClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClassEx obj = new SubClassEx();
		SubClassEx.dept obj2 = obj.new dept();
		
		obj2.library();
	}
		
	 class dept {
		 void library() {
			System.out.println("Books are available");
		}
	}

}
