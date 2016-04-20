import java.util.Vector;

/**
 * Created by Raziel Ferundir on 19-Apr-16.
 */
public abstract class Prenda {
    protected int codigo;
    protected String nombre;
    protected Vector<ItemMaterial> ItemMateriales;
    protected int cantidad;

    public Prenda(int codigo, String nombre, Vector<ItemMaterial> itemMateriales, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        ItemMateriales = itemMateriales;
        this.cantidad = cantidad;
    }
}
