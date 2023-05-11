import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Spotify {
	private List<Artista> artistas;

	public Spotify() {
		artistas = new ArrayList<Artista>();
	}

	public void agregarArtista(Artista artista) {
		artistas.add(artista);
	}

	public void mostrarInfo() {
		System.out.println("------------");
		for (Artista artista : artistas) {
			System.out.println("Nombre: " + artista.getNombre());
			System.out.println("Genero: " + artista.getGenero());
			System.out.println("Reproducciones: " + artista.getReproducciones());
			System.out.println("Pais donde mas se escucha: " + artista.getPais());
			System.out.println("Recaudacion monetaria: " + artista.recaudacionMonetaria(artista.getReproducciones())+"€");
			System.out.println("Proyeccion anual: " + artista.proyeccionAnual(artista.getReproducciones())+"€");
			System.out.println("------------");
		}
	}

	public void guardarArchivo() {
		try {
			FileWriter archivo = new FileWriter("artistas.txt");
			for (Artista artista : artistas) {
				archivo.write("Nombre: " + artista.getNombre() + "\n");
				archivo.write("Genero: " + artista.getGenero() + "\n");
				archivo.write("Reproducciones: " + artista.getReproducciones() + "\n");
				archivo.write("Pais donde mas se escucha: " + artista.getPais() + "\n");
				archivo.write(
						"Recaudacion monetaria: $" + artista.recaudacionMonetaria(artista.getReproducciones()) + "\n");
				archivo.write("Proyeccion anual: $" + artista.proyeccionAnual(artista.getReproducciones()) + "\n");
				archivo.write("------------\n");
			}
			archivo.close();
			System.out.println("Se ha generado el archivo 'artistas.txt'");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error al generar el archivo");
			e.printStackTrace();
		}
	}
}