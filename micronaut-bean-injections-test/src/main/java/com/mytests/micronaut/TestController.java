package com.mytests.micronaut;

import com.mytests.micronaut.beanReplacement.UseRepBeanServices;
import com.mytests.micronaut.beansFromFields.UseBeanFromFactoryService;
import com.mytests.micronaut.limitingInjectableTypes.UseLimitedService;
import com.mytests.micronaut.namedAndQualifiedBeansFactories.UseNamedBeans;
import com.mytests.micronaut.primaryBeans.UsePrimaryBean;
import com.mytests.micronaut.qualifyingByAnnotationMembers.UseQualifiedService;
import com.mytests.micronaut.qualifyingByGenericTypeArgs.UseGenericService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Controller
public class TestController {
    
    @Inject
    UseGenericService useGenericService;
    
    @Inject
    UseQualifiedService useQualifiedService;
    
    @Inject
    UseLimitedService useLimitedService;

    @Inject
    UseRepBeanServices useRepBeanServices;
    
    @Inject
    UseBeanFromFactoryService useBeanFromFactoryService;

    @Inject
    UsePrimaryBean usePrimaryBean;

    @Inject
    private UseNamedBeans useNamedBeans;

    @Get("/genericTypeArgs")
    public String genericTypeArgs() {
        return "genericTypeArgs test: "+useGenericService.getService1().getServiceProvider().getId();
    }

    @Get("/qualifierAnnotationMembers")
    public String qualifierAnnotationMembers() {
        return "qualifierAnnotationMembers test: "+useQualifiedService.getAll();
    }

    @Get("/limitedInjectableType")
    public String limitedInjectableType() {
        return "limitedInjectableType test: "+useLimitedService.showAll();
    }

    @Get("/replaceBeans")
    public String replaceBeans() {
        return "replaceBeans: "+ useRepBeanServices.returnServices();
    }

    @Get("/beansFromFields")
    public String beansFromFields() {
        return "beansFromFields: "+useBeanFromFactoryService.returnServices();
    }

    @Get("/primaryBeans")
    public String primaryBeans() {
        return "primaryBeans test: "+usePrimaryBean.getTestPrimary();
    }

    @Get("/namedAndQualifiedBeans")
    public String namedAndQualifiedBeans() {
        return "namedAndQualifiedBeans: "+ useNamedBeans.getBeans();
    }

}
