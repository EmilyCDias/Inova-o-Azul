public class Praia {
    private String nome;
    private boolean suja;

    public Praia(String nome) {
        this.nome = nome;
        this.suja = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isSuja() {
        return suja;
    }

    public void setSuja(boolean suja) {
        this.suja = suja;
    }
}
