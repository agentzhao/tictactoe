package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter cells: ");
        String[] ttt = new String[9];
        String temp = scanner.next();
       
        for (int i=0; i < 9;i++){
           ttt[i] = temp.substring(i,i+1);
        }
       
        //print
        System.out.println("---------");
        System.out.println("| " + ttt[0] + " " + ttt[1] + " " + ttt[2] + " |");
        System.out.println("| " + ttt[3] + " " + ttt[4] + " " + ttt[5] + " |");
        System.out.println("| " + ttt[6] + " " + ttt[7] + " " + ttt[8] + " |");
        System.out.println("---------");
        
        //analyzer
        boolean xwins = false;
        boolean owins = false;
        boolean notfinished = false;
        boolean impossible = false;
        
        int countx = 0;
        int counto = 0;
        
        //check if game not finished
        for (int i=0;i<9;++i){
            if (ttt[i].equals("X")){
                countx++;
            } else if (ttt[i].equals("O")){
                counto++;
            } else {
                notfinished = true;
            }
        }
        
        //check if game is impossible
        if ((counto - countx) < -1 || (counto - countx) > 1){
            impossible = true;     
        }
        
        //check who wins
        if (ttt[0].equals(ttt[1]) && ttt[1].equals(ttt[2])){
            if (ttt[0].equals("X")){
                xwins = true;
            }
            if (ttt[0].equals("O")){
                owins = true;
            }
        }
              
        if (ttt[3].equals(ttt[4]) && ttt[4].equals(ttt[5])){
            if (ttt[3].equals("X")){
                xwins = true;
            }
            if (ttt[3].equals("O")){
                owins = true;
            }
        }
        if (ttt[6].equals(ttt[7]) && ttt[7].equals(ttt[8])){
            if (ttt[6].equals("X")){
                xwins = true;
            }
            if (ttt[6].equals("O")){
                owins = true;
            }
        }
        if (ttt[0].equals(ttt[3]) && ttt[3].equals(ttt[6])){
            if (ttt[0].equals("X")){
                xwins = true;
            }
            if (ttt[0].equals("O")){
                owins = true;
            }
        }
        if (ttt[1].equals(ttt[4]) && ttt[4].equals(ttt[7])){
            if (ttt[1].equals("X")){
                xwins = true;
            }
            if (ttt[1].equals("O")){
                owins = true;
            }
        }
        if (ttt[2].equals(ttt[5]) && ttt[5].equals(ttt[8])){
            if (ttt[2].equals("X")){
                xwins = true;
            }
            if (ttt[2].equals("O")){
                owins = true;
            }
        }
        if (ttt[0].equals(ttt[4]) && ttt[4].equals(ttt[8])){
            if (ttt[0].equals("X")){
                xwins = true;
            }
            if (ttt[0].equals("O")){
                owins = true;
            }
        }
        if (ttt[2].equals(ttt[4]) && ttt[4].equals(ttt[6])){
            if (ttt[2].equals("X")){
                xwins = true;
            }
            if (ttt[2].equals("O")){
                owins = true;
            }
        }
        
        if (xwins && owins){
            System.out.println("Impossible");
        } else if (impossible){
            System.out.println("Impossible");
        } else if (xwins){
            System.out.println("X wins");
        } else if (owins){
            System.out.println("O wins");
        } else if (notfinished){
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
    }
}
