import java.util.*;
public class menuPesan {
  public static void main (String [] warteg){
  Scanner masukan=new Scanner (System.in);
  int subTot=0;
  int tot=0;
  int lagi=0;
  
  do
  {
  System.out.println("Menu Minuman : ");
  System.out.println("1.Es Teh");
  System.out.println("2.Kopi");
  System.out.println("3.Milk Shake");
  System.out.println("4.Es Duren");
  System.out.println("5.Es Campur");
  System.out.println("6.STMJ");
  System.out.print("Masukan Pilihan Anda [1-6]: ");
  
  int pilihan=masukan.nextInt();
  
  switch(pilihan)
  {
    case 1:
      System.out.print("Masukan Jumlah Yang Anda Pesan : ");
      int jmlTeh=masukan.nextInt();
      int teh=2500;
      jmlTeh*=teh;
      subTot+=jmlTeh;
      System.out.println("Subtotal : Rp."+subTot);
      tot+=subTot;
      subTot=0;
    break;
      case 2:
      System.out.print("Masukan Jumlah Yang Anda Pesan : ");
      int jmlKopi=masukan.nextInt();
      int kopi=3000;
      jmlKopi*=kopi;
      subTot+=jmlKopi;
      System.out.println("Subtotal : Rp."+subTot);
      tot+=subTot;
      subTot=0;
    break;
    case 3:
      System.out.print("Masukan Jumlah Yang Anda Pesan : ");
      int jmlMilk=masukan.nextInt();
      int milk=7000;
      jmlMilk*=milk;
      subTot+=jmlMilk;
      System.out.println("Subtotal : Rp."+subTot);
      tot+=subTot;
      subTot=0;
    break;
    case 4:
      System.out.print("Masukan Jumlah Yang Anda Pesan : ");
      int jmlDuren=masukan.nextInt();
      int duren=9000;
      jmlDuren*=duren;
      subTot+=jmlDuren;
      System.out.println("Subtotal : Rp."+subTot);
      tot+=subTot;
      subTot=0;
    break;
    case 5:
      System.out.print("Masukan Jumlah Yang Anda Pesan : ");
      int jmlCampur=masukan.nextInt();
      int campur=5000;
      jmlCampur*=campur;
      subTot+=jmlCampur;
      System.out.println("Subtotal : Rp."+subTot);
      tot+=subTot;
      subTot=0;
    break;
    case 6:
      System.out.print("Masukan Jumlah Yang Anda Pesan : ");
      int jmlstmj=masukan.nextInt();
      int stmj=4500;
      jmlstmj*=stmj;
      subTot+=jmlstmj;
      System.out.println("Subtotal : Rp."+subTot);
      tot+=subTot;
      subTot=0;
    break;
    default:
      System.out.println("Maaf Anda Hanya Bisa Memilih Anka 1-6 Saja !");
  }
      System.out.println("Ingin Memesan Lagi? [1=YA 0=TIDAK]");
      lagi=masukan.nextInt();
  }  
  while(lagi==1);
        System.out.println("Total Yang Harus Anda Bayar : Rp."+tot);
  }
}