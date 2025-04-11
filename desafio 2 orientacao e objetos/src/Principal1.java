public class Principal1 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(678);
        conta.setSaldo(200);
        conta.titular = "José";

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(250);
        System.out.println("Novo saldo: " + conta.getSaldo());
    }
}