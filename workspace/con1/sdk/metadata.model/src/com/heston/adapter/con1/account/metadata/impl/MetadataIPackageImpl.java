/*
 * Copyright (c)  Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 
 * Generation time: 
 */
package com.heston.adapter.con1.account.metadata.impl;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * The package implementation for IPackage.
 * 'com.heston.adapter.con1.account.metadata'
 */
public final class MetadataIPackageImpl
extends com.informatica.imf.icore.impl.IPackageImpl
implements com.heston.adapter.con1.account.metadata.MetadataIPackage {

    /**
     * The generated Serial Version UID.
     */
      private static final long serialVersionUID = -8838384377481331526L;

    /**
     * The IMF version that this package was generated with.
     */
    private static final String GENERATED_WITH_IMF_VERSION = "9.5.0";

    /**
     * @handcoded
     */
    private static final Logger LOGGER = Logger.getLogger(com.informatica.imf.icore.impl.IPackageImpl.class.getName());


    /**
     * Constant for class 'AccountFieldExtensions'.
     */
    public static final int ACCOUNT_FIELD_EXTENSIONS = 0;


    /**
     * Constant for feature constant in class 'AccountFieldExtensions'.
     */
    private static final int ACCOUNT_FIELD_EXTENSIONS_FEATURE_COUNT = com.informatica.adapter.sdkadapter.logical.impl.LogicalIPackageImpl.getL__MODEL_EXTENSION_FIELD_BASEFeatureCount()+0;


    /**
     * Constant for class 'AccountRecordExtensions'.
     */
    public static final int ACCOUNT_RECORD_EXTENSIONS = 1;


    /**
     * Constant for feature constant in class 'AccountRecordExtensions'.
     */
    private static final int ACCOUNT_RECORD_EXTENSIONS_FEATURE_COUNT = com.informatica.adapter.sdkadapter.logical.impl.LogicalIPackageImpl.getL__MODEL_EXTENSION_NODEFeatureCount()+0;



    private com.informatica.imf.icore.IClass accountFieldExtensionsIClass = null;
    private com.informatica.imf.icore.IClass accountRecordExtensionsIClass = null;
    private static com.informatica.metadata.common.modelextension.impl.ModelextensionIPackageImpl theComInformaticaMetadataCommonModelextensionIPackage = (com.informatica.metadata.common.modelextension.impl.ModelextensionIPackageImpl)com.informatica.metadata.common.modelextension.ModelextensionIPackage.I_INSTANCE;
    private static com.informatica.adapter.sdkadapter.logical.impl.LogicalIPackageImpl theComInformaticaAdapterSdkadapterLogicalIPackage = (com.informatica.adapter.sdkadapter.logical.impl.LogicalIPackageImpl)com.informatica.adapter.sdkadapter.logical.LogicalIPackage.I_INSTANCE;
    private MetadataIPackageImpl() {
        super(com.heston.adapter.con1.account.metadata.MetadataIFactory.I_INSTANCE);
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
     public static com.heston.adapter.con1.account.metadata.MetadataIPackage init() {
       synchronized(com.informatica.imf.icore.IMFRuntime.getInstance().getIMFRegistryLockObject()) {
          LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.metadata.MetadataIPackage: enter 'init()'");
            com.informatica.imf.icore.IMFRuntime imfRuntime = com.informatica.imf.icore.IMFRuntime.getInstance();
          if (imfRuntime.isPackageRegistered(com.heston.adapter.con1.account.metadata.MetadataIPackage.I_QUALIFIED_NAME)) {
            LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.metadata.MetadataIPackage: already initialized");
            return (com.heston.adapter.con1.account.metadata.MetadataIPackage)
              imfRuntime.getIPackageForName(com.heston.adapter.con1.account.metadata.MetadataIPackage.I_QUALIFIED_NAME);
          }

          // Create and register package
          MetadataIPackageImpl theComHestonAdapterCon1AccountMetadataIPackage = (MetadataIPackageImpl)
              new com.heston.adapter.con1.account.metadata.impl.MetadataIPackageImpl();

          theComHestonAdapterCon1AccountMetadataIPackage.createPackageContents();



          theComHestonAdapterCon1AccountMetadataIPackage.initializePackageContents();



          imfRuntime.registerPackage(theComHestonAdapterCon1AccountMetadataIPackage);

          LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.metadata.MetadataIPackage: exit 'init()'");
          return theComHestonAdapterCon1AccountMetadataIPackage;
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
     * Retrieves the 'AccountFieldExtensions' IClass defined
     * in this IPackage.
     * @return the 'AccountFieldExtensions' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getAccountFieldExtensionsIClass() {
        return this.accountFieldExtensionsIClass;
    }


    /**
     * @return the feature count of ACCOUNT_FIELD_EXTENSIONS class
    */
    public static int getACCOUNT_FIELD_EXTENSIONSFeatureCount(){
    return ACCOUNT_FIELD_EXTENSIONS_FEATURE_COUNT;
    }

    /**
     * Retrieves the 'AccountRecordExtensions' IClass defined
     * in this IPackage.
     * @return the 'AccountRecordExtensions' IClass defined
     * in this IPackage
     * 
     */
    public com.informatica.imf.icore.IClass getAccountRecordExtensionsIClass() {
        return this.accountRecordExtensionsIClass;
    }


    /**
     * @return the feature count of ACCOUNT_RECORD_EXTENSIONS class
    */
    public static int getACCOUNT_RECORD_EXTENSIONSFeatureCount(){
    return ACCOUNT_RECORD_EXTENSIONS_FEATURE_COUNT;
    }



    /**
     * Retrieves the factory class defined in this package.
     * @return the factory class defined in this package.
     */
    @Override
    public com.informatica.imf.icore.IFactory getFactory() {
       return com.heston.adapter.con1.account.metadata.MetadataIFactory.I_INSTANCE;
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
         LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.metadata.MetadataIPackage: enter 'createPackageContents()'");
         if (this.isCreated) {
           LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.metadata.MetadataIPackage: already created");
           return;
         }
         this.isCreated = true;

         // Create classes and their features
         this.accountFieldExtensionsIClass = createIClass(ACCOUNT_FIELD_EXTENSIONS);

         this.accountRecordExtensionsIClass = createIClass(ACCOUNT_RECORD_EXTENSIONS);


         LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.metadata.MetadataIPackage: exit 'createPackageContents()'");
    }
  private boolean isInitialized = false;
    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     *
     */
    @Override
    public void initializePackageContents() {
        LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.metadata.MetadataIPackage: enter 'initializePackageContents()'");
      if (this.isInitialized) {
          LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.metadata.MetadataIPackage: already initialized");
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
        setFactory(com.heston.adapter.con1.account.metadata.MetadataIFactory.I_INSTANCE);

        //initialize the targets for the Annotations present in this package
        initAnnotationTargets();
        //initialize annotations for all classes and properties, if any
        initAnnotationsForAllElements();

        LOGGER.log(Level.FINE, "Initialization of com.heston.adapter.con1.account.metadata.MetadataIPackage: exit 'initializePackageContents()'");
    }
    private void addSuperTypesToClasses() {
        assert (this.accountFieldExtensionsIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.accountFieldExtensionsIClass)).setSuperClass(com.informatica.adapter.sdkadapter.logical.LogicalIPackage.I_INSTANCE.getL_ModelExtensionFieldBaseIClass());
        assert (this.accountRecordExtensionsIClass instanceof com.informatica.imf.icore.internal.IClassInternal);
        ((com.informatica.imf.icore.internal.IClassInternal) (this.accountRecordExtensionsIClass)).setSuperClass(com.informatica.adapter.sdkadapter.logical.LogicalIPackage.I_INSTANCE.getL_ModelExtensionNodeIClass());
    }
    private void initClasses() {
        // Initialize classes and features; add operations and parameters
        initIClass(this.accountFieldExtensionsIClass, "AccountFieldExtensions",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED);

        initIClass(this.accountRecordExtensionsIClass, "AccountRecordExtensions",
        	!IS_ABSTRACT, IS_SECOND_CLASS, IS_INTERNAL, !IS_FINAL, !IS_SEEDED, "", !IS_CONSTRAINT_ANNOTATION, !IS_NAMESPACE, !IS_NAMESPACED);

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



      		//initialization of annotations for class AccountFieldExtensions
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl AccountFieldExtensionsCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		AccountFieldExtensionsCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		AccountFieldExtensionsCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		AccountFieldExtensionsCppSerializeAsGeneric.setExtensionPoint("com.informatica.adapter.sdkadapter.patternblocks.field.P_Field");
      		AccountFieldExtensionsCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.adapter.sdkadapter.logical.L_GenericModelExtensionFieldBase");
      		this.addAnnotationToElement(this.accountFieldExtensionsIClass, AccountFieldExtensionsCppSerializeAsGeneric);


      		//initialization of annotations for class AccountRecordExtensions
      		com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl AccountRecordExtensionsCppSerializeAsGeneric = 
      					new com.informatica.metadata.common.annotation.impl.CppSerializeAsGenericImpl();
      		AccountRecordExtensionsCppSerializeAsGeneric.iSetIClass(com.informatica.metadata.common.annotation.AnnotationIPackage.I_INSTANCE.getCppSerializeAsGenericIClass());
      		AccountRecordExtensionsCppSerializeAsGeneric.setContainerProperty("genericContainer");
      		AccountRecordExtensionsCppSerializeAsGeneric.setExtensionPoint("com.informatica.adapter.sdkadapter.patternblocks.flatrecord.P_FlatRecord");
      		AccountRecordExtensionsCppSerializeAsGeneric.setSerializedExtensionClass("com.informatica.adapter.sdkadapter.logical.L_GenericModelExtensionNode");
      		this.addAnnotationToElement(this.accountRecordExtensionsIClass, AccountRecordExtensionsCppSerializeAsGeneric);


    }
}