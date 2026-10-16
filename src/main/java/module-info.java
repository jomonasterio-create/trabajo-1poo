module com.monasterio.jose.jose {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.monasterio.jose.jose to javafx.fxml;
    exports com.monasterio.jose.jose;
}