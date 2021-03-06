import java.text.Normalizer

import org.junit.Test
import org.scalatest.junit.AssertionsForJUnit

/**
  * @author ynupc
  *         Created on 2016/07/19
  */
class Day6GeorgianAlphabetTestSuite extends AssertionsForJUnit {
  @Test
  def testMrgvlovaniToUpperCase(): Unit = {
    assert(Character.toUpperCase('Ⴀ') == 'Ⴀ')
    assert(Character.toUpperCase('Ⴁ') == 'Ⴁ')
    assert(Character.toUpperCase('Ⴂ') == 'Ⴂ')
    assert(Character.toUpperCase('Ⴃ') == 'Ⴃ')
    assert(Character.toUpperCase('Ⴄ') == 'Ⴄ')
    assert(Character.toUpperCase('Ⴅ') == 'Ⴅ')
    assert(Character.toUpperCase('Ⴆ') == 'Ⴆ')
    assert(Character.toUpperCase('Ⴡ') == 'Ⴡ')
    assert(Character.toUpperCase('Ⴇ') == 'Ⴇ')
    assert(Character.toUpperCase('Ⴈ') == 'Ⴈ')
    assert(Character.toUpperCase('Ⴉ') == 'Ⴉ')
    assert(Character.toUpperCase('Ⴊ') == 'Ⴊ')
    assert(Character.toUpperCase('Ⴋ') == 'Ⴋ')
    assert(Character.toUpperCase('Ⴌ') == 'Ⴌ')
    assert(Character.toUpperCase('Ⴢ') == 'Ⴢ')
    assert(Character.toUpperCase('Ⴍ') == 'Ⴍ')
    assert(Character.toUpperCase('Ⴎ') == 'Ⴎ')
    assert(Character.toUpperCase('Ⴏ') == 'Ⴏ')
    assert(Character.toUpperCase('Ⴐ') == 'Ⴐ')
    assert(Character.toUpperCase('Ⴑ') == 'Ⴑ')
    assert(Character.toUpperCase('Ⴒ') == 'Ⴒ')
    assert(Character.toUpperCase('Ⴣ') == 'Ⴣ')
    //assert(Character.toUpperCase('ႭჃ') == 'ႭჃ')
    assert(Character.toUpperCase('Ⴍ') == 'Ⴍ')
    assert(Character.toUpperCase('Ⴣ') == 'Ⴣ')
    assert(Character.toUpperCase('Ⴓ') == 'Ⴓ')
    assert(Character.toUpperCase('Ⴔ') == 'Ⴔ')
    assert(Character.toUpperCase('Ⴕ') == 'Ⴕ')
    assert(Character.toUpperCase('Ⴖ') == 'Ⴖ')
    assert(Character.toUpperCase('Ⴗ') == 'Ⴗ')
    assert(Character.toUpperCase('Ⴘ') == 'Ⴘ')
    assert(Character.toUpperCase('Ⴙ') == 'Ⴙ')
    assert(Character.toUpperCase('Ⴚ') == 'Ⴚ')
    assert(Character.toUpperCase('Ⴛ') == 'Ⴛ')
    assert(Character.toUpperCase('Ⴜ') == 'Ⴜ')
    assert(Character.toUpperCase('Ⴝ') == 'Ⴝ')
    assert(Character.toUpperCase('Ⴞ') == 'Ⴞ')
    assert(Character.toUpperCase('Ⴤ') == 'Ⴤ')
    assert(Character.toUpperCase('Ⴟ') == 'Ⴟ')
    assert(Character.toUpperCase('Ⴠ') == 'Ⴠ')
    assert(Character.toUpperCase('Ⴥ') == 'Ⴥ')
  }

