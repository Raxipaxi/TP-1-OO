import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

/**
 * Created by Raziel Ferundir on 19-Apr-16.
 */

public class Operador {

    public Vector<Prenda> Prendas;
    public Vector<Material> Materiales;
    public Vector<Factura> Facturas;

    public Operador() {
        Prendas = new Vector<Prenda>();
        Materiales = new Vector<Material>();
        cargaInicial();
    }

    private void cargaInicial() {
        Material m = new Material(001, 10, "Algodon", "Algodonera Santa Fe", 3, 50, 50);
        Material n = new Material(002, 213, "Lycra", "Todo Telas", 50, 40, 50);

        Materiales.add(m);
        Materiales.add(n);
    }

    public void AltaPrendaTemporada(int codigo, String nombre, Vector<ItemMaterial> itemMateriales,
                                    int cantidad, String estacion, float porcentaje) {

        PrendaTemporada p = new PrendaTemporada(codigo, nombre, itemMateriales, cantidad, estacion, porcentaje);

        if (BuscarPrenda(codigo) >= 0)
            Prendas.add(p);
    }

    public void BajaPrenda(int codigo) {
        try {
            Prendas.removeElementAt(BuscarPrenda(codigo));
        } catch (Exception e) {
            System.out.println("No existe la prenda a borrar");
        }

    }

    private int BuscarPrenda(int codigo) {

        for (int i = 0; i < Prendas.size(); i++) {
            if (Prendas.elementAt(i).codigo == codigo) {
                return i;
            }
        }

        return -1;
    }

    private void ModificarPrendaTemporada(int codigo, String nombre, Vector<ItemMaterial> itemMateriales,
                                          int cantidad, String estacion, float porcentaje) {

        PrendaTemporada p = new PrendaTemporada(codigo, nombre, itemMateriales, cantidad, estacion, porcentaje);

        try {
            Prendas.set(BuscarPrenda(codigo), p);
        } catch (Exception e) {
            System.out.println("No existe la prenda a modificar");
        }

    }

    public float RealizarVenta(int codigo, int cantidad) {
        try {
            int i = BuscarPrenda(codigo);
            float precio = 0;
            if (i >= 0) {
                if (Prendas.elementAt(i).cantidad > 0) {

                    Prenda temp = Prendas.elementAt(i);
                    // precio=Cal
                    return precio;
                }

            }

        } catch (Exception e) {
            System.out.println("No hay prenda en stock");
        }
        return 0;
    }

    public void ControlStock() {
        for (int i = 0; i < Materiales.size(); i++) {
            Material m = Materiales.elementAt(i);

            if (m.getStock() <= m.getPuntoDePedido())
                GenerarOC(m);
        }
    }

    private void GenerarOC(Material m)
    {
        OrdenDeCompra oc = new OrdenDeCompra(m);
    }
}



