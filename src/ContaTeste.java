public class ContaTeste {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.cliente = "Fábio";
        conta.saldo = 7_000.00;
        conta.exibesaldo();

        conta.saque(2000);
        conta.exibesaldo();

        conta.deposita(8000);
        conta.exibesaldo();

        Conta destino = new Conta();
        destino.cliente = "Bianca";
        destino.saldo = 3_000.00;
        destino.exibesaldo();

        double valorTransferencia = 1000;
        conta.transferenciaValor(destino, valorTransferencia);
        destino.exibesaldo();

        conta.exibesaldo();
        
    }
}
