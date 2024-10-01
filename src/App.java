import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String palabra = "enviar ";
        palabra = palabra.toLowerCase().trim();
        int intentosmaximos = 10;
        int intentos = 0;
        boolean acertado = false;

        char[] palabraArray = new char[palabra.length()];

        for (int i = 0; i < palabraArray.length; i++) {
            palabraArray[i] = '_';
        }

        while (intentos < intentosmaximos && !acertado) {
            System.out.println("Palabra a adivinar: " + String.valueOf(palabraArray));
            System.out.println("Introduce una letra: ");
            char letra = Character.toLowerCase(scan.next().charAt(0));
            System.out.println("Letra introducida: " + letra);

            boolean letraEncontrada = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraArray[i] = letra;
                    letraEncontrada = true;
                }
            }
            if (!letraEncontrada) {
                System.out.println("¡Fallaste!");
                intentos++;
            } else {
                System.out.println("¡Has acertado!");
            }
            
            if (String.valueOf(palabraArray).equals(palabra)) {
                acertado = true;
                System.out.println("¡Has acertado la palabra! "+palabra);
            }
        
            System.out.println("Intentos restantes: " + (intentosmaximos - intentos));
        }

        if (!acertado) {
            System.out.println("Has agotado los intentos. La palabra era: " + palabra);
        }

        scan.close();
    }
}
