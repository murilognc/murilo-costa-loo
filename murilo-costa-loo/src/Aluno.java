public class Aluno {
    // Atributo da classe Aluno
    private String nome;

    // Construtor para inicializar o nome do aluno
    public Aluno(String nome) {
        this.nome = nome;
    }

    // Método getter para acessar o nome do aluno
    public String getNome() {
        return nome;
    }

    // Método setter para modificar o nome do aluno, se necessário
    public void setNome(String nome) {
        this.nome = nome;
    }
}
