public class Cliente {
    private String nome;
    private String CPF;
    private String agencia;
    private double saldo;
    private int numero;



    public Cliente(String nome, String CPF, String agencia, int numero) {
        this.nome = nome;
        this.CPF = CPF;
        this.agencia = this.agencia;
        this.saldo = 237.48;
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

}
