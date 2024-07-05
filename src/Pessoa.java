public class Pessoa {
    private String nome;
    private Telesena[] telesenas;
    private double premiacao = 0.0;

    public Pessoa(String nome) {
        this.nome = nome;
        this.telesenas = new Telesena[25];
    }

    public Pessoa(String nome, Telesena[] telesenas, double premiacao) {
        this.nome = nome;
        this.telesenas = telesenas;
        this.premiacao = premiacao;
    }

    public void comprarTelesena(Telesena telesena) {
        for (int i = 0; i < telesenas.length; i++) {
            if (telesenas[i] == null) {
                telesenas[i] = telesena;
                break;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telesena[] getTelesenas() {
        return telesenas;
    }

    public void setTelesenas(Telesena[] telesenas) {
        this.telesenas = telesenas;
    }

    public double getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(double premiacao) {
        this.premiacao = premiacao;
    }
}
