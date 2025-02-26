public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int age1 = 18;
        if (age1 >= 18 ) {System.out.println(" Ты совершеннолетний человек ");}
         else {System.out.println(" Возраст совершенолетия еще не наступил, нужно не много подождаать ");}

        int age2 = 15;
        if (age2 >= 18 ) {System.out.println(" Ты совершеннолетний человек ");}
        else {System.out.println(" Возраст совершенолетия еще не наступил, нужно не много подождаать ");}

        int t1 = 4;
        if (t1 < 5) {System.out.println(" На улице " + t1 + " градуса, нужно надеть шапку");}
        int t2 = 7;
        if (t2 > 5) {System.out.println(" На улице " + t2 + " градусов, можно идти без шапки");}

        int v1 = 83;
        if(v1>60){System.out.println(" Если скорость " + v1 + " , то придется заплатить штраф ");}

        int v2 = 45;
        if(v2<60){System.out.println(" Если скорость " + v2 + " , то можно ездить спокойно ");}

        int age3 =4;
        if(age3>2 && age3<6){System.out.println(" Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");}
        int age4 =9;
        if(age4>7 && age4<17){System.out.println(" Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");}
        int age5 = 18;
        if(age5>=18 && age5<=24){System.out.println(" Если возраст человека равен " + age5 + ", то его место в университете");}
        int age6 = 27;
        if(age6>24) {System.out.println(" Если возраст человека равен " + age6 + ", то ему пора ходить на работу ");}
    int age7 = 15;
        if (age7<5){System.out.println(" Если возрас ребенка равен " + age7 + ", то ему нельзя кататься на аттракционе ");}
    if(age7>5 && age7<14){System.out.println(" Если возраст ребенка равен " + age7 + ", то ему можно кататься в присутствии взрослых ");}
        if(age7>14){System.out.println(" Если возраст ребенка равен " + age7 + ", то ему можно кататься без сопровождения взрослого  ");}

        int capacityWagon = 102;
        int seatingPlaces = 60;
        int standingPlaces = capacityWagon - seatingPlaces;
        int passangeres = 102;
        if(passangeres<seatingPlaces) {System.out.println(" Значит есть сидячие места ");}
        else if(passangeres<capacityWagon) {System.out.println(" Есть стоячие места ");}
        else {System.out.println(" Вагон полностью забит ");}

        int one = 33;
        int two = 55;
        int three = 76;
        if (one>two && one>three) {System.out.println(" Наибольшее число " + one);}
        else if(two>one && two>three) {System.out.println(" Наибольшее число " + two);}
        else if (three>one && three>two) {System.out.println(" Наибольшее число " + three);}
        else {System.out.println(" Все числа равны ");}
    }
}