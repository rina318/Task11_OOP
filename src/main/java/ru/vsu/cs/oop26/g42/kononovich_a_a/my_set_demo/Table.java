package ru.vsu.cs.oop26.g42.kononovich_a_a.my_set_demo;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private ArrayList<String> columns = new ArrayList<>();
    private ArrayList<ArrayList<String>> rows = new ArrayList<>();

    public Table(String... columnNames) {
        for (int i = 0; i < columnNames.length; i++) {
            columns.add(columnNames[i]);
        }
    }

    public int rowCount() {
        return rows.size();
    }

    public int columnCount() {
        return columns.size();
    }

    public int columnIndex(String name) {
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public void addRow(String...values) {
        ArrayList<String> row = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            row.add(values[i]);
        }
        rows.add(row);
    }
}