
public class Champion {
	public String name;
	public String year;
	public String image;
	
	public Champion(String n, String y, String im) {
		name = n;
		year = y;
		image = im;
	}
	
	public void printInfo() {
		System.out.println("team name: " + name + " year: " + year + " emblem: " + image);
	}

}
