public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sv = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        System.out.println("========== For ==============");
        for(int i = 0; i < 100000; i++)
        {
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 5ms
            //c+= a + b + "\n"; // 500 => 6ms
            // sv.append(a).append(b).append("\n");// 500 => 1ms // se optimiza
        }

        long fin = System.currentTimeMillis();
        System.out.println( fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb" + sv.toString());


    }
}
