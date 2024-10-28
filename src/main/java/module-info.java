module com.rolw.mycounttable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rolw.mycounttable to javafx.fxml;
    exports com.rolw.mycounttable;
}