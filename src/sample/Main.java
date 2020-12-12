package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Per info:
 * https://docs.oracle.com/javase/8/javafx/api/javafx/application/Application.html  (doc ufficiale)
 * https://www.tutorialspoint.com/javafx/javafx_application.htm                     (utile spiegazione)
 * http://tutorials.jenkov.com/javafx/stage.html#:~:text=%20JavaFX%20Stage%20%201%20Creating%20a%20Stage.,set%20a%20JavaFX%20Scene%20object%20on...%20More%20
 *  (tutorial generale, anche con una minima introduzione alla gestione degli eventi)
 *
 */
public class Main extends Application {

    private int width = 300, height = 275;

    /*** Funzione che inizializza il tutto
     *  viene chiamata all'avvio dell'applicazione
     *
     *  Opzionale, può non essere implementato
     */
    @Override
    public  void init() throws Exception {
        System.out.println("Inizializzando...");
    }

    /** Unico metodo da implementare obbligatoriamente
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");

        /** Esempi di gestione eventi vari
         * vedere il tutorial sopra
         *
         * NON hanno a che fare con il "bottone minimizza"
         */
        primaryStage.setOnHidden((event) -> {
            System.out.println("Finestra nascosta");
        });
        // con le lambda con 1 arg. le parentesi non sono obbligatorie intorno all'arg
        primaryStage.setOnShown(event -> {
            /**
             * Invocato prima che la finestra sia resa visibile (si chiama show su essa)
             */
            System.out.println("Finestra mostrata");
        });

        // Mostra la scena principale
        showDefaultScene(primaryStage);
    }

    public void showDefaultScene(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setScene(new Scene(root, this.width, this.height));
        stage.show();
    }
    public void showOtherScene(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample-2.fxml"));
        stage.setScene(new Scene(root, this.width, this.height));
        stage.show();
    }


    /** Invocato alla chiusura
     * di default invocherebbe super.stop() e basta
     */
    @Override
    public void stop() throws Exception {
        System.out.println("Stopping... (freeing resources)");

        super.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
