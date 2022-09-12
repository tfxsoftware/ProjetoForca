

public class Tracinhos implements Cloneable
{
    private char[] texto ;

    public Tracinhos (int qtd) throws Exception
    {
		if (qtd <= 0){
            throw new Exception("Quantidade de tracinhos inválida!");
        }
        this.texto = new char[qtd];
        for (int i=0;i<qtd;i++){
            texto[i] = '_';
        }
        
        // verifica se qtd não é positiva, lançando uma exceção.
		// instancia this.texto com um vetor com tamanho igual qtd.
		// preenche this.texto com underlines (_).
    }

    public void revele (int posicao, char letra) throws Exception
    {
		if (posicao < 0 || posicao >= this.texto.length){
            throw new Exception("Posição inválida!");
        }
        this.texto[posicao] = letra;
        // verifica se posicao é negativa ou então igual ou maior
		// do que this.texto.length, lançando uma exceção.
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto
    }

    public boolean isAindaComTracinhos ()
    {
        for (int i=0;i<this.texto.length;i++){
            if (this.texto[i] == '_'){
                return true;
            }
        
        }
        return false;
        
        
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
    }

    public String toString ()
    {
        String caracteres = "";
        for (int i=0;i<this.texto.length;i++){
            caracteres = caracteres + this.texto[i] + " ";
        }
        return caracteres;
        // retorna um String com TODOS os caracteres que há
        // no vetor this.texto, intercalados com espaços em
        // branco
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    }

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto
    }

    public Object clone ()
    {
        // retornar uma copia de this
    }
}
