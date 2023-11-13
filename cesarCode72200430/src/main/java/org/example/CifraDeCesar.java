package org.example;

public class CifraDeCesar {
    public static String criptografar(String texto, int chave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                char inicioAlfabeto = Character.isLowerCase(caractere) ? 'a' : 'A';
                caractere = (char) (((caractere - inicioAlfabeto + chave) % 26) + inicioAlfabeto);
            }

            resultado.append(caractere);
        }

        return resultado.toString();
    }

    public static String descriptografar(String texto, int chave) {
        return criptografar(texto, 26 - chave);
    }

    public static void main(String[] args) {
        int chave = 3;
        String textoOriginal = "Rafael Guimaraes Sakurai";
        String textoCriptografado = criptografar(textoOriginal, chave);
        String textoDescriptografado = descriptografar(textoCriptografado, chave);

        System.out.println("Texto Original: " + textoOriginal);
        System.out.println("Texto Criptografado: " + textoCriptografado);
        System.out.println("Texto Descriptografado: " + textoDescriptografado);
    }
}
