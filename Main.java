import java.util.Scanner;
class Main {
public static void main(String[] args) {
 System.out.println("Wybierz operację:\n 1 - suma, 2 - różnica, 3 - iloczyn, 4 -iloraz"); 
 Scanner in = new Scanner (System.in);
 int wybór = in.nextInt();
 System.out.println("Podaj pierwszą liczbe: ");
 Float a = in.nextFloat();
 System.out.println("Podaj drugą liczbe: ");
 Float b = in.nextFloat();
 switch(wybór){
 case 1:{
 System.out.println("Suma liczb "+a+" oraz "+b+" wynosi "+(a+b));
 break; 
 }
 case 2:{
 System.out.println("Różnica liczb "+a+" oraz "+b+" wynosi "+(a-b));
 break;
 }
 case 3:{
 System.out.println("Iloczyn liczb "+a+" oraz "+b+" wynosi "+(a*b));
 break;
 }
 case 4:{
 if(b==0){
 System.out.println("Nie można dzielić przez zero."); 
 }
 else{
 System.out.println("Iloraz liczb "+a+" oraz "+b+" wynosi "+(a/b));
 } 
 break;
 }
 }
}
}