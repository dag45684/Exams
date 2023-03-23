package fp.dam.examen2ev;

public class Coche extends Alquiler implements Comparable<Coche> {
	
	protected int seats;
	protected String plate;
	
	Coche(String plate, int seats){
		this.basePrice = 50;
		this.plate = plate;
		this.id = plate;
		this.seats = seats;
		this.suplement = 1.5 * seats;
	
	}

	public int getSeats() {
		return seats;
	}

	public String getPlate() {
		return plate;
	}

	@Override
	public String toString() {
		return "Coche [seats=" + seats + ", plate=" + plate + ", id=" + id
				+ ", basePrice=" + basePrice + ", suplement=" + suplement + "]";
	}

	double getPrecioAlquiler(int days) {
		return this.suplement;
	}
	
	@Override
	public int compareTo(Coche o) {
		return Integer.parseInt(o.getPlate().substring(4)) > Integer.parseInt(this.plate.substring(4)) ? 1 : -1;
	}

}
