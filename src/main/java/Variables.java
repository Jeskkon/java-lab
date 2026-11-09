public class Variables {
    String name = "Jeskkon";
    int age = 22;
    boolean isActive = true;
    String goal = "just for fun";
    int a;
    long b;
    double c;
    boolean d;
    char e;
    String f = "All data types start with a lowercase letter, but String starts with an uppercase... why?";

    public void main(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        observation();
    }
    public void observation(){
        System.out.println("It seems that Java assigns the value 0 to variables.");
    }
}