  @Test
  def testNuskhuriToUpperCase(): Unit = {
    assert(Character.toUpperCase('ⴀ') == 'Ⴀ')
    assert(Character.toUpperCase('ⴁ') == 'Ⴁ')
    assert(Character.toUpperCase('ⴂ') == 'Ⴂ')
    assert(Character.toUpperCase('ⴃ') == 'Ⴃ')
    assert(Character.toUpperCase('ⴄ') == 'Ⴄ')
    assert(Character.toUpperCase('ⴅ') == 'Ⴅ')
    assert(Character.toUpperCase('ⴆ') == 'Ⴆ')
    assert(Character.toUpperCase('ⴡ') == 'Ⴡ')
    assert(Character.toUpperCase('ⴇ') == 'Ⴇ')
    assert(Character.toUpperCase('ⴈ') == 'Ⴈ')
    assert(Character.toUpperCase('ⴉ') == 'Ⴉ')
    assert(Character.toUpperCase('ⴊ') == 'Ⴊ')
    assert(Character.toUpperCase('ⴋ') == 'Ⴋ')
    assert(Character.toUpperCase('ⴌ') == 'Ⴌ')
    assert(Character.toUpperCase('ⴢ') == 'Ⴢ')
    assert(Character.toUpperCase('ⴍ') == 'Ⴍ')
    assert(Character.toUpperCase('ⴎ') == 'Ⴎ')
    assert(Character.toUpperCase('ⴏ') == 'Ⴏ')
    assert(Character.toUpperCase('ⴐ') == 'Ⴐ')
    assert(Character.toUpperCase('ⴑ') == 'Ⴑ')
    assert(Character.toUpperCase('ⴒ') == 'Ⴒ')
    assert(Character.toUpperCase('ⴣ') == 'Ⴣ')
    //assert(Character.toUpperCase('ⴍⴣ') == 'ႭჃ')
    assert(Character.toUpperCase('ⴍ') == 'Ⴍ')
    assert(Character.toUpperCase('ⴣ') == 'Ⴣ')
    assert(Character.toUpperCase('ⴓ') == 'Ⴓ')
    assert(Character.toUpperCase('ⴔ') == 'Ⴔ')
    assert(Character.toUpperCase('ⴕ') == 'Ⴕ')
    assert(Character.toUpperCase('ⴖ') == 'Ⴖ')
    assert(Character.toUpperCase('ⴗ') == 'Ⴗ')
    assert(Character.toUpperCase('ⴘ') == 'Ⴘ')
    assert(Character.toUpperCase('ⴙ') == 'Ⴙ')
    assert(Character.toUpperCase('ⴚ') == 'Ⴚ')
    assert(Character.toUpperCase('ⴛ') == 'Ⴛ')
    assert(Character.toUpperCase('ⴜ') == 'Ⴜ')
    assert(Character.toUpperCase('ⴝ') == 'Ⴝ')
    assert(Character.toUpperCase('ⴞ') == 'Ⴞ')
    assert(Character.toUpperCase('ⴤ') == 'Ⴤ')
    assert(Character.toUpperCase('ⴟ') == 'Ⴟ')
    assert(Character.toUpperCase('ⴠ') == 'Ⴠ')
    assert(Character.toUpperCase('ⴥ') == 'Ⴥ')
  }

  @Test
  def testMrgvlovaniToLowerCase(): Unit = {
    assert(Character.toLowerCase('Ⴀ') == 'ⴀ')
    assert(Character.toLowerCase('Ⴁ') == 'ⴁ')
    assert(Character.toLowerCase('Ⴂ') == 'ⴂ')
    assert(Character.toLowerCase('Ⴃ') == 'ⴃ')
    assert(Character.toLowerCase('Ⴄ') == 'ⴄ')
    assert(Character.toLowerCase('Ⴅ') == 'ⴅ')
    assert(Character.toLowerCase('Ⴆ') == 'ⴆ')
    assert(Character.toLowerCase('Ⴡ') == 'ⴡ')
    assert(Character.toLowerCase('Ⴇ') == 'ⴇ')
    assert(Character.toLowerCase('Ⴈ') == 'ⴈ')
    assert(Character.toLowerCase('Ⴉ') == 'ⴉ')
    assert(Character.toLowerCase('Ⴊ') == 'ⴊ')
    assert(Character.toLowerCase('Ⴋ') == 'ⴋ')
    assert(Character.toLowerCase('Ⴌ') == 'ⴌ')
    assert(Character.toLowerCase('Ⴢ') == 'ⴢ')
    assert(Character.toLowerCase('Ⴍ') == 'ⴍ')
    assert(Character.toLowerCase('Ⴎ') == 'ⴎ')
    assert(Character.toLowerCase('Ⴏ') == 'ⴏ')
    assert(Character.toLowerCase('Ⴐ') == 'ⴐ')
    assert(Character.toLowerCase('Ⴑ') == 'ⴑ')
    assert(Character.toLowerCase('Ⴒ') == 'ⴒ')
    assert(Character.toLowerCase('Ⴣ') == 'ⴣ')
    //assert(Character.toLowerCase('ႭჃ') == 'ⴍⴣ')
    assert(Character.toLowerCase('Ⴍ') == 'ⴍ')
    assert(Character.toLowerCase('Ⴣ') == 'ⴣ')
    assert(Character.toLowerCase('Ⴓ') == 'ⴓ')
    assert(Character.toLowerCase('Ⴔ') == 'ⴔ')
    assert(Character.toLowerCase('Ⴕ') == 'ⴕ')
    assert(Character.toLowerCase('Ⴖ') == 'ⴖ')
    assert(Character.toLowerCase('Ⴗ') == 'ⴗ')
    assert(Character.toLowerCase('Ⴘ') == 'ⴘ')
    assert(Character.toLowerCase('Ⴙ') == 'ⴙ')
    assert(Character.toLowerCase('Ⴚ') == 'ⴚ')
    assert(Character.toLowerCase('Ⴛ') == 'ⴛ')
    assert(Character.toLowerCase('Ⴜ') == 'ⴜ')
    assert(Character.toLowerCase('Ⴝ') == 'ⴝ')
    assert(Character.toLowerCase('Ⴞ') == 'ⴞ')
    assert(Character.toLowerCase('Ⴤ') == 'ⴤ')
    assert(Character.toLowerCase('Ⴟ') == 'ⴟ')
    assert(Character.toLowerCase('Ⴠ') == 'ⴠ')
    assert(Character.toLowerCase('Ⴥ') == 'ⴥ')
  }

