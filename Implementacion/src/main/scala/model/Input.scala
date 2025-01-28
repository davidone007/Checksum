package model
import java.io._
import scala.io.Source

/** Clase para manejar operaciones de lectura y escritura de archivos. */
class Input {

  // Nombres de los archivos de entrada
  val filenameToy = "src/main/resources/dataToy.txt"
  val filenamePequena = "src/main/resources/dataPequena.txt"
  val filenameMediana = "src/main/resources/dataMediana.txt"
  val filenameGrande = "src/main/resources/dataGrande.txt"

  // Nombres de los archivos de salida
  val filenameResultadosSingle = "src/main/resources/resultadosSingle.txt"
  val filenameResultadosDual = "src/main/resources/resultadosDual.txt"

  /** Guarda el contenido en el archivo de resultados individuales.
   *  @param contenido El texto a guardar en el archivo.
   */
  def saveToTxtSingle(contenido: String): Unit = {
    val writer = new PrintWriter(new BufferedWriter(new FileWriter(filenameResultadosSingle, true)))
    try {
      writer.write(contenido)
    } catch {
      case e: Exception => println(s"Error al escribir en el archivo de resultados individuales: ${e.getMessage}")
    } finally {
      writer.close()
    }
  }

  /** Guarda el contenido en el archivo de resultados duales.
   *  @param contenido El texto a guardar en el archivo.
   */
  def saveToTxtDual(contenido: String): Unit = {
    val writer = new PrintWriter(new BufferedWriter(new FileWriter(filenameResultadosDual, true)))
    try {
      writer.write(contenido)
    } catch {
      case e: Exception => println(s"Error al escribir en el archivo de resultados duales: ${e.getMessage}")
    } finally {
      writer.close()
    }
  }

  /** Lee el contenido del archivo 'dataToy.txt' y lo devuelve como una lista de líneas.
   *  @return Lista de líneas del archivo 'dataToy.txt' o lista vacía si hay un error.
   */
  def readFromTxtToy(): List[String] = {
    try {
      Source.fromFile(filenameToy).getLines().toList
    } catch {
      case e: Exception =>
        println(s"Error al leer el archivo 'dataToy.txt': ${e.getMessage}")
        Nil
    }
  }

  /** Lee el contenido del archivo 'dataPequena.txt' y lo devuelve como una lista de líneas.
   *  @return Lista de líneas del archivo 'dataPequena.txt' o lista vacía si hay un error.
   */
  def readFromTxtPequena(): List[String] = {
    try {
      Source.fromFile(filenamePequena).getLines().toList
    } catch {
      case e: Exception =>
        println(s"Error al leer el archivo 'dataPequena.txt': ${e.getMessage}")
        Nil
    }
  }

  /** Lee el contenido del archivo 'dataMediana.txt' y lo devuelve como una lista de líneas.
   *  @return Lista de líneas del archivo 'dataMediana.txt' o lista vacía si hay un error.
   */
  def readFromTxtMediana(): List[String] = {
    try {
      Source.fromFile(filenameMediana).getLines().toList
    } catch {
      case e: Exception =>
        println(s"Error al leer el archivo 'dataMediana.txt': ${e.getMessage}")
        Nil
    }
  }

  /** Lee el contenido del archivo 'dataGrande.txt' y lo devuelve como una lista de líneas.
   *  @return Lista de líneas del archivo 'dataGrande.txt' o lista vacía si hay un error.
   */
  def readFromTxtGrande(): List[String] = {
    try {
      Source.fromFile(filenameGrande).getLines().toList
    } catch {
      case e: Exception =>
        println(s"Error al leer el archivo 'dataGrande.txt': ${e.getMessage}")
        Nil
    }
  }
}
