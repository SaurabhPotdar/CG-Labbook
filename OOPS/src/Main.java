import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		/*String name = sc.nextLine();
		int brain = sc.nextInt();
		int body = sc.nextInt();
		int eyes = sc.nextInt();
		int legs = sc.nextInt();*/

        Animal animal = new Animal("Animal",1,1);
        System.out.println(animal.getName());
        animal.eat();

        Animal animal1 = new Animal();
        System.out.println(animal1.getName());

        System.out.println();

        Dog dog = new Dog("Labrador",1,1,2,4);
        System.out.println(dog.getName());
        dog.chew();  //Inheriting chew from dog class
        dog.eat();  //Overriding eat in dog class
        dog.walk1(10);  //Walk1 calls move in Animal class
        dog.walk2(10);  //Walk2 calls move in Dog class

    }
}