  @Test
  def testNuskhuriToLowerCase(): Unit = {
    assert(Character.toLowerCase('ⴀ') == 'ⴀ')
    assert(Character.toLowerCase('ⴁ') == 'ⴁ')
    assert(Character.toLowerCase('ⴂ') == 'ⴂ')
    assert(Character.toLowerCase('ⴃ') == 'ⴃ')
    assert(Character.toLowerCase('ⴄ') == 'ⴄ')
    assert(Character.toLowerCase('ⴅ') == 'ⴅ')
    assert(Character.toLowerCase('ⴆ') == 'ⴆ')
    assert(Character.toLowerCase('ⴡ') == 'ⴡ')
    assert(Character.toLowerCase('ⴇ') == 'ⴇ')
    assert(Character.toLowerCase('ⴈ') == 'ⴈ')
    assert(Character.toLowerCase('ⴉ') == 'ⴉ')
    assert(Character.toLowerCase('ⴊ') == 'ⴊ')
    assert(Character.toLowerCase('ⴋ') == 'ⴋ')
    assert(Character.toLowerCase('ⴌ') == 'ⴌ')
    assert(Character.toLowerCase('ⴢ') == 'ⴢ')
    assert(Character.toLowerCase('ⴍ') == 'ⴍ')
    assert(Character.toLowerCase('ⴎ') == 'ⴎ')
    assert(Character.toLowerCase('ⴏ') == 'ⴏ')
    assert(Character.toLowerCase('ⴐ') == 'ⴐ')
    assert(Character.toLowerCase('ⴑ') == 'ⴑ')
    assert(Character.toLowerCase('ⴒ') == 'ⴒ')
    assert(Character.toLowerCase('ⴣ') == 'ⴣ')
    //assert(Character.toLowerCase('ⴍⴣ') == 'ⴍⴣ')
    assert(Character.toLowerCase('ⴍ') == 'ⴍ')
    assert(Character.toLowerCase('ⴣ') == 'ⴣ')
    assert(Character.toLowerCase('ⴓ') == 'ⴓ')
    assert(Character.toLowerCase('ⴔ') == 'ⴔ')
    assert(Character.toLowerCase('ⴕ') == 'ⴕ')
    assert(Character.toLowerCase('ⴖ') == 'ⴖ')
    assert(Character.toLowerCase('ⴗ') == 'ⴗ')
    assert(Character.toLowerCase('ⴘ') == 'ⴘ')
    assert(Character.toLowerCase('ⴙ') == 'ⴙ')
    assert(Character.toLowerCase('ⴚ') == 'ⴚ')
    assert(Character.toLowerCase('ⴛ') == 'ⴛ')
    assert(Character.toLowerCase('ⴜ') == 'ⴜ')
    assert(Character.toLowerCase('ⴝ') == 'ⴝ')
    assert(Character.toLowerCase('ⴞ') == 'ⴞ')
    assert(Character.toLowerCase('ⴤ') == 'ⴤ')
    assert(Character.toLowerCase('ⴟ') == 'ⴟ')
    assert(Character.toLowerCase('ⴠ') == 'ⴠ')
    assert(Character.toLowerCase('ⴥ') == 'ⴥ')
  }

