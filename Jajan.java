import java.util.Scanner;
import java.util.Arrays;

public class Jajan{
  private int maxAmount = 0;
  private int currentIndex = 0;
  private String[] items = new String[1];

  void setMaxItemAmount(int maxAmount) {
    this.maxAmount = maxAmount;
    this.items = new String[this.maxAmount];
  }

  void addItem(String item) throws ArrayIndexOutOfBoundsException {
    this.items[this.currentIndex] = item;
    this.currentIndex++;
  }

  String[] getItems() {
    return this.items;
  }
    public static void main(String[] args) {
    Jajan Jajan = new Jajan ();
    Scanner jumlahItemHandler = new Scanner(System.in);
    Scanner productInput = new Scanner(System.in);
    Scanner statusInput = new Scanner(System.in);
    boolean addingProduct = true;

    System.out.print("Udah jajan berapa kali sayang? : ");
    int jumlahMaksimalProduk = jumlahItemHandler.nextInt();
    Jajan.setMaxItemAmount(jumlahMaksimalProduk);
    System.out.println(jumlahMaksimalProduk);

    try {
      while(addingProduct) {
        System.out.println();
        System.out.println("=======================");
        System.out.println("[1] Lagi gak? ");
        System.out.println("[2] udah aja? ");
        System.out.println("=======================");
        System.out.println();

        System.out.print("Pilih : ");
        int decision = statusInput.nextInt();

        if (decision == 1) {
          System.out.print("Sok jajan apalagi     : ");
          String produk = productInput.nextLine();
          Jajan.addItem(produk);

          System.out.println("PRODUK DITAMBAHKAN");
        }

        if (decision == 2) {
          addingProduct = false;
        }
      }

    } catch (ArrayIndexOutOfBoundsException err) {
      System.out.println("kantong penuh loh beb");
    } finally {
      System.out.println("Ini jajanan kamu sayang : " + Arrays.deepToString(Jajan.getItems()));
        }
    
    }
}