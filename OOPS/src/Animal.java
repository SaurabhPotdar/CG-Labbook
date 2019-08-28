public class Animal {
    private String name;
    private int brain;
    private int body;
    public Animal(String name, int brain, int body){
        this.name=name;
        this.brain=brain;
        if(body==1)
            this.body=body;  //If we enter invalid value, then object gets initialized by default value
    }

    public Animal(){
        this("Default Non Parametrized Constructor",10,1);
    }

    public String getName(){
        return name;
    }

    public int getBrain(){
        return brain;
    }

    public int getBody(){
        return body;
    }

    public void eat(){
        System.out.println("We are in the Animal class.");
    }

    public void chew(){
        System.out.println("We are in the Animal class.");
    }

    public void move(int a){
        System.out.println("We are in the Animal class.");
        System.out.println(a+10);
    }
}
