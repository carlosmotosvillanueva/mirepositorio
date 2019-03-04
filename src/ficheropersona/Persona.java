
package ficheropersona;/**
 *
 * @author carlos
 * @version 20/02/2019
 */
public class Persona {
      private String nombre;
    private int edad;
   
    /**
     * Constructor persona sin parametros
     */
    public Persona() {
        nombre="";
        edad=0;
       
    }
/**
 * Constructor persona con parametros
 * @param nombre nombre de la persona
 * @param edad edad  de la persona
 */
    public Persona(String nombre, int edad) {
   
        this.nombre = nombre;
        this.edad = edad;
     
    }
    
    /**
     * Constructor persona
     * @param p objeto persona que se le pasa
     */
    public Persona(Persona p){
     
        this.nombre = p.nombre;
        this.edad = p.edad;
      
    }
    
   /**
    * metodo  para devolver nombre
    * @return se devuelve nombre de la persona
    */
public String getNombre() {
        return nombre;
    }
    /**
     * metodo set para establecer nombre de la persona
     * @param nombre nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
 /**
  * metodo para devolver edad de la persona
  * @return edad de la persona
  */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Metodo para establecer la edad de la persona
     * @param edad edad de la persona
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public boolean mayor(){
    if(this.edad>=18){return true;}
    
    else return false;
    
    }
    $valor;
    /**
     *Cambios por aqui y por alla
     */

   
   
    
  
    
}
