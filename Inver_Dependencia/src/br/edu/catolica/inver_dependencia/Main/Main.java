package br.edu.catolica.inver_dependencia.Main;
import br.edu.catolica.inver_dependencia.Interface.IMensagem;
import br.edu.catolica.inver_dependencia.Model.*;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setMensagem(new WhatsApp());

        usuario.enviarMensagem();

        usuario.setMensagem(new Instagram());
        usuario.enviarMensagem();
    }
}