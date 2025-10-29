import random

#Nivel 1
def edadd():
    edad = int(input("Ingresa tu edad: "))
    print(f"Tu edad es: {edad} años")


def suma():
    a = int(input("Ingresa el primer número: "))
    b = int(input("Ingresa el segundo número: "))
    print(f"La suma es: {a + b}")


def num_aleatorio():
    numero = random.randint(1, 100)
    intento = None
    while intento != numero:
        intento = int(input("Adivina el número (entre 1 y 100): "))
        if intento < numero:
            print("El número es mayor.")
        elif intento > numero:
            print("El número es menor.")
        else:
            print("¡Felicitaciones, adivinaste el número!")


def contador_vocales():
    texto = input("Ingresa una palabra: ").lower()
    vocales = "aeiou"
    contador = sum(1 for letra in texto if letra in vocales)
    print(f"La cadena tiene {contador} vocales.")
    
#Nivel 2

def palindromo(palabra):
    palabra = palabra.lower().replace(" ", "")
    if palabra == palabra[::-1]:
        print(True)
    else:
        print(False)

def potencias(b,e):
    
    print(f"{b} elevado a {e} es: {b**e}")

def cmedia(lista):
    media = sum(lista) / len(lista)
    print(f"la media es de: {media}")

#nivel 3

def invcadena(cadena):
    return cadena[::-1]

def mayordetres(n1,n2,n3):
    if n1 > n2 and n1 > n3:
        return(f"el numero mayor es: {n1}")
    elif n2 > n1 and n2 > n3:
        return(f"el numero mayor es: {n2}")
    elif n3 > n1 and n3 > n2:
        return(f"el numero mayor es: {n3}")
    else:
        n1 == n2 and n2 == n3
        return("Toos los numeros son iguales")
    
def calcarea(radio, altura):
    area = (2 * 3,14 * radio * altura + 2 * 3,14 * radio**2)
    return area

def buscar_palabra(cadena, palabra):
    return palabra.lower() in cadena.lower()

#nivel 4

def promedio(*numeros):
    return sum(numeros) / len(numeros)

def multiplicar_lista(lista, numero):
    return [x * numero for x in lista]

def mayor_de_varios_numeros(*numeros):
    return max(numeros)

def mediana(*numeros):
    lista = sorted(numeros)
    n = len(lista)
    mitad = n // 2
    if n % 2 == 0:
        return (lista[mitad - 1] + lista[mitad]) / 2
    else:
        return lista[mitad]

def contar_ocurrencias(cadena, palabra):
    return cadena.lower().split().count(palabra.lower())

def menu():
    while True:
        print("\n=== MENÚ DE FUNCIONES ===")
        print("1. Edad")
        print("2. Suma")
        print("3. Adivinar número aleatorio")
        print("4. Contador de vocales")
        print("5. Palíndromo")
        print("6. Calcular potencia")
        print("7. Calcular media")
        print("8. Invertir cadena")
        print("9. Mayor de tres números")
        print("10. Calcular área del cilindro")
        print("11. Buscar palabra en cadena")
        print("12. Promedio de varios números")
        print("13. Multiplicar lista por número")
        print("14. Mayor de varios números")
        print("15. Calcular mediana")
        print("16. Contar ocurrencias")
        print("17. Salir")

        opcion = input("Selecciona una opción: ")

        if opcion == "1":
            edadd()
        elif opcion == "2":
            suma()
        elif opcion == "3":
            num_aleatorio()
        elif opcion == "4":
            contador_vocales()
        elif opcion == "5":
            palabra = input("Ingresa una palabra: ")
            palindromo(palabra)
        elif opcion == "6":
            b = float(input("Base: "))
            e = float(input("Exponente: "))
            potencias(b, e)
        elif opcion == "7":
            lista = list(map(float, input("Escribe números separados por espacio: ").split()))
            cmedia(lista)
        elif opcion == "8":
            cadena = input("Ingresa una cadena: ")
            print("Cadena invertida:", invcadena(cadena))
        elif opcion == "9":
            n1 = float(input("Número 1: "))
            n2 = float(input("Número 2: "))
            n3 = float(input("Número 3: "))
            print(mayordetres(n1, n2, n3))
        elif opcion == "10":
            radio = float(input("Radio: "))
            altura = float(input("Altura: "))
            print("Área del cilindro:", calcarea(radio, altura))
        elif opcion == "11":
            cadena = input("Cadena: ")
            palabra = input("Palabra a buscar: ")
            print("¿Está la palabra?", buscar_palabra(cadena, palabra))
        elif opcion == "12":
            numeros = list(map(float, input("Escribe números separados por espacio: ").split()))
            print("Promedio:", promedio(*numeros))
        elif opcion == "13":
            lista = list(map(float, input("Escribe números separados por espacio: ").split()))
            numero = float(input("Número multiplicador: "))
            print("Lista resultante:", multiplicar_lista(lista, numero))
        elif opcion == "14":
            numeros = list(map(float, input("Escribe números separados por espacio: ").split()))
            print("El mayor es:", mayor_de_varios_numeros(*numeros))
        elif opcion == "15":
            numeros = list(map(float, input("Escribe números separados por espacio: ").split()))
            print("La mediana es:", mediana(*numeros))
        elif opcion == "16":
            cadena = input("Cadena: ")
            palabra = input("Palabra a contar: ")
            print("Ocurrencias:", contar_ocurrencias(cadena, palabra))
        elif opcion == "17":
            print("Chao ;););););););););):);):);)")
            break
        else:
            print("Opción inválida, intenta de nuevo.")

# Ejecutar el menú automáticamente
menu()