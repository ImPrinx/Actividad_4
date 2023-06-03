package inmuebleconherencia;
import java.util.Scanner;
import inmuebleconherencia.Local.Tipo;
public class Prueba {
    /**
     * Método main que crea dos inmuebles, calcula su precio de
     * acuerdo al área y se muestran sus datos en pantalla
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de inmueble: ");
        String inmueble = sc.nextLine();
        
        
        if (inmueble.equalsIgnoreCase("Apartaestudio") || inmueble.equalsIgnoreCase("apartaestudio")){
        System.out.println("---APARTAESTUDIO---");
        System.out.println("Ingrese el identificador inmobiliario: ");
        int ident = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el area: ");
        int area = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la direccion: ");
        String dir = sc.nextLine();        
        System.out.println("\n");
        System.out.println("---REPORTE DE DATOS APARTAESTUDIO---");
        Apartaestudio aptestudio1 = new Apartaestudio(ident, area, dir, 1, 1);
        aptestudio1.calcularPrecioVenta(Apartaestudio.valorArea);
        aptestudio1.imprimir();
        }
        
        else if (inmueble.equalsIgnoreCase("Apartamento familiar") || inmueble.equalsIgnoreCase("apartamento familiar")){
        System.out.println("---APARTAMENTO FAMILIAR---");
        System.out.println("Ingrese el identificador inmobiliario: ");
        int ident = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el area: ");
        int area = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la direccion: ");
        String dir = sc.nextLine();
        System.out.println("Ingrese el numero de habitaciones: ");
        int habs = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el numero de baños: ");
        int bañ = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el valor de la administracion: ");
        int admin = sc.nextInt();
        sc.nextLine();
        System.out.println("\n");
        System.out.println("---REPORTE DE DATOS APARTAMENTO FAMILIAR---");
        ApartamentoFamiliar aptfliar = new ApartamentoFamiliar(ident, area, dir, habs, bañ, admin);
        aptfliar.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
        aptfliar.imprimir();
        }
        
        
        else if (inmueble.equalsIgnoreCase("Casa conjunto cerrado") || inmueble.equalsIgnoreCase("casa conjunto cerrado")){
        System.out.println("---CASA CONJUNTO CERRADO---");
        System.out.println("Ingrese el identificador inmobiliario: ");
        int ident = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el area: ");
        int area = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la direccion: ");
        String dir = sc.nextLine();
        System.out.println("Ingrese el numero de habitaciones: ");
        int habs = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el numero de baños: ");
        int bañ = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el numero de pisos: ");
        int pisos = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el valor de la administracion: ");
        int admin = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Tiene piscina?: ");
        boolean pisc = false;
        String pisc2 = sc.nextLine();
        pisc2 = pisc2.toLowerCase();
        if (pisc2.equalsIgnoreCase("si")){
            pisc = true;
        }
        System.out.println("¿Tiene campos deportivos?: ");
        boolean camp = false;
        String camp2 = sc.nextLine();
        camp2 = camp2.toLowerCase();
        if (camp2.equalsIgnoreCase("si")){
            camp = true;
        }         
        System.out.println("\n");
        System.out.println("---REPORTE DE DATOS APARTAMENTO FAMILIAR---");
        CasaConjuntoCerrado casa = new CasaConjuntoCerrado(ident, area, dir, habs, bañ, pisos, admin, pisc, camp);
        casa.calcularPrecioVenta(CasaConjuntoCerrado.valorArea);
        casa.imprimir();
        }
        
        
        else if (inmueble.equalsIgnoreCase("Casa independiente") || inmueble.equalsIgnoreCase("casa independiente")){
        System.out.println("---CASA INDEPENDIENTE---");
        System.out.println("Ingrese el identificador inmobiliario: ");
        int ident = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el area: ");
        int area = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la direccion: ");
        String dir = sc.nextLine();
        System.out.println("Ingrese el numero de habitaciones: ");
        int habs = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el numero de baños: ");
        int bañ = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el numero de pisos: ");
        int pisos = sc.nextInt();
        sc.nextLine();
        System.out.println("\n");
        System.out.println("---REPORTE DE DATOS APARTAMENTO FAMILIAR---");
        CasaIndependiente casa = new CasaIndependiente(ident, area, dir, habs, bañ, pisos);
        casa.calcularPrecioVenta(CasaIndependiente.valorArea);
        casa.imprimir();
        }
        
        else if (inmueble.equalsIgnoreCase("Casa rural") || inmueble.equalsIgnoreCase("casa rural")){
        System.out.println("---CASA RURAL---");
        System.out.println("Ingrese el identificador inmobiliario: ");
        int ident = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el area: ");
        int area = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la direccion: ");
        String dir = sc.nextLine();
        System.out.println("Ingrese el numero de habitaciones: ");
        int habs = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el numero de baños: ");
        int bañ = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el numero de pisos: ");
        int pisos = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la distancia a la que se encuentra la casa de la cabecera municipal: ");
        int cab = sc.nextInt();
        System.out.println("Ingrese la altitud sobre el nivel del mar en que se encuentra la casa rural: ");
        int alt = sc.nextInt();
        sc.nextLine();       
        System.out.println("\n");
        System.out.println("---REPORTE DE DATOS CASA RURAL---");
        CasaRural casa = new CasaRural(ident, area, dir, habs, bañ, pisos, cab, alt);
        casa.calcularPrecioVenta(CasaRural.valorArea);
        casa.imprimir();
        }
        
        else if (inmueble.equalsIgnoreCase("Local comercial") || inmueble.equalsIgnoreCase("local comercial")){
        System.out.println("---LOCAL COMERCIAL---");
        System.out.println("Ingrese el identificador inmobiliario: ");
        int ident = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el area: ");
        int area = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la direccion: ");
        String dir = sc.nextLine();       
        System.out.println("Ingrese el tipo de local (interno, calle): ");
        Tipo lcl = Tipo.valueOf(sc.next().toUpperCase());
        sc.nextLine();
        System.out.println("Ingrese el centro comercial: ");
        String cc = sc.nextLine();        
        System.out.println("\n");
        System.out.println("---REPORTE DE DATOS LOCAL COMERCIAL---");
        LocalComercial local = new LocalComercial(ident, area, dir, lcl, cc);
        local.calcularPrecioVenta(LocalComercial.valorArea);
        local.imprimir();
        }
        
        else if (inmueble.equalsIgnoreCase("Oficina") || inmueble.equalsIgnoreCase("oficina")){
        System.out.println("---OFICINA---");
        System.out.println("Ingrese el identificador inmobiliario: ");
        int ident = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el area: ");
        int area = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la direccion: ");
        String dir = sc.nextLine();       
        System.out.println("Ingrese el tipo de local (interno, calle): ");
        Tipo lcl = Tipo.valueOf(sc.next().toUpperCase());
        sc.nextLine();
        System.out.println( "¿Es una oficina del gobierno?: ");
        boolean ofi = false;   
        String ofi2 = sc.nextLine(); 
        ofi2 = ofi2.toLowerCase();
        if (ofi2.equalsIgnoreCase("si")){
            ofi = true;
        }          
        System.out.println("\n");
        System.out.println("---REPORTE DE DATOS OFICINA---");
        Oficina oficina = new Oficina(ident, area, dir, lcl, ofi);
        oficina.calcularPrecioVenta(Oficina.valorArea);
        oficina.imprimir();
        }
        
        else{
            System.out.println("Ingrese un inmueble válido.");
        }       
    }
}