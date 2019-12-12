package org.vaadin.jeanchristophe;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route("")
@PWA(name = "Project Base for Vaadin", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView() {
        OpenLayers openLayers = new OpenLayers();
        openLayers.setHeight("400px");
        openLayers.setWidthFull();
        add(openLayers);
    }
}
