

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

    }

    public void revele (int posicao, char letra) throws Exception
    {
		if (posicao < 0 || posicao >= this.texto.length){
            throw new Exception("Posição inválida!");
        }
        this.texto[posicao] = letra;

    }

    public boolean isAindaComTracinhos ()
    {
        for (int i=0;i<this.texto.length;i++){
            if (this.texto[i] == '_'){
                return true;
            }
        
        }
        return false;
        
    }
    
    @Override
    public String toString ()
    {
        String caracteres = "";
        for (int i=0;i<this.texto.length;i++){
            caracteres = caracteres + this.texto[i] + " ";
        }
        return caracteres;

    }

    @Override
    public boolean equals (Object obj)
    {
        if (this == obj) return true;
        if (obj==null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Tracinhos comparador = (Tracinhos) obj;
        if (this.texto != comparador.texto) return false;
        
        return true;
    }

    public int hashCode ()
    {
        int ret = 123;
        if (this.texto != null) ret = ret * 7 + this.texto.hashCode();
        if (ret < 0) ret=-ret;
        return ret;
    }
/* 
    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto
    }

    public Object clone ()
    {
        // retornar uma copia de this
    }
*/
}
