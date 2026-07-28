package Aula5.empresa;

public class PrincipalFuncionario {



    public static void main(String[] args) {

       // Troque a criação do f1 por uma subclasse concreta:
        Funcionario f1 = new Assalariado("Mario", 3500);
        Funcionario f2 = f1; // f2 continua apontando para o mesmo objeto f1
		
		System.out.println("Nome f1: " + f1.nome);
		System.out.println("Nome f2: " + f2.nome);
		
		
		System.out.println();
		
		f2.nome="Luigi";
		
		System.out.println("Nome f1: " + f1.nome);
		System.out.println("Nome f2: " + f2.nome);
		
		
		Funcionario f3 = new Assalariado("Mario",3500);
		
		f3 = new Horista("Luigi",100,40.5f);
		
		Funcionario funcionarios[] = { 	new Assalariado("Mario",3500),
										new Horista("Luigi",100,40.5f),
										new Comissionado("Yoshi",50000,0.05f)};
		Funcionario f;
		float total=0;
		for(int i=0; i<funcionarios.length;i++) {
			f= funcionarios[i];
			System.out.println(f.nome + " salario: " + f.pagamento());
			total += f.pagamento();
		}
		
		System.out.println("Total: " + total);
}

}
