package com.example.csd_214_lab_3_nawaz_cho;

import javafx.fxml.Initializable;

public class EmployeeController implements Initializable {
    @FXML
    private TableView<Appointment> tableView;
    @FXML
    private TableColumn<Appointment,Integer > id;
    @FXML
    private TableColumn<Appointment, String> name;
    @FXML
    private TableColumn<Appointment,String> doctor;
    @FXML
    private TableColumn<Appointment,Integer> room;


    ObservableList<Appointment> list = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new
                PropertyValueFactory<Appointment,Integer>("id"));
        name.setCellValueFactory(new
                PropertyValueFactory<Appointment,String>("name"));
        doctor.setCellValueFactory(new
                PropertyValueFactory<Appointment,String>("doctor"));
        room.setCellValueFactory(new
                PropertyValueFactory<Appointment,Integer>("room"));
        tableView.setItems(list);
    }
}