  @Test
  def testMkhedruliToUpperCase(): Unit = {
    assert(Character.toUpperCase('ა') == 'ა')
    assert(Character.toUpperCase('ბ') == 'ბ')
    assert(Character.toUpperCase('გ') == 'გ')
    assert(Character.toUpperCase('დ') == 'დ')
    assert(Character.toUpperCase('ე') == 'ე')
    assert(Character.toUpperCase('ვ') == 'ვ')
    assert(Character.toUpperCase('ზ') == 'ზ')
    assert(Character.toUpperCase('ჱ') == 'ჱ')
    assert(Character.toUpperCase('თ') == 'თ')
    assert(Character.toUpperCase('ი') == 'ი')
    assert(Character.toUpperCase('კ') == 'კ')
    assert(Character.toUpperCase('ლ') == 'ლ')
    assert(Character.toUpperCase('მ') == 'მ')
    assert(Character.toUpperCase('ნ') == 'ნ')
    assert(Character.toUpperCase('ჲ') == 'ჲ')
    assert(Character.toUpperCase('ო') == 'ო')
    assert(Character.toUpperCase('პ') == 'პ')
    assert(Character.toUpperCase('ჟ') == 'ჟ')
    assert(Character.toUpperCase('რ') == 'რ')
    assert(Character.toUpperCase('ს') == 'ს')
    assert(Character.toUpperCase('ტ') == 'ტ')
    assert(Character.toUpperCase('ჳ') == 'ჳ')
    assert(Character.toUpperCase('უ') == 'უ')
    assert(Character.toUpperCase('ფ') == 'ფ')
    assert(Character.toUpperCase('ქ') == 'ქ')
    assert(Character.toUpperCase('ღ') == 'ღ')
    assert(Character.toUpperCase('ყ') == 'ყ')
    assert(Character.toUpperCase('შ') == 'შ')
    assert(Character.toUpperCase('ჩ') == 'ჩ')
    assert(Character.toUpperCase('ც') == 'ც')
    assert(Character.toUpperCase('ძ') == 'ძ')
    assert(Character.toUpperCase('წ') == 'წ')
    assert(Character.toUpperCase('ჭ') == 'ჭ')
    assert(Character.toUpperCase('ხ') == 'ხ')
    assert(Character.toUpperCase('ჴ') == 'ჴ')
    assert(Character.toUpperCase('ჯ') == 'ჯ')
    assert(Character.toUpperCase('ჰ') == 'ჰ')
    assert(Character.toUpperCase('ჵ') == 'ჵ')

    assert(Character.toUpperCase('ჶ') == 'ჶ')
    assert(Character.toUpperCase('ჷ') == 'ჷ')
    assert(Character.toUpperCase('ჸ') == 'ჸ')
    assert(Character.toUpperCase('ჹ') == 'ჹ')
    assert(Character.toUpperCase('ჺ') == 'ჺ')
  }

  @Test
  def testMkhedruliToLowerCase(): Unit = {
    assert(Character.toLowerCase('ა') == 'ა')
    assert(Character.toLowerCase('ბ') == 'ბ')
    assert(Character.toLowerCase('გ') == 'გ')
    assert(Character.toLowerCase('დ') == 'დ')
    assert(Character.toLowerCase('ე') == 'ე')
    assert(Character.toLowerCase('ვ') == 'ვ')
    assert(Character.toLowerCase('ზ') == 'ზ')
    assert(Character.toLowerCase('ჱ') == 'ჱ')
    assert(Character.toLowerCase('თ') == 'თ')
    assert(Character.toLowerCase('ი') == 'ი')
    assert(Character.toLowerCase('კ') == 'კ')
    assert(Character.toLowerCase('ლ') == 'ლ')
    assert(Character.toLowerCase('მ') == 'მ')
    assert(Character.toLowerCase('ნ') == 'ნ')
    assert(Character.toLowerCase('ჲ') == 'ჲ')
    assert(Character.toLowerCase('ო') == 'ო')
    assert(Character.toLowerCase('პ') == 'პ')
    assert(Character.toLowerCase('ჟ') == 'ჟ')
    assert(Character.toLowerCase('რ') == 'რ')
    assert(Character.toLowerCase('ს') == 'ს')
    assert(Character.toLowerCase('ტ') == 'ტ')
    assert(Character.toLowerCase('ჳ') == 'ჳ')
    assert(Character.toLowerCase('უ') == 'უ')
    assert(Character.toLowerCase('ფ') == 'ფ')
    assert(Character.toLowerCase('ქ') == 'ქ')
    assert(Character.toLowerCase('ღ') == 'ღ')
    assert(Character.toLowerCase('ყ') == 'ყ')
    assert(Character.toLowerCase('შ') == 'შ')
    assert(Character.toLowerCase('ჩ') == 'ჩ')
    assert(Character.toLowerCase('ც') == 'ც')
    assert(Character.toLowerCase('ძ') == 'ძ')
    assert(Character.toLowerCase('წ') == 'წ')
    assert(Character.toLowerCase('ჭ') == 'ჭ')
    assert(Character.toLowerCase('ხ') == 'ხ')
    assert(Character.toLowerCase('ჴ') == 'ჴ')
    assert(Character.toLowerCase('ჯ') == 'ჯ')
    assert(Character.toLowerCase('ჰ') == 'ჰ')
    assert(Character.toLowerCase('ჵ') == 'ჵ')

    assert(Character.toLowerCase('ჶ') == 'ჶ')
    assert(Character.toLowerCase('ჷ') == 'ჷ')
    assert(Character.toLowerCase('ჸ') == 'ჸ')
    assert(Character.toLowerCase('ჹ') == 'ჹ')
    assert(Character.toLowerCase('ჺ') == 'ჺ')
  }

