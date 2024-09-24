import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

      Scanner scanner = new Scanner(System.in);

      String palabraSecreta = "diana";
      int intentosMaximos = 10;
      int intentos = 0;
      boolean palabraAdivinada = false;

      //Arreglos:
      char[] letrasAdivinadas = new char[palabraSecreta.length()];
    //Estructura de control: Iteractiva (Bucle)
      for (int i= 0; i < letrasAdivinadas.length; i++){
      letrasAdivinadas[i] = '_';
    }

    //Estructura de control: Iteractiva (Bucle)

   while(!palabraAdivinada && intentos < intentosMaximos){

   System.out.println("palabra a adivinar:" + String.valueOf(letrasAdivinadas) + "(" + palabraSecreta.length() + " Letras)");

   System.out.println("Introduce una letra, por favor");

   //Usamos la clase scanner para pedir una letra
   char letra = Character.toLowerCase(scanner.next().charAt(0));

   boolean letraCorrecta = false;
   // Estructura de control: Iteractiva (Bucle)
   for(int i = 0; i < palabraSecreta.length(); i++){
    //Estructura de control: condicional
   if(palabraSecreta.charAt(i) == letra){
    letrasAdivinadas[i] = letra;
    letraCorrecta = true;

   }

   }


   if(!letraCorrecta){
intentos++;
System.out.println("¡Inconrrecto! te quedan " + (intentosMaximos - intentos) + " intentos.");

   }

if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){

    palabraAdivinada = true;
    System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
}


}

if (!palabraAdivinada){

    System.out.println("¡Que pena te has quedado sin intentos! GAME OVER");
}

scanner.close();

    }
}
