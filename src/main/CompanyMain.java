package main;

import model.HRManager;
import model.JuniorDeveloper;
import model.MidDeveloper;
import model.SeniorDeveloper;

import java.util.Arrays;

public class CompanyMain {
    public static void main(String[] args) {
        JuniorDeveloper junior1 = new JuniorDeveloper(1, "cemre", 22000);
        junior1.work();
        JuniorDeveloper junior2 = new JuniorDeveloper(1, "melih", 22000);
        //JuniorDeveloper[] juniors = new JuniorDeveloper[]{junior1, junior2};
        MidDeveloper mid1 = new MidDeveloper(3, "ahmet", 35000);
        SeniorDeveloper senior1 = new SeniorDeveloper(4, "ayse",45000 );
        senior1.work();

        HRManager hrManager = new HRManager(1, "ali", 60000, new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();

        System.out.println("juniors " + Arrays.toString(hrManager.getJuniorDeveloper()));
        System.out.println("mids " + Arrays.toString(hrManager.getMidDeveloper()));
        System.out.println("seniors " + Arrays.toString(hrManager.getSeniorDeveloper()));

        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(0, senior1);
        hrManager.addEmployee(1, senior1);
        hrManager.addEmployee(0, senior1);

        System.out.println("juniors " + Arrays.toString(hrManager.getJuniorDeveloper()));
        System.out.println("mids " + Arrays.toString(hrManager.getMidDeveloper()));
        System.out.println("seniors " + Arrays.toString(hrManager.getSeniorDeveloper()));

    }
}
