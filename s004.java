import java.util.Scanner;

public class s004 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int op, val1;
        String val2;
        System.out.println("輸入名子\nIsbn\n作者\n價格\n總頁數\n類型");
        Book book[] = new Book[5];

        boolean flag = true;
        for (int i = 0; i < 5; i++) {
            book[i] = new Book(scn.next(), scn.next(), scn.next(), scn.nextInt(), scn.nextInt(), scn.next());
            book[i].show();
        }

        while (flag) {
            System.out.println();
            System.out.println("0:離開\n1:書\n2:種類\n3:搜尋");
            op = scn.nextInt();
            switch (op) {

                case 0: // exit system  System.out.println("0:離開\n+1:某人總成績+\n+");

                    flag = false;
                    break;
                case 1:
                    System.out.println(("0:" + book[0].getName()) + ("\n1:" + book[1].getName()) + ("\n2:" + book[2].getName()) + ("\n1:" + book[3].getName()) + ("\n1:" + book[4].getName()));
                    val1 = scn.nextInt();
                    book[val1].show();
                    break;
                case 2:
                    System.out.println("輸入種類找書");
                    val2 = scn.next();
                    if (val2.equals(book[0].getCategory())) {
                        System.out.println(book[0].getName());
                    }
                    if (val2.equals(book[1].getCategory())) {
                        System.out.println(book[1].getName());
                    }
                    if (val2.equals(book[2].getCategory())) {
                        System.out.println(book[2].getName());
                    }
                    if (val2.equals(book[3].getCategory())) {
                        System.out.println(book[3].getName());
                    }
                    if (val2.equals(book[4].getCategory())) {
                        System.out.println(book[4].getName());
                    }

                    break;
                case 3:
                    System.out.println("輸入書名或Isbn找書資訊");
                    val2 = scn.next();
                    if (val2.equals(book[0].getName())) {
                        book[0].show();
                    }
                    if (val2.equals(book[0].getIsbn())) {
                        book[0].show();
                    }
                    if (val2.equals(book[1].getName()) || val2.equals(book[1].getIsbn())) {
                        book[1].show();
                    }
                    if (val2.equals(book[2].getName()) || val2.equals(book[2].getIsbn())) {
                        book[2].show();
                    }
                    if (val2.equals(book[3].getName()) || val2.equals(book[3].getIsbn())) {
                        book[3].show();
                    }
                    if (val2.equals(book[4].getName()) || val2.equals(book[4].getIsbn())) {
                        book[4].show();
                        break;
                    }

            }
        }


    }
}
