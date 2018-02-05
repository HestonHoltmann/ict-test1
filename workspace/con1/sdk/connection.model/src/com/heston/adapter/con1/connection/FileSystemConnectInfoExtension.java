/*
 * Copyright (c) 2018 Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0
 * Generation time: 2018-02-05 14:38:31
 */

package com.heston.adapter.con1.connection;


/**
 * The interface for IClass
 *     'FileSystemConnectInfoExtension'.
 * 
 * <p><br>
 * <b>Thread-Safety</b>
 * <p>
 * <strong>Note that this interface is not thread-safe.</strong> If multiple
 * threads access an instance of this interface concurrently, it must be
 * synchronized externally.</p>
 * </br></p>
 * <p>
 * The following features (Attributes/references) are supported:
 * <ul>
 *     <li>{@link com.heston.adapter.con1.connection.FileSystemConnectInfoExtension#getFilename() <em>filename</em>} </li>
 * </ul>
 * </p>
 * @Class (isSeeded=false, classKind=com.informatica.imf.annotations.ClassKind.SECOND_CLASS_INTERNAL, isAbstract=false)
 */
 public interface FileSystemConnectInfoExtension extends com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.SDKConnectInfoModelExtension {

    /** A constant that references the IClass for this generated Java Class. */
    com.informatica.imf.icore.IClass ICLASS = ConnectionIPackage.I_INSTANCE.getFileSystemConnectInfoExtensionIClass();
    /**
     * Retrieves the 'filename' property value for this IObject.
     * @return the 'filename' property value for this IObject.
     * @Property (redefines="", minOccurs=0, containerType=com.informatica.imf.annotations.ContainerType.NOT_A_CONTAINER, referenceScope=com.informatica.imf.annotations.ReferenceScope.NONE, containmentType=com.informatica.imf.annotations.ContainmentType.NOT_CONTAINED, isUnique=false, maxOccurs=1, opposite="", redefinability=com.informatica.imf.annotations.Redefinability.FINAL_PROPERTY)
     */
    java.lang.String getFilename();


    /**
     * Sets the 'filename' property value for this IObject.
     * @param filename is the new property value for this IObject
     * @see #getFilename
     */
    void setFilename(java.lang.String filename);

    /**
     * Exposes the IProperties of the IClass associated with this Object
     */
    static class Properties {

        public static com.informatica.imf.icore.IProperty FILENAME = null;
        static  {
			com.heston.adapter.con1.connection.impl.FileSystemConnectInfoExtensionImpl.initIProperties();
		}
    }
 }