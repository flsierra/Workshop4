public class Yate extends  Embarcacion implements Validacion{
    private int cant_Camarote;
    public Yate() {

    }
    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cant_Camarote) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cant_Camarote = cant_Camarote;

    }

    public int getCant_Camarote() {
        return cant_Camarote;
    }

    public void setCant_Camarote(int cant_Camarote) {
        this.cant_Camarote = cant_Camarote;
    }

    @Override
    public boolean validar(int cantidad) {
        if(cant_Camarote >7){
            return true;
        } else{
        return false;
        }
    }
}
