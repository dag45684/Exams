package fp.dam.examen2ev;

import java.util.Objects;

public class Microbus extends Alquiler implements Comparable<Microbus>{
	
	protected int seats;
	protected String plate;
	
	Microbus(String plate, int seats){
		this.basePrice = 50;
		this.plate = plate;
		this.id = plate;
		this.seats = seats;
		this.suplement = 2 * seats;
	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(plate, seats);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Microbus other = (Microbus) obj;
		return Objects.equals(plate, other.plate) && seats == other.seats;
	}

	@Override
	public String toString() {
		return "Microbus [seats=" + seats + ", plate=" + plate + ", id=" + id + ", basePrice=" + basePrice
				+ ", suplement=" + suplement + ", days=" + days + "]";
	}

	public int getSeats() {
		return seats;
	}

	public String getPlate() {
		return plate;
	}

	double getPrecioAlquiler(int days) {
		return this.suplement * days;
	}
	
	@Override
	public int compareTo(Microbus o) {
		return Integer.parseInt(o.getPlate().substring(4)) > Integer.parseInt(this.plate.substring(4)) ? 1 : -1;
	}

}
