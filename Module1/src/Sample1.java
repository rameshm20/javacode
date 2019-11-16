class Sample1{
	int cube(int x) {
		return x*x*x;
	}
	
	public static void main(String[] args) {
		int x = Sample1.cube(5);
		System.out.println(x);
	}
}