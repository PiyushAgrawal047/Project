//DEMO PROGRAM



public abstract class AbstractionProject {

     private int id;
      private int phoneNumber;
     public abstract void run();
     public AbstractionProject(int id,int phoneNumber){
         this.id=id;
         this.phoneNumber=phoneNumber;
     }
}
class Lone extends AbstractionProject{

    public Lone(int id, int phoneNumber) {
        super(id, phoneNumber);
    }

    @Override
    public void run() {
        System.out.println("running"
        );

    }
}
class Main{
    public static void main(String[] args) {
        AbstractionProject abstractionProject=new Lone(23,900000000);
        abstractionProject.run();

    }
}
