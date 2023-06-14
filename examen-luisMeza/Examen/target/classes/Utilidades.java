import java.util.logging.Logger;

public class Utilidades {
private static final Logger LOG = Logger.getLogger(Utilidades.class.getName());
    
    /**
     * 
     * @return 
     */
    public static char menu() {
        char op;
        do {
            mostrarMensaje(
                    "MENÚ PRINCIPAL\n\n"
                    + "[1] Manejo de Empleados\n"
                    + "[2] Manejo de Socio\n"
                    + "[3] Mostrar Socios\n"
                    + "[4] Mostrar Empleados\n"
                    + "[5] Salir\n"
            );
            op = Utilidades.obtenerOpcion();
        } while (op < '1' || op > '5');

        return op;
    }

    public static void mostrarMensaje()
    {
        
    }
    
    /**
     * 
     * @return 
     */
    public static int leerNumero()
    {
        
        return 0;
    }
    
    /**
     * 
     * @return 
     */
    public static String leerTexto()
    {
        
        return "";
    }
    
    /**
     * 
     * @param tipo
     * @return 
     */
    public static boolean validar(char tipo)
    {
        switch(tipo)
        {
            case 's':
                
            case 'n':
                
            case 'd':
                
            case 'c':    
        }
        
        return true;
    }
}
