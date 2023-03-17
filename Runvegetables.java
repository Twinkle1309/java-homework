package inheritance;

public class Runvegetables {

    static int number(int x , int y){
        return x+y;
    }
    public static void main(String[] args) {

        int number1= number(0,2);

        System.out.println("Type of vegetables:" +number1);

        Vegetables v=new Vegetables();
        v.typesofvegetables();

        System.out.println("Type1-Leafy-green vegetable");
        System.out.println("");
        System.out.println("Child class:Lettuce" );
        Lettuce l=new Lettuce();
        l.cut();
        l.useinsalad();


        System.out.println("");
        System.out.println("child class:Spinach" );
        Spinach s=new Spinach();
        s.boil();
        s.makegravy();

        System.out.println("");
        System.out.println("Type2-Root vegetables");
        System.out.println("");
        System.out.println("child class:Potatoes");
        Potatoes p=new Potatoes();
        p.chopped();
        p.curry();

        System.out.println("");
        System.out.println("child class:Sweetpotato");
        Sweetpotatos r=new Sweetpotatos();
        r.boilit();
        r.eatit();



    }
}
