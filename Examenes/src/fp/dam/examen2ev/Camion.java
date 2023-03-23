package fp.dam.examen2ev;

import java.util.Objects;

public class Camion extends Alquiler implements Comparable<Camion>{
	
	protected int seats;
	protected String plate;
	protected int PMA;
	
	public Camion(String plate, int PMA){
		this.basePrice = 50;
		this.plate = plate;
		this.id = plate;
		this.seats = 2;
		this.PMA = PMA;
		this.suplement = 20 * PMA + 40;
	
	}

	@Override
	public String toString() {
		return "Camion [seats=" + seats + ", plate=" + plate + ", PMA=" + PMA + ", id=" + id + ", basePrice="
				+ basePrice + ", suplement=" + suplement + ", days=" + days + "]";
	}

	public int getSeats() {
		return seats;
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
		Camion other = (Camion) obj;
		return PMA == other.PMA && Objects.equals(plate, other.plate) && seats == other.seats;
	}

	public String getPlate() {
		return plate;
	}

	public int getPMA() {
		return PMA;
	}

	public void setPMA(int pMA) {
		PMA = pMA;
	}

	double getPrecioAlquiler(int days) {
		return this.suplement * days;
	}

	@Override
	public int compareTo(Camion o) {
		return Integer.parseInt(o.getPlate().substring(4)) > Integer.parseInt(this.plate.substring(4)) ? 1 : -1;
	}

}
