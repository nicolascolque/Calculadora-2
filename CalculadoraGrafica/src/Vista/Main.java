package Vista;
import bsh.EvalError;
import bsh.Interpreter;

/**
 * Ejercicio: Calculadora sencilla - Implementar la Interfaz de usuario -
 * Implementar los mtodos siguientes a través de los listeners adecuados: -
 * Sumar - Restar - Multiplicar - Dividir
 * 
 * @author: $Author: franchux $
 * @version: $Rev: 70 $
 * @date: $Date: 2009-04-13 13:06:00 +0200 (lun 13 de abr de 2009) $ $Id:
 *        Main.java 70 2009-04-13 11:06:00Z franchux $
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
	//	VentanaCalculadora calculadora = new VentanaCalculadora();
	//	calculadora.setVisible(true);
		Interpreter interpreter = new Interpreter();
		try {
			interpreter.eval("result = 2+2*3/1.2");
			System.out.println(interpreter.get("result"));
			
		}
		catch(EvalError e) 
		{
			e.printStackTrace();
		}
	}
}
