public class TesteDeLetras {
    
        public static void main(String[] args) {
           

            ControladorDeLetrasJaDigitadas t4 = null;
            try
            {
                t4 = new ControladorDeLetrasJaDigitadas ();
                t4.registre('p');
                System.out.println ("Deu certo construir ControladorDeLetrasJaDigitadas");
            }
            catch (Exception erro)
            {
                System.err.println ("Deu erro construir ControladorDeLetrasJaDigitadas");
            }
            ControladorDeLetrasJaDigitadas t5 = null;
            try
            {
                t5 = new ControladorDeLetrasJaDigitadas ();
                System.out.println ("Deu certo construirControladorDeLetrasJaDigitadas");
            }
            catch (Exception erro)
            {
                System.err.println ("Deu erro construirControladorDeLetrasJaDigitadas");
            }
            try{
                t5.registre('b');
                t5.registre('a');
                t5.registre('c');
                t5.registre('o');
                t5.registre('n');
                
                System.out.println ("Deu certo registrar 5 letras ja digitadas");
                System.out.println(t5);
            }
            catch (Exception e){
                System.err.println("Deu erro registrar 5 letras ja digitas");

            }
            try{
                t5.registre('b');
                System.out.println("deu certo registrar a letra 'b' que ja foi digitadas (se isto ocorreu tem algo errado)");
            }
            catch(Exception erro){
                System.err.println("deu erro ao registrar a letra 'b' que ja foi digitada. é pra dar erro! ja registramos esta letra");
            }
    
    
            System.out.println("é " + t5.isJaDigitada('a') + " que -> " + t5.toString() + "<- ja registrou a letra a");
            System.out.println("é " + t4.isJaDigitada('a') + " que -> " + t4.toString() + "<- ja registrou a letra a");
            System.out.println("é " + t5.equals(t5) + " que " + t5.toString() + " é igual a " + t5.toString());
            System.out.println("é " + t4.equals(t5) + " que " + t4.toString() + " é igual a " + t5.toString());
            System.out.println ("Eh "+(t4.hashCode()==t5.hashCode())+" que o hashCode do " + t4.toString() + " é igual ao hashcode do " + t5.toString());
            ControladorDeLetrasJaDigitadas copia = null;
            try{
                copia = new ControladorDeLetrasJaDigitadas(t4);
                System.out.println("Deu certo fazer uma deepcopy de " + t4.toString());
                System.out.println(copia.toString() + "<< print da copia");
            }
            catch (Exception erro){
                System.err.println("Deu erro ao fazer uma deepcopy de " + t4.toString());
            }
            System.out.println("modificando a original: ");
            try{t4.registre('a');} catch (Exception e) {}
            System.out.println(t4.toString());
            System.out.println("print da copia após modificarmos a original: ");
            System.out.println(copia.toString());
        }
}
    

