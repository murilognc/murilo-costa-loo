public class Turma {
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Turma(int tamanhoMaximo) {
        alunos = new Aluno[tamanhoMaximo];
        quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } else {
            System.out.println("A turma já está cheia.");
        }
    }

    public void removerAluno(int indice) {
        if (indice >= 0 && indice < quantidadeAlunos) {
            for (int i = indice; i < quantidadeAlunos - 1; i++) {
                alunos[i] = alunos[i + 1];
            }
            alunos[quantidadeAlunos - 1] = null; // Opcional: Limpa o último elemento
            quantidadeAlunos--;
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarAlunos() {
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println(alunos[i].getNome());
        }
    }
}
