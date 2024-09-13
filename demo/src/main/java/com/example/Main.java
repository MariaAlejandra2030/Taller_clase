package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {
        List<String> menu = new ArrayList<>();
        menu.add("Vaso de Duraznos");
        menu.add("Ensalada de frutas");
        menu.add("Cono basico");

        Restaurante miRestaurante = new Restaurante("Heladeria's Maria", "Helados", "Calle 98 97-74", 20, "12:00", "21:00", 10, menu);

        miRestaurante.mostrarMenu();
        miRestaurante.reservarMesa(6);

        List<String> pedido = new ArrayList<>();
        pedido.add("Vaso de Duraznos");
        pedido.add("Ensalada de frutas");
        miRestaurante.calcularFactura(pedido);
    }
}
