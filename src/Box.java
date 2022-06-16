import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Box<T extends Voice & Little> {
    private int a;
    private int b;
    private int c;

    private List<T> content;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public Box(int a, int b, int c) {
        this.content = new ArrayList<>();
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
