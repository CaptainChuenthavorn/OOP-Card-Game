/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjavafxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.ImagePattern;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MainController implements Initializable {

    @FXML
    private Button button1;
    @FXML
    private Rectangle rec;
    
    //Card card = new Card();
    Image backcard1 = new Image("/TestJavaFXML/backcard1.png",false); //java class then Image 
    Image backcard2 = new Image("/TestJavaFXML/backcard2.png",false); //java class then Image 
    Image backcard3 = new Image("/TestJavaFXML/backcard3.png",false); //java class then Image 
    Image backcard4 = new Image("/TestJavaFXML/backcard4.png",false); //java class then Image 
    Image club2 = new Image("/TestJavaFXML/club_2.png",false); //java class then Image 
    Image tenp = new Image("/TestJavaFXML/assetCard/10_1.jpg");
    private double newY,newX = 0;
    //rec.setFill(new ImagePattern(img));
    @FXML
    private Rectangle rec1;
    @FXML
    private Rectangle rec2;
    @FXML
    private Rectangle rec3;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        rec.setFill(new ImagePattern(tenp));
        // rec.setFill(new ImagePattern(backcard1));
        rec1.setFill(new ImagePattern(backcard2));
        rec2.setFill(new ImagePattern(backcard3));
        rec3.setFill(new ImagePattern(backcard4));
        
        /*System.out.println(card.isSelected());
        card.select();
        System.out.println(card.isSelected());
        card.select();
        System.out.println(card.isSelected());*/
        
        
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        /*if(event.getSource() == button1 && card.isSelected()) {
            System.out.println("You have clicked the button.");
            //move method
            newY = rec.getY()+280+newY;
            newX = rec.getX()+300+newX;
            rec.setTranslateX(newX);
            rec.setTranslateY(newY);
            card.select();
            
        }*/
    } 

    @FXML
    private void handleMouseClick(MouseEvent event) {
        /*if(event.getSource() == rec) {
            card.select();
            System.out.println("Rec1 : " + card.isSelected());
            if(card.isSelected())
            {
                rec.setFill(new ImagePattern(club2));
                rec.setStrokeWidth(3);
                rec.setStroke(Color.LIGHTBLUE);
            }
            else{
                rec.setFill(new ImagePattern(backcard1));
                rec.setStrokeWidth(0);
                rec.setStroke(Color.BLACK);     
            }
        }*/
        
        
        
        
        
        
        
        
        /*if(event.getSource() == rec1) {
            /*card.select();
            if(card.isSelected())
            {
                //rec1.setFill(new ImagePattern(club2));
                rec1.setStrokeWidth(3);
                rec1.setStroke(Color.LIGHTBLUE);
            }
            else{
                rec1.setFill(new ImagePattern(backcard2));
                rec1.setStrokeWidth(0);
                rec1.setStroke(Color.BLACK);     
            }
        }*/
        
    
    }

    @FXML
    private void handleMouseDragged(MouseEvent event) {
        System.out.println(event.getX());
        System.out.println(event.getY());
        rec1.setX(event.getX());
        rec1.setY(event.getY());
        
    }
}
