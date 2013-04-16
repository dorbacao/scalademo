

 object Truples {

    def main(args: Array[String]) {

      val (nome, telefone, email) = obterCliente(1);

	println(nome, telefone, email);
    }


	def obterCliente(id : Int) = 
	{
		("Marcus", "22557788", "marcus@marcus.com")
	}

  }




