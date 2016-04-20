import java.util.Calendar;
import java.util.Date;

/**
 * Created by kalanord on 4/20/16.
 */
public class OrdenDeCompra {

    private Material material;
    private Date date;

    public OrdenDeCompra(Material material) {
        this.material = material;
        date = Calendar.getInstance().getTime();
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
