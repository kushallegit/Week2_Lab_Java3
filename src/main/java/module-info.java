module com.student.model.studentmodel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.student.model.studentmodel to javafx.fxml;
    exports com.student.model.studentmodel;
}