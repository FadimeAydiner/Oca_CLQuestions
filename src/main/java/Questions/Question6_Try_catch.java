package Questions;

import java.io.IOException;

class X{
    public void printFileContent() throws IOException {
        /*code goes here */
        throw new IOException();//this give us two option 1)throws IOException 2)Surrounded with try-cath.
        //Option 1 is given in the options of question (e)
        //when accept this then in main() printFileContent(); complening then we have the sama options for it too.
        //it is given is given in the options of question (c)
    }
}

public class Question6_Try_catch {


      public static void main(String[] args) throws IOException {
            X xobj = new X();
            xobj.printFileContent();
        }
}

 /*   Which two modifications should you make so that the code compiles successfully? (Choose two.)
 a) Replace line 13 (in my program line 18 which is    xobj.printFileContent();) with:
    try{
       xobj.printFileContent();}
     catch{Exception e){}
     catch{IOception e){}
 b)Replace line 7(  throw new IOException();) with   throw new IOException("Exception raised);
c)Replace line 11(public static void main(String[] args)  )  public static void main(String[] args)  throws IOException
d) At line 14(after  xobj.printFileContent();) insert throw new IOException();
e)Replace line 5(  public void printFileContent() ) with   public void printFileContent() throws IOException

c and e

we can handle throw acception with two way:1)throws IOException 2)Surrounded with try-cath.

for this question the options just have throws exception
  */