
package quized;

import java.util.Scanner;


public class QuizEd {
    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
       Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---Menu de opciones---\n");
            System.out.println("1. Registrar libro");
            System.out.println("2. Buscar libros por área");
            System.out.println("3. Buscar libro por código");
            System.out.println("4. Salir");
            System.out.print("\n--digite una opcion--");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    String continuar;
                    do {
                        System.out.print("Ingrese código del libro: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Ingrese título del libro: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Ingrese área del libro: ");
                        String area = scanner.nextLine();
                        biblioteca.registrarLibro(codigo, titulo, area);
                        
                        System.out.print("Desea registrar otro libro? (s/n): ");
                        continuar = scanner.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));
                    break;
                case 2:
                    System.out.print("Ingrese área para buscar libros: ");
                    String area = scanner.nextLine();
                    biblioteca.buscarLibroPorArea(area);
                    break;
                case 3:
                    System.out.print("Ingrese código del libro a buscar: ");
                    String codigo = scanner.nextLine();
                    biblioteca.buscarLibroPorCodigo(codigo);
                    break;
                case 4:
                    System.out.println("Saliendo de la...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
