//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Encriptador encriptador = new Encriptador();

        String texto = "Hola Mundo";
        String textoEncriptado = encriptador.encriptar(texto);
        System.out.println("Texto encriptado: " + textoEncriptado);

        texto = textoEncriptado;
        String textoDesencriptado = encriptador.desencriptar(texto);
        System.out.println("texto desencriptado: " + textoDesencriptado);
    }
}