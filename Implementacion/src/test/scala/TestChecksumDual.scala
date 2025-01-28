import model.*
import org.scalatest.flatspec.*
import org.scalatest.matchers.should.Matchers

import scala.*

/**
 * This class contains unit tests for the calculateChecksum function of the DualCheckSum class
 */
class TestChecksumDual extends AnyFlatSpec with Matchers {


    val input = new Input
    val M = 100000000
    val BLOCKSIZE = 2
    val checkSum = new DualCheckSum("CheckSum", M)
    val toyData = input.readFromTxtToy()
    val pequenaData = input.readFromTxtPequena()
    

    //////////////////TOY DATA///////////////////////////

    /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    "DualCheckSum" should "calculate the correct checksum for a given data string 1 (TOY)" in {

      

      

      val expectedCheckSum =  "10841543249"
      val actualCheckSum = checkSum.calculateChecksum(toyData.head, BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }

   /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 2 (TOY)" in {
  
      
  
  
      val expectedCheckSum =  "10627531803"
      val actualCheckSum = checkSum.calculateChecksum(toyData(1), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }

   /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 3 (TOY)" in {
  
    
  
      
    val expectedCheckSum =  "10786541006"
    val actualCheckSum = checkSum.calculateChecksum(toyData(2), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 4 (TOY)" in {
  
    
      
  
      
    val expectedCheckSum =  "11046551305"
    val actualCheckSum = checkSum.calculateChecksum(toyData(3), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 5 (TOY)" in {
  
    
      
  
      
    val expectedCheckSum =  "10796539751"
    val actualCheckSum = checkSum.calculateChecksum(toyData(4), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 6 (TOY)" in {
  
  
      
    val expectedCheckSum =  "10738537774"
    val actualCheckSum = checkSum.calculateChecksum(toyData(5), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 7 (TOY)" in {
  
  
      
    val expectedCheckSum =  "10905545018"
    val actualCheckSum = checkSum.calculateChecksum(toyData(6), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 8 (TOY)" in {
  
    
      
  
      
    val expectedCheckSum =  "10710538661"
    val actualCheckSum = checkSum.calculateChecksum(toyData(7), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 9 (TOY)" in {
  
    
      
    
      
    val expectedCheckSum =  "10960549773"
    val actualCheckSum = checkSum.calculateChecksum(toyData(8), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 10 (TOY)" in {
  
  
      
    val expectedCheckSum =  "10774537549"
    val actualCheckSum = checkSum.calculateChecksum(toyData(9), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
    //////////////////PEQUEÑA DATA///////////////////////////
  
   /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
      "DualCheckSum" should "calculate the correct checksum for a given data string 1 (PEQUEÑA)" in {
  
        
  
     
  
        val expectedCheckSum =  "109429768440770"
        val actualCheckSum = checkSum.calculateChecksum(pequenaData.head, BLOCKSIZE)
        actualCheckSum shouldEqual expectedCheckSum
      }
  
   /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 2 (PEQUEÑA)" in {
  
      
  
  
      val expectedCheckSum =  "109344169405830"
      val actualCheckSum = checkSum.calculateChecksum(pequenaData(1), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
   /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 3 (PEQUEÑA)" in {
  
    
      
      
    val expectedCheckSum =  "109456174064500"
    val actualCheckSum = checkSum.calculateChecksum(pequenaData(2), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 4 (PEQUEÑA)" in {
  
    
      
  
      
    val expectedCheckSum =  "109443674899628"
    val actualCheckSum = checkSum.calculateChecksum(pequenaData(3), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 5 (PEQUEÑA)" in {
  
    
  
      
    val expectedCheckSum =  "109475076726345"
    val actualCheckSum = checkSum.calculateChecksum(pequenaData(4), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 6 (PEQUEÑA)" in {
  
    
      
    
      
    val expectedCheckSum =  "109615382713325"
    val actualCheckSum = checkSum.calculateChecksum(pequenaData(5), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 7 (PEQUEÑA)" in {
  
    
      
  
      
    val expectedCheckSum =  "109523780155719"
    val actualCheckSum = checkSum.calculateChecksum(pequenaData(6), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 8 (PEQUEÑA)" in {
  
    
      
  
      
    val expectedCheckSum =  "109440070929205"
    val actualCheckSum = checkSum.calculateChecksum(pequenaData(7), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 9 (PEQUEÑA)" in {
  
    
      
  
      
    val expectedCheckSum =  "109474972742624"
    val actualCheckSum = checkSum.calculateChecksum(pequenaData(8), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
  /**
   * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
   */
    it should "calculate the correct checksum for a given data string 10 (PEQUEÑA)" in {
  
    
      
  
      
    val expectedCheckSum =  "109507075993250"
    val actualCheckSum = checkSum.calculateChecksum(pequenaData(9), BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }
  
    //////////////////MEDIANA DATA///////////////////////////
  
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    "DualCheckSum" should "calculate the correct checksum for a given data string 1 (MEDIANA)" in {
  
  
      val data = input.readFromTxtMediana()
  
      val expectedCheckSum = "1094951341438744"
      val actualCheckSum = checkSum.calculateChecksum(data.head, BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 2 (MEDIANA)" in {
  
  
      val data = input.readFromTxtMediana()
  
      val expectedCheckSum = "1094637948967238"
      val actualCheckSum = checkSum.calculateChecksum(data(1), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 3 (MEDIANA)" in {
  
  
      val data = input.readFromTxtMediana()
  
      val expectedCheckSum = "1095006252366260"
      val actualCheckSum = checkSum.calculateChecksum(data(2), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 4 (MEDIANA)" in {
  
  
      val data = input.readFromTxtMediana()
  
      val expectedCheckSum = "1095006058221744"
      val actualCheckSum = checkSum.calculateChecksum(data(3), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 5 (MEDIANA)" in {
  
  
      val data = input.readFromTxtMediana()
  
      val expectedCheckSum = "1095006698725352"
      val actualCheckSum = checkSum.calculateChecksum(data(4), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 6 (MEDIANA)" in {
  
  
      val data = input.readFromTxtMediana()
  
      val expectedCheckSum = "1095207238148627"
      val actualCheckSum = checkSum.calculateChecksum(data(5), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 7 (MEDIANA)" in {
  
  
      val data = input.readFromTxtMediana()
  
      val expectedCheckSum = "1095325098668244"
      val actualCheckSum = checkSum.calculateChecksum(data(6), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 8 (MEDIANA)" in {
  
  
      val data = input.readFromTxtMediana()
  
      val expectedCheckSum = "1095084774607112"
      val actualCheckSum = checkSum.calculateChecksum(data(7), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 9 (MEDIANA)" in {
  
  
      val data = input.readFromTxtMediana()
  
      val expectedCheckSum = "1094947587753748"
      val actualCheckSum = checkSum.calculateChecksum(data(8), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 10 (MEDIANA)" in {
  
  
      val data = input.readFromTxtMediana()
  
      val expectedCheckSum = "1095026761480649"
      val actualCheckSum = checkSum.calculateChecksum(data(9), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    //////////////////GRANDE DATA///////////////////////////
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    "DualCheckSum" should "calculate the correct checksum for a given data string 1 (GRANDE)" in {
  
  
      val data = input.readFromTxtGrande()
  
      val expectedCheckSum = "950106727819454"
      val actualCheckSum = checkSum.calculateChecksum(data.head, BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 2 (GRANDE)" in {
  
  
      val data = input.readFromTxtGrande()
  
      val expectedCheckSum = "949803470392758"
      val actualCheckSum = checkSum.calculateChecksum(data(1), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 3 (GRANDE)" in {
  
  
      val data = input.readFromTxtGrande()
  
      val expectedCheckSum = "950863345297952"
      val actualCheckSum = checkSum.calculateChecksum(data(2), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 4 (GRANDE)" in {
  
  
      val data = input.readFromTxtGrande()
  
      val expectedCheckSum = "950106512788553"
      val actualCheckSum = checkSum.calculateChecksum(data(3), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 5 (GRANDE)" in {
  
  
      val data = input.readFromTxtGrande()
  
      val expectedCheckSum = "949298784272845"
      val actualCheckSum = checkSum.calculateChecksum(data(4), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 6 (GRANDE)" in {
  
  
      val data = input.readFromTxtGrande()
  
      val expectedCheckSum = "950718180702316"
      val actualCheckSum = checkSum.calculateChecksum(data(5), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 7 (GRANDE)" in {
  
  
      val data = input.readFromTxtGrande()
  
      val expectedCheckSum = "950111690426695"
      val actualCheckSum = checkSum.calculateChecksum(data(6), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 8 (GRANDE)" in {
  
  
      val data = input.readFromTxtGrande()
  
      val expectedCheckSum = "950720553181835"
      val actualCheckSum = checkSum.calculateChecksum(data(7), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 9 (GRANDE)" in {
  
  
      val data = input.readFromTxtGrande()
  
      val expectedCheckSum = "950422828582577"
      val actualCheckSum = checkSum.calculateChecksum(data(8), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }
  
    /**
     * Test to check if the DualCheckSum algorithm returns the correct checksum for a given data string.
     */
    it should "calculate the correct checksum for a given data string 10 (GRANDE)" in {
  
  
      val data = input.readFromTxtGrande()
  
      val expectedCheckSum = "950189743780779"
      val actualCheckSum = checkSum.calculateChecksum(data(9), BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }  
  
  
  }
