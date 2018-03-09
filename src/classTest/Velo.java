package classTest;

public class Velo {
	private String name;
	private Roue myR;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roue getMyR() {
		return myR;
	}

	public void setMyR(Roue myR) {
		this.myR = myR;
	}
	
	public String recupNameRoue() {
		return this.myR.getName();
	}

}
