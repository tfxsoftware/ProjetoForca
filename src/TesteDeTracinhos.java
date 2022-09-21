public class TesteDeTracinhos {
    public static void main(String[] args) {
        try
        {
            Tracinhos t1 = new Tracinhos(null);
            System.out.println ("Deu certo construir Tracinhos null");

        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir Tracinhos null"); 
        }
        try
        {
            Tracinhos t2 = new Tracinhos (-1);
            System.out.println ("Deu certo construir com -1 tracinhos");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir com -1 tracinhos");
        }    
        Tracinhos t3 = null;
        try
        {
            t3 = new Tracinhos (7);
            System.out.println ("Deu certo construir com 7 tracinhos");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir com 7 tracinhos");
        }
        Tracinhos t4 = null;
        try
        {
            t4 = new Tracinhos (7);
            System.out.println ("Deu certo construir com 7 tracinhos");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir com 7 tracinhos");
        }
        Tracinhos t5 = null;
        try
        {
            t5 = new Tracinhos (5);
            System.out.println ("Deu certo construir com 5 tracinhos");
        }
        catch (Exception erro)
        {
            System.err.println ("Deu erro construir com 5 tracinhos");
        }
        try{
            t5.revele(0,'b');
            System.out.println ("Deu certo revelar a primeira letra para n: printo do objeto abaixo");
            System.out.println(t5);
        }
        catch (Exception e){
            System.err.println("Deu erro ao revelar a primeira letra para n");
        }
        try{
            t5.revele(10,'b');
            System.out.println("deu certo ao revelar a 10 letra para b (se isto ocorreu tem algo errado)");
        }
        catch(Exception erro){
            System.err.println("deu erro ao revelar a 10 letra para b, é para dar erro mesmo");
        }
        try{
            t5.revele(1,'a');
            t5.revele(2,'c');
            t5.revele(3,'o');
            t5.revele(4, 'n');
            System.out.println("deu certo ao revelar o resto da palavra para bacon, print do objeto abaixo");
            System.out.println(t5);
        }
        catch (Exception e){
            System.out.println("deu erro ao revelar o resto da palavra para bacon, print do objeto abaixo");
            System.out.println(t5);
        }

        System.out.println("é " + t5.isAindaComTracinhos() + " que -> " + t5.toString() + "<- ainda tem tracinhos");
        System.out.println("é " + t4.isAindaComTracinhos() + " que -> " + t4.toString() + "<- ainda tem tracinhos");
        System.out.println("é " + t3.equals(t4) + " que " + t3.toString() + " é igual a " + t4.toString());
        System.out.println("é " + t4.equals(t5) + " que " + t4.toString() + " é igual a " + t5.toString());
        System.out.println ("Eh "+(t4.hashCode()==t5.hashCode())+" que o hashCode do " + t4.toString() + " é igual ao hashcode do " + t5.toString());
        Tracinhos copia = null;
        try{
            copia = new Tracinhos(t5);
            System.out.println("Deu certo fazer uma deepcopy de " + t5.toString());
            System.out.println(copia.toString() + "<< print da copia");
        }
        catch (Exception erro){
            System.err.println("Deu erro ao fazer uma deepcopy de " + t5.toString());
        }
        System.out.println("modificando a original: ");
        try{t5.revele(0, 'z');} catch (Exception e) {}
        System.out.println(t5.toString());
        System.out.println("print da copia após modificarmos a original: ");
        System.out.println(copia.toString());
    }
}