package Telas;

import Classes.Restaurante;
import Componentes.Botao;
import Componentes.Janela;
import Componentes.Text;

public class Restaurantes {
   public Janela restaurantes = new Janela("Aplicativo", "src/Images/restaurantes.png");
   Restaurante restaurante =new Restaurante("");
   Text t = new Text();

    public Restaurantes() {
        restaurantes.setVisible(false);
        Botao bFazerPedido = new Botao("Botao", 200, 50, 100,350);
        restaurantes.add(bFazerPedido);
        restaurantes.add(t);
        System.out.println(restaurante.mostrarRestaurantes());

    }



}
