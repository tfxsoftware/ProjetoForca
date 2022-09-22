public class TesteDeErros {
    public static void main(String[] args) {
        try
        {
            ControladorDeErros t1 = new ControladorDeErros(null);
            System.out.println ("Deu certo construir ControladorDeErros null");

        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir ControladorDeErros null"); 
        }
        try
        {
            ControladorDeErros t2 = new ControladorDeErros (-1);
            System.out.println ("Deu certo construir com -1 ControladorDeErros");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir com -1 ControladorDeErros");
        }    
        ControladorDeErros t3 = null;
        try
        {
            t3 = new ControladorDeErros (7);
            System.out.println ("Deu certo construir com 7 ControladorDeErros");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir com 7 ControladorDeErros");
        }
        ControladorDeErros t4 = null;
        try
        {
            t4 = new ControladorDeErros (7);
            System.out.println ("Deu certo construir com 7 ControladorDeErros");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir com 7 ControladorDeErros");
        }
        ControladorDeErros t5 = null;
        try
        {
            t5 = new ControladorDeErros (5);
            System.out.println ("Deu certo construir com 5 ControladorDeErros");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir com 5 ControladorDeErros");
        }
        try{
            t5.registreUmErro();
            t5.registreUmErro();
            t5.registreUmErro();
            t5.registreUmErro();
            t5.registreUmErro();
            
            System.out.println ("Deu certo registrar 5 erros");
            System.out.println(t5);
        }
        catch (Exception e){
            System.err.println("Deu erro registrar 4 erros");
        }
        try{
            t5.registreUmErro();
            System.out.println("deu certo registrar 5 erros (se isto ocorreu tem algo errado)");
        }
        catch(Exception erro){
            System.err.println("deu erro ao registrar 5 erros. é pra darerro pois já atingiu o máximo que era 5");
        }


        System.out.println("é " + t5.isAtingidoMaximoDeErros() + " que -> " + t5.toString() + "<- ja atingiu o maximo de erros");
        System.out.println("é " + t4.isAtingidoMaximoDeErros() + " que -> " + t4.toString() + "<- ja atingiu o maximo de erros");
        System.out.println("é " + t3.equals(t4) + " que " + t3.toString() + " é igual a " + t4.toString());
        System.out.println("é " + t4.equals(t5) + " que " + t4.toString() + " é igual a " + t5.toString());
        System.out.println ("Eh "+(t4.hashCode()==t5.hashCode())+" que o hashCode do " + t4.toString() + " é igual ao hashcode do " + t5.toString());
        ControladorDeErros copia = null;
        try{
            copia = new ControladorDeErros(t4);
            System.out.println("Deu certo fazer uma deepcopy de " + t4.toString());
            System.out.println(copia.toString() + "<< print da copia");
        }
        catch (Exception erro){
            System.err.println("Deu erro ao fazer uma deepcopy de " + t4.toString());
        }
        System.out.println("modificando a original: ");
        try{t4.registreUmErro();} catch (Exception e) {}
        System.out.println(t4.toString());
        System.out.println("print da copia após modificarmos a original: ");
        System.out.println(copia.toString());
    }
}
