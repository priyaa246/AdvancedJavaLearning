package AutoboxingAndUnboxing;

public class AutoBoxingDemo {
    public static void main(String[] args) {
        int i = 10;

        //Autoboxing -> From primitive to object -> For autoboxing you will call valueOf()
        Integer integerObj = Integer.valueOf(i);
        System.out.println("Autoboxing: Converting int primitive type to Integer object class: "+integerObj);

        //Auto-unbox -> From object to primitive type
        int primitiveInt = integerObj; //Here simply assigning it.
        System.out.println("Unboxing: Converting integer object into primitive int: "+primitiveInt);

        //For characters:

        Character chObj = 'a'; //'a' is by default of char primitive type

        Character chObj2 = Character.valueOf('a'); //same impact as above

        char primitiveChar = chObj;

        System.out.println("Value of primitive char: "+primitiveChar);
        System.out.println("Value of character object class: "+chObj);

    }
}
