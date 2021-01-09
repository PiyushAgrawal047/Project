package String;
//this program's block  is for examine my knowledge.
public class StringComparing {

    public static void main(String[] args){
        //we use string buuilder because it is mutabale and can be moditfy
        StringBuilder s=new StringBuilder("piyush");
        StringBuilder s1=s;
        s1=s.append("Agrawal");//String builder function.
        if(s==s1)
            System.out.println("Same");
        else{
            System.out.println("not same");
        }
    }
}
