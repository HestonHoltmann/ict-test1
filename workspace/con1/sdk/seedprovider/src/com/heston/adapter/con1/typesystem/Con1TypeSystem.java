package com.heston.adapter.con1.typesystem;

import com.informatica.imf.icore.IMFRuntime;
import com.informatica.imf.icore.exception.SeedException;
import com.informatica.metadata.common.typesystem.DataType;
import com.informatica.metadata.common.typesystem.TypeSystem;
import com.informatica.metadata.common.typesystem.directmaps.DirectTypeSystemMap;
import com.informatica.metadata.common.typesystem.directmaps.util.DirectMapUtils;
import com.informatica.metadata.common.typesystem.storagesemantics.LengthUnitKind;
import com.informatica.metadata.common.typesystem.storagesemantics.RadixKind;
import com.informatica.metadata.common.typesystem.storagesemantics.util.StorageSemanticsUtils;
import com.informatica.metadata.common.typesystem.util.TypeSystemUtils;
import com.informatica.metadata.seed.platform.Platform;

@SuppressWarnings("unused")
@com.informatica.imf.annotations.seed.SeedProvider
public class Con1TypeSystem  {

    @com.informatica.imf.annotations.seed.Seed
    public static final TypeSystem typesystem = TypeSystemUtils.INSTANCE.createTypeSystem("com.heston.adapter.con1.typesystem.Con1TypeSystem", 
                                                                                          "CON1", "con1 Adapter Type System");

    public static final DataType stringDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "String", 
                                                                                                         "String data type", 
                                                                                                         65535, 1024, LengthUnitKind.bytes, 
                                                                                                         true, true);

    public static final DataType booleanDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, 
                                                                                                            "Boolean", "Boolean data type", 
                                                                                                            12, 12, true);

    public static final DataType integerDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, 
                                                                                                            "Integer", "Integer data type", 
                                                                                                            12, 12, true);

    public static final DataType bigintDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, "BigInt", 
                                                                                                           "Big Integer data type", 
                                                                                                           8, 8, true);

    public static final DataType decimalDT = StorageSemanticsUtils.INSTANCE.createSciDecimalSemanticsDataType(typesystem, 
                                                                                                              "Decimal", 
                                                                                                              "Decimal data type", 
                                                                                                              31, 10, true, 
                                                                                                              10, 0, 0, 
                                                                                                              true);

    public static final DataType doubleDT = StorageSemanticsUtils.INSTANCE.createFloatSemanticsDataType(typesystem, "Double", 
                                                                                                        "Double data type", 
                                                                                                        15, 15, true, RadixKind.binary, 
                                                                                                        252, 252, RadixKind.decimal);

    public static final DataType longDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, "Long", 
                                                                                                         "Long data type", 
                                                                                                         8, 8, true);

    public static final DataType timestampDT = StorageSemanticsUtils.INSTANCE.createGDateSemanticsDataType(typesystem, "Timestamp", 
                                                                                                           "Timestamp data type", 
                                                                                                           true, true, true, 
                                                                                                           true, true, true, 
                                                                                                           true, 8, 8, false);

    public static final DataType arrayDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, "Array", 
                                                                                                          "Array data type", 
                                                                                                          65535, 1024, true);

    public static final DataType objectDT = StorageSemanticsUtils.INSTANCE.createLengthSemanticsDataType(typesystem, "Object", 
                                                                                                         "Object data type", 
                                                                                                         65535, 1024, LengthUnitKind.bytes, 
                                                                                                         true, true);

    public static final DataType binaryDT = StorageSemanticsUtils.INSTANCE.createIntegralSemanticsDataType(typesystem, "Binary", 
                                                                                                           "Binary data type", 
                                                                                                           65535, 1024, 
                                                                                                           true);

    private static final DirectTypeSystemMap con1PlatformMap = DirectMapUtils.INSTANCE.createDirectTypeSystemMap(typesystem, 
                                                                                                                 Platform.typesystem);
    static {
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, booleanDT, Platform.integerDT, false, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, bigintDT, Platform.bigIntegerDT, false, false, true, 
                                                      true);
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, integerDT, Platform.integerDT, false, false, true, 
                                                      true);
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, longDT, Platform.bigIntegerDT, false, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, stringDT, Platform.stringDT, false, false, true, 
                                                      true);
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, timestampDT, Platform.dateDT, false, false, true, 
                                                      true);
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, objectDT, Platform.stringDT, false, false, true, 
                                                      false);
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, binaryDT, Platform.binaryDT, false, false, true, 
                                                      true);
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, doubleDT, Platform.doubleDT, false, false, true, 
                                                      true);
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, arrayDT, Platform.binaryDT, false, false, true, false);
            DirectMapUtils.INSTANCE.createDataTypeMap(con1PlatformMap, decimalDT, Platform.decimalDT, false, false, true, 
                                                      true);
    }

    static {
            try {
             	 IMFRuntime.getInstance().getSeedRegistry().register(Con1TypeSystem.class);
            } catch (SeedException e) {
            	e.printStackTrace();
            }
    }


    private Con1TypeSystem(){}


}