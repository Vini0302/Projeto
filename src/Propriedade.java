public class Propriedade {
    boolean disponibilidade;
    String titulo;
    String descricao;
    int capacidade;
    double precoPorNoite;
    Usuario proprietario;
    String localizacao;

    public Propriedade (boolean disponibilidade,String titulo,String descricao,int capacidade,double precoPorNoite,Usuario proprietario,String localizacao) {
        this.disponibilidade = disponibilidade;
        this.titulo = titulo;
        this.descricao = descricao;
        this.capacidade = capacidade;
        this.precoPorNoite = precoPorNoite;
        this.proprietario = proprietario;
        this.localizacao = localizacao;
    }
    public void imprimirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Localização: " + localizacao);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Preço por noite: " + precoPorNoite);
        System.out.println("Proprietario: " + proprietario);
        System.out.println("Disponibilidade: " + disponibilidade);
    }
    public void verificarDisponibilidade () {
        if (disponibilidade) {
            System.out.println("Propriedade disponível");
        } else {
            System.out.println("Propriedade indisponível");
        }
    }
}
