

    public class Conta{

        //Atributos
        private String numero;
        private float saldo;

        //Construtores
        public Conta(String numeroDaConta, float saldoInicial){
            numero = numeroDaConta;
            saldo = saldoInicial;
        }

        //Metodo Main
        public static void main (String[] args){

            //Instancia do obj1
            Conta obj1 = new Conta("123-4" , 2000);
            System.out.println("Mostrando saldo atual: R$ " + obj1.getSaldo());
            System.out.println("Debitando R$ 100.0 ");
            obj1.debitar(100);
            System.out.println("Mostrando saldo atual: R$ " + obj1.getSaldo());
            System.out.println("Mostrando o Numero da conta: " + obj1.getNumero());

            //Instancia do obj2
            Conta obj2 = new Conta("5678-9" , 6000);
            System.out.println("Mostrando saldo atual: R$ " + obj2.getSaldo());
            System.out.println("Debitando R$ 900.0 ");
            obj1.debitar(900);
            System.out.println("Mostrando saldo atual: R$ " + obj2.getSaldo());
            System.out.println("Mostrando o Numero da conta: " + obj2.getNumero());
        }

        public void debitar(float valor) {
            saldo = saldo - valor;
        }
        public void creditar(float valor) {
            saldo = saldo + valor;
        }

        public float getSaldo(){
            return saldo;
        }
        public void setSaldo(float novoSaldo){
            saldo = novoSaldo;
        }

        public String getNumero(){
            return numero;
        }
    }

