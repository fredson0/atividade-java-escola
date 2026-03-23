import java.util.ArrayList;
import java.util.List;

public class SistemaEscolar {
    public static void main(String[] args) {
        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(new Aluno("Marcos Silva", 8.5, 7.0, 9.0));
        listaAlunos.add(new Aluno("Julia Costa", 4.0, 5.5, 6.0));
        listaAlunos.add(new Aluno("Ricardo Oliveira", 3.0, 2.5, 4.0));

        System.out.println("----- RELATÓRIO ESCOLAR -----");
        for (Aluno aluno : listaAlunos) {
            System.out.printf("Nome: %s | Média: %.2f | Status: %s%n", 
                aluno.getNome(), aluno.calcularMedia(), aluno.retornarSituacao());
        }
    }
}