public class Principal3 {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 2000.0);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());
    }
}

