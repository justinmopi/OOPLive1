//MAGIC SQUARE
package liveexercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*; 
public class opinaldoJMLiveExercise1 {

public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("MAGIC SQUARE");
    System.out.println("a b c");
    System.out.println("d e f");
    System.out.println("g h i");
        
    System.out.print("Enter first number(a): ");
    String A = in.readLine();
    int a = Integer.parseInt(A);
        if(a == 5){
            System.out.println("It's not a Magic Square");
            System.exit(0);}
       
    System.out.print("Enter second number(b): ");
    String B = in.readLine();
    int b = Integer.parseInt(B);
        if(b == 5 || b == a){
            System.out.println("It's not a Magic Square");
            System.exit(0);}
        
    System.out.print("Enter third number(c): ");
    String C = in.readLine();
    int c = Integer.parseInt(C);
        if(c == 5 || c == a || c == b){
            System.out.println("It's not a Magic Square");
            System.exit(0);}
        
    System.out.print("Enter fourth number(d): ");
    String D = in.readLine();
    int d = Integer.parseInt(D);
        if(d == 5 || d == a || d == b || d == c){
            System.out.println("It's not a Magic Square");
            System.exit(0);}
        
    System.out.print("Enter fifth number(e): ");
    String E = in.readLine();
    int e = Integer.parseInt(E);
        if(e != 5 || e == a || e == b || e == c || e == d){
            System.out.println("It's not a Magic Square");
            System.exit(0);}
        
    System.out.print("Enter sixth number(f): ");
    String F = in.readLine();
    int f = Integer.parseInt(F);
        if(f == a || f == b || f == c || f == d || f == e){
            System.out.println("It's not a Magic Square");
            System.exit(0);}
        
    System.out.print("Enter seventh number(g): ");
    String G = in.readLine();
    int g = Integer.parseInt(G);
        if(g == a || g == b || g == c || g == d || g == e || g == f){
            System.out.println("It's not a Magic Square");
            System.exit(0);}
        
    System.out.print("Enter eighth number(h): ");
    String H = in.readLine();
    int h = Integer.parseInt(H);
        if(h == a || h == b || h == e || h == d || h == e || h == f || h == g){
            System.out.println("It's not a Magic Square");
            System.exit(0);}
        
    System.out.print("Enter ninth number(i): ");
    String I = in.readLine();
    int i = Integer.parseInt(I);
        if(i == a || i == b || i == c || i == d || i == e || i == f || i == g || i == h){
            System.out.println("It's not a Magic Square");
            System.exit(0);}
        
    int row1 = a + b + c;
    int row2 = d + e + f;
    int row3 = g + h + i;
    int col1 = a + d + g;
    int col2 = b + e + h;
    int col3 = c + f + i;
        if(row1 == 15 && row2 == 15 && row3 == 15 && col1 == 15 && col2 == 15 && col3 == 15){
            System.out.println(a + " " + b + " " +  c);
            System.out.println(d + " " + e + " " +  f);
            System.out.println(g + " " + h + " " +  i);
            System.out.println("It's a MAGIC SQUARE");}
        else{
            System.out.println(a + " " + b + " " +  c);
            System.out.println(d + " " + e + " " +  f);
            System.out.println(g + " " + h + " " +  i);
            System.out.println("It's not a Magic Square!");}
}
}