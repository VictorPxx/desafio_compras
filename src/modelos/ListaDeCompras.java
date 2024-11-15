package modelos;

import java.util.HashMap;
import java.util.Map;

public class ListaDeCompras {
    private static Map<String, Double> listaDeCompras = new HashMap<>();

    public static Map<String, Double> getListaDeCompras () {
        return listaDeCompras;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
