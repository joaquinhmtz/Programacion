import java.io.*;

public class Traductor{
	
	static PrintStream fs = System.out;
	static InputStreamReader isr = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(isr);
	static String str;
	static int num;

	public void traducir(String es[],String in[],int n)throws IOException{
		String aux;
		int i;
		int aux2 = 200;

		fs.println("Bienvenido al sistema de traducción");
		fs.println("Dame la palabra en inglés: ");
		aux = br.readLine();

		for(i = 0; i < num; i++){
			if(aux.equals(in[i])){
				aux2 = i;
				break;
			}

		}
		if(aux2 >= 0 && aux2 <= 100)
		 	fs.println("Palabra en español: " +es[aux2]);
		else
			fs.println("Palabra no encontrada.");
	}

	public void crearDiccionario(String es[],String in[],int n)throws IOException{
		int i;

		for(i = 0;i < num; i++){
		fs.println("Dame la palabra en español: ");
		str = br.readLine();
			if(str.length() < 40)
				es[i] = str;
			else 
				fs.println("Longitud Inválida");
				fs.println("Dame la palabra en inglés: ");
		str = br.readLine();
				if(str.length() < 40)
					in[i] = str;
				else 
					fs.println("Longitud Inválida");
		}
	}

	public static void main(String [] args)throws IOException{

		Traductor obj = new Traductor();
		String espaniol[];
		String ingles[];

		fs.println("Bienvenido.");
		fs.println("Dame el número de palabras a agregar: ");
		str=br.readLine();
		num=Integer.parseInt(str);

		if(num > 0 && num <= 100){

		espaniol = new String[num];
		ingles = new String[num];

		obj.crearDiccionario(espaniol,ingles,num);
		obj.traducir(espaniol,ingles,num);

		}else 
			fs.println("Número de palabras inválidas.");

	}

}
