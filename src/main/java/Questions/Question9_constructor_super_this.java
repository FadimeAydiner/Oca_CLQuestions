package Questions;


class CD{
    int r;
    CD (int r){

        this.r = r;
    }

}

 class DVD extends CD{
    int c;
    DVD(int r, int c){
        // line n1 //super() and this() must used to be after constructor
                //so we have choose one of them here we cant not use both of them.
                //super.r=r is not a suitable way to call constructor.
                //so we have to use super(r)
                //after than we cannot use this(c)

        super(r);
        this.c = c;
    }

}
public class Question9_constructor_super_this {
    public static void main(String[] args) {
        DVD dvd = new DVD(10,  20);



        System.out.println(dvd.r);
        System.out.println(dvd.c);


    }
}

/*
Which code fragment should you use at line n1 to instantiate the dvd object successfully?
A. super.r = r;		// super.r is not correct way to call parent class's constructor
	this.c = c;

B. super(r);
	this(c);				// this(); should be the first statement right after constructor

C. super(r);
	this.c = c;

D. this.c = r;
	super(c);        	// super(); should be the first statement right after constructor
*/
