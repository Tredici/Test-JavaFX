package sample;

import javafx.event.ActionEvent;
// per il "cambio scena"
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.text.Text;
import javafx.scene.Group;

import java.io.IOException;

public class Controller {
    public void btnPress(ActionEvent e) throws IOException {
        System.out.println("Boom!");

        /** Copiato [e rielaborato] senza alcuna vegogna da
         * https://stackoverflow.com/questions/37200845/how-to-switch-scenes-in-javafx
         */
        Scene scene = ((Node)e.getSource()).getScene();

        /** Copiato da:
         * https://www.tutorialspoint.com/javafx/javafx_text.htm
         */
        Text text = new Text();
        //Setting the text to be added.
        text.setText("Hello how are you");
        //setting the position of the text
        text.setX(50);
        text.setY(50);
        //Creating a Group object
        Group root = new Group(text);
        scene.setRoot(root);
    }
}
