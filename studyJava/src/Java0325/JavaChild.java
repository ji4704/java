package Java0325;

public class JavaChild extends Java_0325{
    public JavaChild() {
        super();
    }
    public JavaChild(int a, String b) {
        super(a, b);
    }
    @Override
    public String getString() {
        return "b";
    }

    public void setValue(int a) {
        super.setValue(a); // 자바스타일. 자바는 세터와 게터를 사용하는 것을 추천함
        //super.a = a; // 비추천. 자바스타일 아님
    }

    public void setValue(String b) {
        super.setString(b);
    }


}
