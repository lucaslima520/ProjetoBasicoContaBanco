public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int numero;
            double saldo;
            String agencia;
            String nomeCliente;
            System.out.println("Por favor, digite o número da agência!");
            agencia = sc.nextLine();
            System.out.println("Por favor, digite o número da conta!");
            numero = sc.nextInt();
            nomeCliente = sc.nextLine();
            System.out.println("Por favor, digite o nome do cliente!");
            nomeCliente = sc.nextLine();
            System.out.println("Por favor, digite o saldo!");
            saldo = sc.nextDouble();
            System.out.printf("Olá"+" "+nomeCliente+" "+"obrigado por criar uma conta em nosso banco, sua agência é"+" "+ agencia +" "+",conta"+" "+numero+" "+"e seu saldo"+" "+saldo+" "+"já está disponível para saque!");
            sc.close();
    }
}
