public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
		if (qtdMax <= 0){
            throw new Exception("Quantidade maxima de erros inválida!");
        }
        this.qtdMax = qtdMax;
    }

    public void registreUmErro () throws Exception
    {
        if (this.qtdErr >= qtdMax){
            throw new Exception("Quantidade máxima de erros antigida!");
        }
        else{
            this.qtdErr++;
        }
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        if (this.qtdErr >= qtdMax){
            return true;
        }
        else{
            return false;
        }

    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
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

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de cópia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    }

    public Object clone ()
    {
        // returnar uma cópia de this
    }
}
