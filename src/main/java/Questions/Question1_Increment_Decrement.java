package Questions;

public class Question1_Increment_Decrement {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        if (x++ < ++y) { // x is still 1,   y is 2 ==> true
            System.out.print("Hello ");
        }else {
            System.out.print("Welcome ");
        }
        System.out.print("Log " + x + ":" + y);  // x is used again so x becomes 2
    }
}
/*
        What is the result?
        A. Hello
        Log 2:2
        B. Welcome
        Log 1:2
        C. Welcome
        Log 2:1
        D. Hello
        Log 1:2
* */
/*
x++ : post increment

In post decrement or increment result is always vsriables first value.
In thşs example x=1 then x++ is a post inc. so result=0 but x increase so x is 2.
It is same for decrement to result is varibles first value but variable is decreasing.


++y :pre increment

In pre decrement or increment first variable increase or decrease then result is became variables new value.
In this example y=1 then ++y is a pre inc. so y is increase first y=2 then result is variables new value which is 2 .

*/