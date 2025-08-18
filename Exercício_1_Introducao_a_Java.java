public class java {
    public int publico = 1;
    private int privado = 2;
    protected int protegido = 3;
    int pacote = 4; // acesso default (package-private)

    public void mostrarValores() {
        System.out.println("publico: " + publico);
        System.out.println("privado: " + privado);
        System.out.println("protegido: " + protegido);
        System.out.println("pacote: " + pacote);
    }

    public static void main(String[] args) {
        java obj = new java();
        obj.mostrarValores();
    }
}