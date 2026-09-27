public class Main {
    public static void main(String[] args) {
        GERENTE gerente = new GERENTE();
        gerente.nome = "João";
        gerente.salarioBase = 5000.0;

        VENDEDOR vendedor = new VENDEDOR();
        vendedor.nome = "Maria";
        vendedor.salarioBase = 3000.0;
        vendedor.totalVendas = 20000.0;

        System.out.println("Salário do gerente " + gerente.nome + ": " + gerente.calcularSalario());
        System.out.println("Salário do vendedor " + vendedor.nome + ": " + vendedor.calcularSalario());
    }
}
