import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Spotify spotify = new Spotify();

		for (int i = 1; i <= 3; i++) {
			System.out.println("Artista " + i + ":");
			System.out.print("Nombre: ");
			String nombre = scanner.nextLine();
			System.out.print("Género: ");
			String genero = scanner.nextLine();
			System.out.print("Cantidad de reproducciones: ");
			int reproducciones = scanner.nextInt();
			scanner.nextLine(); // Consumir el salto de línea pendiente
			System.out.print("País donde más se escucha: ");
			String pais = scanner.nextLine();

			Artista artista = new Artista(nombre, genero, reproducciones, pais);
			spotify.agregarArtista(artista);
		}

		scanner.close();

		spotify.mostrarInfo();
		spotify.guardarArchivo();
	}
}
