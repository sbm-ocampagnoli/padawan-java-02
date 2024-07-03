public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(20, 20);

		conta.setNumero(1337);
		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
	}

}
