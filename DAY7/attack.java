package DAY7;
abstract class Character{
    String name ;
    Character(String n){
        this.name = n;
    }
    abstract void attacktype();
}
class warrior extends Character{
    warrior(String name){
        super(name);
    }
    void attacktype(){
        System.out.println(name+" : Attack with sword");
    }
}
class archer extends Character{
    archer(String name){
        super(name);
    }
    void attacktype(){
        System.out.println(name+" : Attack with arrow");
    }
}
class mage extends Character{
    mage(String name){
        super(name);
    }
    void attacktype(){
        System.out.println(name+" : Attack with magic");
    }
}
public class attack{
    public static void main(String[] args){
        Character c1 ;
        c1 = new warrior("nivetha");
         Character c2 ;
        c2 = new archer("kamal");
         Character c3 ;
        c3 = new mage("pooj");
        Character[] cha = {c1,c2,c3};
        for(Character ch : cha){
            ch.attacktype();
        }
    }

}