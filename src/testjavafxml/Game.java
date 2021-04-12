package testjavafxml;

import java.util.Stack;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Game {
    
    Stack<Card> deck = new Stack<Card>();   
    
    public Game() {
        loadCard();
       
    }

    private void loadCard() {
        deck.clear();
        for(int i = 1;i<=13;i++){
            for(int j =1;j<=4;j++){
                double tempI = i+(j/10.0);
                String tempS = "/TestJavaFXML/assetCard/"+i+"_"+j+".jpg";
                //  Image tenp = new Image("/TestJavaFXML/assetCard/10_1.jpg");
                System.out.println(tempS+" , "+tempI);
                deck.push(new Card(tempS,tempI));
                
            }
        } 
        System.out.println(deck);
        //System.out.println(deck.get(0).getValue());
    }

    void handleMouseCliked(MouseEvent t) {
        
    }

}
