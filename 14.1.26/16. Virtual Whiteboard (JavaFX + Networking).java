import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Whiteboard extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        canvas.setOnMouseDragged(e -> gc.fillOval(e.getX(), e.getY(), 4, 4));
        stage.setScene(new Scene(new StackPane(canvas), 400, 400));
        stage.setTitle("Virtual Whiteboard");
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
