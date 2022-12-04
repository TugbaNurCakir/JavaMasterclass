public class Example{
    String name;
    int number;

    Example(String name){
        this(name, 4);
    }

    Example(String name, int number){
        System.out.println(name+number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        //Example e = new Example("tugbanur");
    }
}