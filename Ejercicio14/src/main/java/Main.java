public class Main {
	public static void main(String[] args) {
		Spotify spotify = new Spotify();
		
		Artista artista1 = new Artista("The Beatles", "Rock", 1000000, "Reino Unido");
        Artista artista2 = new Artista("BTS", "K-Pop", 2000000, "Corea del Sur");
        Artista artista3 = new Artista("Bad Bunny", "Reggaeton", 1500000, "Puerto Rico");
        Artista artista4 = new Artista("Ariana Grande", "Pop", 3000000, "Estados Unidos");
        Artista artista5 = new Artista("Queen", "Rock", 2500000, "Reino Unido");
        Artista artista6 = new Artista("Rosalía", "Flamenco urbano", 1800000, "España");
        Artista artista7 = new Artista("Enrique Iglesias", "Pop latino", 2200000, "España");
        Artista artista8 = new Artista("Pablo Alborán", "Pop", 1700000, "España");
        Artista artista9 = new Artista("Vanessa Martin", "Pop", 1400000, "España");
        Artista artista10 = new Artista("Antonio Orozco", "Pop", 1300000, "España");

        spotify.agregarArtista(artista1);
        spotify.agregarArtista(artista2);
        spotify.agregarArtista(artista3);
        spotify.agregarArtista(artista4);
        spotify.agregarArtista(artista5);
        spotify.agregarArtista(artista6);
        spotify.agregarArtista(artista7);
        spotify.agregarArtista(artista8);
        spotify.agregarArtista(artista9);
        spotify.agregarArtista(artista10);

		spotify.mostrarInfo();
		spotify.guardarArchivo();
	}
}
