import javax.swing.JOptionPane;
import java.util.Random;
//create class
public class GuessNum{
    public static void main(String[] args) {
        Random rd=new Random();
        //generate random numbers from 0 to 10
        int n=rd.nextInt(10)+1;

        while(true){
            String response=JOptionPane.showInputDialog(null,"Enter any number : ");
            int guess=Integer.parseInt(response);

            if(guess>n){
                JOptionPane.showMessageDialog(null,"Too high");
            }
            else if(guess<n){
                JOptionPane.showMessageDialog(null,"Too low");
            }
            else{
                JOptionPane.showMessageDialog(null,"your guess is correct");
                break;
            }
        }
    }
}