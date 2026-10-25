package ru.vsu.cs.oop26.g42.kononovich_a_a.my_set_demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Table t = new Table("Имя", "Должность", "Город", "Зарплата");
        t.addRow("Анна", "Программист", "Москва", "150000");
        t.addRow("Борис", "Тимлид", "Казань", "120000");
        t.addRow("Вера", "Менеджер", "Москва", "90000");
        t.addRow("Глеб", "Дизайнер", "Москва", "95000");
        t.addRow("Дима", "Рекламщик", "Казань", "110000");
        t.addRow("Ева", "HR", "Москва", "170000");

        t.print();
    }
}
