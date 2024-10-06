public class Produto {

    private String codigo;
    private String nome;
    private String tam_peso;
    private String cor;
    private double valor;
    private int estoque;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTam_peso() {
        return tam_peso;
    }
    public void setTam_peso(String tam_peso) {
        this.tam_peso = tam_peso;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void mostrar_produtos (){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Tamanho/peso: " + tam_peso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade em estoque: " + estoque);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", tam_peso='" + tam_peso + '\'' +
                ", cor='" + cor + '\'' +
                ", valor=" + valor + '\'' +
                ", estoque=" + estoque +
                '}';
    }
}
