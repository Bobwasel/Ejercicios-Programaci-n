public class PruebaSleep {
    static{
      System.out.println("Una cadena");
    }
    {
      System.out.println("prueba");
    }
    public static void main(String[] args) throws InterruptedException {
      System.out.println("Numeros: 1 2 3");
    }
  }
  
  /*  En el programa anterior, ¿Cuál es la salida? 
   *  La salida sería "Una cadena" "Numeros: 1 2 3"
   *
   * ¿Cómo conseguimos que se imprima prueba?
   *  Poniendo static en el inicializador donde está prueba o también podríamos instanciar
   *  un obejto de esta clase.
   * 
   *  ¿Cuantas veces se imprimirá en un programa "Una Cadena"?
   *   Una vez, cuando sea lanzado el programa.
   *  ¿Y "prueba"?
   *   Las veces que sea instanciado.
   */