
public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.letrasJaDigitadas = "";

    }

    public boolean isJaDigitada (char letra)
    {
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++){
            if (letra == this.letrasJaDigitadas.charAt(i)){
                return true;
            }
        }
        return false;

    }

    public void registre (char letra) throws Exception
    {
		if (isJaDigitada(letra)){
            throw new Exception("Letra já digitada");
        }
        else{
            this.letrasJaDigitadas = this.letrasJaDigitadas + letra;
        }
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
        

    }

  
    public boolean equals (Object obj)
    {
        if (this == obj) return true;
        if (obj==null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ControladorDeLetrasJaDigitadas comparador = (ControladorDeLetrasJaDigitadas) obj;
        if (this.letrasJaDigitadas != comparador.letrasJaDigitadas) return false;
        
        return true;

    }
/* 
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
*/
}

