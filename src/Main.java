import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Que quieres haccer?");
        System.out.println("1) Encriptar?");
        System.out.println("2) Desencriptar");

        Scanner teclado = new Scanner(System.in);
        String opcionElegida = teclado.nextLine();

        System.out.println("Ingrese la direccion del archivo");
        String rutaDelArchivo = teclado.nextLine();

        Encriptador encriptador = new Encriptador();
        encriptador.setClave(432);

        if("1".equals(opcionElegida)){
            String texto = FileUtil.cargarArchivo(rutaDelArchivo);
            String textoEncriptado = encriptador.encriptar(texto);
            System.out.println("Texto encriptado: " + textoEncriptado);
            String rutaArchivo = "";
            FileUtil.guardarArchivo(rutaArchivo, textoEncriptado);
        }else {
            //String textoDesencriptado = encriptador.desencriptar(texto);
            //System.out.println("texto desencriptado: " + textoDesencriptado);
        }

        System.out.println("Proceso completado con Exito!");






    }
}