package com.mytests.micronaut;

import com.mytests.micronaut.limitingInjectableTypes.UseLimitedService;
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
}