

public class Ejercicio7 {
    public static void main(String[] args) {
        /*Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva
         un array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número 
         es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de 
         ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor 
debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
Input (Entrada):
fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)
Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”]
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”] */
String[] fizzBuzz = fizzBuzz(1, 6);
for (int i=0; i<6 ; i++){
    System.out.println(fizzBuzz[i]);
}
String[] fizzBuzz2 = fizzBuzz(1, 8);
for (int i=0; i<8 ; i++){
    System.out.println(fizzBuzz2[i]);
}

                    }
public static String[] fizzBuzz(int num1, int num2) {
    String[] guardarAca = new String[num2] ;
    int j = 0;
    for (int i=num1 ; i<=num2 ; i++){
        if (i%2==0 && i%3==0){
            guardarAca[j]="FizzBuzz";j+=1;
        }
        else if (i%2==0){
            guardarAca[j]="Fizz";j+=1;
        }
        else if (i%3==0){
            guardarAca[j]="Buzz";j+=1;
        }
        else {guardarAca[j]=Integer.toString(i);j+=1;
        }
    }
    return guardarAca;
}}

     