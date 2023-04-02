/**
 * pattern
 */
// 1)Pattern-1 
// ****
// ****
// ****
// ****
//boiler - clas
//psvm
// public class pattern {

//     public static void main(String[] args) {
//         int n = 4;
//         int m = 4;
//         for (int i = 0; i<n; i++) {
//             for (int j = 0; j<m; j++) {
//                System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//-------------------------------------------------------
// 2)Pattern-2 
// ****
// ***
// **
// *

/**
 * Innerpattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         int n = 3;
//         int m = 3;
//         for (int i = 0; i<=n; i++) {
//             for (int j=0; j<=n-i; j++) {
//                System.out.print("*");
//             }
//             for (int k=0; k<m+1; k++) {
//                 System.out.print("");
//              }
//             System.out.println();
//         }
//     }
// }
//-------------------------------------------------------
// 3)Pattern-3
// *
// **
// ***
// public class pattern {

//     public static void main(String[] args) {
//         int n = 3;
//         //int m = 3;
//         for (int i = 1; i<=n; i++) {
//             // for (int j=1; j<=n; j++) {
               
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//              }
//             System.out.println();
//         }
//     }
// }
//--------------------------------------------------------------
// 4)Pattern-4
//      *
//    * *
//  * * *
public class pattern {

    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i<=n; i++) {
            for (int j=0; j<=n-i; j++) {
                System.out.print(" ");
             }
            for (int k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//--------------------------------------------------------------
