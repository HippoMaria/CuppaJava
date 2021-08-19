import java.util.*;
import java.io.*;

public class Battleship {


    public static void main(String[] args) {
        
        System.out.println("Welcome to Battleship!\n");

        char[][] ocean1= new char[5][5];//Create the main ocean map for Player 1
        char[][] ocean2= new char[5][5];//Create the main ocean map for Player 2

        for (int row = 0; row < ocean1.length; row++)
          {for (int col = 0; col < ocean1[row].length; col++)
            {ocean1[row][col] = '-'; }       
                }

        for (int row = 0; row < ocean2.length; row++)
          {for (int col = 0; col < ocean2[row].length; col++)
            {ocean2[row][col] = '-'; }       
                }

        char[][] history1= new char[5][5];//Create the main ocean map for Player 1
        char[][] history2= new char[5][5];//Create the main ocean map for Player 2

        for (int row = 0; row < history1.length; row++)
          {for (int col = 0; col < history1[row].length; col++)
            {history1[row][col] = '-'; }       
                }

        for (int row = 0; row < history2.length; row++)
          {for (int col = 0; col < history2[row].length; col++)
            {history2[row][col] = '-'; }       
                }

        Scanner input = new Scanner(System.in); //read keyboard input
        System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");

        int p1ship = 0;

        while (p1ship<5){
            System.out.println("Enter ship " + (p1ship+1) + " location:");
            int row=input.nextInt();
            int col= input.nextInt();

            
            if (row>4||col>4||row<0||col<0){
                System.out.println("Invalid coordinates. Choose different coordinates.");
            } else if (row>4||col>4||row<0||col<0){
                System.out.println("Invalid coordinates. Choose different coordinates.");
            } else if(ocean1[row][col] == '@') { 
                System.out.println("You already have a ship there. Choose different coordinates.");
            } else {
                ocean1 [row][col]='@';
                p1ship++;
            }
            }

        printBattleShip(ocean1);

        for (int i = 0; i < 100; i++){
        System.out.println();
        }

        System.out.println("PLAYER 2, ENTER YOUR SHIPS’ COORDINATES.");

        int p2ship = 0;

        while (p2ship<5){
            System.out.println("Enter ship " + (p2ship+1) + " location:");
            int row=input.nextInt();
            int col= input.nextInt();

            if (row>4||col>4||row<0||col<0){
                System.out.println("Invalid coordinates. Choose different coordinates.");
            } else if(ocean2[row][col] == '@') { 
                System.out.println("You already have a ship there. Choose different coordinates.");
            } else {
                ocean2 [row][col]='@';
                p2ship++;
            }
            }

        printBattleShip2(ocean2);

        for (int i = 0; i < 100; i++){
        System.out.println();
        }


//Battle
        do{

        System.out.println("\nPlayer 1, enter hit row/column:");
        int turn=0;

        while (turn==0 &&p1ship!=0 && p2ship!=0) {

            int row = input.nextInt();
            int col = input.nextInt();


            if (row>4||col>4||row<0||col<0) {
                System.out.println("Invalid coordinates. Choose different coordinates.\n");
            }else if(ocean2[row][col] =='O'||ocean2[row][col] == 'X'){
                System.out.println("You already fired on this spot. Choose different coordinates.\n");
            } else if (ocean2[row][col] == '@') {//Player correctly guessed coordinates
                System.out.println("PLAYER 1 HIT PLAYER 2’s SHIP!");
                history2[row][col] = 'X';
                ocean2[row][col] = 'X';
                printHistory2(history2);
                p2ship--;
                turn++;
            } else {//Player missed. No ship on the entered coordinates
                System.out.println("PLAYER 1 MISSED!");
                history2[row][col] = 'O';
                ocean2[row][col]='O';
                printHistory2(history2);
                turn++;
            }
        }

        System.out.println("\nPlayer 2, enter hit row/column:");
        int turn2=0;

        while (turn2==0 &&p1ship!=0 && p2ship!=0) {

            int row = input.nextInt();
            int col = input.nextInt();


            if (row>4||col>4||row<0||col<0) {
                System.out.println("Invalid coordinates. Choose different coordinates.\n");
            }else if(ocean1[row][col] =='O'||ocean1[row][col] == 'X'){
                System.out.println("You already fired on this spot. Choose different coordinates.\n");
            } else if (ocean1[row][col] == '@') {//Player correctly guessed coordinates
                System.out.println("PLAYER 2 HIT PLAYER 1’s SHIP!");
                history1[row][col] = 'X';
                ocean1[row][col] = 'X';
                printHistory1(history1);
                p1ship--;
                turn2++;
            } else {//Player missed. No ship on the entered coordinates
                System.out.println("PLAYER 2 MISSED!");
                history1[row][col] = 'O';
                ocean1[row][col]='O';
                printHistory1(history1);
                turn2++;
            }
        }
    }while(p1ship!=0 && p2ship!=0);

    if (p2ship==0){
            System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n");
            System.out.println("Final boards:");
            printBattleShip(ocean1);
            System.out.println();
            printBattleShip2(ocean2);
        } else if (p1ship==0){
            System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n");
            System.out.println("Final boards:");
            printBattleShip(ocean1);
            System.out.println();
            printBattleShip2(ocean2);
        }


}
 

 //------ Main Ends Here ---------

       public static void printBattleShip(char[][] ocean1) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(ocean1[row][column] + " ");
                }
            }
            System.out.println("");
        }
        }

        public static void printBattleShip2(char[][] ocean2) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(ocean2[row][column] + " ");
                }
            }
            System.out.println("");
        }
        }

        public static void printHistory1(char[][] history1) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(history1[row][column] + " ");
                }
            }
            System.out.println("");
        }
        }

        public static void printHistory2(char[][] history2) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(history2[row][column] + " ");
                }
            }
            System.out.println("");
        }
        }

        
}




