package Privat.DE25_InHeritance.task02;

public class Task {
public static int div(int a, int b){
    return a/b;
}

    public static void main(String[] args) {
   String a = "";
   a+=5;
   a+='c';
   a+=true;
   if (a=="%ctrue"){
       System.out.println(a+"<==");
   }else System.out.println("==>"+a);
   int div = Task.div(10,5);
        System.out.println("div = " + div);
    }
}
