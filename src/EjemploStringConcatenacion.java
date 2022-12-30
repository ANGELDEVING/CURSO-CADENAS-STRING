public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        // no es un primitivo como pareciera ser
        String curso = "Programacion Java"; // forma implicita
        String profesor = "Andres Guzman";

        String detalle = curso + " " + profesor;
        System.out.println( detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));

        System.out.println(numeroA + numeroB + detalle);
        // concatenar la cadena con profesor metodo..
        String detalle2 = curso.concat(" " ).concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
