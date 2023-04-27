package aplicativo;
import navegador.Navegador;
import reprodutorMusical.ReprodutorMusical;
import telefone.Telefone;

public class Aplicativo implements ReprodutorMusical, Telefone, Navegador{
    @Override
    public void tocar(){
        System.out.println("Aplicativo tocando uma música");
    }

    @Override
    public void pausar(){
        System.out.println("Aplicativo pausando a música.");
    }

    @Override
    public void selecionarMusica(){
        System.out.println("Aplicativo selecionando uma música.");
    }

    @Override
    public void ligar(){
        System.out.println("Aplicativo está realizando uma ligação.");
    }

    @Override
    public void atender(){
        System.out.println("Aplicativo atendeu uma chamada");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Aplicativo iniciou o correio de voz.");
    }

    @Override
    public void exibirPagina(){
        System.out.println("Aplicativo está exibindo uma página.");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Aplicativo adicionou uma nova aba.");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Aplicativo atualizou a página.");
    }
}
