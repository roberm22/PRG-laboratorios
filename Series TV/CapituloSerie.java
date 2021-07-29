package es.upm.dit.prog.laboratorio2;

public class CapituloSerie {
	private String serie;
	private int temporada;
	private int episodio;
	/**
	 * @param serie
	 * @param temporada
	 * @param episodio
	 */
	public CapituloSerie(String serie, int temporada, int episodio) {
		super();
		this.serie = serie;
		this.temporada = temporada;
		this.episodio = episodio;
	}
	@Override
	public String toString() {
		return "CapituloSerie [serie=" + serie + ", temporada=" + temporada + ", episodio=" + episodio + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + episodio;
		result = prime * result + ((serie == null) ? 0 : serie.hashCode());
		result = prime * result + temporada;
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
		CapituloSerie other = (CapituloSerie) obj;
		if (episodio != other.episodio)
			return false;
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		if (temporada != other.temporada)
			return false;
		return true;
	}
	

}
