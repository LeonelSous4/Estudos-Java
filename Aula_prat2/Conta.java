public class Conta {

    String correntista;
    float saldo;
    float LimiteSaque;

    void sacar(float valor) {
        if (valor <= saldo && valor <= LimiteSaque) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! \n");
        } else {
            System.out.println("Saldo insuficiente para o saque. \n");
        }

    }

    void transferir(float valor, Conta contaDestino) {
        if (valor <= saldo && valor <= LimiteSaque) {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência realizada com sucesso, valor transferido: \n" + valor);
        } else {
            System.out.println("Saldo insuficiente para a transferência. \n");
        }
    }

    void depositar(float valor) {
        if (valor >  0) {
            saldo += valor;
            System.out.println("Depsito realizado com sucesso! \n");
        } else {
            System.out.println("Valor invalido \n");
        }


    }

    void info() {
        System.out.println("Nome do correntista: \n" + correntista);
        System.out.printf("Saldo total: %.1f \n", saldo );
    }
    
        public static void main(String[] args) {

            Conta contaD = new Conta();
            contaD.correntista = "Chica";
            contaD.saldo = 500;
            contaD.LimiteSaque = 2000;
    
            contaD.sacar(400);
            contaD.depositar(100);
            contaD.info();


        Conta conta = new Conta();
        conta.correntista = "Topuria";
        conta.saldo = 6000;
        conta.LimiteSaque = 2000;

        conta.sacar(4000);
        conta.depositar(500);
        conta.info();
        conta.transferir(2000, contaD);



        


      
    }


}
