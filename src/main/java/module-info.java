/* doesn't work with source level 1.8:
module com.mycompany.javafxtexts {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafxtexts to javafx.fxml;
    exports com.mycompany.javafxtexts;
}
*/
