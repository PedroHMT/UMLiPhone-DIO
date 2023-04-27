package navegador;

public class Safari implements Navegador {
    public void exibirPagina(){
        System.out.println("Safari está exibindo uma página.");
    }

    public void adicionarNovaAba(){
        System.out.println("Safari adicionou uma nova aba.");
    }

    public void atualizarPagina(){
        System.out.println("Safari atualizou a página.");
    }

}
