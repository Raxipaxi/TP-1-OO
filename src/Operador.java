import java.util.Vector;

/**
 * Created by Raziel Ferundir on 19-Apr-16.
 */

public class Operador {
    public Vector<Prenda> Prendas;
    public Vector<Material>Materiales;
    public Vector<Factura>Facturas;

    public Operador() {

        Prendas = new Vector<Prenda>();
        Materiales = new Vector<Material>();
        cargaInicial();


    }

    private void cargaInicial()
    {
        ///TODO terminar la carga inicial

    }

    public void AltaPrendaTemporada(int codigo, String nombre, Vector<ItemMaterial> itemMateriales,
                                    int cantidad, String estacion, float porcentaje){
        PrendaTemporada p = new PrendaTemporada(codigo,nombre,itemMateriales,cantidad,estacion,porcentaje);

        if(BuscarPrenda(codigo)>=0)
            Prendas.add(p);//con esto ganaste papa


    }

    public void BajaPrenda(int codigo){
      try{
          Prendas.removeElementAt(BuscarPrenda(codigo));
      }
      catch (Exception e)
      {
          System.out.println("No existe la prenda a borrar");
      }

    }

    private int BuscarPrenda(int codigo){

        for ( int i=0; i<Prendas.size();i++)
        {
            if (Prendas.elementAt(i).codigo == codigo)
            {
                return i;
            }
        }

        return -1;
    }
    private void ModificarPrendaTemporada(int codigo, String nombre, Vector<ItemMaterial> itemMateriales,
                                          int cantidad, String estacion, float porcentaje){
        PrendaTemporada p = new PrendaTemporada(codigo,nombre,itemMateriales,cantidad,estacion,porcentaje);

        try{
            Prendas.set(BuscarPrenda(codigo),p);
        }
        catch (Exception e)
        {
            System.out.println("No existe la prenda a modificar");
        }

    }



}
