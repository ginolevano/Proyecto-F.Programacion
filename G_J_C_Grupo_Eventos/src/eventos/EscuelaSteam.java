
package eventos;
import eventos.Evento;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class EscuelaSteam {
	
	
	
	public static List<Evento> leerEvento(String rutaArchivo){
		
		//Usamos List para que nos guarda cada evento q cree el usuario
		// para q se cree en forma de list o Strings
		
		List<Evento> eventos =  new ArrayList<>();
		
		try (BufferedReader br =  new BufferedReader(new FileReader(rutaArchivo))){
			
			String linea;
			
			while((linea = br.readLine()) !=null ) {
				
				String[] partes = linea.split(",");

				if(linea.trim().isEmpty()) {
					continue;

				}

				if(partes.length < 8) {
					System.out.print("linea invalida" + linea);
					continue;
				}
				
				Evento evento = new Evento(partes[0],partes[1],partes[2],partes[3],partes[4],partes[5],partes[6],partes[7]);
				eventos.add(evento);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al leer archivo" + e.getMessage());
		}
		
		return eventos;
		}
	
	
	public static void guardarEvento(Evento eventito, String rutaArchivo) {
		
		boolean banderita = true;
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, banderita))){
			
			bw.write(eventito.toString());
			bw.newLine();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al guardar tu archivo" + e.getMessage());

		}
	}
	//FABRICANDO MI FICHERITO
	
	public static void crearArchivo(String rutaArchivo) {
		File fichero = new File(rutaArchivo);
		
		System.out.println("Ruta absoluta del archivo: " + new File("Data/eventos.csv").getAbsolutePath());

		
		try {
			if (!fichero.getParentFile().exists()) {
	            fichero.getParentFile().mkdirs();
	            System.out.println("Carpeta 'Data' creada.");
	        }
			
			if(!fichero.exists()) {
				fichero.createNewFile();
				System.out.print("Fichero creado ");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al crear el fichero" + e.getMessage());
		}
	}
	
	
	public static void main(String[]args) {


		crearArchivo("Data/eventos.csv");
		
		
		Scanner teclado = new Scanner(System.in);
		int menu;
		boolean banderita = true;

		String title = "==================================================\n"
				+ "|||| BIENVENIDOS AL CALENDARIO DE EVENTOS UEM |||| "
				+ "\n==================================================";


		System.out.println();

		while(banderita) {
			System.out.println("C:EventsUe > ");

			String titleUpper = title.toUpperCase();
			System.out.println();

			String development= "D e v e l o p m e n t   b y   C a r m e n  ,  J o s u e  ,  G i n o";
			String develoUpper= development.toUpperCase();
			System.out.println(title);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(develoUpper  );
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println();
			System.out.println("1) EVENTO UEM");
			System.out.println("2) AÑADIR EVENTO UEM");
			System.out.println("3) MODIFICAR EVENTO UEM");
			System.out.println("4) ELIMINAR EVENTO UEM");
			System.out.println("5) HELP UEM");
			
			
			menu  = teclado.nextInt();

			switch(menu) {
			

			case 1:
				boolean flag = true;
				
				while(flag) {
					
					
					System.out.println("C:EventsUe >Evento_Uem");
					
					System.out.println();

					System.out.println("1) VER EVENTO UEM");
					
					System.out.println("2) VER POR FECHA UEM  ");
					
					System.out.println("3) EXIT");
					
					
					int opcionesMenu = teclado.nextInt();
					
					switch(opcionesMenu){
					
						case 1:
							System.out.println();

							System.out.println("C:EventsUe >Evento_Uem\\Ver_Evento_Uem");
							
							System.out.println();

							System.out.println("MOSTRANDO EVENTOS UEM");
							
							List<Evento> eventos = leerEvento("Data/eventos.csv");
						    if (eventos.isEmpty()) {
						        System.out.println("No hay eventos para mostrar.");
						    } else {
						        for (Evento evento : eventos) {
						            System.out.println(evento);
						        }
						    }

							
							
							System.out.println();


							break;
							
						case 2:
							System.out.println("MOSTRANDO CALENDARIO POR FECHA");

							break;
						case 3:
							System.out.println("SALIENDO....");
							
							System.out.println();
							
							if(opcionesMenu == 3) {
								flag = false;
							}

							break;
						default :
							System.out.println("INGRESA VALORES CORRECTOS");

							break;
							
					}
					
						
				}
				
			break;
			
			case 2:
				boolean flag2 = true;

				while(flag2) {
					System.out.println("C:EventsUe >Añadir_Evento_Uem");
					System.out.println("1) INGRESAR NUEVO EVENTO UEM");
					System.out.println("2) EXIT");

					int opcionesMenu2 = teclado.nextInt();
					switch(opcionesMenu2) {
					case 1:
						System.out.print("ID");
						String id = teclado.next();
						System.out.println("Nombre:");
						String nombre = teclado.next();
						System.out.println("Fecha (0/0/0):");
						String fecha = teclado.next();
						System.out.println("Hora de Inicio:");
						String horaInicial = teclado.next();
						System.out.println("Hora de Fin:");
						String horaFinal = teclado.next();
						System.out.println("Lugar:");
						String lugar = teclado.next();
						System.out.println("Publico objetivo:");
						String user = teclado.next();
						System.out.println("Url");
						String url = teclado.next();
						
						Evento nuevoEventito =  new Evento(id,nombre,fecha,horaInicial,horaFinal,lugar,user,url);
						guardarEvento(nuevoEventito , "Data/eventos.csv");

						System.out.println("Guardando evento ..");
						break;
						
						
						case 2:
							
							System.out.println("saliendo del submenú...");
							if( opcionesMenu2 == 2) {
								flag2 = false;
							}

							
							break;
							
							
						default:
							System.out.println("INGRESA VALORES CORRECTOS");
						break;
						
					}
					
					

				}
				
			break;
			case 3:
				System.out.println("EVENTO UEM");
			break;
			case 4:
				System.out.println("EVENTO UEM");
			break;
			case 5:
				System.out.println("EVENTO UEM");
			break;
			
			default:
				System.out.println("ingresa valores correctos. '5' help");
				break;
			}
			
		}
		
		
		teclado.close();
		
	}

}
