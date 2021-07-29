package es.upm.dit.prog.laboratorio3;

public class ElementoRadiactivo {

	private String nombre;
	private double l;
	
	public ElementoRadiactivo(String nombre, double l) {
		super();
		this.nombre = nombre;
		this.l = l;
	}

	public double getPorcentajeDesintegrados(double t) {
		return 100*(1-Math.exp(-this.l * t));
	}
	
	public double getVidaMedia() {
		return Math.log(2.0) / this.l;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementoRadiactivo other = (ElementoRadiactivo) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ElementoRadiactivo [nombre=" + nombre + ", l=" + l + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementoRadiactivo e1 = new ElementoRadiactivo("Uranio 235", 3.1229827968e-17);
		System.out.println(e1 + " Vida media=" + e1.getVidaMedia());
		e1 = new ElementoRadiactivo("Uranio 238", 4.919326974e-18);
		System.out.println(e1 + " Vida media=" + e1.getVidaMedia());
		e1 = new ElementoRadiactivo("Rubidio 87", 4.5040067466e-19);
		System.out.println(e1 + " Vida media=" + e1.getVidaMedia());
		e1 = new ElementoRadiactivo("Calcio 41", 2.133937177e-13);
		System.out.println(e1 + " Vida media=" + e1.getVidaMedia());
		e1 = new ElementoRadiactivo("Radio 226", 1.3720070489e-11);
		System.out.println(e1 + " Vida media=" + e1.getVidaMedia());
		e1 = new ElementoRadiactivo("Cesio 137", 7.309462229e-10);
		System.out.println(e1 + " Vida media=" + e1.getVidaMedia());		
	}

}