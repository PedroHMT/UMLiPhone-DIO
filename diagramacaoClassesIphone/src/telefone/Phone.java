package telefone;

public class Phone implements Telefone{
    public void ligar(){
        System.out.println("Phone está realizando uma ligação.");
    }

    public void atender(){
        System.out.println("Phone atendeu uma chamada");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Phone iniciou o correio de voz.");
    }
}
