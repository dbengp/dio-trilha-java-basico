package entidade;

public class ContaBancaria {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(int numero, String agencia, String nomeCliente, double saldo) {
		setNumero(numero);
		setAgencia(agencia);
		setNomeCliente(nomeCliente);
		setSaldo(saldo);
	}

    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

    public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

    public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

    public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    public String toString() {
		return "Olá "
				+ getNomeCliente()
				+ ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ getAgencia()
				+ ", conta "
                + getNumero()
                + " e seu saldo "
				+ String.format("%.2f", getSaldo())
                + " já está disponível para saque";
	}
    

}