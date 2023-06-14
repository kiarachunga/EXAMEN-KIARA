import java.util.logging.Logger;

public class Programa {
	private static final Logger LOG = Logger.getLogger(Programa.class.getName());
    
    /**
     * 
     */
    public Programa() {
    }
    
    /**
     * 
     */
    public void iniciar()
    {        
            char op = Utilidades.menu();    
            switch (op) {
                case '1':
                    
                case '2':

                case '3':
                    //SALIR
                    System.exit( 0 );
                    break;
                default:
                   Utilidades.menu(); 
            }         
        
    }
}
