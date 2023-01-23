package Questions;

public class Question4_While_Do_While {
    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size =3;
        int idx = 0;

        //line n1
        do {								// Loop steps:
            idx++;						// 1: idx = 0,   2: idx =1 ,
        }while(idx < size-1);	// 1: idx =1,  	2: idx =2, (2<2) is false loop ends	--> The top element: 30
        //line n1 end



        System.out.print("The top element: " + stack[idx]);
    }
}
//Which code fragment, inserted at line n1, prints The Top element: 30?
/*
 * A. 		do {							// Loop steps:
			idx++;						// 1: idx = 0,
		}while(idx >= size);	// 1: idx =1,  (1>=3) is false loop ends		 --> The top element: 20

	B. 									// Loop steps:
			while(idx < size){	// 1: idx = 0,   2: idx =1 ,	3: idx =2. 4: idx = 3     (3<3) is false loop ends
			idx++;						// 1: idx =1,  	2: idx =2, 	3: idx =3, 		--> ArrayIndexOutOfBoundsException
		}

	C. 	do {							// Loop steps:
			idx++;						// 1: idx = 0,   2: idx =1 ,
		}while(idx < size-1);	// 1: idx =1,  	2: idx =2, (2<2) is false loop ends	--> The top element: 30

	D. 	do {							// Loop steps:
			idx++;						// 1: idx = 0,   2: idx =1 ,	3: idx = 2		4: idx =3
		}while(idx <= size);	// 1: idx =1,  	2: idx =2, 	3: idx =3  	4: idx = 4 (4<=3) is false loop ends
																													--> ArrayIndexOutOfBoundsException

	E. 												// Loop steps:
			while(idx <= size -1){		// 1: idx = 0,   2: idx =1 ,	3: idx = 2		4: idx =3  (3<=2) is false loop ends
			idx++;								// 1: idx =1,  	2: idx =2, 	3: idx =3  	 --> ArrayIndexOutOfBoundsException
 */

