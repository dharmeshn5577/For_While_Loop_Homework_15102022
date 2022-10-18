// 15. Printout multiplication table using DO WHILE loop in below format
//     	1    2    3
//	    2    4    6
//	    3    6    9
//	    4    8    12
//	    5    10   15
//	    6    12   18
//	    7    14   21

public class MultiplicationTableInGivenFormat {

    public static void main(String[] args) {

//        for (int i = 1; i <=10 ; i++) {  System.out.print(i + " ");
//        for (int j = 1; j <=3; j++) {System.out.print(i*j + " ");}}

//  Confused in question so printed in 2 different format
        System.out.println("Multiplication table in given format : ");
        System.out.println( "FORMAT-01 : ");
        int i = 1;
        do {            // used do while loop
        int j = 1;
        do {            // used nested do while loop
            System.out.print(j + " x " + i + " = " +(i * j) + "    ");
            j++;
        } while (j <= 3) ;
            System.out.println(" ");
            i++;
        }while (i <= 10) ;
        System.out.println(" ");

        System.out.println( "FORMAT-02 : ");
        int k = 1;
        do {
            int l = 1;
            do {
                System.out.print((k * l) + "    ");
                l++;
            } while (l <= 3) ;
            System.out.println(" ");
            k++;
        }while (k <= 10) ;
    }
}
