public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Execução Construtor padrão");
        // Criação do objeto carroUno, sendo do tipo Carro
        Carro carroUno = new Carro("Fiat", "Uno", 2020);

        carroUno.exibirInfo();  
        
        //Mudança do valor do atributo marca
        carroUno.setMarca("Chevrolet");

        carroUno.exibirInfo();

        System.out.println("Execução Construtor personalizado");
        // Criação do objeto variavelCarro sendo do tipo Carro, porém sem definir a marca
        Carro variavelCarro = new Carro("Gol", 2024);

        // Como a marca não foi definida, ao exibir as informações, seu valor é null
        variavelCarro.exibirInfo();

        variavelCarro.setMarca("BYD");

        // Agora o valor não será mais null
        variavelCarro.exibirInfo();
        

        //Agora vamos pegar a informação do carroUno e setar o valor de variavelCarro com a informação
        System.out.println("Atribuir o valor de um objeto a outro");

        String marcaUno = carroUno.getMarca();
        String modeloUno = carroUno.getModelo();

        variavelCarro.setMarca(marcaUno);
        variavelCarro.setModelo(modeloUno);

        variavelCarro.exibirInfo();

        //Podemos também criar um objeto utilizando as informações de outro objeto
        System.out.println("Criar objeto com o valor direto de outro objeto");

        Carro carroChevrolet = new Carro(carroUno.getMarca(), "Strada", 2024);

        carroChevrolet.exibirInfo();
    }
}
