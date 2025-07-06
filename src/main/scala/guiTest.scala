import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import java.io.File

class GuiTestApp extends Application {
  override def start(primaryStage: Stage): Unit = {
    try {
      val fxmlFile = new File("src/main/scala/MainApp.fxml")
      val loader = new FXMLLoader(fxmlFile.toURI.toURL)
      val root = loader.load()
      val scene = new Scene(root)

      primaryStage.setTitle("Global Development Indicator Analyzer - GUI Test")
      primaryStage.setScene(scene)
      primaryStage.setResizable(false)
      primaryStage.show()

      println("GUI loaded successfully!")
    } catch {
      case e: Exception =>
        e.printStackTrace()
        println(s"Error loading FXML: ${e.getMessage}")
    }
  }
}

object GuiTest {
  def main(args: Array[String]): Unit = {
    // Set JavaFX system properties to suppress warnings
    System.setProperty("javafx.preloader", "")
    System.setProperty("prism.verbose", "false")

    println("Starting GUI Test...")
    Application.launch(classOf[GuiTestApp], args: _*)
  }
}