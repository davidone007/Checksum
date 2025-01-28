file:///C:/Users/ASUS/OneDrive%20-%20Universidad%20Icesi%20(@icesi.edu.co)/Discretas%20II/2023-2t2-team-e7/Implementacion/src/test/scala/TestChecksumSingle.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 614
uri: file:///C:/Users/ASUS/OneDrive%20-%20Universidad%20Icesi%20(@icesi.edu.co)/Discretas%20II/2023-2t2-team-e7/Implementacion/src/test/scala/TestChecksumSingle.scala
text:
```scala
import model.*
import org.scalatest.flatspec.*
import org.scalatest.matchers.should.Matchers

import scala.*

/**
 * This class contains unit tests for the calculateChecksum function of the SingleCheckSum class
 */
class TestChecksumSingle extends AnyFlatSpec with Matchers {



    val M = 100000000
    val BLOCKSIZE = 2



    //////////////////TOY DATA///////////////////////////

    /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
    "SingleCheckSum" should "calculate the correct checksum for a given data string 1 (@@)" in {

      val toyCheckSum = new SingleCheckSum("toyCheckSum", M)

      val data = "xfcwjgynqkvwofikykxqmvcagtengiphltptrziojofqniuuearbqugcvjnqxubxshsuaddroxzgwyhbcerbpfobpuprubimyqc"

      val expectedCheckSum =  "10841"
      val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }

 /**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 2" in {

    val toyCheckSum = new SingleCheckSum("toyCheckSum", M)

    val data = "npojiewqgkqnjtcbbdgelbapedkybwnbxbhekvvlxphhmsmbxkewpabznpelgnfhjosbxwoyphiifcdrftqdslizbcdgbeqleki"

    val expectedCheckSum =  "10627"
    val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

 /**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 3" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "yskzlabletzgykkgghmmqjkrauujiruepheyednzeerzriftuxquaewkcsmpnsyuqfjfsfdkkehexzcupcfbbxajpqvvnzkfmab"
    
  val expectedCheckSum =  "10786"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 4" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "fmpizudyxwlqauvfznhxiuspueucbptwqikvfxdnqenyxskpytxrcpdxboveystumzxqftqabhqanbszsmxfywposriwycrwzwf"
    
  val expectedCheckSum =  "11046"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 5" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "kxpfrhmrfuhwjcwegsuyynvegbnqekhfotwldbbtbgqkzophkxqxsrxfkrbikkbotdgoghciimxvcccsmniclnzirtiieppzxzk"
    
  val expectedCheckSum =  "10796"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 6" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "ynqxrikanhykkrkwobcaeoqlmicsilzdfdpkjbcttaojxehcyswwhhxahmasvrlrwvhkgmoxqggrepfrjtnvaboczeanidfqnwf"
    
  val expectedCheckSum =  "10738"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 7" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "vfsbznsthjqgbnezvgwphdszcmhzpgdvtvmnvmooqjqckxmxpiucjndglwolukyhjsnzxbvjqiqzabgxaegrvijomltleyuvsmq"
    
  val expectedCheckSum =  "10905"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 8" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "penddriimukxboyjjngnucvdlmzwowdvgcgatmxzmkbqnrjqzlaxfqjgicbinzqzgnwimgipxephoaiijoqjcekhefrfckcmgfs"
    
  val expectedCheckSum =  "10710"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 9" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "jchmzwxtyevkpykakiwjlssysotkxlgtdncsgsujuylfimrksmjhluqetzylyvevzzyponotibohlgdymddudnsxxeklzbcrosf"
    
  val expectedCheckSum =  "10960"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 10" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "mibvxemcstjwbmihhdbogifurjkkqjrqtacovrunsqiakpgtovwffxtgmeglohnxwthfdmxizediwzfarsqedrgnrivqlfzihoe"
    
  val expectedCheckSum =  "10774"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}




    //////////////////PEQUEÑA DATA///////////////////////////

 /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
    "SingleCheckSum" should "calculate the correct checksum for a given data string 1" in {

      val toyCheckSum = new SingleCheckSum("toyCheckSum", M)

      val data = "xfcwjgynqkvwofikykxqmvcagtengiphltptrziojofqniuuearbqugcvjnqxubxshsuaddroxzgwyhbcerbpfobpuprubimyqc"

      val expectedCheckSum =  "10841"
      val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }

 /**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 2" in {

    val toyCheckSum = new SingleCheckSum("toyCheckSum", M)

    val data = "npojiewqgkqnjtcbbdgelbapedkybwnbxbhekvvlxphhmsmbxkewpabznpelgnfhjosbxwoyphiifcdrftqdslizbcdgbeqleki"

    val expectedCheckSum =  "10627"
    val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

 /**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 3" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "yskzlabletzgykkgghmmqjkrauujiruepheyednzeerzriftuxquaewkcsmpnsyuqfjfsfdkkehexzcupcfbbxajpqvvnzkfmab"
    
  val expectedCheckSum =  "10786"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 4" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "fmpizudyxwlqauvfznhxiuspueucbptwqikvfxdnqenyxskpytxrcpdxboveystumzxqftqabhqanbszsmxfywposriwycrwzwf"
    
  val expectedCheckSum =  "11046"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 5" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "kxpfrhmrfuhwjcwegsuyynvegbnqekhfotwldbbtbgqkzophkxqxsrxfkrbikkbotdgoghciimxvcccsmniclnzirtiieppzxzk"
    
  val expectedCheckSum =  "10796"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 6" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "ynqxrikanhykkrkwobcaeoqlmicsilzdfdpkjbcttaojxehcyswwhhxahmasvrlrwvhkgmoxqggrepfrjtnvaboczeanidfqnwf"
    
  val expectedCheckSum =  "10738"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 7" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "vfsbznsthjqgbnezvgwphdszcmhzpgdvtvmnvmooqjqckxmxpiucjndglwolukyhjsnzxbvjqiqzabgxaegrvijomltleyuvsmq"
    
  val expectedCheckSum =  "10905"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 8" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "penddriimukxboyjjngnucvdlmzwowdvgcgatmxzmkbqnrjqzlaxfqjgicbinzqzgnwimgipxephoaiijoqjcekhefrfckcmgfs"
    
  val expectedCheckSum =  "10710"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 9" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "jchmzwxtyevkpykakiwjlssysotkxlgtdncsgsujuylfimrksmjhluqetzylyvevzzyponotibohlgdymddudnsxxeklzbcrosf"
    
  val expectedCheckSum =  "10960"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 10" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "mibvxemcstjwbmihhdbogifurjkkqjrqtacovrunsqiakpgtovwffxtgmeglohnxwthfdmxizediwzfarsqedrgnrivqlfzihoe"
    
  val expectedCheckSum =  "10774"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

  

  



    
    //////////////////MEDIANA DATA///////////////////////////


     /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
    "SingleCheckSum" should "calculate the correct checksum for a given data string 1 " in {

      val toyCheckSum = new SingleCheckSum("toyCheckSum", M)

      val data = "xfcwjgynqkvwofikykxqmvcagtengiphltptrziojofqniuuearbqugcvjnqxubxshsuaddroxzgwyhbcerbpfobpuprubimyqc"

      val expectedCheckSum =  "10841"
      val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }

 /**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 2" in {

    val toyCheckSum = new SingleCheckSum("toyCheckSum", M)

    val data = "npojiewqgkqnjtcbbdgelbapedkybwnbxbhekvvlxphhmsmbxkewpabznpelgnfhjosbxwoyphiifcdrftqdslizbcdgbeqleki"

    val expectedCheckSum =  "10627"
    val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

 /**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 3" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "yskzlabletzgykkgghmmqjkrauujiruepheyednzeerzriftuxquaewkcsmpnsyuqfjfsfdkkehexzcupcfbbxajpqvvnzkfmab"
    
  val expectedCheckSum =  "10786"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 4" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "fmpizudyxwlqauvfznhxiuspueucbptwqikvfxdnqenyxskpytxrcpdxboveystumzxqftqabhqanbszsmxfywposriwycrwzwf"
    
  val expectedCheckSum =  "11046"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 5" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "kxpfrhmrfuhwjcwegsuyynvegbnqekhfotwldbbtbgqkzophkxqxsrxfkrbikkbotdgoghciimxvcccsmniclnzirtiieppzxzk"
    
  val expectedCheckSum =  "10796"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 6" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "ynqxrikanhykkrkwobcaeoqlmicsilzdfdpkjbcttaojxehcyswwhhxahmasvrlrwvhkgmoxqggrepfrjtnvaboczeanidfqnwf"
    
  val expectedCheckSum =  "10738"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 7" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "vfsbznsthjqgbnezvgwphdszcmhzpgdvtvmnvmooqjqckxmxpiucjndglwolukyhjsnzxbvjqiqzabgxaegrvijomltleyuvsmq"
    
  val expectedCheckSum =  "10905"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 8" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "penddriimukxboyjjngnucvdlmzwowdvgcgatmxzmkbqnrjqzlaxfqjgicbinzqzgnwimgipxephoaiijoqjcekhefrfckcmgfs"
    
  val expectedCheckSum =  "10710"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 9" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "jchmzwxtyevkpykakiwjlssysotkxlgtdncsgsujuylfimrksmjhluqetzylyvevzzyponotibohlgdymddudnsxxeklzbcrosf"
    
  val expectedCheckSum =  "10960"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 10" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "mibvxemcstjwbmihhdbogifurjkkqjrqtacovrunsqiakpgtovwffxtgmeglohnxwthfdmxizediwzfarsqedrgnrivqlfzihoe"
    
  val expectedCheckSum =  "10774"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}


    
    //////////////////GRANDE DATA///////////////////////////

     /**
   * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
   */
    "SingleCheckSum" should "calculate the correct checksum for a given data string 1" in {

      val toyCheckSum = new SingleCheckSum("toyCheckSum", M)

      val data = "xfcwjgynqkvwofikykxqmvcagtengiphltptrziojofqniuuearbqugcvjnqxubxshsuaddroxzgwyhbcerbpfobpuprubimyqc"

      val expectedCheckSum =  "10841"
      val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
      actualCheckSum shouldEqual expectedCheckSum
    }

 /**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 2" in {

    val toyCheckSum = new SingleCheckSum("toyCheckSum", M)

    val data = "npojiewqgkqnjtcbbdgelbapedkybwnbxbhekvvlxphhmsmbxkewpabznpelgnfhjosbxwoyphiifcdrftqdslizbcdgbeqleki"

    val expectedCheckSum =  "10627"
    val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
    actualCheckSum shouldEqual expectedCheckSum
  }

 /**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 3" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "yskzlabletzgykkgghmmqjkrauujiruepheyednzeerzriftuxquaewkcsmpnsyuqfjfsfdkkehexzcupcfbbxajpqvvnzkfmab"
    
  val expectedCheckSum =  "10786"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 4" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "fmpizudyxwlqauvfznhxiuspueucbptwqikvfxdnqenyxskpytxrcpdxboveystumzxqftqabhqanbszsmxfywposriwycrwzwf"
    
  val expectedCheckSum =  "11046"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 5" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "kxpfrhmrfuhwjcwegsuyynvegbnqekhfotwldbbtbgqkzophkxqxsrxfkrbikkbotdgoghciimxvcccsmniclnzirtiieppzxzk"
    
  val expectedCheckSum =  "10796"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 6" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "ynqxrikanhykkrkwobcaeoqlmicsilzdfdpkjbcttaojxehcyswwhhxahmasvrlrwvhkgmoxqggrepfrjtnvaboczeanidfqnwf"
    
  val expectedCheckSum =  "10738"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 7" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "vfsbznsthjqgbnezvgwphdszcmhzpgdvtvmnvmooqjqckxmxpiucjndglwolukyhjsnzxbvjqiqzabgxaegrvijomltleyuvsmq"
    
  val expectedCheckSum =  "10905"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 8" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "penddriimukxboyjjngnucvdlmzwowdvgcgatmxzmkbqnrjqzlaxfqjgicbinzqzgnwimgipxephoaiijoqjcekhefrfckcmgfs"
    
  val expectedCheckSum =  "10710"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 9" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "jchmzwxtyevkpykakiwjlssysotkxlgtdncsgsujuylfimrksmjhluqetzylyvevzzyponotibohlgdymddudnsxxeklzbcrosf"
    
  val expectedCheckSum =  "10960"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}

/**
 * Test to check if the SingleCheckSum algorithm returns the correct checksum for a given data string.
 */
  it should "calculate the correct checksum for a given data string 10" in {

  val toyCheckSum = new SingleCheckSum("toyCheckSum", M)
    
  val data = "mibvxemcstjwbmihhdbogifurjkkqjrqtacovrunsqiakpgtovwffxtgmeglohnxwthfdmxizediwzfarsqedrgnrivqlfzihoe"
    
  val expectedCheckSum =  "10774"
  val actualCheckSum = toyCheckSum.calculateChecksum(data, BLOCKSIZE)
  actualCheckSum shouldEqual expectedCheckSum
}


}

```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:131)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.countParams(Signatures.scala:501)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:186)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:94)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:63)
	scala.meta.internal.pc.MetalsSignatures$.signatures(MetalsSignatures.scala:17)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:51)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:375)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 0