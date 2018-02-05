/*
 * Copyright (c)  Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 
 * Generation time: 
 */
package com.heston.adapter.con1.account.runtime.capability.impl;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * The package implementation for IPackage.
 * 'com.heston.adapter.con1.account.runtime.capability'
 */
public final class CapabilityIPackageImpl
extends com.informatica.imf.icore.impl.IPackageImpl
implements com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage {

    /**
     * The generated Serial Version UID.
     */
      private static final long serialVersionUID = -7204321411591782597L;

    /**
     * The IMF version that this package was generated with.
     */
    private static final String GENERATED_WITH_IMF_VERSION = "9.5.0";

    /**
     * @handcoded
     */
    private static final Logger LOGGER = Logger.getLogger(com.informatica.imf.icore.impl.IPackageImpl.class.getName());


    /**
     * Constant for class 'AccountCallCapabilityAttributesExtension'.
     */
    public static final int ACCOUNT_CALL_CAPABILITY_ATTRIBUTES_EXTENSION = 0;


    /**
     * Constant for feature constant in class 'AccountCallCapabilityAttributesExtension'.
     */
    private static final int ACCOUNT_CALL_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT = com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_CALL_CAP_ATTRIBUTESFeatureCount()+0;


    /**
     * Constant for class 'AccountLookupCapabilityAttributesExtension'.
     */
    public static final int ACCOUNT_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSION = 1;


    /**
     * Constant for feature constant in class 'AccountLookupCapabilityAttributesExtension'.
     */
    private static final int ACCOUNT_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT = com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_LOOKUP_CAP_ATTRIBUTESFeatureCount()+0;


    /**
     * Constant for class 'AccountReadCapabilityAttributesExtension'.
     */
    public static final int ACCOUNT_READ_CAPABILITY_ATTRIBUTES_EXTENSION = 2;


    /**
     * Constant for feature constant in class 'AccountReadCapabilityAttributesExtension'.
     */
    private static final int ACCOUNT_READ_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT = com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_READ_CAP_ATTRIBUTESFeatureCount()+0;


    /**
     * Constant for class 'AccountWriteCapabilityAttributesExtension'.
     */
    public static final int ACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION = 3;

    /**
     * Constant for property 'AccountWriteCapabilityAttributesExtension.UpdateMode'.
     */
    public static final  int ACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION__UPDATE_MODE =com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_WRITE_CAP_ATTRIBUTESFeatureCount()+0;

    /**
     * Constant for feature constant in class 'AccountWriteCapabilityAttributesExtension'.
     */
    private static final int ACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT = com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_WRITE_CAP_ATTRIBUTESFeatureCount()+1;



    private com.informatica.imf.icore.IClass accountCallCapabilityAttributesExtensionIClass = null;
    private com.informatica.imf.icore.IClass accountLookupCapabilityAttributesExtensionIClass = null;
    private com.informatica.imf.icore.IClass accountReadCapabilityAttributesExtensionIClass = null;
    private com.informatica.imf.icore.IClass accountWriteCapabilityAttributesExtensionIClass = null;
    private static com.informatica.imf.icore.impl.IcoreIPackageImpl theComInformaticaImfIcoreIPackage = (com.informatica.imf.icore.impl.IcoreIPackageImpl)com.informatica.imf.icore.IcoreIPackage.I_INSTANCE;
    private static com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl theComInformaticaAdapterSdkadapterAsoextensionIPackage = (com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl)com.informatica.adapter.sdkadapter.asoextension.AsoextensionIPackage.I_INSTANCE;
    private static com.informatica.metadata.common.modelextension.impl.ModelextensionIPackageImpl theComInformaticaMetadataCommonModelextensionIPackage = (com.informatica.metadata.common.modelextension.impl.ModelextensionIPackageImpl)com.informatica.metadata.common.modelextension.ModelextensionIPackage.I_INSTANCE;
    private CapabilityIPackageImpl() {
        super(com.heston.adapter.con1.account.runtime.capability.CapabilityIFactory.I_INSTANCE);
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
     public static com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage init() {
       synchronized(com.informatica.imf.icore.IMFRuntime.getInstance().getIMFRegistryLockObject()) {
          LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage: enter 'init()'");
            com.informatica.imf.icore.IMFRuntime imfRuntime = com.informatica.imf.icore.IMFRuntime.getInstance();
          if (imfRuntime.isPackageRegistered(com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage.I_QUALIFIED_NAME)) {
            LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage: already initialized");
            return (com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage)
              imfRuntime.getIPackageForName(com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage.I_QUALIFIED_NAME);
          }

          // Create and register package
          CapabilityIPackageImpl theComHestonAdapterCon1AccountRuntimeCapabilityIPackage = (CapabilityIPackageImpl)
              new com.heston.adapter.con1.account.runtime.capability.impl.CapabilityIPackageImpl();

          theComHestonAdapterCon1AccountRuntimeCapabilityIPackage.createPackageContents();



          theComHestonAdapterCon1AccountRuntimeCapabilityIPackage.initializePackageContents();



          imfRuntime.registerPackage(theComHestonAdapterCon1AccountRuntimeCapabilityIPackage);

          LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage: exit 'init()'");
          return theComHestonAdapterCon1AccountRuntimeCapabilityIPackage;
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
     * Retrieves the 'AccountCallCapabilityAttributesExtension' IClass defined
     * in this IPackage.
     * @return the 'AccountCallCapabilityAttributesExtension' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getAccountCallCapabilityAttributesExtensionIClass() {
        return this.accountCallCapabilityAttributesExtensionIClass;
    }


    /**
     * @return the feature count of ACCOUNT_CALL_CAPABILITY_ATTRIBUTES_EXTENSION class
    */
    public static int getACCOUNT_CALL_CAPABILITY_ATTRIBUTES_EXTENSIONFeatureCount(){
    return ACCOUNT_CALL_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT;
    }

    /**
     * Retrieves the 'AccountLookupCapabilityAttributesExtension' IClass defined
     * in this IPackage.
     * @return the 'AccountLookupCapabilityAttributesExtension' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getAccountLookupCapabilityAttributesExtensionIClass() {
        return this.accountLookupCapabilityAttributesExtensionIClass;
    }


    /**
     * @return the feature count of ACCOUNT_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSION class
    */
    public static int getACCOUNT_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSIONFeatureCount(){
    return ACCOUNT_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT;
    }

    /**
     * Retrieves the 'AccountReadCapabilityAttributesExtension' IClass defined
     * in this IPackage.
     * @return the 'AccountReadCapabilityAttributesExtension' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getAccountReadCapabilityAttributesExtensionIClass() {
        return this.accountReadCapabilityAttributesExtensionIClass;
    }


    /**
     * @return the feature count of ACCOUNT_READ_CAPABILITY_ATTRIBUTES_EXTENSION class
    */
    public static int getACCOUNT_READ_CAPABILITY_ATTRIBUTES_EXTENSIONFeatureCount(){
    return ACCOUNT_READ_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT;
    }

    /**
     * Retrieves the 'AccountWriteCapabilityAttributesExtension' IClass defined
     * in this IPackage.
     * @return the 'AccountWriteCapabilityAttributesExtension' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getAccountWriteCapabilityAttributesExtensionIClass() {
        return this.accountWriteCapabilityAttributesExtensionIClass;
    }


    /**
     * @return the feature count of ACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION class
    */
    public static int getACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSIONFeatureCount(){
    return ACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION_FEATURE_COUNT;
    }



    /**
     * Retrieves the factory class defined in this package.
     * @return the factory class defined in this package.
     */
    @Override
    public com.informatica.imf.icore.IFactory getFactory() {
       return com.heston.adapter.con1.account.runtime.capability.CapabilityIFactory.I_INSTANCE;
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
         LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage: enter 'createPackageContents()'");
         if (this.isCreated) {
           LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage: already created");
           return;
         }
         this.isCreated = true;

         // Create classes and their features
         this.accountCallCapabilityAttributesExtensionIClass = createIClass(ACCOUNT_CALL_CAPABILITY_ATTRIBUTES_EXTENSION);

         this.accountLookupCapabilityAttributesExtensionIClass = createIClass(ACCOUNT_LOOKUP_CAPABILITY_ATTRIBUTES_EXTENSION);

         this.accountReadCapabilityAttributesExtensionIClass = createIClass(ACCOUNT_READ_CAPABILITY_ATTRIBUTES_EXTENSION);

         this.accountWriteCapabilityAttributesExtensionIClass = createIClass(ACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION);
         createIProperty(this.accountWriteCapabilityAttributesExtensionIClass,ACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION__UPDATE_MODE);


         LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage: exit 'createPackageContents()'");
    }
  private boolean isInitialized = false;
    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     *
     */
    @Override
    public void initializePackageContents() {
        LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage: enter 'initializePackageContents()'");
      if (this.isInitialized) {
          LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage: already initialized");
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
        setFactory(com.heston.adapter.con1.account.runtime.capability.CapabilityIFactory.I_INSTANCE);

        //initialize the targets for the Annotations present in this package
        initAnnotationTargets();
        //initialize annotations for all classes and properties, if any
        initAnnotationsForAllElements();

        LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage: exit 'initializePackageContents()'");
    }
    private void addSuperTypesToClasses() {
        assert (this.accountCallCapabilityAttributesExtensionIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.accountCallCapabilityAttributesExtensionIClass)).setSuperClass(com.informatica.adapter.sdkadapter.asoextension.AsoextensionIPackage.I_INSTANCE.getD_ModelExtensionCallCapAttributesIClass());
        assert (this.accountLookupCapabilityAttributesExtensionIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.accountLookupCapabilityAttributesExtensionIClass)).setSuperClass(com.informatica.adapter.sdkadapter.asoextension.AsoextensionIPackage.I_INSTANCE.getD_ModelExtensionLookupCapAttributesIClass());
        assert (this.accountReadCapabilityAttributesExtensionIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.accountReadCapabilityAttributesExtensionIClass)).setSuperClass(com.informatica.adapter.sdkadapter.asoextension.AsoextensionIPackage.I_INSTANCE.getD_ModelExtensionReadCapAttributesIClass());
        assert (this.accountWriteCapabilityAttributesExtensionIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.accountWriteCapabilityAttributesExtensionIClass)).setSuperClass(com.informatica.adapter.sdkadapter.asoextension.AsoextensionIPackage.I_INSTANCE.getD_ModelExtensionWriteCapAttributesIClass());
    }
    private void initClasses() {
        // Initialize classes and features; add operations and parameters
        initIClass(this.accountCallCapabilityAttributesExtensionIClass, "AccountCallCapabilityAttributesExtension",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED);

        initIClass(this.accountLookupCapabilityAttributesExtensionIClass, "AccountLookupCapabilityAttributesExtension",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED);

        initIClass(this.accountReadCapabilityAttributesExtensionIClass, "AccountReadCapabilityAttributesExtension",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED);

        initIClass(this.accountWriteCapabilityAttributesExtensionIClass, "AccountWriteCapabilityAttributesExtension",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED);
        initIProperty(this.accountWriteCapabilityAttributesExtensionIClass.getAllProperties(true).get(ACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION__UPDATE_MODE), com.informatica.imf.icore.ICoreDatatypes.I_STRING, "UpdateMode",
        	"Update As Update", BOUNDS_VALUE_ZERO, BOUNDS_VALUE_ONE, null,
        	!IS_CONTAINMENT, IS_NO, IS_NOT_REFERABLE, !IS_UNIQUE, !IS_ORDERED, "", IS_FINALREDEFINE, "",
        	!IS_AGGREGATION, !IS_AGGREGATOR, !IS_FINAL_PROPERTY, !IS_NAME_PROPERTY, !IS_SENSITIVE,!IS_DEPRECATED, null);
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



      		//initialization of annotations for class AccountCallCapabilityAttributesExtension
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl AccountCallCapabilityAttributesExtensionCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		AccountCallCapabilityAttributesExtensionCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		AccountCallCapabilityAttributesExtensionCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		AccountCallCapabilityAttributesExtensionCppSerializeAsGeneric.setExtensionPoint("com.informatica.adapter.sdkadapter.capabilityattribute.D_CallCapabilityAttributes");
      		AccountCallCapabilityAttributesExtensionCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.adapter.sdkadapter.asoextension.D_GenericModelExtensionCallCapAttributes");
      		this.addAnnotationToElement(this.accountCallCapabilityAttributesExtensionIClass, AccountCallCapabilityAttributesExtensionCppSerializeAsGeneric);


      		//initialization of annotations for class AccountLookupCapabilityAttributesExtension
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl AccountLookupCapabilityAttributesExtensionCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		AccountLookupCapabilityAttributesExtensionCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		AccountLookupCapabilityAttributesExtensionCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		AccountLookupCapabilityAttributesExtensionCppSerializeAsGeneric.setExtensionPoint("com.informatica.adapter.sdkadapter.capabilityattribute.D_LookupCapabilityAttributes");
      		AccountLookupCapabilityAttributesExtensionCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.adapter.sdkadapter.asoextension.D_GenericModelExtensionLookupCapAttributes");
      		this.addAnnotationToElement(this.accountLookupCapabilityAttributesExtensionIClass, AccountLookupCapabilityAttributesExtensionCppSerializeAsGeneric);


      		//initialization of annotations for class AccountReadCapabilityAttributesExtension
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl AccountReadCapabilityAttributesExtensionCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		AccountReadCapabilityAttributesExtensionCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		AccountReadCapabilityAttributesExtensionCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		AccountReadCapabilityAttributesExtensionCppSerializeAsGeneric.setExtensionPoint("com.informatica.adapter.sdkadapter.capabilityattribute.D_ReadCapabilityAttributes");
      		AccountReadCapabilityAttributesExtensionCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.adapter.sdkadapter.asoextension.D_GenericModelExtensionReadCapAttributes");
      		this.addAnnotationToElement(this.accountReadCapabilityAttributesExtensionIClass, AccountReadCapabilityAttributesExtensionCppSerializeAsGeneric);


      		//initialization of annotations for class AccountWriteCapabilityAttributesExtension
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl AccountWriteCapabilityAttributesExtensionCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		AccountWriteCapabilityAttributesExtensionCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		AccountWriteCapabilityAttributesExtensionCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		AccountWriteCapabilityAttributesExtensionCppSerializeAsGeneric.setExtensionPoint("com.informatica.adapter.sdkadapter.capabilityattribute.D_WriteCapabilityAttributes");
      		AccountWriteCapabilityAttributesExtensionCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.adapter.sdkadapter.asoextension.D_GenericModelExtensionWriteCapAttributes");
      		this.addAnnotationToElement(this.accountWriteCapabilityAttributesExtensionIClass, AccountWriteCapabilityAttributesExtensionCppSerializeAsGeneric);


      		//initialization of annotations for property UpdateMode
      		com.informatica.imf.annotations.constraints.impl.LengthImpl accountwritecapabilityattributesextensionUpdatemodeLength = 
      					new com.informatica.imf.annotations.constraints.impl.LengthImpl();
      		accountwritecapabilityattributesextensionUpdatemodeLength.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getLengthIClass());
      		accountwritecapabilityattributesextensionUpdatemodeLength.setLengthType(com.informatica.imf.annotations.constraints.LengthType.OTHER);
      		accountwritecapabilityattributesextensionUpdatemodeLength.setMax(0);
      		accountwritecapabilityattributesextensionUpdatemodeLength.setMin(0);
      		this.addAnnotationToElement(this.accountWriteCapabilityAttributesExtensionIClass.getAllProperties(true).get(ACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION__UPDATE_MODE), accountwritecapabilityattributesextensionUpdatemodeLength);
      		com.informatica.imf.annotations.constraints.impl.PersistenceImpl accountwritecapabilityattributesextensionUpdatemodePersistence = 
      					new com.informatica.imf.annotations.constraints.impl.PersistenceImpl();
      		accountwritecapabilityattributesextensionUpdatemodePersistence.iSetIClass(com.informatica.imf.annotations.constraints.ConstraintsIPackage.I_INSTANCE.getPersistenceIClass());
      		accountwritecapabilityattributesextensionUpdatemodePersistence.setSize(0);
      		this.addAnnotationToElement(this.accountWriteCapabilityAttributesExtensionIClass.getAllProperties(true).get(ACCOUNT_WRITE_CAPABILITY_ATTRIBUTES_EXTENSION__UPDATE_MODE), accountwritecapabilityattributesextensionUpdatemodePersistence);
    }
}