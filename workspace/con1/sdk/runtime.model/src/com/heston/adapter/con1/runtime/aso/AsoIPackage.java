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
 * The package interface for IPackage.
 * 'com.heston.adapter.con1.runtime.aso'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently. Note that
 * the package initialization of this package and all its dependent package
 * is also thread-safe.</br>
 * </br></p>
 */
public interface AsoIPackage
extends com.informatica.imf.icore.IPackage {
    // Package attributes derived from package namespace and name
    /**
     * Constant for the name of the package.
     */
    java.lang.String I_NAME = "aso";

    /**
     * Constant for the comment associated with the package.
     */
    java.lang.String I_COMMENT = "";

    /**
     * Constant for the namespace prefix.
     */
    java.lang.String I_NS_PREFIX = "com.heston.adapter.con1.runtime";

    /**
     * Constant for the fully qualified name.
     */
    java.lang.String I_QUALIFIED_NAME = I_NS_PREFIX + "." + I_NAME;


    // Create and initialize metamodel for this package (reflective API)
    /**
     * Constant for the package instance.
     */
    com.heston.adapter.con1.runtime.aso.AsoIPackage I_INSTANCE = com.heston.adapter.con1.runtime.aso.impl.AsoIPackageImpl.init();


    /**
     * Retrieves the 'ComplexASO' IClass
     * defined in this IPackage.
     * @return the 'ComplexASO' IClass
     * defined in this IPackage
     */
    com.informatica.imf.icore.IClass getComplexASOIClass();
}