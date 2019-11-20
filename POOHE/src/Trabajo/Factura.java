package Trabajo;

/**
 * Fig.2. Ejemplo 3.13.: Factura.java
 * La Clase Factura permite calcular el monto de una Factura, en base a cuatro 
 * cuatros datos de una Factura: cantidad de articulos y precio por articulo.
 */

public class Factura {

    public String pieza;
    public String piezaDes;
    public int cant;
    public double precArt;
    
    //Se especifica el constructor vacio por si desea crear un objeto vacio, sin valores
    public Factura() {
    }
    
    /**
     * Crea un objeto asignando todos los valores para los cuatro atributos de 
     * la clase como:
     *
     * @param pieza Es el numero de piezas
     * @param piezaDes Es la descripcion de una pieza 
     * @param cant Es la cantidad de artículos de tipo pieza tipo que se van a comprar 
     * @param precArt Es el precio por cada articulo
     */
    
    public Factura(String pieza, String piezaDes, int cant, double precArt) {
        this.pieza = pieza;
        this.piezaDes = piezaDes;
        this.cant = cant;
        if (this.cant < 0) {
            setCant(0);
        }
        this.precArt = precArt;
        if (this.precArt < 0) {
            setPrecArt(0);
        }
        // Fin del constructor(String, String, int, double)
    }
    /**
     * @param obtenerMontoFactura es el valor de cantidad de articulos x precio 
     * de articulos
     */   
    public double obtenerMontoFactura() {
        return (this.cant * this.precArt);
    }

    //Obtiene el nombre de Pieza
    public String getPieza() {
        return pieza;
    }
    //Asigna el nombre de Pieza
    public void setPieza(String pieza) {
        this.pieza = pieza;
    }
    //Obtiene la descripcion de la Pieza
    public String getPiezaDes() {
        return piezaDes;
    }
    //Asigna la descripcion de la Pieza
    public void setPiezaDes(String piezaDes) {
        this.piezaDes = piezaDes;
    }
    //Obtiene la cantidad de Piezas
    public int getCant() {
        return cant;
    }
    //Asigna la cantidad de Piezas
    public void setCant(int cant) {
        this.cant = cant;
    }
    //Obtiene el Precio por Articulo
    public double getPrecArt() {
        return precArt;
    }
    //Asigna el Precio por Articulo
    public void setPrecArt(double precArt) {
        this.precArt = precArt;
    }
    
    //Para cuando se desea presentar los valores del objeto
    //Éste tostring() esta sobrecargado de la Clase java.lang.Object.class.toString()

    @Override
    public String toString() {
        return "La factura es:\n" + "Pieza=" + pieza + "\nDescripcion=" + piezaDes + "\nCantidad=" + cant + "\n"
                + "Precio del articulo=" + precArt + "\nTotal=" + obtenerMontoFactura();

    } //Fin del metodo toString
}

/**
 * Fig.3. Ejemplo 3.13.: PruebaFactura.java Probando las capacidades de la
 * clase Factura.
 */

class PruebaFactura {
    //el método main() inicia la ejecución del programa
    public static void main(String[] args) {
        //Creacion de facturas, 1, 2 y 3.
        Factura fac1 = new Factura("Tornillo", "Ninguna", 3, 0.10);
        Factura fac2 = new Factura("Martillo", "Mango Mandera", 1, 2.75);
        Factura fac3 = new Factura("Lija", "320", 2, 0.25);
        
        System.out.println(fac1); //Presntacion valores del objeto fact1
        System.out.println(fac2); //Presntacion valores del objeto fact2
        System.out.println(fac3); //Presntacion valores del objeto fact3

    }//Fin metodo main()
}//Fin de la Clase PruebaFactura
