package Questions;

//in question it is X but i used in different quesiton X so i changed it
class X2 {
    static int i;  // static fields gets changed for every object
    int j;

}


public class Question7_staticKeyword {
    public static void main(String[] args) {
        X2 x1 = new X2();
        X2 x2 = new X2();
        x1.i= 3;
        x1.j = 4;
        x2.i= 5;
        x2.j = 6;
        System.out.println(
                x1.i + " " +
                        x1.j + " " +
                        x2.i + " " +
                        x2.j);
    }
}
//What is the result?
//A.-3 4 5 6
//B.3 4 3 6
//C.5 4 5 6
//D.3 6 4 6

//original
/*
public class X {
    static int i;  // static fields gets changed for every object
    int j;
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();
        x1.i= 3;
        x1.j = 4;
        x2.i= 5;
        x2.j = 6;
        System.out.println(
                x1.i + " " +
                        x1.j + " " +
                        x2.i + " " +
                        x2.j);
    }
}
*/