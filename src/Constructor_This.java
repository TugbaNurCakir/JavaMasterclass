

public class Constructor_This {
    String name;
    String surname;
    public Constructor_This(String name){
        this(name, "Cakir");
    }

    public Constructor_This(String name, String surname){
        System.out.println(name+" "+surname);
    }

    public static void main(String[] args) {
        //Constructor_This ct = new Constructor_This("Tugbanur");
    }
}
