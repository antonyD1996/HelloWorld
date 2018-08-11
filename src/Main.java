import sv.edu.unab.clase.Automovil;

public class Main {

    public static void main(String[] args) {

        Automovil automovil=new Automovil("P189634", "1612589","corola","toyota" );
        Automovil automovil1=new Automovil("P182544");
        Automovil automovil2=new Automovil();

        System.out.println("Automovil"+ automovil +"Automovil 1 "+ automovil1 +"Automovil 2 "+ automovil2 );
        System.out.println("Automovil"+ automovil.hashCode());
        System.out.println("Provando cambios");
        System.out.println("Provando cambios");

    }
}
