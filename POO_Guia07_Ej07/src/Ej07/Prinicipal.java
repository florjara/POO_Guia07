/*

deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, 
calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también 
calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.*/
package Ej07;

public class Prinicipal {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        Persona[] personas;
        personas = new Persona[4];

        persona1.crearPersona();
        persona2.crearPersona();
        persona3.crearPersona();
        persona4.crearPersona();

        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;
        personas[3] = persona4;

        int contBajo = 0, contIdeal = 0, contAlto = 0;
        int mayorEdad = 0, menorEdad = 0;

        for (int i = 0; i < 4; i++) {
            switch (personas[i].calcularImc()) {
                case -1:
                    contBajo += 1;
                    break;
                case 0:
                    contIdeal += 1;
                    break;
                case 1:
                    contAlto += 1;
                    break;
            }
            if (personas[i].esMayorDeEdad()) {
                mayorEdad += 1;
            } else {
                menorEdad += 1;
            }
        }

        System.out.println(contBajo * 25 + "% de personas tienen bajo peso. ");
        System.out.println(contIdeal * 25 + "% de personas estan en su peso ideal. ");
        System.out.println(contAlto * 25 + "% de personas tienen sobrepeso. ");
        System.out.println(mayorEdad * 25 + "% de personas son mayores de edad. ");
        System.out.println(menorEdad * 25 + "% de personas son menores de edad. ");

    }
}
