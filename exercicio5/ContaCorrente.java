class ContaCorrente extends Conta { 
    double taxaManutencao;

    @Override 
    public double calcularSaldo() { 
        return saldo - taxaManutencao; // Deduz a taxa de manutenção ao depositar
    }
}