/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.modelo.Computador;
import com.mycompany.modelo.Mouse_new;
import com.mycompany.modelo.VideoGame;
import com.mycompany.visao.VideoGame.VisaoComputador;
import com.mycompany.visao.VideoGame.VisaoMenu;
import com.mycompany.visao.VideoGame.VisaoVideoGame;
import java.util.ArrayList;

/**
 *
 * @author rosa.3950
 */
public class ControleSistema {
    public static ArrayList<Object> produtos = new ArrayList<>();
    
    public static void cadastrar(){
       
        int opcaoProduto = VisaoMenu.menuEscolhaProduto();
       
        if(opcaoProduto== 1){
            produtos.add( VisaoVideoGame.menuCadastroVideogame());
        }else if(opcaoProduto == 2){
            produtos.add(VisaoComputador.menuCadastroComputador());
        }else if (opcaoProduto == 3){
        }    
        }
    public static void alterar(int indiceProduto){
        indiceProduto = indiceProduto - 1;
          
        Object object = produtos.get(indiceProduto);
          
        if(object instanceof VideoGame){
            VideoGame videoGame = new VideoGame();
            videoGame = (VideoGame) object;
             
            System.out.println("Alterando o produto: " + videoGame.toString());
            
           videoGame = (VideoGame) VisaoMenu.menuAlteracaoProdutoInformacoes(videoGame);
           ControleSistema.produtos.set(indiceProduto, videoGame);
        }else if (object instanceof Computador){
        Computador computador = new Computador();
        computador = (Computador) object;
        
            System.out.println("ALterando Produto: " + computador.toString());
        
            computador = (Computador) VisaoMenu.menuAlteracaoProdutoInformacoes(computador);
            ControleSistema.produtos.set(indiceProduto, computador);
        
        }
        else if(object instanceof Mouse_new){
            Mouse_new mouse = new Mouse_new();
            mouse = (Mouse_new) object;
            System.out.println("Alterando Produto: " + mouse.toString());
            mouse = (Mouse_new)  VisaoMenu.menuAlteracaoProdutoInformacoes(mouse);
            ControleSistema.produtos.set(indiceProduto, mouse);
            
            
           
    }
            
        }
}
          
