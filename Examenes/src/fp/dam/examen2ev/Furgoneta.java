package fp.dam.examen2ev;

import java.util.Objects;

public class Furgoneta extends Alquiler implements Comparable<Furgoneta>{
	
	protected int seats;
	protected int PMA;
	protected String plate;
	
	public Furgoneta(String plate, int PMA){
		this.basePrice = 50;
		this.plate = plate;
		this.id = plate;
		this.seats = 3;
		this.PMA = PMA;
		this.suplement = 20 * PMA;
	
	}

	double getPrecioAlquiler(int days) {
		return this.suplement * days;
	}

	@Override
	public String toString() {
		return "Furgoneta [seats=" + seats + ", PMA=" + PMA + ", plate=" + plate + ", id=" + id + ", basePrice="
				+ basePrice + ", suplement=" + suplement + ", days=" + days + "]";
	}

	public int getSeats() {
		return seats;
	}

	public int getPMA() {
		return PMA;
	}

	public String getPlate() {
		return plate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(PMA, plate, seats);
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
		Furgoneta other = (Furgoneta) obj;
		return PMA == other.PMA && Objects.equals(plate, other.plate) && seats == other.seats;
	}

	@Override
	public int compareTo(Furgoneta o) {
		return Integer.parseInt(o.getPlate().substring(4)) > Integer.parseInt(this.plate.substring(4)) ? 1 : -1;
	}
}
