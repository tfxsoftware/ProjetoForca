import java.io.EOFException;

public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
		if (texto == null || texto == ""){
            throw new Exception("Texto inválido!");
        }
        this.texto = texto;
        // verifica se o texto recebido é nulo ou então vazio,
		// ou seja, sem nenhum caractere, lançando exceção.
		// armazena o texto recebido em this.texto.
    }

    public int getQuantidade (char letra)
    {
        int quantidade = 0;    
        for (int i = 0; i < this.texto.length(); i++){
            if(this.texto.charAt(i)== letra){
                quantidade++;
            }
        }
        return quantidade;
        
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida
        
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        int posicao = -1;
        int contador = 0;
        for (int index = 0; index < this.texto.length(); index++){
            if(this.texto.charAt(index)== letra){
                if (i==contador){
                    posicao = index;
                    return posicao;
                }
                else{
                    contador++;
                }
            }
        }
        if (posicao == -1){
            throw new Exception("letra nao existe na ocorrencia selecionada");
        }
        return posicao;
        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre em this.texto
        // a Iézima aparição da letra fornecida.
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
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

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
