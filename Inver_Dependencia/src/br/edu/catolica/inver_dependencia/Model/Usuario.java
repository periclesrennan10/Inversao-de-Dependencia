package br.edu.catolica.inver_dependencia.Model;
import br.edu.catolica.inver_dependencia.Interface.IMensagem;

public class Usuario {

    private IMensagem mensagem;

    public Usuario(){}

    public void setMensagem(IMensagem mensagem){
        this.mensagem = mensagem;
    }

    public void enviarMensagem(){
        this.mensagem.enviarMensagem();
    }
}
