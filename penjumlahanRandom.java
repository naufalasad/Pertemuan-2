import java.util.*;
public class penjumlahanRandom{
  public static void main (String[]ngitung){
  Scanner masukan=new Scanner (System.in);
  int i=1;
  int a=0;
  int b=0;
  int c=0;
  int skor=0;
  int total=0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
  System.out.println("Latihan Penjumlahan");
  System.out.println("====================");
  System.out.print("Masukan Jumlah Soal: ");
  int soal=masukan.nextInt();
  
  while (i<=soal){
  
  double bilRandom=Math.random()*10;                                                                                             
  a+=bilRandom;
  double bilAcak=Math.random()*10;
  b+=bilAcak;
  c=a+b;
  System.out.print(i+".  "+a+"+"+b+"=");
  int jawab=masukan.nextInt();
  i+=1; 
  if (jawab==c){
    skor+=1;
  }
  }
  total=(skor*100)/soal;
    System.out.println("Skor Anda : "+total);
  }
}