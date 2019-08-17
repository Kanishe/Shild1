package Konstructor;

public class Kristina {
  public static void main(String[] args) {
    HowWorkWomen kristina =new HowWorkWomen("мало","много", " часто", 100000000);
    HowWorkWomen eva=new HowWorkWomen("мало", "много", "часто",100000000);

    System.out.println("Кристина ест:"+ kristina.est +"\n"+ "Кристина спит:"+kristina.spit+"\n" +"Кристина кричит:"+kristina.krishit+ "\n"+"Нужно денег:"+ kristina.needmoney);

    System.out.println("Ева ест:"+ eva.est +"\n"+ "Ева спит:"+eva.spit+"\n" +"Ева кричит:"+eva.krishit);
  }
}
