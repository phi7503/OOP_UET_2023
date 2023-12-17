
package exercise;


public class SonOfBoo extends Boo {
    public SonOfBoo(){
        super("boo");
    }
    public SonOfBoo(int i){
        super("Foo");
    }
    public SonOfBoo(String s){//Modified to call Boo's constructor with a String argument.
        super(s);
    }
    public SonOfBoo(int i, String s){
    }
    public SonOfBoo(String a,String b,String c){//add c
        super(a,b,c);
    }
    public SonOfBoo(int i,int j){
        super("bar",j);
    }
    public SonOfBoo(int i,int x,int y){
        super(i);//delete"Boo"
    }
}
