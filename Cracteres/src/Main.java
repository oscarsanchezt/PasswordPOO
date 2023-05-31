import java.util.*;

class Password {
	
	//Atributos
	private String pwd;
	private int fallos;
	
	//Constructor
	public Password(String pwd) {
		this.pwd = pwd;
		fallos = 0;
	}
	
	//metodo login
	public boolean login(String txt) {
		// comparamos txt con pwd
		if (txt.equals(pwd)) {
			fallos = 0;
			return true;
		} else {
			fallos++;
			return false;
		}
	}
	
	// metodo getter
	int getFallos() {
		return fallos;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//	Ponemos la contraseña, con la que comparara
		Password ejemplo = new Password("pass123");
		
		// Escribimos una contraseña, para comprobar
		System.out.print("Contraseña: ");
		String ejemplo2 = sc.next();

		if (ejemplo.login(ejemplo2)) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
	}
}
