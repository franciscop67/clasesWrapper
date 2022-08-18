public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000); //En java si es menor o igual a 127 compara por el valor.
        Integer num2 = num1;                   //De lo contrario por instancia

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));


        num2=1000; //Es otro objeto, Ya que no compara por el valor si no por la instancia
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));//Compara la instancia, no su valor

        System.out.println("Tienen el mismo valor ? " + (num1.equals(num2))); //Permite comparar por el valor
        System.out.println("Tienen el mismo valor ? " + (num1.intValue() == num2.intValue()));//Otra manera
        //de comparar valor

        num2=500;
        boolean condicion =  num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 =  num1.intValue() < num2.intValue();
        System.out.println("condicion = " + condicion2);
    }
}
