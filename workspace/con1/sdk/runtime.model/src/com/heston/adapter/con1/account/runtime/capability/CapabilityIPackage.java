/*
 * Copyright (c) 2018 Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0
 * Generation time: 2018-02-05 14:40:38
 */

package com.heston.adapter.con1.account.runtime.capability;
/**
 * The package interface for IPackage.
 * 'com.heston.adapter.con1.account.runtime.capability'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently. Note that
 * the package initialization of this package and all its dependent package
 * is also thread-safe.</br>
 * </br></p>
 */
public interface CapabilityIPackage
extends com.informatica.imf.icore.IPackage {
    // Package attributes derived from package namespace and name
    /**
     * Constant for the name of the package.
     */
    java.lang.String I_NAME = "capability";

    /**
     * Constant for the comment associated with the package.
     */
    java.lang.String I_COMMENT = "";

    /**
     * Constant for the namespace prefix.
     */
    java.lang.String I_NS_PREFIX = "com.heston.adapter.con1.account.runtime";

    /**
     * Constant for the fully qualified name.
     */
    java.lang.String I_QUALIFIED_NAME = I_NS_PREFIX + "." + I_NAME;


    // Create and initialize metamodel for this package (reflective API)
    /**
     * Constant for the package instance.
     */
    com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage I_INSTANCE = com.heston.adapter.con1.account.runtime.capability.impl.CapabilityIPackageImpl.init();


    /**
     * Retrieves the 'AccountCallCapabilityAttributesExtension' IClass
     * defined in this IPackage.
     * @return the 'AccountCallCapabilityAttributesExtension' IClass
     * defined in this IPackage
     */
    com.informatica.imf.icore.IClass getAccountCallCapabilityAttributesExtensionIClass();


    /**
     * Retrieves the 'AccountLookupCapabilityAttributesExtension' IClass
     * defined in this IPackage.
     * @return the 'AccountLookupCapabilityAttributesExtension' IClass
     * defined in this IPackage
     */
    com.informatica.imf.icore.IClass getAccountLookupCapabilityAttributesExtensionIClass();


    /**
     * Retrieves the 'AccountReadCapabilityAttributesExtension' IClass
     * defined in this IPackage.
     * @return the 'AccountReadCapabilityAttributesExtension' IClass
     * defined in this IPackage
     */
    com.informatica.imf.icore.IClass getAccountReadCapabilityAttributesExtensionIClass();


    /**
     * Retrieves the 'AccountWriteCapabilityAttributesExtension' IClass
     * defined in this IPackage.
     * @return the 'AccountWriteCapabilityAttributesExtension' IClass
     * defined in this IPackage
     */
    com.informatica.imf.icore.IClass getAccountWriteCapabilityAttributesExtensionIClass();
}