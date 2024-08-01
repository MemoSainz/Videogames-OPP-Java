package videojuegos;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Videojuegos> lista = new ArrayList<>();

        lista.add(new Videojuegos(1, "Zelda",
                "Nintendo 64", 1, "kids"));
        lista.add(new Videojuegos(2, "Mario",
                "Nintendo 3DS", 8, "kids"));
        lista.add(new Videojuegos(3, "Skyrim",
                "PC", 1, "adult"));
        lista.add(new Videojuegos(4, "Lego Star Wars",
                "Xbox", 4, "kids"));
        lista.add(new Videojuegos(5, "Gate Zero",
                "PC", 1, "cringetian"));


        for (Videojuegos juego : lista) {
            System.out.println("------------------------------");
            System.out.println("Title: " + juego.getTitulo());
            System.out.println("Console: " + juego.getConsola());
            System.out.println("Number of players: " + juego.getCantidadJugadores());

            System.out.println("Category: " + juego.getCategoria());
        }

        System.out.println("----------------------------------------------------");
        System.out.println(".....Changing the name and number of players in the 3rd and 4th");
        System.out.println("----------------After the change--------------------");
        lista.remove(2);
        lista.add(2, new Videojuegos(3, "Mario Kart",
                "Nintendo Wii U", 8, "kids"));

        lista.remove(3);
        lista.add(3, new Videojuegos(4, "Lego Batman",
                "Xbox 360", 4, "kids"));

        for (Videojuegos juego : lista) {
            System.out.println("------------------------------");
            System.out.println("Title: " + juego.getTitulo());
            System.out.println("Console: " + juego.getConsola());
            System.out.println("Number of players: " + juego.getCantidadJugadores());
            System.out.println("Category: " + juego.getCategoria());

        }

        System.out.println("----------Just making appear the N64 console-------------------------------------");
        System.out.println("------------------------------");

        String nintendo64 = "Nintendo 64";
        for (Videojuegos juego : lista) {
            if (juego.getConsola().equals(nintendo64)) {
                System.out.println(juego.toString());
            }
        }


    }
}
