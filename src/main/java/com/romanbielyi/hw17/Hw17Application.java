package com.romanbielyi.hw17;

import com.romanbielyi.hw17.models.Notebook;
import com.romanbielyi.hw17.services.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.GregorianCalendar;

@SpringBootApplication
public class Hw17Application implements CommandLineRunner {

    @Autowired
    private NotebookService notebookService;
    public static void main(String[] args) {
        SpringApplication.run(Hw17Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        notebookService.add(new Notebook("Asus Zephyrus G14", "Asus", "AMD Ryzen 5 (3500u)", "black", 32, 42450, false, new GregorianCalendar(2018, Calendar.JULY, 22).getTime()));
        notebookService.add(new Notebook("Asus Chromebook Flip", "Asus", "Intel i7 extreme (2200)", "silver", 64, 72102, false, new GregorianCalendar(2020, Calendar.AUGUST, 5).getTime()));
        notebookService.add(new Notebook("Asus VivoBook S15", "Asus", "AMD Ryzen 3", "gold", 16, 28044, false, new GregorianCalendar(2020, Calendar.SEPTEMBER, 13).getTime()));
        notebookService.add(new Notebook("Lenovo IdeaPad Slim 5i", "Lenovo", "AMD Ryzen Threadripper", "silver", 64, 58050, false, new GregorianCalendar(2020, Calendar.DECEMBER, 20).getTime()));
        notebookService.add(new Notebook("Lenovo IdeaPad Gaming 3", "Lenovo", "AMD Ryzen 6 (3559k)", "blue", 64, 57000, true, new GregorianCalendar(2019, Calendar.DECEMBER, 13).getTime()));
        notebookService.add(new Notebook("Lenovo ThinkBook Plus", "Lenovo", "Intel i5 4450u", "magenta", 8, 18564, true, new GregorianCalendar(2019, Calendar.AUGUST, 2).getTime()));
        notebookService.add(new Notebook("HP Pavilion x360 14", "HP", "Intel i3", "metallic black", 16, 25000, false, new GregorianCalendar(2020, Calendar.MARCH, 16).getTime()));
        notebookService.add(new Notebook("Lenovo Yoga 7i", "Lenevo", "AMD Ryzen 6 (3201u)", "pink", 16, 30000, false, new GregorianCalendar(2019, Calendar.MARCH, 5).getTime()));
        notebookService.add(new Notebook("HP Omen 15", "HP", "Intel i9 1740ku", "green", 64, 91000, false, new GregorianCalendar(2020, Calendar.OCTOBER, 28).getTime()));
        notebookService.add(new Notebook("HP Spectre x360", "HP", "AMD 2500X", "black", 8, 19300, false, new GregorianCalendar(2017, Calendar.JULY, 21).getTime()));
        notebookService.add(new Notebook("Huawei Matebook D15", "Huawei", "AMD Ryzen 5 (2209u)", "silber", 16, 26156, true, new GregorianCalendar(2019, Calendar.OCTOBER, 9).getTime()));
        notebookService.add(new Notebook("Vinga Iron S140", "Vinga", "Intel i3", "black", 8, 15000, true, new GregorianCalendar(2016, Calendar.JULY, 9).getTime()));
        notebookService.add(new Notebook("Dell Choma XT", "Dell", "Intel i6 3310u", "silver", 64, 39000, false, new GregorianCalendar(2020, Calendar.AUGUST, 22).getTime()));
        notebookService.add(new Notebook("Asus Chomebook Flip TX10", "Asus", "AMD Ryzen 5 (3500u)", "metal gray", 32, 31000, false, new GregorianCalendar(2019, Calendar.JULY, 15).getTime()));
        notebookService.add(new Notebook("Lenovo GamePad Slim 10m", "Lenovo", "AMD Ryzen 9 x667", "black", 64, 88678, true, new GregorianCalendar(2020, Calendar.JANUARY, 2).getTime()));
        notebookService.add(new Notebook("Dell XPS 15", "Dell", "AMD Ryzen 6", "black", 64, 61000, false, new GregorianCalendar(2018, Calendar.JULY, 22).getTime()));
        notebookService.add(new Notebook("Dell XPS 13", "Dell", "AMD Ryzen 5 ", "black", 32, 49000, false, new GregorianCalendar(2018, Calendar.DECEMBER, 8).getTime()));
        notebookService.add(new Notebook("Dell G7 15 7590", "Dell", "Intel i5 4040k", "silver red", 32, 47000, true, new GregorianCalendar(2018, Calendar.JULY, 2).getTime()));
        notebookService.add(new Notebook("Asus Zephyrus G19", "Asus", "AMD Ryzen 5 (3500u)", "silver", 16, 38000, false, new GregorianCalendar(2019, Calendar.JULY, 19).getTime()));
        notebookService.add(new Notebook("Vinga Iron Steel TXX", "Vinga", "Intel i9 extreme 1453", "light blue", 64, 92000, false, new GregorianCalendar(2020, Calendar.OCTOBER, 7).getTime()));

        System.out.println("\n\tAll notebooks\n");
        for (Notebook notebook: notebookService.getAll()){
            System.out.println(notebook);
        }

        System.out.println("\n\tAll notebooks by manufacturer ordered in descending order\n");
        for (Notebook notebook: notebookService.getAllDescSortedByManufacturer()){
            System.out.println(notebook);
        }

        System.out.println("\n\tAll refurbished notebooks\n");
        for (Notebook notebook: notebookService.getAllRefurbished()){
            System.out.println(notebook);
        }

        System.out.println("\n\t All notebooks with RAM greater than 16GB\n");
        for (Notebook notebook: notebookService.getAllWithGreaterThan(16)){
            System.out.println(notebook);
        }
    }
}
