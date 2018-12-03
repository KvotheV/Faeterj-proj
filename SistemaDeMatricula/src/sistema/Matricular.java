package sistema;

import java.util.ArrayList;
import java.util.List;

public class Matricular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criação da disciplina
		Disciplina oo1;
		oo1 = new Disciplina();
		oo1.codigo=001;
		oo1.nome = "Orientacao a Objetos";
		
		//Inscrição de alunos na disciplina
		Aluno malunos[] = new Aluno[10];

		malunos[0] = new Aluno();
		malunos[0].setNome("João");
		malunos[0].setMatricula(123);
		oo1.matriculaAlunos(malunos[0]);
		
		malunos[1] = new Aluno();
		malunos[1].setNome("Maria");
		malunos[1].setMatricula(456);
		oo1.matriculaAlunos(malunos[1]);
		
		malunos[2] = new Aluno();
		malunos[2].setNome("José");
		malunos[2].setMatricula(568);
		oo1.matriculaAlunos(malunos[2]);
		
		malunos[3] = new Aluno();
		malunos[3].setNome("Antônio");
		malunos[3].setMatricula(743);
		oo1.matriculaAlunos(malunos[3]);
		
		malunos[4] = new Aluno();
		malunos[4].setNome("Carlos");
		malunos[4].setMatricula(643);
		oo1.matriculaAlunos(malunos[4]);
		
		
		//Listagem de Alunos Matriculados
		System.out.println("\nAlunos Matriculados em " + oo1.nome + "\n");
        for(int i=0;i<oo1.matriculasAlunos.size();i++) {
        	System.out.println("nome " + oo1.matriculasAlunos.get(i).getNome());
        	System.out.println("Matricula: " + oo1.matriculasAlunos.get(i).getMatricula()+ "\n");
        }
	}

}
