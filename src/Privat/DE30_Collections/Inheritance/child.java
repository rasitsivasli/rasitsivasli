package Privat.DE30_Collections.Inheritance;

public class child extends parent{

    @Override
    public void met_child(){
        System.out.println("child");

    }

    @Override
    public void met_Parent() {
        super.met_Parent();
    }
}
