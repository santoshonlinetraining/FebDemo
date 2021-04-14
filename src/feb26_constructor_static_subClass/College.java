package feb26_constructor_static_subClass;

class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College.dept.library();
		
	}
		
	static class dept {
		static void library() {
			System.out.println("Books are available");
		}
	}

}
