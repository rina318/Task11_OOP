package ru.vsu.cs.oop26.g42.kononovich_a_a.my_set_demo;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<String> columns = new ArrayList<>();
    private List<List<Object>> rows = new ArrayList<>();

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
}