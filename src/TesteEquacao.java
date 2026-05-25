public class TesteEquacao {
    static void main(String[] args) {
        int a = 1;
        int b = -5;
        int c = 6;
        double delta = (b*b)-(4*a*c);
        double x1 = (-b + Math.sqrt(delta)) / (2*a);
        System.out.println("A raiz quadrada de delta é " + x1);

    }
}
