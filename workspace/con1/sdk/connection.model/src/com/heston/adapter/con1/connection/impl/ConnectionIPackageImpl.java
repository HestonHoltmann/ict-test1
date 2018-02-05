/*
 * Copyright (c)  Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 
 * Generation time: 
 */
package com.heston.adapter.con1.connection.impl;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * The package implementation for IPackage.
 * 'com.heston.adapter.con1.connection'
 */
public final class ConnectionIPackageImpl
extends com.informatica.imf.icore.impl.IPackageImpl
implements com.heston.adapter.con1.connection.ConnectionIPackage {

    /**
     * The generated Serial Version UID.
     */
      private static final long serialVersionUID = -2955892207748099036L;

    /**
     * The IMF version that this package was generated with.
     */
    private static final String GENERATED_WITH_IMF_VERSION = "9.5.0";

    /**
     * @handcoded
     */
    private static final Logger LOGGER = Logger.getLogger(com.informatica.imf.icore.impl.IPackageImpl.class.getName());


    /**
     * Constant for class 'FileSystemConnectInfoExtension'.
     */
    public static final int FILE_SYSTEM_CONNECT_INFO_EXTENSION = 0;

    /**
     * Constant for property 'FileSystemConnectInfoExtension.filename'.
     */
    public static final  int FILE_SYSTEM_CONNECT_INFO_EXTENSION__FILENAME =com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+0;

    /**
     * Constant for feature constant in class 'FileSystemConnectInfoExtension'.
     */
    private static final int FILE_SYSTEM_CONNECT_INFO_EXTENSION_FEATURE_COUNT = com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl.getS_D_K_CONNECT_INFO_MODEL_EXTENSIONFeatureCount()+1;


    /**
     * Constant for class 'FileSystemConnectInfo'.
     */
    public static final int FILE_SYSTEM_CONNECT_INFO = 1;


    /**
     * Constant for feature constant in class 'FileSystemConnectInfo'.
     */
    private static final int FILE_SYSTEM_CONNECT_INFO_FEATURE_COUNT = com.informatica.metadata.infasdk.connectinfo.sdkadapter.impl.SdkadapterIPackageImpl.getS_D_K_CONNECT_INFOFeatureCount()+0;



    private com.informatica.imf.icore.IClass fileSystemConnectInfoExtensionIClass = null;
    private com.informatica.imf.icore.IClass fileSystemConnectInfoIClass = null;
    private static com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl theComInformaticaMetadataInfasdkConnectinfoCommonSdkmodelextensionIPackage = (com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.impl.SdkmodelextensionIPackageImpl)com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.SdkmodelextensionIPackage.I_INSTANCE;
    private static com.informatica.metadata.common.core.impl.CoreIPackageImpl theComInformaticaMetadataCommonCoreIPackage = (com.informatica.metadata.common.core.impl.CoreIPackageImpl)com.informatica.metadata.common.core.CoreIPackage.I_INSTANCE;
    private static com.informatica.metadata.common.connectinfo.impl.ConnectinfoIPackageImpl theComInformaticaMetadataCommonConnectinfoIPackage = (com.informatica.metadata.common.connectinfo.impl.ConnectinfoIPackageImpl)com.informatica.metadata.common.connectinfo.ConnectinfoIPackage.I_INSTANCE;
    private static com.informatica.metadata.infasdk.connectinfo.sdkadapter.impl.SdkadapterIPackageImpl theComInformaticaMetadataInfasdkConnectinfoSdkadapterIPackage = (com.informatica.metadata.infasdk.connectinfo.sdkadapter.impl.SdkadapterIPackageImpl)com.informatica.metadata.infasdk.connectinfo.sdkadapter.SdkadapterIPackage.I_INSTANCE;
    private static com.informatica.metadata.common.modelextension.impl.ModelextensionIPackageImpl theComInformaticaMetadataCommonModelextensionIPackage = (com.informatica.metadata.common.modelextension.impl.ModelextensionIPackageImpl)com.informatica.metadata.common.modelextension.ModelextensionIPackage.I_INSTANCE;
    private static com.informatica.imf.icore.impl.IcoreIPackageImpl theComInformaticaImfIcoreIPackage = (com.informatica.imf.icore.impl.IcoreIPackageImpl)com.informatica.imf.icore.IcoreIPackage.I_INSTANCE;
    private ConnectionIPackageImpl() {
        super(com.heston.adapter.con1.connection.ConnectionIFactory.I_INSTANCE);
        // set all the package-info
        setVersion("1.0.0");

    }

    /**
     * Creates, registers, and initializes the <b>Package</b> for this
     * model, and for any others upon which it depends.  Simple
     * dependencies are satisfied by calling this method on all
     * dependent packages before doing anything else. This method drives
     * initialization for interdependent packages directly, in parallel
     * with this package, itself.
     * <p>Of this package and its interdependencies, all packages which
     * have not yet been registered by their fully qualified name  values are first created
     * and registered.  The packages are then initialized in two steps:
     * meta-model objects for all of the packages are created before any
     * are initialized, since one package's meta-model objects may refer to
     * those of another.
     * <p>Invocation of this method will not affect any packages that have
     * already been initialized.
     * @return the initialized package for this model.</br>
     *         null if the package was not found.
     */
     public static com.heston.adapter.con1.connection.ConnectionIPackage init() {
       synchronized(com.informatica.imf.icore.IMFRuntime.getInstance().getIMFRegistryLockObject()) {
          LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.connection.ConnectionIPackage: enter 'init()'");
            com.informatica.imf.icore.IMFRuntime imfRuntime = com.informatica.imf.icore.IMFRuntime.getInstance();
          if (imfRuntime.isPackageRegistered(com.heston.adapter.con1.connection.ConnectionIPackage.I_QUALIFIED_NAME)) {
            LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.connection.ConnectionIPackage: already initialized");
            return (com.heston.adapter.con1.connection.ConnectionIPackage)
              imfRuntime.getIPackageForName(com.heston.adapter.con1.connection.ConnectionIPackage.I_QUALIFIED_NAME);
          }

          // Create and register package
          ConnectionIPackageImpl theComHestonAdapterCon1ConnectionIPackage = (ConnectionIPackageImpl)
              new com.heston.adapter.con1.connection.impl.ConnectionIPackageImpl();

          theComHestonAdapterCon1ConnectionIPackage.createPackageContents();



          theComHestonAdapterCon1ConnectionIPackage.initializePackageContents();



          imfRuntime.registerPackage(theComHestonAdapterCon1ConnectionIPackage);

          LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.connection.ConnectionIPackage: exit 'init()'");
          return theComHestonAdapterCon1ConnectionIPackage;
      }
    }



    /**
     * Returns the IMF version that this package was generated with.
     * @return The used IMF version that was used for the generation of this package.
     */
    @Override
    public String getGeneratedWithIMFVersion() {
        return GENERATED_WITH_IMF_VERSION;
    }
    /**
     * Retrieves the 'FileSystemConnectInfoExtension' IClass defined
     * in this IPackage.
     * @return the 'FileSystemConnectInfoExtension' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getFileSystemConnectInfoExtensionIClass() {
        return this.fileSystemConnectInfoExtensionIClass;
    }


    /**
     * @return the feature count of FILE_SYSTEM_CONNECT_INFO_EXTENSION class
    */
    public static int getFILE_SYSTEM_CONNECT_INFO_EXTENSIONFeatureCount(){
    return FILE_SYSTEM_CONNECT_INFO_EXTENSION_FEATURE_COUNT;
    }

    /**
     * Retrieves the 'FileSystemConnectInfo' IClass defined
     * in this IPackage.
     * @return the 'FileSystemConnectInfo' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getFileSystemConnectInfoIClass() {
        return this.fileSystemConnectInfoIClass;
    }


    /**
     * @return the feature count of FILE_SYSTEM_CONNECT_INFO class
    */
    public static int getFILE_SYSTEM_CONNECT_INFOFeatureCount(){
    return FILE_SYSTEM_CONNECT_INFO_FEATURE_COUNT;
    }



    /**
     * Retrieves the factory class defined in this package.
     * @return the factory class defined in this package.
     */
    @Override
    public com.informatica.imf.icore.IFactory getFactory() {
       return com.heston.adapter.con1.connection.ConnectionIFactory.I_INSTANCE;
    }

    /**
     * @generated
     * @see com.informatica.imf.icore.INamedElement#getNamespace()
     */
    @Override
    public String getQualifiedName() {
      return I_QUALIFIED_NAME;
    }

   private boolean isCreated = false;

    /**
      * Creates the meta-model objects for the package.  This method is
      * guarded to have no affect on any invocation but its first.
      *
      *
      */
     @Override
     public void createPackageContents() {
         LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.connection.ConnectionIPackage: enter 'createPackageContents()'");
         if (this.isCreated) {
           LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.connection.ConnectionIPackage: already created");
           return;
         }
         this.isCreated = true;

         // Create classes and their features
         this.fileSystemConnectInfoExtensionIClass = createIClass(FILE_SYSTEM_CONNECT_INFO_EXTENSION);
         createIProperty(this.fileSystemConnectInfoExtensionIClass,FILE_SYSTEM_CONNECT_INFO_EXTENSION__FILENAME);

         this.fileSystemConnectInfoIClass = createIClass(FILE_SYSTEM_CONNECT_INFO);


         LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.connection.ConnectionIPackage: exit 'createPackageContents()'");
    }
  private boolean isInitialized = false;
    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     *
     */
    @Override
    public void initializePackageContents() {
        LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.connection.ConnectionIPackage: enter 'initializePackageContents()'");
      if (this.isInitialized) {
          LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.connection.ConnectionIPackage: already initialized");
          return;
        }

        this.isInitialized = true;
        // Initialize package
        setName(I_NAME);
        setNsPrefix(I_NS_PREFIX);
        setComment(I_COMMENT);
      iSetIdentity(getQualifiedName());

        // Initialize types defined in this package
        addSuperTypesToClasses();
        initClasses();
        setFactory(com.heston.adapter.con1.connection.ConnectionIFactory.I_INSTANCE);

        //initialize the targets for the Annotations present in this package
        initAnnotationTargets();
        //initialize annotations for all classes and properties, if any
        initAnnotationsForAllElements();

        LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.connection.ConnectionIPackage: exit 'initializePackageContents()'");
    }
    private void addSuperTypesToClasses() {
        assert (this.fileSystemConnectInfoExtensionIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.fileSystemConnectInfoExtensionIClass)).setSuperClass(com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.SdkmodelextensionIPackage.I_INSTANCE.getSDKConnectInfoModelExtensionIClass());
        assert (this.fileSystemConnectInfoIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.fileSystemConnectInfoIClass)).setSuperClass(com.informatica.metadata.infasdk.connectinfo.sdkadapter.SdkadapterIPackage.I_INSTANCE.getSDKConnectInfoIClass());
    }
    private void initClasses() {
        // Initialize classes and features; add operations and parameters
        initIClass(this.fileSystemConnectInfoExtensionIClass, "FileSystemConnectInfoExtension",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED);
        initIProperty(this.fileSystemConnectInfoExtensionIClass.getAllProperties(true).get(FILE_SYSTEM_CONNECT_INFO_EXTENSION__FILENAME), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "filename",
        	"c:\\tmp\\test.txt", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
        initIClass(this.fileSystemConnectInfoIClass, "FileSystemConnectInfo",
        	!IS_ABSTRACT, IS_FIRST_CLASS, IS_EXTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED);

    }
    private void initEnums() {
        com.informatica.imf.icore.IEnumerationLiteral defaultLiteral = null;
        // Initialize enums and add enum literals
    }

    private void initAnnotationTargets() {
        //Set Annotation Targets for all the Annotation IClasses in this Package.
    }


    private void initAnnotationsForAllElements() {
      //This method initialize annotations present on various elements
      //(package, types and properties) in a package.



      		//initialization of annotations for class FileSystemConnectInfoExtension
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl FileSystemConnectInfoExtensionCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		FileSystemConnectInfoExtensionCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		FileSystemConnectInfoExtensionCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		FileSystemConnectInfoExtensionCppSerializeAsGeneric.setExtensionPoint("com.informatica.metadata.infasdk.connectinfo.sdkadapter.SDKConnectInfo");
      		FileSystemConnectInfoExtensionCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.GenericSDKConnectInfoModelExtension");
      		this.addAnnotationToElement(this.fileSystemConnectInfoExtensionIClass, FileSystemConnectInfoExtensionCppSerializeAsGeneric);


      		//initialization of annotations for property filename
      		com.informatica.imf.annotations.constraints.impl.LengthImpl filesystemconnectinfoextensionFilenameLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		filesystemconnectinfoextensionFilenameLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		filesystemconnectinfoextensionFilenameLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		filesystemconnectinfoextensionFilenameLength.setMax(255);
      		filesystemconnectinfoextensionFilenameLength.setMin(0);
      		this.addAnnotationToElement(this.fileSystemConnectInfoExtensionIClass.getAllProperties(true).get(FILE_SYSTEM_CONNECT_INFO_EXTENSION__FILENAME), filesystemconnectinfoextensionFilenameLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl filesystemconnectinfoextensionFilenamePersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		filesystemconnectinfoextensionFilenamePersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		filesystemconnectinfoextensionFilenamePersistence.setSize(255);
      		this.addAnnotationToElement(this.fileSystemConnectInfoExtensionIClass.getAllProperties(true).get(FILE_SYSTEM_CONNECT_INFO_EXTENSION__FILENAME), filesystemconnectinfoextensionFilenamePersistence);
      		//initialization of annotations for class FileSystemConnectInfo
      		com.informatica.metadata.common.annotation.impl.SerializeAsGenericClassImpl FileSystemConnectInfoSerializeAsGenericClass = 
      					new com.informatica.metadata.common.annotation.impl.SerializeAsGenericClassImpl();
      		FileSystemConnectInfoSerializeAsGenericClass.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getSerializeAsGenericClassIClass());
      		FileSystemConnectInfoSerializeAsGenericClass.setGenericClass("com.informatica.metadata.infasdk.connectinfo.sdkadapter.GenericSDKConnectInfo");
      		this.addAnnotationToElement(this.fileSystemConnectInfoIClass, FileSystemConnectInfoSerializeAsGenericClass);


    }
}