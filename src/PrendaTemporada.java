import java.util.Vector;

/**
 * Created by Raziel Ferundir on 19-Apr-16.
 */
public class PrendaTemporada extends  Prenda {
    private String estacion;
    private float porcentaje;

    public PrendaTemporada(int codigo, String nombre, Vector<ItemMaterial> itemMateriales,
                           int cantidad, String estacion, float porcentaje) {
        super(codigo, nombre, itemMateriales, cantidad);
        this.estacion = estacion;
        this.porcentaje = porcentaje;
    }

    public float CalculoPrecio(String estacion, float porcentaje){
        float precio = 0;

        return precio;
    }
}
