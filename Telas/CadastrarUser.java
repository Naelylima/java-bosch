package Telas;

import Componentes.Botao;
import Componentes.Janela;

public class CadastrarUser {
    public Janela user = new Janela("Aplicativo", "src/Images/user.png");

    public CadastrarUser() {
        user.setVisible(false);
        Botao bFazerPedido = new Botao("Botao", 200, 50, 100,350);
        user.add(bFazerPedido);
    }
}
