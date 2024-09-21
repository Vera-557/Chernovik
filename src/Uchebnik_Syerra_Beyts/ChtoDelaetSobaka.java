package Uchebnik_Syerra_Beyts;

public class ChtoDelaetSobaka {
    public static void main(String[] args) {
        String [] names = {"Тузик","Бобик","Лайма","Джесика"};
        String[] characters = {" Добродушный лабрадор "," Толстопузая такса "," Шпиц с черным пятнышком на ухе "," Задиристая болонка "," Овчарка "," Той- терьер "," Собака Баскервили "};
        String[] doWhat = {"грызёт мячик","гавкает на чужих","ест корм","шкодит на кухне","спит","играет с котом","скалит зубы"};
        int firstParametr = names.length;
        int secondParametr = characters.length;
        int thirdParametr = doWhat.length;

        int firstRand = (int)(Math.random() * firstParametr);
        int secondRand = (int)(Math.random() * secondParametr);
        int thirdRand = (int)(Math.random() * thirdParametr);

        System.out.println(names[firstRand]+characters[secondRand]+doWhat[thirdRand]);
    }
}
