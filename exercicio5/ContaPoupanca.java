class ContaPoupanca extends Conta {
    double percentualRendimento;
    @Override 
    public double calcularSaldo() {
        return saldo + (saldo * percentualRendimento); // Adiciona o percentual de rendimento ao depositar
    }
}