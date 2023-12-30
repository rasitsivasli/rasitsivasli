package _____OSA_____.OCA_Tum_Sorular.Q119_Static;

public class App {
  String greet="Welcome!";
    public App(){
        String greet="Hello!";
    }
    public void setGreet(){
        String greet="Good Day!";
    }

    public static void main(String[] args) {
        App t=new App();
        String greet="Good Luck!";
      System.out.println(t.greet);
    }
}
/*What is the result?
A. Good Luck!
B. Good Day!
C. Welcome!
D. Hello!
answer C
 */
