package p2;

public class BatteryAA implements Battery {
	
	public int energy;
	
	public BatteryAA() {
		// TODO Auto-generated constructor stub
	}

	public BatteryAA(int energy) {				// <constructor-arg>
		this.energy = energy;
	}
	
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {			// <property>
		this.energy = energy;
	}
	
	public void useEnergy( ) {
		this.energy -= 10;
	}
	
	
	
	

}
