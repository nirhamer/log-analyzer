package ru.iitdgroup.gpb;

import java.util.Scanner;

class arr15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int i,j,row,column;
        float sum=0,average;
        System.out.println("number of rows");
        row = sc.nextInt();
        System.out.println("number of columns");
        column = sc.nextInt();

        int[][] mat = new int[row][column];

        System.out.println("entries are as follows") ;
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("entries are as follows") ;
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println("");
        }

        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                sum = sum + mat[i][j];
            }
        }
/**
 * returns average sum
 */
        average=sum/(row*column);
        System.out.printf("AVERAGE is = %.2f",average) ;
    }
}