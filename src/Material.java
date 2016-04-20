/**
 * Created by Raziel Ferundir on 19-Apr-16.
 */
public class Material {
    private int codigo;
    private int stock;
    private String nombre;
    private String proveedor;
    private int puntoDePedido;
    private float costo;
    private int cantidadAReponer;

    public Material(int codigo, int stock, String nombre, String proveedor, int puntoDePedido, float costo, int cantidadAReponer) {
        this.codigo = codigo;
        this.stock = stock;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.puntoDePedido = puntoDePedido;
        this.costo = costo;
        this.cantidadAReponer = cantidadAReponer;
    }

    public int getCantidadAReponer() {
        return cantidadAReponer;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getPuntoDePedido() {
        return puntoDePedido;
    }

    public void setPuntoDePedido(int puntoDePedido) {
        this.puntoDePedido = puntoDePedido;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
