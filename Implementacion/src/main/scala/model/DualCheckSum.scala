package model

/**
 * Clase que implementa la interfaz ICheckSum para calcular el DualCheckSum de un solo bloque de datos.
 *
 * @param name Nombre del checksum dual.
 * @param M Módulo utilizado en los cálculos.
 */
class DualCheckSum(name: String, M: Int) extends ICheckSum {

  /**
   * Calcula el checksum dual para una lista de bloques de datos.
   *
   * @param data Lista de bloques de datos representados como enteros.
   * @return Resultado del checksum dual en formato de cadena.
   */
  override def checkSum(data: List[Int]): String =
    val (sumA, sumB) = data.foldLeft((0, 0)) {
      case ((sumA, sumB), block) =>
        val newSumA = (sumA + block) % M
        val newSumB = (sumB + newSumA) % M
        (newSumA, newSumB)
    }
    sumA.toString + sumB.toString
}
