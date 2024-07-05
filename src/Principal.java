public class Principal {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[20];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa("Pessoa " + (i + 1));
        }

        ControleTelesena controle = new ControleTelesena(pessoas);

        for (Pessoa pessoa : pessoas) {
            int quantidadeCompras = Gerador.gerarNumero(1, 15);

            for (int i = 0; i < quantidadeCompras; i++) {
                controle.venderTelesena(pessoa);
            }

            System.out.println(pessoa.getNome() + " comprou " + quantidadeCompras + " telesenas.");
        }

        System.out.println("Quantidade de telesenas vendidas: " + controle.getQuantidadeTelesenasVendidas());
        System.out.println("Valor total das telesenas vendidas: " + controle.getTotal());
    }
}