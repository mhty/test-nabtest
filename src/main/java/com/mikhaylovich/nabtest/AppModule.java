package com.mikhaylovich.nabtest;


import com.mikhaylovich.nabtest.service.InterfaceService1;
import com.mikhaylovich.nabtest.service.Service1;
import com.mikhaylovich.nabtest.service.Service3;
import com.mikhaylovich.nabtest.service.Service3Provider;
import ru.hh.nab.NabModule;

public class AppModule extends NabModule {


    @Override
  protected void configureApp() {
      bindJerseyResources(ATSResource.class);
      // если вы делаете inject используя interface, то надо указать, какую именно имплементацию injectить
      bind(InterfaceService1.class).to(Service1.class);
        bind(Service3.class).toProvider(Service3Provider.class);
  }
}
