public class Velero extends Embarcacion implements Validacion{
    private int cantMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantMastiles=cantMastiles;
    }

    public Velero() {

    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }

    @Override
    public boolean validar(int cantidad) {
        if(cantMastiles > 4){
            return true;
        }else {
            return false;
        }

    }

}
