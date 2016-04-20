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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vector<ItemMaterial> getItemMateriales() {
        return ItemMateriales;
    }

    public void setItemMateriales(Vector<ItemMaterial> itemMateriales) {
        ItemMateriales = itemMateriales;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public abstract float CalculoPrecio();
}
