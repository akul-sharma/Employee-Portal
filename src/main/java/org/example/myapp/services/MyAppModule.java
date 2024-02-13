package org.example.myapp.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.commons.MappedConfiguration;
import org.apache.tapestry5.ioc.*;
import org.apache.tapestry5.ioc.annotations.*;
import org.example.myapp.pages.EmployeeList;

public class MyAppModule {
    public static void contributeApplicationDefaults(MappedConfiguration<String,String> configuration)
    {
        configuration.add(SymbolConstants.SUPPORTED_LOCALES, "en,fr,de");
        configuration.add(SymbolConstants.FILE_CHECK_INTERVAL, "10 m");
    }

//    @Contribute(ServiceBinder.class)
//    public static void bindServiceImplementation(MappedConfiguration<Class<?>, Object> configuration,
//                                                 LoginServiceImpl loginServiceImpl) {
//        configuration.add(LoginService.class, loginServiceImpl);
//    }

    public static void bind(ServiceBinder binder) {
//        configuration.add(LoginService.class, loginServiceImpl);
        binder.bind(LoginService.class, LoginServiceImpl.class).withId("LoginServiceImpl");
    }

//    @Contribute(ServiceBinder.class)
//    public static void bindServiceImplementation(MappedConfiguration<Class<?>, Object> configuration,
//                                                 LoginService loginService) {
//        configuration.add(LoginService.class, loginService);
//    }

}
