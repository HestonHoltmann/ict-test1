/* 
 * Copyright (c) 2018 Informatica Corporation. All rights reserved. 
 */
 
/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0 
 * Generation time: 2018-02-05 14:40:39
 */ 
package com.heston.adapter.con1.runtime.aso;

/**
 * The factory interface for IPackage.
 * 'com.heston.adapter.con1.runtime.aso'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently.</br>
 * </br></p>
 */

public interface AsoIFactory
extends com.informatica.imf.icore.IFactory {

    /**
     * The Factory instance for package
     * 'com.heston.adapter.con1.runtime.aso'.
     */
    com.heston.adapter.con1.runtime.aso.AsoIFactory I_INSTANCE = new
        com.heston.adapter.con1.runtime.aso.impl.AsoIFactoryImpl();
    /**
     * Creates an instance of ComplexASO IClass.
     * @return an object of type ComplexASO.
     */

    com.heston.adapter.con1.runtime.aso.ComplexASO createComplexASO();
}