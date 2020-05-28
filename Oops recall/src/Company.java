public class Company extends Phone {
	private String name;
	public Company(String colour,int camera, int battery, String name) {
		super(colour, camera, battery);
		this.name = name;
		//System.out.println(n1);
	}
	public void name() {
		System.out.println(" company name is " + name);
	}

}
