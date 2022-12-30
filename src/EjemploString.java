public class EjemploString {
    public static void main(String[] args) {
        // no es un primitivo como pareciera ser
        String curso = "Programacion Java"; // forma implicita
        String curso2 = new String("Programacion Java"); // se crea forma explicita
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        //retorna boolean compara el texto (== equals ==)
        esIgual = curso.equals(curso2);
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);
        System.out.println("esIgual = " + esIgual);
        // comparacion 3
        System.out.println("||==== comparacion2 === ||");
        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("curso3 = " + esIgual);




    }
}
