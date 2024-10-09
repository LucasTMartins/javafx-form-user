module org.sg_usuario {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
//    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.sg_usuario to javafx.fxml;
    exports org.sg_usuario;
    exports org.sg_usuario.controller;
    opens org.sg_usuario.controller to javafx.fxml;
}