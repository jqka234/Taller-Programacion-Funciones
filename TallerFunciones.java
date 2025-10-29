import java.util.*;

public class TallerFunciones {

    static Scanner sc = new Scanner(System.in);

//Nivel 1

    public static void edadd() {
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu edad es: " + edad + " años");
    }

    public static void suma() {
        System.out.print("Ingresa el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double b = sc.nextDouble();
        System.out.println("La suma es: " + (a + b));
    }

    public static void numAleatorio() {
        int numero = (int) (Math.random() * 100) + 1;
        int intento = -1;
        while (intento != numero) {
            System.out.print("Adivina el número (1-100): ");
            intento = sc.nextInt();
            if (intento < numero) {
                System.out.println("El número es mayor.");
            } else if (intento > numero) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicitaciones, adivinaste el número!");
            }
        }
    }

    public static void contadorVocales() {
        sc.nextLine();
        System.out.print("Ingresa una cadena: ");
        String texto = sc.nextLine().toLowerCase();
        int contador = 0;
        for (char c : texto.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) contador++;
        }
        System.out.println("La cadena tiene " + contador + " vocales.");
    }

//Nivel 2

    public static void palindromo(String palabra) {
        palabra = palabra.toLowerCase().replace(" ", "");
        String invertida = new StringBuilder(palabra).reverse().toString();
        System.out.println(palabra.equals(invertida));
    }

    public static void calcularPotencia(double base, double exponente) {
        double resultado = Math.pow(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es " + resultado);
    }

    public static void calcularMedia(double[] lista) {
        double suma = 0;
        for (double num : lista) suma += num;
        System.out.println("La media es: " + (suma / lista.length));
    }

//Nivel 3

    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    public static double mayorDeTresNumeros(double n1, double n2, double n3) {
        return Math.max(n1, Math.max(n2, n3));
    }

    public static double calcularArea(double radio, double altura) {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }

    public static boolean buscarPalabra(String cadena, String palabra) {
        return cadena.toLowerCase().contains(palabra.toLowerCase());
    }

//Nivel 4

    public static double promedio(double... numeros) {
        double suma = 0;
        for (double n : numeros) suma += n;
        return suma / numeros.length;
    }

    public static double[] multiplicarLista(double[] lista, double numero) {
        double[] resultado = new double[lista.length];
        for (int i = 0; i < lista.length; i++) {
            resultado[i] = lista[i] * numero;
        }
        return resultado;
    }

    public static double mayorDeVariosNumeros(double... numeros) {
        double mayor = numeros[0];
        for (double n : numeros) if (n > mayor) mayor = n;
        return mayor;
    }

    public static double calcularMediana(double... numeros) {
        Arrays.sort(numeros);
        int n = numeros.length;
        if (n % 2 == 0) {
            return (numeros[n / 2 - 1] + numeros[n / 2]) / 2;
        } else {
            return numeros[n / 2];
        }
    }

    public static int Ocurrencias(String cadena, String palabra) {
        String[] palabras = cadena.toLowerCase().split(" ");
        int contador = 0;
        for (String p : palabras) {
            if (p.equals(palabra.toLowerCase())) contador++;
        }
        return contador;
    }


    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== MENÚ DE FUNCIONES ===");
            System.out.println("1. Edad");
            System.out.println("2. Suma");
            System.out.println("3. Adivinar número aleatorio");
            System.out.println("4. Contador de vocales");
            System.out.println("5. Palíndromo");
            System.out.println("6. Calcular potencia");
            System.out.println("7. Calcular media");
            System.out.println("8. Invertir cadena");
            System.out.println("9. Mayor de tres números");
            System.out.println("10. Calcular área del cilindro");
            System.out.println("11. Buscar palabra en cadena");
            System.out.println("12. Promedio de varios números");
            System.out.println("13. Multiplicar lista por número");
            System.out.println("14. Mayor de varios números");
            System.out.println("15. Calcular mediana");
            System.out.println("16. Contar ocurrencias");
            System.out.println("17. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                edadd();
                break;
            case 2:
                suma();
                break;
            case 3:
                numAleatorio();
                break;
            case 4:
                contadorVocales();
                break;
            case 5:
                sc.nextLine();
                System.out.print("Palabra: ");
                String palabra = sc.nextLine();
                palindromo(palabra);
                break;
            case 6:
                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Exponente: ");
                double exp = sc.nextDouble();
                calcularPotencia(base, exp);
                break;
            case 7:
                System.out.print("Cantidad de números: ");
                int n = sc.nextInt();
                double[] lista = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    lista[i] = sc.nextDouble();
                }
                calcularMedia(lista);
                break;
            case 8:
                sc.nextLine();
                System.out.print("Cadena: ");
                String cad = sc.nextLine();
                System.out.println("Invertida: " + invertirCadena(cad));
                break;
            case 9:
                System.out.print("Número 1: ");
                double n1 = sc.nextDouble();
                System.out.print("Número 2: ");
                double n2 = sc.nextDouble();
                System.out.print("Número 3: ");
                double n3 = sc.nextDouble();
                System.out.println("El mayor es: " + mayorDeTresNumeros(n1, n2, n3));
                break;
            case 10:
                System.out.print("Radio: ");
                double r = sc.nextDouble();
                System.out.print("Altura: ");
                double h = sc.nextDouble();
                System.out.println("Área del cilindro: " + calcularArea(r, h));
                break;
            case 11:
                sc.nextLine();
                System.out.print("Cadena: ");
                String cadena = sc.nextLine();
                System.out.print("Palabra a buscar: ");
                palabra = sc.nextLine();
                System.out.println("¿Está la palabra? " + buscarPalabra(cadena, palabra));
                break;
            case 12:
                System.out.print("Cantidad de números: ");
                n = sc.nextInt();
                double[] nums = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    nums[i] = sc.nextDouble();
                }
                System.out.println("Promedio: " + promedio(nums));
                break;
            case 13:
                System.out.print("Cantidad de números: ");
                n = sc.nextInt();
                lista = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    lista[i] = sc.nextDouble();
                }
                System.out.print("Número multiplicador: ");
                double mult = sc.nextDouble();
                System.out.println("Lista resultante: " + Arrays.toString(multiplicarLista(lista, mult)));
                break;
            case 14:
                System.out.print("Cantidad de números: ");
                n = sc.nextInt();
                lista = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    lista[i] = sc.nextDouble();
                }
                System.out.println("El mayor es: " + mayorDeVariosNumeros(lista));
                break;
            case 15:
                System.out.print("Cantidad de números: ");
                n = sc.nextInt();
                lista = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    lista[i] = sc.nextDouble();
                }
                System.out.println("Mediana: " + calcularMediana(lista));
                break;
            case 16:
                sc.nextLine();
                System.out.print("Cadena: ");
                cadena = sc.nextLine();
                System.out.print("Palabra a contar: ");
                palabra = sc.nextLine();
                System.out.println("Ocurrencias: " + Ocurrencias(cadena, palabra));
                break;
            case 17:
                System.out.println("Chaitoooo ;):);):);):)");
                return;
            default:
                System.out.println("Opción inválida, intenta de nuevo.");

            }
        }
    }
}



