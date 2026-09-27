class GERENTE extends FUNCIONARIO {
    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.2);
    }
}