import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Capitan cp = new Capitan();
        Velero vl = new Velero();
        Yate yt = new Yate();
        int opcion = 0;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("1. Crear un capitan");
            System.out.println("2. Crear embarcaciones Veleros/ Yates");
            System.out.println("3. Ver los detalles de todos los registros");
            System.out.println("4. Salir");
            System.out.println("-------------------------------------------------");
            opcion = leer.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Ingresar un capitan  nuevo");
                    System.out.println("Ingrese el nombre");
                    String nombreCap = leer.next();
                    cp.setNombre(nombreCap);
                    System.out.println("Ingrese el apellido");
                    String apellidoCap = leer.next();
                    cp.setApellido(apellidoCap);
                    System.out.println("Ingrese la matricula");
                    String matriculaCap = leer.next();
                    cp.setMatriculaNavegacion(matriculaCap);
                    System.out.println("Capitan agregado con exito");
                    System.out.println("Datos generales del capitan");
                    System.out.println("Nombre "+cp.getNombre()+" Apellido "+ cp.getApellido()+ " Matricula "+cp.getMatriculaNavegacion());
                    break;
                case 2:
                    System.out.println("Crea embarcaciones");
                    System.out.println("Indique el tipo de embarcación a crear (1.Velero / 2. Yate)");
                    int opc = leer.nextInt();
                    if (opc ==1){
                        System.out.println("Ingrese los parametros para Velero");
                        System.out.println("Ingrese el precio base");
                        vl.setPrecioBase(leer.nextDouble());
                        System.out.println("Ingrese el valor adicional");
                        vl.setValorAdicional(leer.nextDouble());
                        System.out.println("Año de fabricación");
                        vl.setAnioFabricacion(leer.nextInt());
                        System.out.println("Ingrese la longitud del velero");
                        vl.setEslora(leer.nextDouble());
                        System.out.println("Ingrese la cantidad de mastiles");
                        vl.setCantMastiles(leer.nextInt());
                        System.out.println("Embarcación Creada con exito");
                        System.out.println("Datos del Yate ||"+ " Capitan asignado "+cp.getNombre()+ " ||Precio Base "+ vl.getPrecioBase()+" ||Año de fabricación "+ vl.getAnioFabricacion()+ " ||Longitud en Metros "+vl.getEslora()+"m"+ " ||Cantidad de Mastiles " +vl.getCantMastiles());
                        if (vl.validar(vl.getCantMastiles())){
                            System.out.println("El velero es categoria grande");
                        }else {
                            System.out.println("El velero es categoria estandar");
                        }
                    }
                    if (opc ==2){
                        System.out.println("Ingrese los parametros para Yate");
                        System.out.println("Ingrese el precio base");
                        yt.setPrecioBase(leer.nextDouble());
                        System.out.println("Ingrese el valor adicional");
                        yt.setValorAdicional(leer.nextDouble());
                        System.out.println("Año de fabricación");
                        yt.setAnioFabricacion(leer.nextInt());
                        System.out.println("Ingrese la longitud del velero");
                        yt.setEslora(leer.nextDouble());
                        System.out.println("Ingrese la cantidad de camarotes");
                        yt.setCant_Camarote(leer.nextInt());
                        System.out.println("Embarcación Creada con exito");
                        System.out.println("Datos del Yate ||"+ " Capitan asignado "+cp.getNombre()+ " ||Precio Base "+ yt.getPrecioBase()+" ||Año de fabricación "+ yt.getAnioFabricacion()+ " ||Longitud en Metros "+yt.getEslora()+"m"+ " ||Cantidad de Camarotes " +yt.getCant_Camarote());
                        if (yt.validar(yt.getCant_Camarote())){
                            System.out.println("El yate es categoria lujoso");
                        }else{
                            System.out.println("El yate es categoria estandar");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Registros detallados de cada uno de los registros");
                    System.out.println("-----------------------------------------");
                    System.out.println("Registro de Capitan|| "+ "Nombre "+cp.getNombre()+ " || Apellido "+cp.getApellido()+ " || Matricula "+ cp.getMatriculaNavegacion());
                    System.out.println("Registro de embarcación categoria Velero");
                    System.out.println("Capitan asignado ||"+ "Nombre Capitan "+ cp.getNombre()+ "|| Precio Alquiler"+" $"+ vl.montoAlquiler()+ " || Año de Fabricación "+ vl.getAnioFabricacion()+ " || Longitud "+vl.getEslora()+"m "+ " ||Cantidad de Mastiles "+vl.getCantMastiles()+" ||Categoria "+vl.validar(vl.getCantMastiles()));
                    System.out.println("Capitan asignado ||"+ "Nombre Capitan "+ cp.getNombre()+ "|| Precio Alquiler "+" $"+yt.montoAlquiler()+ " || Año de Fabricación "+ yt.getAnioFabricacion()+ " || Longitud "+yt.getEslora()+"m "+ " ||Cantidad de Camarotes "+yt.getCant_Camarote()+" ||Categoria "+yt.validar(yt.getCant_Camarote()));
                    System.out.println("-----------------------------------------");
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro servicio...");
                    break;
            }
        }while (opcion != 4);

    }
}