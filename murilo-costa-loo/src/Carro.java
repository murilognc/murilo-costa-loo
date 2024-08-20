public class Carro {
    // Atributos (propriedades) da classe Carro
    private String marca;
    private String modelo;
    private int ano;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Construtor da classe Carro
    public Carro(String modelo, int ano) {
        String modeloString = " feita com o Construtor personalizado";
        this.modelo = modelo + modeloString;
        this.ano = ano;
    }

    // Métodos getter para acessar os atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Métodos setter para modificar os atributos
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano > 1885) { // Validação simples: o primeiro carro foi inventado em 1886
            this.ano = ano;
        }
    }

    // Método para exibir informações sobre o carro
    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}