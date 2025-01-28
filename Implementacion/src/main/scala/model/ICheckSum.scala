package model

/**
 * Trait que define la interfaz para cálculos de checksum.
 */
trait ICheckSum {

  /**
   * Calcula el checksum para una lista de bloques de datos.
   *
   * @param data Lista de bloques de datos representados como enteros.
   * @return Resultado del checksum en formato de cadena.
   */
  def checkSum(data: List[Int]): String

  /**
   * Calcula el checksum para una cadena de datos dividida en bloques.
   *
   * @param s Cadena de datos.
   * @param blockSize Tamaño de los bloques para el cálculo del checksum.
   * @return Resultado del checksum en formato de cadena.
   */
  def calculateChecksum(s: String, blockSize: Int): String =
    checkSum(stringToAsciiList(s, blockSize))

  /**
   * Convierte una cadena de texto en una lista de valores ASCII, divididos en bloques.
   *
   * @param s Cadena de texto.
   * @param blockSize Tamaño de los bloques para la conversión.
   * @return Lista de valores ASCII representando los bloques de datos.
   */
  def stringToAsciiList(s: String, blockSize: Int): List[Int] = {
    s.grouped(blockSize).flatMap(block => block.map(_.toInt)).toList
  }
}
