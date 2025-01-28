package model

/** Clase que implementa la interfaz ICheckSum para calcular el checkSum de un solo bloque de datos.
 *
 *  @param name Nombre del bloque de datos.
 *  @param M Valor M utilizado en el cálculo de la suma de verificación.
 */
class SingleCheckSum(name: String, M: Int) extends ICheckSum {

    /** Calcula la suma de verificación para un solo bloque de datos.
     *
     *  @param data Lista de enteros que representa el bloque de datos.
     *  @return La suma de verificación como una cadena de texto.
     */
    override def checkSum(data: List[Int]): String =
        data.foldLeft(0)((sum, block) => (sum + block) % M).toString
}
