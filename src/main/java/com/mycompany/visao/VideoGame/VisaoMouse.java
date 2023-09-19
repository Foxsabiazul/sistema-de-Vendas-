/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao.VideoGame;

import com.mycompany.modelo.Mouse_new;
import java.util.Scanner;

/**
 *
 * @author rosa.3950
 */
public class VisaoMouse {
    public static Mouse_new MenuCadastroMouse(){
        Mouse_new  mouse = new Mouse_new();
        System.out.println("Nome do Mouse: ");
        mouse.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço do Mouse: ");
        mouse.setPreco(new Scanner (System.in).nextDouble());
        System.out.println("==============================================");
        
        return mouse;
    }
            
}
