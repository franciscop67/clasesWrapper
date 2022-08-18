public class WrapperInteger {
    public static void main(String[] args) {

        //Tomar el primitivo y lo transforma a objeto referencia
        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);// Crear un objeto del tipo integer
        //Unboxing: la conversión de un objeto de tipo contenedor a
        // su valor primitivo correspondiente se denomina unboxing
        Integer intObjeto2 =  intPrimitivo; //Autoboxing: la conversión de un valor primitivo en un objeto
        // de la clase contenedora correspondiente se denomina autoboxing
        System.out.println("intObjeto = " + intObjeto);

        //Tomar el objeto y lo transforma a primitivo
        int num = intObjeto;//Implicita
        System.out.println("num = " + num);
        int num2= intObjeto.intValue();//Explicita
        System.out.println("num2 = " + num2);

        String valorTVLcd = "67000";
        Integer valor =  Integer.valueOf(valorTVLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto =  intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        //Se puede convertir de un tipo de dato menor a uno mayor, pero uno menor
        //a mayor se tendria que verificar, ya que habría perdida de datos.

        Long longObjeto =  intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
