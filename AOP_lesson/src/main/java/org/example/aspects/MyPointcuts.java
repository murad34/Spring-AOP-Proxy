package org.example.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){}

//    @Pointcut("execution(* org.example.UniLibrary.get* ())")
//    public void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* org.example.UniLibrary.return* ())")
//    public void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    public void allGetAndReturnMethodsFromUniLibrary() {}

}
