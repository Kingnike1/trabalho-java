class VENDEDOR extends FUNCIONARIO {
    double totalVendas;

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * 0.1);
    }
}