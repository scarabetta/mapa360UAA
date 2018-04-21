package ar.gob.gcba.dgisis.mapa360.uaa.cucumber.stepdefs;

import ar.gob.gcba.dgisis.mapa360.uaa.Mapa360UaaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Mapa360UaaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
