package org.example.myapp.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.commons.Configuration;
import org.apache.tapestry5.commons.MappedConfiguration;
import org.apache.tapestry5.ioc.*;
import org.apache.tapestry5.ioc.annotations.*;
import org.apache.tapestry5.services.LibraryMapping;
import org.example.myapp.pages.EmployeeList;

public class MyAppModule {
    public static void contributeApplicationDefaults(MappedConfiguration<String,String> configuration)
    {
        configuration.add(SymbolConstants.SUPPORTED_LOCALES, "en,fr,de");
        configuration.add(SymbolConstants.FILE_CHECK_INTERVAL, "10 m");
    }


    public static void bind(ServiceBinder binder) {
//        configuration.add(LoginService.class, loginServiceImpl);
        binder.bind(LoginService.class, LoginServiceImpl.class).withId("LoginServiceImpl");
        binder.bind(EmployeeService.class, EmployeeServiceImpl.class).withId("EmployeeServiceImpl");
    }

//    public static void contributeComponentClassResolver(
//            Configuration<LibraryMapping> configuration) {
//        configuration.add(new LibraryMapping("component", "org.example.myapp.components"));
//    }



}