  @Test
  def testI(): Unit = {
    val char73: Char = 73.toChar //LATIN CAPITAL LETTER I
    val char304: Char = 304.toChar //LATIN CAPITAL LETTER I WITH DOT ABOVE

    printf("%s %d%n", char73, char73.toInt)
    printf("%s %d%n", char304, char304.toInt)
    assert(char73 == 'I')
    assert(char73.toInt == 73)
    assert(char304 == 'İ')
    assert(char304.toInt == 304)
    println("toUpperCase")
    val char73UpperCase: Char = Character.toUpperCase(char73)
    val char304UpperCase: Char = Character.toUpperCase(char304)
    printf("%s %d%n", char73UpperCase, char73UpperCase.toInt)
    printf("%s %d%n", char304UpperCase, char304UpperCase.toInt)
    assert(char73UpperCase == 'I')
    assert(char73UpperCase.toInt == 73)
    assert(char304UpperCase == 'İ')
    assert(char304UpperCase.toInt == 304)
    println("toLowerCase")
    val char73LowerCase: Char = Character.toLowerCase(char73)
    val char304LowerCase: Char = Character.toLowerCase(char304)
    printf("%s %d%n", char73LowerCase, char73LowerCase.toInt)
    printf("%s %d%n", char304LowerCase, char304LowerCase.toInt)
    assert(char73LowerCase == 'i')
    assert(char73LowerCase.toInt == 105) //LATIN SMALL LETTER I
    assert(char304LowerCase == 'i')
    assert(char304LowerCase.toInt == 105)
    println("toUpperCase.toLowerCase")
    val char73UpperCaseLowerCase: Char = Character.toLowerCase(char73UpperCase)
    val char304UpperCaseLowerCase: Char = Character.toLowerCase(char304UpperCase)
    printf("%s %d%n", char73UpperCaseLowerCase, char73UpperCaseLowerCase.toInt)
    printf("%s %d%n", char304UpperCaseLowerCase, char304UpperCaseLowerCase.toInt)
    assert(char73UpperCaseLowerCase == 'i')
    assert(char73UpperCaseLowerCase.toInt == 105)
    assert(char304UpperCaseLowerCase == 'i')
    assert(char304UpperCaseLowerCase.toInt == 105)
    println("toLowerCase.toUpperCase")
    val char73LowerCaseUpperCase: Char = Character.toUpperCase(char73LowerCase)
    val char304LowerCaseUpperCase: Char = Character.toUpperCase(char304LowerCase)
    printf("%s %d%n", char73LowerCaseUpperCase, char73LowerCaseUpperCase.toInt)
    printf("%s %d%n", char304LowerCaseUpperCase, char304LowerCaseUpperCase.toInt)
    assert(char73LowerCaseUpperCase == 'I')
    assert(char73LowerCaseUpperCase.toInt == 73)
    assert(char304LowerCaseUpperCase == 'I')
    assert(char304LowerCaseUpperCase.toInt == 73)
    println("Normalize with the NFKC form")
    val char73Normalized: Char = Normalizer.normalize(char73.toString, Normalizer.Form.NFKC).head
    val char304Normalized: Char = Normalizer.normalize(char304.toString, Normalizer.Form.NFKC).head
    printf("%s %d%n", char73Normalized, char73Normalized.toInt)
    printf("%s %d%n", char304Normalized, char304Normalized.toInt)
    assert(char73Normalized == 'I')
    assert(char73Normalized.toInt == 73)
    assert(char304Normalized == 'İ')
    assert(char304Normalized.toInt == 304)
    println("Normalize with the NFKC form toUpperCase")
    val char73NormalizedUpperCase: Char = Character.toUpperCase(char73Normalized)
    val char304NormalizedUpperCase: Char = Character.toUpperCase(char304Normalized)
    printf("%s %d%n", char73NormalizedUpperCase, char73NormalizedUpperCase.toInt)
    printf("%s %d%n", char304NormalizedUpperCase, char304NormalizedUpperCase.toInt)
    assert(char73NormalizedUpperCase == 'I')
    assert(char73NormalizedUpperCase.toInt == 73)
    assert(char304NormalizedUpperCase == 'İ')
    assert(char304NormalizedUpperCase.toInt == 304)
    println("toUpperCase Normalize with the NFKC form")
    val char73UpperCaseNormalized: Char = Normalizer.normalize(char73UpperCase.toString, Normalizer.Form.NFKC).head
    val char304UpperCaseNormalized: Char = Normalizer.normalize(char304UpperCase.toString, Normalizer.Form.NFKC).head
    printf("%s %d%n", char73UpperCaseNormalized, char73UpperCaseNormalized.toInt)
    printf("%s %d%n", char304UpperCaseNormalized, char304UpperCaseNormalized.toInt)
    println("Normalize with the NFKC form toLowerCase")
    assert(char73UpperCaseNormalized == 'I')
    assert(char73UpperCaseNormalized.toInt == 73)
    assert(char304UpperCaseNormalized == 'İ')
    assert(char304UpperCaseNormalized.toInt == 304)
    val char73NormalizedLowerCase: Char = Character.toLowerCase(char73Normalized)
    val char304NormalizedLowerCase: Char = Character.toLowerCase(char304Normalized)
    printf("%s %d%n", char73NormalizedLowerCase, char73NormalizedLowerCase.toInt)
    printf("%s %d%n", char304NormalizedLowerCase, char304NormalizedLowerCase.toInt)
    assert(char73NormalizedLowerCase == 'i')
    assert(char73NormalizedLowerCase.toInt == 105)
    assert(char304NormalizedLowerCase == 'i')
    assert(char304NormalizedLowerCase.toInt == 105)
    println("toLowerCase Normalize with the NFKC form")
    val char73LowerCaseNormalized: Char = Normalizer.normalize(char73LowerCase.toString, Normalizer.Form.NFKC).head
    val char304LowerCaseNormalized: Char = Normalizer.normalize(char304LowerCase.toString, Normalizer.Form.NFKC).head
    printf("%s %d%n", char73LowerCaseNormalized, char73LowerCaseNormalized.toInt)
    printf("%s %d%n", char304LowerCaseNormalized, char304LowerCaseNormalized.toInt)
    assert(char73LowerCaseNormalized == 'i')
    assert(char73LowerCaseNormalized.toInt == 105)
    assert(char304LowerCaseNormalized == 'i')
    assert(char304LowerCaseNormalized.toInt == 105)
    println("---")

    assert(char73 != char304)
    //toUpperCase
    assert(Character.toUpperCase(char73) != Character.toUpperCase(char304))
    //toLowerCase
    assert(Character.toLowerCase(char73) == Character.toLowerCase(char304))
    //toUpperCase.toLowerCase
    assert(Character.toLowerCase(Character.toUpperCase(char73)) == Character.toLowerCase(Character.toUpperCase(char304)))
    //toLowerCase.toUpperCase
    assert(Character.toUpperCase(Character.toLowerCase(char73)) == Character.toUpperCase(Character.toLowerCase(char304)))
    //normalize with the NFKC
    assert(Normalizer.normalize(char73.toString, Normalizer.Form.NFKC) != Normalizer.normalize(char304.toString, Normalizer.Form.NFKC))
    //normalize with the NFKC form toUpperCase
    assert(Normalizer.normalize(char73.toString, Normalizer.Form.NFKC).toUpperCase != Normalizer.normalize(char304.toString, Normalizer.Form.NFKC).toUpperCase)
    //toUpperCase normalize with the NFKC form
    assert(Normalizer.normalize(Character.toUpperCase(char73).toString, Normalizer.Form.NFKC) != Normalizer.normalize(Character.toUpperCase(char304).toString, Normalizer.Form.NFKC))
    //normalize with the NFKC form toLowerCase
    assert(Normalizer.normalize(char73.toString, Normalizer.Form.NFKC).toLowerCase != Normalizer.normalize(char304.toString, Normalizer.Form.NFKC).toLowerCase)
    //toLowerCase normalize with the NFKC form
    assert(Normalizer.normalize(Character.toLowerCase(char73).toString, Normalizer.Form.NFKC) == Normalizer.normalize(Character.toLowerCase(char304).toString, Normalizer.Form.NFKC))
  }

