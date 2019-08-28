
public class Dog extends Animal{
    private int eyes;
    private int legs;
    public Dog(String name,int brain,int body,int eyes,int legs){
        super(name,brain,body);
        this.eyes=eyes;
        this.legs=legs;
    }

    //Calls the move method in Animal class
    public void walk1(int a){
        super.move(a);
    }

    //Overriding Eat method in animal class
    @Override
    public void eat(){
        System.out.println("We are in Dog class.");
    }


    //If we dont specify super.move then it will execute whichever method it find first
    //In this case the method given in Dog class.
    public void move(int a){
        System.out.println("We are in the Dog class.");
        System.out.println(a+20);
    }
    public void walk2(int a){
        move(a);
    }

}
