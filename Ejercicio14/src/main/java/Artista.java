class Artista implements CalculadoraInterfaz {
	private String nombre;
	private String genero;
	private double reproducciones;
	private String pais;

	public Artista(String nombre, String genero, double reproducciones, String pais) {
		this.nombre = nombre;
		this.genero = genero;
		this.reproducciones = reproducciones;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public double getReproducciones() {
		return reproducciones;
	}

	public String getPais() {
		return pais;
	}

	public double recaudacionMonetaria(double reproducciones) {
		return reproducciones * 0.02;
	}

	public double proyeccionAnual(double reproducciones) {
		return recaudacionMonetaria(reproducciones) * 12;
	}
}