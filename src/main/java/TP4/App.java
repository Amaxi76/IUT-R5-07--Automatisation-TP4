package TP4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] calcule = args[0].split(" ");
        double resultat = 0.0;
        int cpt = 0;

        while ( cpt < calcule.length ) {
            if ( cpt == 0 ) {
                resultat = Double.parseDouble(calcule[cpt]);
            } else {
                if ( calcule[cpt].equals("+") ) {
                    resultat = resultat + Double.parseDouble(calcule[cpt + 1]);
                } else if ( calcule[cpt].equals("-") ) {
                    resultat = resultat - Double.parseDouble(calcule[cpt + 1]);
                } else if ( calcule[cpt].equals("*") ) {
                    resultat = resultat * Double.parseDouble(calcule[cpt + 1]);
                } else if ( calcule[cpt].equals("/") ) {
                    resultat = resultat / Double.parseDouble(calcule[cpt + 1]);
                }
            }
            cpt += 2;
        }

        System.out.println( "Résultat : " + resultat );
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

}
