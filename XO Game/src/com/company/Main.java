package com.company;
import java.util.Scanner;
public class Main {
// the shape of the game O.o :) ;)
    public static void the_shape (String table [][]) {
        String [] digit_char ={"1","2","3","4","5","6","7","8","9"};
        int DC = 0 ;
        // the odd column and ' | '  & the odd row print ' _ '
        //void border ()
        // {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col % 2 != 0 && row % 2 == 0) {
                    table[row][col] = "  | ";
                    System.out.print(table[row][col]);
                }
                if (row % 2 != 0 && col % 2 == 0) {
                    table[row][col] = "--";
                    System.out.print(table[row][col]);
                }
                if (row % 2 != 0 && col % 2 != 0) {
                    table[row][col] = " + ";
                    System.out.print(table[row][col]);
                }
                if (row % 2 == 0 && col % 2 == 0) {
                        table[row][col] = digit_char[DC];
                        System.out.print(table[row][col]);
                        DC++;
                }
            }
            System.out.println();
        }
        System.out.println("==============================================");
        System.out.println();
        System.out.println();

        System.out.println("Player 1 : X \t\t Player 2: O");
        System.out.println();
        System.out.println();
    }
    public static void Player1(String table [][]){

    }
    public static void Player2(String table [][]){

    }
    public static void The_game (String table [][]){



    }

    public static void main(String[] args) {
        String[][] table = new String[5][5];
        the_shape(table);
    }

}
