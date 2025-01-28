import model.*
import org.scalatest.flatspec.*
import org.scalatest.matchers.should.Matchers

import scala.*

/**
 * This class contains unit tests for the calculateChecksum function of the SingleCheckSum class
 */
class TestChecksumSingle extends AnyFlatSpec with Matchers {


  val input = new Input
  val M = 100000000
  val BLOCKSIZE = 2
  val checkSum = new SingleCheckSum("CheckSum", M)

  //////////////////TOY DATA///////////////////////////

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  "SingleCheckSum" should "calculate the correct checksum for a given data string 1 (TOY)" in {


    val data = input.readFromTxtToy()

    val expectedCheckSum = "10841"
    val actualCheckSum = checkSum.calculateChecksum(data.head, BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 2 (TOY)" in {


    val data = input.readFromTxtToy()

    val expectedCheckSum = "10627"
    val actualCheckSum = checkSum.calculateChecksum(data(1), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 3 (TOY)" in {


    val data = input.readFromTxtToy()

    val expectedCheckSum = "10786"
    val actualCheckSum = checkSum.calculateChecksum(data(2), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 4 (TOY)" in {


    val data = input.readFromTxtToy()

    val expectedCheckSum = "11046"
    val actualCheckSum = checkSum.calculateChecksum(data(3), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 5 (TOY)" in {


    val data = input.readFromTxtToy()

    val expectedCheckSum = "10796"
    val actualCheckSum = checkSum.calculateChecksum(data(4), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 6 (TOY)" in {


    val data = input.readFromTxtToy()

    val expectedCheckSum = "10738"
    val actualCheckSum = checkSum.calculateChecksum(data(5), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 7 (TOY)" in {


    val data = input.readFromTxtToy()

    val expectedCheckSum = "10905"
    val actualCheckSum = checkSum.calculateChecksum(data(6), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 8 (TOY)" in {


    val data = input.readFromTxtToy()

    val expectedCheckSum = "10710"
    val actualCheckSum = checkSum.calculateChecksum(data(7), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 9 (TOY)" in {


    val data = input.readFromTxtToy()

    val expectedCheckSum = "10960"
    val actualCheckSum = checkSum.calculateChecksum(data(8), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 10 (TOY)" in {


    val data = input.readFromTxtToy()

    val expectedCheckSum = "10774"
    val actualCheckSum = checkSum.calculateChecksum(data(9), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }




  //////////////////PEQUEÑA DATA///////////////////////////

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  "SingleCheckSum" should "calculate the correct checksum for a given data string 1 (PEQUEÑA)" in {


    val data = input.readFromTxtPequena()

    val expectedCheckSum = "1094297"
    val actualCheckSum = checkSum.calculateChecksum(data.head, BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 2 (PEQUEÑA)" in {


    val data = input.readFromTxtPequena()

    val expectedCheckSum = "1093441"
    val actualCheckSum = checkSum.calculateChecksum(data(1), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 3 (PEQUEÑA)" in {

    val data = input.readFromTxtPequena()

    val expectedCheckSum = "1094561"
    val actualCheckSum = checkSum.calculateChecksum(data(2), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 4 (PEQUEÑA)" in {


    val data = input.readFromTxtPequena()

    val expectedCheckSum = "1094436"
    val actualCheckSum = checkSum.calculateChecksum(data(3), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 5 (PEQUEÑA)" in {


    val data = input.readFromTxtPequena()

    val expectedCheckSum = "1094750"
    val actualCheckSum = checkSum.calculateChecksum(data(4), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 6 (PEQUEÑA)" in {


    val data = input.readFromTxtPequena()

    val expectedCheckSum = "1096153"
    val actualCheckSum = checkSum.calculateChecksum(data(5), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 7 (PEQUEÑA)" in {


    val data = input.readFromTxtPequena()

    val expectedCheckSum = "1095237"
    val actualCheckSum = checkSum.calculateChecksum(data(6), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 8 (PEQUEÑA)" in {


    val data = input.readFromTxtPequena()

    val expectedCheckSum = "1094400"
    val actualCheckSum = checkSum.calculateChecksum(data(7), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 9 (PEQUEÑA)" in {


    val data = input.readFromTxtPequena()

    val expectedCheckSum = "1094749"
    val actualCheckSum = checkSum.calculateChecksum(data(8), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 10 (PEQUEÑA)" in {


    val data = input.readFromTxtPequena()

    val expectedCheckSum = "1095070"
    val actualCheckSum = checkSum.calculateChecksum(data(9), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }


  //////////////////MEDIANA DATA///////////////////////////


  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  "SingleCheckSum" should "calculate the correct checksum for a given data string 1 (MEDIANA)" in {


    val data = input.readFromTxtMediana()

    val expectedCheckSum = "10949513"
    val actualCheckSum = checkSum.calculateChecksum(data.head, BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 2 (MEDIANA)" in {


    val data = input.readFromTxtMediana()

    val expectedCheckSum = "10946379"
    val actualCheckSum = checkSum.calculateChecksum(data(1), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 3 (MEDIANA)" in {


    val data = input.readFromTxtMediana()

    val expectedCheckSum = "10950062"
    val actualCheckSum = checkSum.calculateChecksum(data(2), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 4 (MEDIANA)" in {


    val data = input.readFromTxtMediana()

    val expectedCheckSum = "10950060"
    val actualCheckSum = checkSum.calculateChecksum(data(3), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 5 (MEDIANA)" in {


    val data = input.readFromTxtMediana()

    val expectedCheckSum = "10950066"
    val actualCheckSum = checkSum.calculateChecksum(data(4), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 6 (MEDIANA)" in {


    val data = input.readFromTxtMediana()

    val expectedCheckSum = "10952072"
    val actualCheckSum = checkSum.calculateChecksum(data(5), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 7 (MEDIANA)" in {


    val data = input.readFromTxtMediana()

    val expectedCheckSum = "10953250"
    val actualCheckSum = checkSum.calculateChecksum(data(6), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 8 (MEDIANA)" in {


    val data = input.readFromTxtMediana()

    val expectedCheckSum = "10950847"
    val actualCheckSum = checkSum.calculateChecksum(data(7), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 9 (MEDIANA)" in {


    val data = input.readFromTxtMediana()

    val expectedCheckSum = "10949475"
    val actualCheckSum = checkSum.calculateChecksum(data(8), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
  it should "calculate the correct checksum for a given data string 10 (MEDIANA)" in {


    val data = input.readFromTxtMediana()

    val expectedCheckSum = "10950267"
    val actualCheckSum = checkSum.calculateChecksum(data(9), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

  //////////////////GRANDE DATA///////////////////////////

     /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
    "SingleCheckSum" should "calculate the correct checksum for a given data string 1 (GRANDE)" in {

      

      val data = input.readFromTxtGrande()

      val expectedCheckSum =  "9501067"
      val actualCheckSum = checkSum.calculateChecksum(data.head, BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }

 /**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 2 (GRANDE)" in {

    

    val data = input.readFromTxtGrande()

    val expectedCheckSum =  "9498034"
    val actualCheckSum = checkSum.calculateChecksum(data(1), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

 /**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 3 (GRANDE)" in {

  
    
  val data = input.readFromTxtGrande()
    
  val expectedCheckSum =  "9508633"
  val actualCheckSum = checkSum.calculateChecksum(data(2), BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 4 (GRANDE)" in {

  
    
 val data = input.readFromTxtGrande()
    
  val expectedCheckSum =  "9501065"
  val actualCheckSum = checkSum.calculateChecksum(data(3), BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 5 (GRANDE)" in {

  
    
  val data = input.readFromTxtGrande()
    
  val expectedCheckSum =  "9492987"
  val actualCheckSum = checkSum.calculateChecksum(data(4), BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 6 (GRANDE)" in {

  
    
  val data = input.readFromTxtGrande()
    
  val expectedCheckSum =  "9507181"
  val actualCheckSum = checkSum.calculateChecksum(data(5), BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 7 (GRANDE)" in {

  
    
  val data = input.readFromTxtGrande()
    
  val expectedCheckSum =  "9501116"
  val actualCheckSum = checkSum.calculateChecksum(data(6), BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 8 (GRANDE)" in {

  
    
  val data = input.readFromTxtGrande()
    
  val expectedCheckSum =  "9507205"
  val actualCheckSum = checkSum.calculateChecksum(data(7), BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 9 (GRANDE)" in {

  
    
  val data = input.readFromTxtGrande()
    
  val expectedCheckSum =  "9504228"
  val actualCheckSum = checkSum.calculateChecksum(data(8), BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 10 (GRANDE)" in {

  
    
  val data = input.readFromTxtGrande()
    
  val expectedCheckSum =  "9501897"
  val actualCheckSum = checkSum.calculateChecksum(data(9), BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}


}
