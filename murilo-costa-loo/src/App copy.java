public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 03!");
        Turma turmaLoo = new Turma(2);
        Aluno novoAluno = new Aluno("murilo");

        turmaLoo.adicionarAluno(novoAluno);
        turmaLoo.adicionarAluno(new Aluno("Testemilson"));

        turmaLoo.listarAlunos();
    }
}
