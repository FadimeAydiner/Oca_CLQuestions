package Questions;

public class Question11_StringArray_concat {
    public static void main(String[] args) {
        String[] strs = {"A", "B"};
        int idx = 0;


	for (String s : strs) {
        strs[idx].concat(" element " + idx);
        // strs[idx]=strs[idx].concat(" element " + idx); if we assign the new value to
        // array than array can change.
        //without assign array not changed
        //Actually it is not about array.
        //It is about String which is immutable class. so when we change String object
        // with using some mehods it does not change String object
        //it just make effect the result where we use with String
        //If want to change String object itself then we have to assing

        /* String b="c";
        b.concat("777");
        System.out.println("b="+b);
        */

        idx++;

	}
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}
//What is the result?
//A.	A
//		B
//B.	A element 0
//		B element 1
//C.	A NullPointerException is thrown at runtime.
//D.	A 0
//		B 1
