package packageHewan;

public abstract class Hewan {
	private String name;
	private int umur;
	
	public abstract void doSomething();
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
