public class Drone extends Usuario {

    public Drone(String nome, String email) {
        super(nome, email);
    }

    public Relatorio monitorar(Praia praia, String descricao) {
        praia.setSuja(true);
        return new Relatorio(praia, descricao, this);
    }
}
