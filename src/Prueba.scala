import scala.io.StdIn.{readDouble, readInt}
import scala.math._

object Prueba {
  def obtenerCociente (num: Int, estimacion : Double) : Double = {
    return num/estimacion;
  }
  def obtenerPromedio(cuociente: Double, estimacion: Double, num: Int): Double={
    return (cuociente+estimacion)/num;
  }
  def main(args: Array[String]): Unit = {
    println("Ingresa la aproximacion inicial");
    var estimacion = readDouble()
    println("Ingresa el numero para calcular la raiz")
    val num = readInt()
    println("Ingresa el numero de estimacion que desea realizar: ")
    val numEstimaciones = readInt()
    var a = 0;
    for (a <- 1 to numEstimaciones){
      println("Estamacion " + a + ": ")
      println("Cuociente: ", obtenerCociente(num, estimacion))
      println("Promedio: ", obtenerPromedio(obtenerCociente(num, estimacion), estimacion, num))
      estimacion = obtenerPromedio(obtenerCociente(num, estimacion), estimacion, num)
      println("\n")
    }
  }
}