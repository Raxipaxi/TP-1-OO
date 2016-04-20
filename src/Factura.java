import java.util.Date;
import java.util.Vector;

/**
 * Created by Raziel Ferundir on 20-Apr-16.
 */
public class Factura {

    int numero;
    Date fecha;
    float total;
    Vector<ItemFactura> itemFacturas;

    public Factura(int numero, Date fecha, Vector<ItemFactura> itemFacturas) {

        total = 0;

        this.numero = numero;
        this.fecha = fecha;
        this.itemFacturas = itemFacturas;

        for(int i = 0; i < itemFacturas.size(); i++)
            total += itemFacturas.elementAt(i).getProducto().CalculoPrecio() *
                     itemFacturas.elementAt(i).getProducto().getCantidad();
    }
}
