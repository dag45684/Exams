package fp.dam.examen2ev;

import java.util.Objects;

public abstract class Alquiler {
	
	protected String id;
	protected double basePrice;
	protected double suplement;
	protected int days;

	public String getId() {
		return id;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public double getSuplement() {
		return suplement;
	}

	public int getDays() {
		return days;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public void setSuplement(double suplement) {
		this.suplement = suplement;
	}

	public void setDays(int days) {
		this.days = days;
	}

	abstract double getPrecioAlquiler(int days);

	@Override
	public int hashCode() {
		return Objects.hash(basePrice, days, id, suplement);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Double.doubleToLongBits(basePrice) == Double.doubleToLongBits(other.basePrice) && days == other.days
				&& Objects.equals(id, other.id)
				&& Double.doubleToLongBits(suplement) == Double.doubleToLongBits(other.suplement);
	}

}
