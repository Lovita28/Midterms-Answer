class Condition {
    public static void main(String[] args) {
        int x = 30;
        int y = 10;
        char grade = 'A';

        // if-else Statement
        // if( x >= 20 ) {
        //    System.out.print("This is if statement " + x);
        // } else {
        //    System.out.print("This is else statement " + x);
        //     }

        // if( x == 10 ) {
        //     System.out.print("Value of X is 10");
        //  }else if( x == 20 ) {
        //     System.out.print("Value of X is 20");
        //  }else if( x == 30 ) {
        //     System.out.print("Value of X is 30");
        //  }else {
        //     System.out.print("This is else statement");
        //  }

        // nested-if statement
        // if( x == 30 ) {
        //     if( y == 10 ) {
        //     System.out.print("X = 30 and Y = 10");
        //     }
        // }

        // if (x==30 && y==10){
        //     System.out.print("X = 30 and Y = 10");
        // }

        // switch statement
        switch(grade) {
            case 'A' :
               System.out.println("Excellent!"); 
               break;
            case 'B' :
                System.out.println("Good job");
                break;
            case 'C' :
               System.out.println("Well done");
               break;
            case 'D' :
               System.out.println("You passed");
            case 'E' :
               System.out.println("Better try again");
               break;
            default :
               System.out.println("Invalid grade");
         }
         System.out.println("Your grade is " + grade);
    }
}

// java
// variable/attribute/method
// muridSekolahDasar

// Class
// Muridsekolahdasarnegerisatu
// MuridSekolahDasarNegeriSatu
