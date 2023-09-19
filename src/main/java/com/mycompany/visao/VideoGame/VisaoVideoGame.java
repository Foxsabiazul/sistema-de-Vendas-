/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao.VideoGame;

import com.mycompany.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author rosa.3950
 */
public class VisaoVideoGame  {
    public static VideoGame menuCadastroVideogame(){
        VideoGame videoGame = new VideoGame();
        
        System.out.println("Nome:" );
        videoGame.setNome(new Scanner( System.in).nextLine());
        System.out.println("Preço: ");
        videoGame.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("Plataforma: ");
        videoGame.setPlataforma(new Scanner(System.in).nextLine());
        System.out.println("================================================");
        
        return videoGame;
    }
    
}
