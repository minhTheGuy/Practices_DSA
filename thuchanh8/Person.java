public class Person {
    String name;
    int p_num;
    public Person(String name, int p_num) {
        this.name = name;
        this.p_num = p_num;
    }
    public String toString() {
        return "[" + name + ", " + p_num + "]";
    }
}