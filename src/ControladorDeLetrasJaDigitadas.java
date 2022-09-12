
public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.letrasJaDigitadas = "";
        // torna this.letrasJaDigitadas igual ao String vazio
    }

    public boolean isJaDigitada (char letra)
    {
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++){
            if (letra == this.letrasJaDigitadas.charAt(i)){
                return true;
            }
        }
        return false;
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
    }

    public void registre (char letra) throws Exception
    {
		if (isJaDigitada(letra)){
            throw new Exception("Letra já digitada")
        }
        else{
            this.letrasJaDigitadas = this.letrasJaDigitadas + letra;
        }
        // verifica se a letra fornecida ja foi digitada (pode usar
		// o método this.isJaDigitada, para isso), lancando uma exceção
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
    }

    public String toString ()
    {
        String letras = "";
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++){
            letras = letras + this.letrasJaDigitadas.charAt(i);
            if (i != letrasJaDigitadas.length() - 1){
                letras = letras + ",";
            }
        }
        return letras;
        

        // retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por vírgula (,).
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj são iguais
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    }

    public ControladorDeLetrasJaDigitadas(
    ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception // construtor de cópia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    }

    public Object clone ()
    {
        // criar uma cópia do this com o construtor de cópia e retornar
    }
}
