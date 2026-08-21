public class Cuenta {
    private double saldo;

    public Cuenta(double saldo){
        this.saldo=saldo;
    }


    public void retirar (double monto) throws SaldoInsuficienteException{
        if (monto>saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente.Disponible: $" + saldo + ", solicitando: $"+ monto);
        }
        saldo -= monto;
        System.out.println("Retiro existoso. Saldo restante: $" + saldo);
    }

}

