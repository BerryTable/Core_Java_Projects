package Basics;

/**
 * Created by MamathaGangappa on 4/2/17.
 */
public class twodimensionalArray {

    public static void main(String[] args) {
        //  rows, columns
        String x[][] = new String[2][3];

        x[0][0] = "A";
        x[0][1] = "B";
        x[0][2] = "C";


        x[1][0] = "A1";
        x[1][1] = "B2";
        x[1][2] = "C3";
        System.out.println(x.length);
        System.out.println(x[0].length);

        for(int i=0;i<x.length;i++)
        {
            for(int y=0;y<x[i].length;y++)
            {
                System.out.println(x[i][y]);
            }
        }


    }

    }



