package model

/**
 * Clase abstracta que representa los DataExperiment.
 *
 * @param list Lista de cadenas que representan los datos del experimento.
 */
abstract class DataExperiment(list: List[String]) {

  /**
   * Ejecuta el DataExperiment y devuelve el tiempo promedio de ejecución, cada DataExperiment se corre 10 veces.
   *
   * @param blockSize Tamaño de los bloques para el experimento.
   * @param checkSum Instancia de ICheckSum para realizar los cálculos de checksum.
   * @return Tiempo promedio de ejecución del experimento en milisegundos.
   */
  def runExperiment(blockSize: Int, checkSum: ICheckSum): Double = {
    val times = list.map { experiment =>
      val start = System.nanoTime()
      checkSum.calculateChecksum(experiment, blockSize)
      val end = System.nanoTime()
      (end - start) / 1e6 // Tiempo en milisegundos, para segundos es 1e9
    }
    val averageTime = times.sum / times.length
    averageTime
  }

  /**
   * Obtiene la lista de cadenas que representan los datos del experimento.
   *
   * @return Lista de cadenas de datos del experimento.
   */
  def getList(): List[String] =
    this.list
}
