import java.util.Vector;
/**
 * Created by raxipaxi on 4/27/16.
 */
public class PrendaSinTemporada extends Prenda {
       float precio;

    public PrendaSinTemporada(int codigo, String nombre, Vector<ItemMaterial> itemMateriales, int cantidad) {
        super(codigo, nombre, itemMateriales, cantidad);
    }

    public float CalculoPrecio() {
    return precio;
}
}
