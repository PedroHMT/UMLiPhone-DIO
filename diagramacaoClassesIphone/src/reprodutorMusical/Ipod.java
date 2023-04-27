package reprodutorMusical;

public class Ipod implements ReprodutorMusical{
    public void tocar(){
        System.out.println("iPod tocando uma música");
    }

    public void pausar(){
        System.out.println("iPod pausando a música.");
    }

    public void selecionarMusica(){
        System.out.println("iPod selecionando uma música.");
    }
}
