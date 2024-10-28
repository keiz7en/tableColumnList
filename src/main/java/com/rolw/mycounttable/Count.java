package com.rolw.mycounttable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Count {

    @FXML
    private TextField cpuid;

    @FXML
    private ComboBox<String> ram_combo;

    @FXML
    private TextField gpuid;

    @FXML
    private TableView<CountItem> tableView;

    @FXML
    private TableColumn<CountItem, String> cpuColumn;

    @FXML
    private TableColumn<CountItem, String> ramColumn;

    @FXML
    private TableColumn<CountItem, String> gpuColumn;

    private ObservableList<CountItem> data;

    @FXML
    public void initialize() {
        data = FXCollections.observableArrayList();
        tableView.setItems(data);

        // Initialize ComboBox items (RAM options)
        ram_combo.getItems().addAll("4 GB", "8 GB", "16 GB", "32 GB");

        // Set up Table Columns with data properties
        cpuColumn.setCellValueFactory(new PropertyValueFactory<>("cpu"));
        ramColumn.setCellValueFactory(new PropertyValueFactory<>("ram"));
        gpuColumn.setCellValueFactory(new PropertyValueFactory<>("gpu"));
    }

    @FXML
    private void addingMyList() {
        String cpu = cpuid.getText();
        String ram = ram_combo.getValue();
        String gpu = gpuid.getText();

        if (cpu != null && !cpu.isEmpty() && ram != null && gpu != null && !gpu.isEmpty()) {
            CountItem item = new CountItem(cpu, ram, gpu);
            data.add(item);

            // Clear input fields after adding
            cpuid.clear();
            ram_combo.getSelectionModel().clearSelection();
            gpuid.clear();
        }
    }
}
