

package Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Display vq = new Display();
        Insert iq = new Insert();
        Search sq = new Search();
        Delete dq = new Delete();

        Connection1.getConnect();
        for(String con = "y"; con.equalsIgnoreCase("y"); con = scan2.nextLine()) {
            System.out.println("Enter Choice:\n1.Display Data\n2.Insert Data\n3.Delete Data\n4.Search Data\n");
            int choice = scan.nextInt();
            String var10 = String.valueOf(choice);
            byte var11 = -1;
            switch(var10.hashCode()) {
                case 49:
                    if (var10.equals("1")) {
                        var11 = 0;
                    }
                    break;
                case 50:
                    if (var10.equals("2")) {
                        var11 = 1;
                    }
                    break;
                case 51:
                    if (var10.equals("3")) {
                        var11 = 2;
                    }
                    break;
                case 52:
                    if (var10.equals("4")) {
                        var11 = 3;
                    }
            }

            switch(var11) {
                case 0:
                    vq.Display();
                    break;
                case 1:
                    iq.insert();
                    break;
                case 2:
                    dq.delete();
                    break;
                case 3:
                    sq.Search();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }

            System.out.println("\n\nContinue? (Y/N): ");
        }

    }
}
