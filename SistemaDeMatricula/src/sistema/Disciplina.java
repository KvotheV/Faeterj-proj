package sistema;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	String nome;
	int codigo;
	
	List<Aluno> matriculasAlunos = new ArrayList<Aluno>();
	
	void matriculaAlunos(Aluno novoaluno) {
		this.matriculasAlunos.add(novoaluno);
	}
}
