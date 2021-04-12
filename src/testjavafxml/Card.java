/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testjavafxml;

import java.util.Stack;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Card {
    Image backside = new Image("/TestJavaFXML/backcard3.png"); //java class then Image 
    Image cardface = new Image("/TestJavaFXML/club_2.png");//java class then Image 
    private String cardFacePath = "";
    private boolean revealed = false;
    private boolean selected = false;
    double value = 0;
    @FXML
    private Rectangle body = new Rectangle();
    
    public Card(String cardFacePath,double value) {
        body.setWidth(130);
        body.setHeight(170);
        body.setLayoutX(10);
        body.setLayoutY(10);
        this.cardFacePath = cardFacePath;//AceOfSpade   == 1.4
        this.body.setFill(new ImagePattern(new Image(cardFacePath)));
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" + "value=" + value + '}';
    }
    
    
    
    
    
    /*temp for loop loader Path
    for(int i = 1;i<=13;i++){
        for(int j =1;j<=4;j++){
            deck.add(new Card(i+"_"+j,i+(j/10.0)));
        }
    } */
    public double getValue(){
        return this.value;
    }

    public String getCardFacePath() {
        return cardFacePath;
    }

    public Rectangle getBody() {
        return body;
    }


    public boolean reveal(){
        if(this.revealed==true)
            return false;
        revealed = true;
        body.setFill(new ImagePattern(cardface));
        return revealed;
    }
    
    public boolean unReveal(){
        if(this.revealed==false)
            return false;
        revealed = false;  
        body.setFill(new ImagePattern(backside));
        return revealed;
        
    }
    
    
    public boolean isRevealed(){
        return revealed;
    }
    
    public void select(){
        selected = !selected;
        
    }
    public boolean isSelected() {
    return selected;
    }
            
}
