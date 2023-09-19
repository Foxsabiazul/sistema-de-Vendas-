/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao.VideoGame;
import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author rosa.3950
 */
public class VisaoMenu {
    public static int menuPrincipal(){
       
        System.out.println("==========SISTEMA DE VENDAS 2.0==========");
        System.out.println("Cadastrar produto");
        System.out.println("Alterar produto");
        System.out.println("Remover produto");
        System.out.println("LIstar produto");
        System.out.println("===========================================");
        int opcaoMenu = new Scanner(System.in).nextInt();
        
        return opcaoMenu;
    }
    
    public static int menuEscolhaProduto(){
        System.out.println("==========CADASTRAR PRODUTO==========");
        System.out.println("Qual categoria de produtos deseja cadastrar?");
        System.out.println("1 - Video Game");
        System.out.println("2 - Computador");
        System.out.println("=============================================");
        int opcaoProduto = new Scanner(System.in).nextInt();
        
        return opcaoProduto;
    }
    public static int menuAlteracaoProduto(){
        System.out.println("================ALTERAR PRODUTO===============");
        System.out.println("Qual produto deseja alterar?");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + "|" + ControleSistema.produtos.get( i));
        }
        System.out.println("===================================================");
        int produtoAlterar = new Scanner(System.in).nextInt();
        
        return produtoAlterar; 
    }
    
    public static Object menuAlteracaoProdutoInformacoes(Object object){
        if(object instanceof VideoGame){
            System.out.println("Novo nome: ");
            ((VideoGame) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((VideoGame) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Novo plataforma: ");
            ((VideoGame) object).setNome(new Scanner(System.in).nextLine());
        }else if(object instanceof Computador){
            System.out.println("Novo nome: ");
              System.out.println("Novo preço: ");
            ((Computador) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Nova quantidade de memória Ram: ");
            ((Computador) object).setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Novo processador: ");
            ((Computador) object).setProcessador(new Scanner(System.in).nextLine());
        }     
        return object;
        
    }
}

