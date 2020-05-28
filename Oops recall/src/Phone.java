public class Phone {
private String colour;
private int camera;
private int battery;
public Phone(String c1, int camera, int battery) {
	this.colour = c1;
	this.camera = camera;
	this.battery = battery;
	System.out.println(" phone colour is " + c1);
	System.out.println(" no.of lens in this camera are " + camera);
	System.out.println(" battery efficiency is " + battery + " mah");
//	company.
	//System.out.println("name");
}
public String getColour() {
	return this.colour;
}
public void setColour( String c2) {
	this.colour = c2;
	System.out.println(c2);
}

}
