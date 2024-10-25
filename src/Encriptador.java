public class Encriptador {
    public String encriptar(String texto){
        String resultado = "";
        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            resultado += letra + "x";
        }
        return resultado;
    }

    public String desencriptar(String texto){
        String resultado = "";
        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            boolean esPar = i % 2 == 0;
            if(esPar){
                resultado += letra;
            }

        }
        return resultado;
    }
}
