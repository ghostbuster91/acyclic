package multiconstructor.prog

object Prog extends sinject.Module[Prog]{}

class Prog(x: Int, s: String){

  val inner = new Inner('c', 100)
  val value = 10
  def run = inner.run()
}

