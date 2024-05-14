package package1;

public class ContaCorrente {
    public float saldo;
    public String NovaConta;

    public void definirSaldoInicial(float saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public boolean sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true; 
        } else {
            return false; 
        }
    }
}

