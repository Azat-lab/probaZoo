package by.azatzootest.zen;

import by.azatzootest.zen.enumeration.HerbivoresDiet;
import by.azatzootest.zen.enumeration.PredatorsDiet;
import by.azatzootest.zen.enumeration.Sex;
import by.azatzootest.zen.herbivores.Dolphin;
import by.azatzootest.zen.herbivores.Monkey;
import by.azatzootest.zen.herbivores.Parrot;
import by.azatzootest.zen.predators.Shark;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер животного: ");
        System.out.println();
        int number = scanner.nextInt();
        Dolphin dolphin = new Dolphin("Very Fast", "Plankton", 3);
        dolphin.setFloats("floats with speed 30km/h");
        dolphin.setDiet(HerbivoresDiet.PLANKTON);
        dolphin.setFlippers(3);
        dolphin.setSex(Sex.MALE);
        System.out.println("С какой скоростью плавает Дельфин? " + dolphin.getFloats() + "\nчем питается? " + dolphin.getDiet()
                + "\nколичество плавников: " + dolphin.getFlippers() + "\nпол: " + dolphin.getSex() + "\nномер: " + number);

        System.out.println();
        System.out.println();

        System.out.print("Введите номер животного: ");
        Monkey monkey = new Monkey("На задних лапах", "Звуки", "vegan", 4);
        int number2 = scanner.nextInt();
        monkey.setWalksOnItsHindLegs("Walks on Its Hind Legs");
        monkey.setVoice("UGAGAGAG");
        monkey.setDiet(HerbivoresDiet.FRUITS);
        monkey.setSex(Sex.FEMALE);
        System.out.println("как передвигается Обезьяна? " + monkey.getWalksOnItsHindLegs() + "\nчем питается? "
                + monkey.getDiet() + "\nсколько у горилы лап: " + monkey.getPaws() + "\nкак общаются горилы: "
                + monkey.getVoice() + "\nпол:" + monkey.getSex() + "\nНомер:"  + number2);

        Shark shark = new Shark("25km/h", "another fishes", 4);
        int number3=scanner.nextInt();
        shark.setSwimInSaltWatter("в морях и океанах");
        shark.setFlippers(4);
        shark.setDiet(PredatorsDiet.EAT_EVERYTHING);
        shark.setSex(Sex.FEMALE);
        System.out.print("Где обитают акулы?:" + shark.getSwimInSaltWatter() + "\nколичество плавников: "
                + shark.getFlippers() + "\nрацион: " + shark.getDiet() + "\nНомер:" + number3);
        System.out.println();
        System.out.println();

        Parrot parrot = new Parrot("Высоко в небе", "фрукты и зелень", "Подражает", 2, "rainbow");
        int number4=scanner.nextInt();
        parrot.setFly("Летают");
        parrot.setWings(2);
        parrot.setVoice("ПикЧивик");
        parrot.setColor("Разных цветов и окраса");
        parrot.setDiet(HerbivoresDiet.FRUITS);
        System.out.println("Как передвигаются попугаи:" + parrot.getFly() + "\nсколько крыльев:" + parrot.getWings()
                + "\nпопугай говорит: " + parrot.getVoice() + "\nцвет попугаев:" + parrot.getColor()
                + "\nчем питаются: " + parrot.getDiet() + "\nНомер:" + number4);
    }

}