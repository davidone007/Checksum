package model

/**
 * Clase que representa el controlador principal de la aplicación.
 */
class Controller(){

    // Tamaño de los bloques para los experimentos
    val blockSize = 8

    // Módulo utilizado en los cálculos
    val M = 1111113

    /*
    val M = 11113
    val blockSize = 5

    val M = 1111113
    val blockSize = 8
    */

    /*Prueba para conocer la cantidad de pruebas que tiene cada categoría
    val experiment = readFromTxt()

    val cantidad = experiment.map { ex =>
      ex.getList().length
    }

    s"Toy: ${cantidad.head}\n" +
      s"Pequena: ${cantidad.tail.head}\n" +
      s"Mediana: ${cantidad.tail.tail.head}\n" +
      s"Grande: ${cantidad.tail.tail.tail.head}\n-------------------------------------"*/


    /**
     * Función principal que coordina la ejecución de la aplicación.
     *
     * @return Resultado de la ejecución en formato de cadena.
     */
    def play(): String =
        val input = new Input() // Se declara el Input del sistema
        val data = runExperiments(readFromTxt(input))
        //saveToTxt(input, data)
        showResults(data)

    /**
     * Lee datos desde archivos de texto y crea instancias de experimentos.
     *
     * @param input Instancia de la clase Input que maneja la lectura de datos.
     * @return Lista de objetos DataExperiment correspondientes a diferentes categorías.
     */
    def readFromTxt(input: Input): List[DataExperiment] =
        // Se crea un DataExperiment según las categorías del problema
        List(new ToyExperiment(input.readFromTxtToy()),
            new PequenaExperiment(input.readFromTxtPequena()),
            new MedianaExperiment(input.readFromTxtMediana()),
            new GrandeExperiment(input.readFromTxtGrande()))

    /**
     * Ejecuta los experimentos y devuelve una lista de resultados.
     *
     * @param data Lista de objetos DataExperiment.
     * @return Lista de listas de tiempos de ejecución para cada experimento.
     */
    def runExperiments(data: List[DataExperiment]): List[List[String]] =
        // Se declaran los dos checksum únicos del sistema
        val checkSumSingle = new SingleCheckSum("Single", M)
        val checkSumDual = new DualCheckSum("Dual", M)

        // Cálculo del tiempo promedio usando el checkSumSingle
        val timeSingle = data.map { experiment =>
            experiment.runExperiment(blockSize, checkSumSingle).toString
        }
        // Cálculo del tiempo promedio usando el checkSumDual
        val timeDual = data.map { experiment =>
            experiment.runExperiment(blockSize, checkSumDual).toString
        }
        List(timeSingle, timeDual) // Se retorna una lista con los tiempos de Single y Dual

    /**
     * Guarda los resultados en archivos de texto.
     *
     * @param input Instancia de la clase Input que maneja la escritura de datos.
     * @param list Lista de listas de tiempos de ejecución.
     * @return Verdadero si la operación se realizó con éxito.
     */
    def saveToTxt(input: Input, list: List[List[String]]): Boolean =
        val single = list.head.mkString("; ") + "; \n"
        val dual = list.tail.head.mkString("; ") + "; \n"
        input.saveToTxtSingle(single)
        input.saveToTxtDual(dual)
        true

    /**
     * Muestra los resultados formateados en una cadena.
     *
     * @param l Lista de listas de tiempos de ejecución.
     * @return Cadena con los resultados formateados.
     */
    def showResults(l: List[List[String]]): String =
        val single = l.head
        val dual = l.tail.head

        "\n-------------------------------------\nRESULTADOS: \n-------------------------------------\n" +
            "Single\n-------------------------------------\n" +
            s"Toy: ${single.head}\n" +
            s"Pequena: ${single.tail.head}\n" +
            s"Mediana: ${single.tail.tail.head}\n" +
            s"Grande: ${single.tail.tail.tail.head}\n-------------------------------------\n" +
            "Dual\n-------------------------------------\n" +
            s"Toy: ${dual.head}\n" +
            s"Pequena: ${dual.tail.head}\n" +
            s"Mediana: ${dual.tail.tail.head}\n" +
            s"Grande: ${dual.tail.tail.tail.head}\n-------------------------------------"
}
