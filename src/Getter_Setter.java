
public class Getter_Setter {
    private int value;
    private String name;

    public Getter_Setter(int value, String name){
        setName(name);
        setValue(value);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getValue(){
        return value;
    } 

    public void setValue(int value){
        this.value = value;
    }

    public static void main(String args[]){
        Getter_Setter gs = new Getter_Setter(5, "tugbanur");
        System.out.println("your name is: "+gs.getName());
        System.out.println("your value is: "+gs.getValue());
    }
}
