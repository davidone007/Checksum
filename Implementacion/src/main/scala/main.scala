import model.Controller
import model.*

/**
 * Clase principal que sirve como punto de entrada de la aplicación.
 */
@main
def main(): Unit = {
  // Crea una instancia del controlador
  val controller = new Controller()


  /**
   * Función que inicia y controla la reproducción a través del controlador.
   *
   * @return Resultado de la reproducción
   */
  def play() = controller.play()

  // Inicia la reproducción a través del controlador y muestra el resultado
  println("--------------------------------------------------------------------------\n\n\n")
  println(play())
}