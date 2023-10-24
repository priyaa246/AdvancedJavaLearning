package Enumeration;

public class Main {
    public static void main(String[] args) {
        Color clr = Color.RED;
        System.out.println("Red enum name: "+ clr.name());
        System.out.println("Red enum value: "+clr.getValue());

        for(Color color:Color.values()){
            System.out.println("Color values: "+color.getValue());
        }
    }
}
