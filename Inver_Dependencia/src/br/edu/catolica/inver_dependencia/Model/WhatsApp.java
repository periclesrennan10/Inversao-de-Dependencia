package br.edu.catolica.inver_dependencia.Model;
import br.edu.catolica.inver_dependencia.Interface.IMensagem;
public class WhatsApp implements IMensagem{
    @Override
    public void enviarMensagem(){
        System.out.println("Mensagem enviada no Whats!");
    }

}
