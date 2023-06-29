package Telas;

import Classes.Restaurante;
import Componentes.Botao;
import Componentes.Janela;


import java.util.ArrayList;

public class CadastrarRestaurantes {
    Restaurante restaurante = new Restaurante("");
    Restaurantes restaurantes = new Restaurantes();
    public Janela cadastrarRestaurantes = new Janela("Cadastro Restaurantes", "src/Images/cadastroRestaurantes.png");

    public CadastrarRestaurantes() {
        cadastrarRestaurantes.setVisible(false);
        restaurante.cadastrarRestaurante(new Restaurante("restaurante"));
        restaurante.cadastrarRestaurante(new Restaurante("restaurante2"));
        restaurante.cadastrarRestaurante(new Restaurante("restaurante"));


//        Botões
//        Botao bAdicionarLanche = new Botao("Botao", 150, 30, 125,460);
//        cadastrarRestaurantes.add(bAdicionarLanche);
//
       Botao bFinalizarPedido = new Botao("Botao", 230, 52, 100,570);
       bFinalizarPedido.addActionListener(e -> restaurantes.restaurantes.setVisible(true));
       cadastrarRestaurantes.add(bFinalizarPedido);

    }
//    public void cadastrar(Classes.Restaurante restaurante){
//        restaurantes.add(restaurante);
//        System.out.println(restaurantes);
//    }
}
