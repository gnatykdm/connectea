module org.chatgui.chatgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires static lombok;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;

    requires java.sql;
    requires com.fasterxml.jackson.databind;

    opens org.connect to javafx.fxml;
    exports org.connect;
    exports org.connect.controller;
    opens org.connect.controller to javafx.fxml;
    exports org.connect.model.entities to com.fasterxml.jackson.databind;
    exports org.connect.controller.logcontrollers;
    exports org.connect.model.dto to com.fasterxml.jackson.databind;
    opens org.connect.model.entities to org.hibernate.orm.core;
    opens org.connect.controller.logcontrollers to javafx.fxml;
}