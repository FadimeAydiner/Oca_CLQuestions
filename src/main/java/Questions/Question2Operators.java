package Questions;

public class Question2Operators {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = j += i / 5 ;
        // k = j = j + i / 5 ==> first i / 5 = 2, then k = j = j + 2 => 22
        System.out.println(i + " : " + j + " : " + k);
    }
}
/*
* What is the result?
A. 10 : 30 : 6
B. 10 : 22 : 22
C. 10 : 22 : 20
D. 10 : 22 : 6
* */