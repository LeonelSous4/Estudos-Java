
package Aula3;

// matricula é privado (-) — só interessa internamente, ex: vincular no banco de dados.
// notas é protegido (#) — não deve ser público, mas classes filhas (herança) podem precisar acessar.
// cpf e nome são públicos (+) — fazem parte do que quem usa a classe precisa.

// Na UML, os símbolos são: + público, - privado, # protegido.

/**
 * Exemplo inicial de código Java mostrando o início de uma classe.
 */
public class visibilidade {

	// atributos com diferentes níveis de visibilidade
	public String publico = "publico";
	protected String protegido = "protegido";
	String pacote = "pacote"; // visibilidade default (package-private)
	private String privado = "privado";

	public static void main(String[] args) {
		visibilidade v = new visibilidade();
		System.out.println("Iniciando a classe visibilidade");
		System.out.println("public: " + v.publico);
		System.out.println("protected: " + v.protegido);
		System.out.println("default (package): " + v.pacote);
		System.out.println("private: " + v.privado);
	}

}
