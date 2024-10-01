/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase principal de la aplicación
 * @author rbr - 011024
 *
 */
public class Inicial {

	/**
	 * Método principal de la aplicación
	 * rbr - 011024
	 * @param args
	 */
	public static void main(String[] args) {


		//Variables
		char respuesta1, respuesta2;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Hago las preguntas al usuario por consola y recojo las respuestas
		System.out.println("Está nevando ahora???: ");
		respuesta1 = sc.next().charAt(0);
		System.out.println("Has acabado las actividades???: ");
		respuesta2 = sc.next().charAt(0);
		
		//Verifico si las actividades se han terminado
		if(respuesta2=='S'||respuesta2=='s') {
			System.out.println("PUEDES SALIR A LA CALLE");
		}else if(respuesta2=='N'||respuesta2=='n') {
			System.out.println("ACABA LAS ACTIVIDADES");
		}else {
			System.out.println("LA RESPUESTA A LA PREGUNTA NO HA SIDO LA ESPERADA (NO ES VÁLIDA)");
		}

	}

}