  @Test
  def testTheta(): Unit = {
    val char977: Char = 977.toChar //GREEK THETA SYMBOL
    val char1012: Char = 1012.toChar //GREEK CAPITAL THETA SYMBOL

    printf("%s %d%n", char977, char977.toInt)
    printf("%s %d%n", char1012, char1012.toInt)
    assert(char977 == 'ϑ')
    assert(char977.toInt == 977)
    assert(char1012 == 'ϴ')
    assert(char1012.toInt == 1012)
    println("toUpperCase")
    val char977UpperCase: Char = Character.toUpperCase(char977)
    val char1012UpperCase: Char = Character.toUpperCase(char1012)
    printf("%s %d%n", char977UpperCase, char977UpperCase.toInt)
    printf("%s %d%n", char1012UpperCase, char1012UpperCase.toInt)
    assert(char977UpperCase == 'Θ')
    assert(char977UpperCase.toInt == 920) //GREEK CAPITAL LETTER THETA
    assert(char1012UpperCase == 'ϴ')
    assert(char1012UpperCase.toInt == 1012)
    println("toLowerCase")
    val char977LowerCase: Char = Character.toLowerCase(char977)
    val char1012LowerCase: Char = Character.toLowerCase(char1012)
    printf("%s %d%n", char977LowerCase, char977LowerCase.toInt)
    printf("%s %d%n", char1012LowerCase, char1012LowerCase.toInt)
    assert(char977LowerCase == 'ϑ')
    assert(char977LowerCase.toInt == 977)
    assert(char1012LowerCase == 'θ')
    assert(char1012LowerCase.toInt == 952) //GREEK SMALL LETTER THETA
    println("toUpperCase.toLowerCase")
    val char977UpperCaseLowerCase: Char = Character.toLowerCase(char977UpperCase)
    val char1012UpperCaseLowerCase: Char = Character.toLowerCase(char1012UpperCase)
    printf("%s %d%n", char977UpperCaseLowerCase, char977UpperCaseLowerCase.toInt)
    printf("%s %d%n", char1012UpperCaseLowerCase, char1012UpperCaseLowerCase.toInt)
    assert(char977UpperCaseLowerCase == 'θ')
    assert(char977UpperCaseLowerCase.toInt == 952)
    assert(char1012UpperCaseLowerCase == 'θ')
    assert(char1012UpperCaseLowerCase.toInt == 952)
    println("toLowerCase.toUpperCase")
    val char977LowerCaseUpperCase: Char = Character.toUpperCase(char977LowerCase)
    val char1012LowerCaseUpperCase: Char = Character.toUpperCase(char1012LowerCase)
    printf("%s %d%n", char977LowerCaseUpperCase, char977LowerCaseUpperCase.toInt)
    printf("%s %d%n", char1012LowerCaseUpperCase, char1012LowerCaseUpperCase.toInt)
    assert(char977LowerCaseUpperCase == 'Θ')
    assert(char977LowerCaseUpperCase.toInt == 920)
    assert(char1012LowerCaseUpperCase == 'Θ')
    assert(char1012LowerCaseUpperCase.toInt == 920)
    println("Normalize with the NFKC form")
    val char977Normalized: Char = Normalizer.normalize(char977.toString, Normalizer.Form.NFKC).head
    val char1012Normalized: Char = Normalizer.normalize(char1012.toString, Normalizer.Form.NFKC).head
    printf("%s %d%n", char977Normalized, char977Normalized.toInt)
    printf("%s %d%n", char1012Normalized, char1012Normalized.toInt)
    assert(char977Normalized == 'θ')
    assert(char977Normalized.toInt == 952)
    assert(char1012Normalized == 'Θ')
    assert(char1012Normalized.toInt == 920)
    println("Normalize with the NFKC form toUpperCase")
    val char977NormalizedUpperCase: Char = Character.toUpperCase(char977Normalized)
    val char1012NormalizedUpperCase: Char = Character.toUpperCase(char1012Normalized)
    printf("%s %d%n", char977NormalizedUpperCase, char977NormalizedUpperCase.toInt)
    printf("%s %d%n", char1012NormalizedUpperCase, char1012NormalizedUpperCase.toInt)
    assert(char977NormalizedUpperCase == 'Θ')
    assert(char977NormalizedUpperCase.toInt == 920)
    assert(char1012NormalizedUpperCase == 'Θ')
    assert(char1012NormalizedUpperCase.toInt == 920)
    println("toUpperCase Normalize with the NFKC form")
    val char977UpperCaseNormalized: Char = Normalizer.normalize(char977UpperCase.toString, Normalizer.Form.NFKC).head
    val char1012UpperCaseNormalized: Char = Normalizer.normalize(char1012UpperCase.toString, Normalizer.Form.NFKC).head
    printf("%s %d%n", char977UpperCaseNormalized, char977UpperCaseNormalized.toInt)
    printf("%s %d%n", char1012UpperCaseNormalized, char1012UpperCaseNormalized.toInt)
    assert(char977UpperCaseNormalized == 'Θ')
    assert(char977UpperCaseNormalized.toInt == 920)
    assert(char1012UpperCaseNormalized == 'Θ')
    assert(char1012UpperCaseNormalized.toInt == 920)
    println("Normalize with the NFKC form toLowerCase")
    val char977NormalizedLowerCase: Char = Character.toLowerCase(char977Normalized)
    val char1012NormalizedLowerCase: Char = Character.toLowerCase(char1012Normalized)
    printf("%s %d%n", char977NormalizedLowerCase, char977NormalizedLowerCase.toInt)
    printf("%s %d%n", char1012NormalizedLowerCase, char1012NormalizedLowerCase.toInt)
    assert(char977NormalizedLowerCase == 'θ')
    assert(char977NormalizedLowerCase.toInt == 952)
    assert(char1012NormalizedLowerCase == 'θ')
    assert(char1012NormalizedLowerCase.toInt == 952)
    println("toLowerCase Normalize with the NFKC form")
    val char977LowerCaseNormalized: Char = Normalizer.normalize(char977LowerCase.toString, Normalizer.Form.NFKC).head
    val char1012LowerCaseNormalized: Char = Normalizer.normalize(char1012LowerCase.toString, Normalizer.Form.NFKC).head
    printf("%s %d%n", char977LowerCaseNormalized, char977LowerCaseNormalized.toInt)
    printf("%s %d%n", char1012LowerCaseNormalized, char1012LowerCaseNormalized.toInt)
    assert(char977LowerCaseNormalized == 'θ')
    assert(char977LowerCaseNormalized.toInt == 952)
    assert(char1012LowerCaseNormalized == 'θ')
    assert(char1012LowerCaseNormalized.toInt == 952)
    println("---")

    assert(char977 != char1012)
    //toUpperCase
    assert(Character.toUpperCase(char977) != Character.toUpperCase(char1012))
    //toLowerCase
    assert(Character.toLowerCase(char977) != Character.toLowerCase(char1012))
    //toUpperCase.toLowerCase
    assert(Character.toLowerCase(Character.toUpperCase(char977)) == Character.toLowerCase(Character.toUpperCase(char1012)))
    //toLowerCase.toUpperCase
    assert(Character.toUpperCase(Character.toLowerCase(char977)) == Character.toUpperCase(Character.toLowerCase(char1012)))
    //normalize with the NFKC form
    assert(Normalizer.normalize(char977.toString, Normalizer.Form.NFKC).head != Normalizer.normalize(char1012.toString, Normalizer.Form.NFKC).head)
    //normalize with the NFKC form toUpperCase
    assert(Character.toUpperCase(Normalizer.normalize(char977.toString, Normalizer.Form.NFKC).head) == Character.toUpperCase(Normalizer.normalize(char1012.toString, Normalizer.Form.NFKC).head))
    //toUpperCase normalize with the NFKC form
    assert(Normalizer.normalize(Character.toUpperCase(char977).toString, Normalizer.Form.NFKC) == Normalizer.normalize(Character.toUpperCase(char1012).toString, Normalizer.Form.NFKC))
    //normalize with the NFKC form toLowerCase
    assert(Normalizer.normalize(char977.toString, Normalizer.Form.NFKC).toLowerCase == Normalizer.normalize(char1012.toString, Normalizer.Form.NFKC).toLowerCase)
    //toLowerCase normalize with the NFKC form
    assert(Normalizer.normalize(Character.toLowerCase(char977).toString, Normalizer.Form.NFKC) == Normalizer.normalize(Character.toLowerCase(char1012).toString, Normalizer.Form.NFKC))
  }
}
