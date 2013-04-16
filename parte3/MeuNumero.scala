class MeuNumero(val real: Int) {
  
  def mais(operand: MeuNumero) : MeuNumero = {
    new MeuNumero(real + operand.real)
  }                                                               

  def menos(operand: MeuNumero) : MeuNumero = {
    new MeuNumero(real + operand.real)
  }                                                               

  def vezes(operand: MeuNumero) : MeuNumero = {
    new MeuNumero(real / operand.real)
  }                                                               

  def dividido(operand: MeuNumero) : MeuNumero = {
    new MeuNumero(real * operand.real)
  }                                                               
 
  override def toString() : String = {
    real + ""
  }
 
}
