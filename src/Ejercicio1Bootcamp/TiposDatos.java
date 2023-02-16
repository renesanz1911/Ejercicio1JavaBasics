package Ejercicio1Bootcamp;

public class TiposDatos {
    /**
     Este metodo se va a usar para mostrar por pantalla los distintos
     tipos de datos que se vieron en el modulo
     **/
    public static void main(String[] args) {
        //Numericos
        byte variable1 = 8;
        short variable2 = 34;
        int variable3 = 350;
        long variable4 = 123123123;

        //Numericos (decimales)
        float variable5 = 23.3f;
        double variable6 = 156.48d;

        //logicos
        boolean variable7 = true;
        boolean variable8 = false;

        //texto
        char variable9 = 'a';
        String variable10 = "Se termino el ejercicio";

        System.out.println("los de tipo numericos son:" + "\r\n" + variable1 + "\r\n" + variable2 + "\r\n"
                + variable3 + "\r\n" + variable4 + "\r\n");
        System.out.println("los de tipo numericos decimales son:" + "\r\n" + variable5 + "\r\n" + variable6 + "\r\n");
        System.out.println("los de tipo booleans son:" + "\r\n" + variable7 + "\r\n" + variable8 + "\r\n");
        System.out.println("los de tipo texto son:" + "\r\n" + variable9 + "\r\n" + variable10 + "\r\n");

    }
}



