import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class Datos {
	private static final Logger LOG = Logger.getLogger(Datos.class.getName());
	static PrintStream ps = new PrintStream(System.out);;
	static InputStreamReader isr = new InputStreamReader( System.in );
	public static BufferedReader br = new BufferedReader( isr );

    public Datos() {

    		
    }

    public void AgregarNuevosDatos() {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = System.out;

        ps.println("¿Cuántos datos desea ingresar?");
        int cantidadDatos = 0;
        
        try {
            cantidadDatos = Integer.parseInt(br.readLine());
            ps.println("");
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        String[] datos = new String[cantidadDatos];

        try {
            for( int i = 0 ; i < cantidadDatos ; i++ ) {
                ps.println("Ingrese el dato: ");
                datos[i] = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        ps.println("");
        ps.println("Se ingresaron los nuevos datos");

        return datos;
    
    }

    public void almacenar() {
    	String[] datos = AgregarNuevosDatos();
		
		File archivo = new File("nuevo.csv");
		FileWriter fw;
		
		try {
			fw = new FileWriter( archivo , true );
			PrintWriter pw = new PrintWriter(fw);
			
			
			fw.flush();
			pw.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
    }

    public void calcularVictorias() {
    	

    }
    
}
