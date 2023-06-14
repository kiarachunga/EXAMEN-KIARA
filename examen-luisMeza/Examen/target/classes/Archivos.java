import java.util.logging.Logger;
import java.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;


public class Archivos {	
	private static final Logger LOG = Logger.getLogger(Archivos.class.getName());
	

    public Archivos() {

    }
    
    //Primero leemos el archivo
    public String leer() {
    	
    	String texto="";
		try {
			FileReader fr = new FileReader("juegos.dat");
			BufferedReader br = new BufferedReader( fr );
			
			String linea ="";
			while( (linea = br.readLine() ) !=  null)
			{
				texto += "\n" + linea;
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return texto;
	}
    
    //Creamos el nuevo archivo con lo leido
    public void CrearArchivo() {
    	
    		File archivo = new File("nuevo.csv");
    		FileWriter fw;
    		BufferedWriter bw = new BufferedWriter(fw);
    		try {

    			bw.write(this.leer());
    			bw.newLine();
    			bw.flush();

    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} finally {
    			try {

    				if (bw != null)
    					bw.close();

    				if (fw != null)
    					fw.close();

    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}

    	}
    //Eliminamos el archivo anterior
    public void eliminar() {
    	String rutaArchivo = "C:\\Users\\CS-01\\Documents\\GitHub\\examen-luisMeza\\Examen\juegos.dat";
    	File archivo = new File(rutaArchivo);
    	
    	if(archivo.exists()) {
    		archivo.delete();
    	}else {
    		System.out.println("El archivo no existe.")
    	}
    	
    }
    //Leemos el nuevo archivo para luego mostrarlo por consola
    public static void leernuevoArchivo{
    	
    	String texto="";
		try {
			FileReader fr = new FileReader("nuevo.csv");
			BufferedReader br = new BufferedReader( fr );
			
			String linea ="";
			while( (linea = br.readLine() ) !=  null)
			{
				texto += "\n" + linea;
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return texto;
    }
    
    public void mostrar() {
    	PrintStream ps = new PrintStream( System.out );
		ps.println(leernuevoArchivo());
    }

    // Modificamos el archivo por la (;)
    public void arreglar() {
    	String signo = leer();
    	
    	String nuevoSigno = signo.replaceAll("\\+" , " ; ");
    	
    	return nuevoSigno;
    }
    
    //Crash Log
    public static void mostrarError() {

    	File archivo = new File("crash.log");


    	try {

    	PrintStream ps = new PrintStream( new FileOutputStream( archivo , true ));

    	System.setErr( new PrintStream(new FileOutputStream( archivo , true)));


    	System.err.println("Hubo un error en este momento");

    	} catch (FileNotFoundException e) {

    	// TODO Auto-generated catch block

    	e.printStackTrace();

    	}



    }
    
}
