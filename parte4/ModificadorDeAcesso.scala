package brasil
{
	package rioDeJaneiro
	{
		class Maravilhosa
		{
			private[rioDeJaneiro] var valPIB = null
			private[brasil] var valAnalfabetismo = null
			private[this] var valCriminalidade = null
			private var valCorrupcao = null

			def help(cidade:Maravilhosa)
			{
				println(cidade.valPIB)
				println(cidade.valAnalfabetismo)
				//println(cidade.valCriminalidade)
				println(valCriminalidade)
				println(cidade.valCorrupcao)
			}
		}

		class Niteroi
		{
			def help(cidade:Maravilhosa)
			{
				println(cidade.valPIB)
				println(cidade.valAnalfabetismo)
				//println(cidade.valCriminalidade)
				//println(cidade.valCorrupcao)
			}
		}
	}

	package minasGerais
	{
		class beloHorizonte
		{
			def help(cidade: brasil.rioDeJaneiro.Maravilhosa)
			{
				//println(cidade.valPIB)	
				println(cidade.valAnalfabetismo)	
				//println(cidade.valCriminalidade)	
				//println(cidade.valCorrupcao)
			}
		}	
	}
}

package bolivia
{
	class Sucre
	{
		def help(cidade: brasil.rioDeJaneiro.Maravilhosa)
		{
			//println(cidade.valPIB)	
			//println(cidade.valAnalfabetismo)	
			//println(cidade.valCriminalidade)	
			//println(cidade.valCorrupcao)
		}
	}
}