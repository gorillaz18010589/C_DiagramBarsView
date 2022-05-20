package android.rockchip.c_diagrambarsview;

import androidx.annotation.IntDef;

public class DeviceIntDef {
    public static int DEFAULT_USE_TIME_LIMIT = 60 * 99; //秒
    public static int DEFAULT_AUTO_PAUSE_TIME = 60 * 3; //秒
    public static int DEFAULT_DISPLAY_BRIGHTNESS = 85;

    public static final int IMPERIAL = 0;
    public static final int METRIC = 1;

    public static final int ON = 1;
    public static final int OFF = 0;

    public static final int SCREEN_TIMEOUT_NEVER = 2147483647;
    public static final int SCREEN_TIMEOUT_15 = 60 * 15 * 1000;

    public static final int TF_24HR  = 24;
    public static final int TF_AM_PM = 12;

    @IntDef({DEVICE_TYPE_TREADMILL, DEVICE_TYPE_ELLIPTICAL,DEVICE_TYPE_UPRIGHT_BIKE,DEVICE_TYPE_RECUMBENT_BIKE})
    public @interface DeviceType {
    }

    @IntDef({IMPERIAL, METRIC})
    public @interface UnitType {
    }

    @IntDef({ TF_24HR, TF_AM_PM })
    public @interface TimeFormat {
    }

    public static final int FTMS_TYPE_TREADMILL = 0;
    public static final int FTMS_TYPE_CROSS_TRAINER = 1;
    public static final int FTMS_TYPE_INDOOR_BIKE = 2;

    public static final int DEVICE_TYPE_TREADMILL = 0; //電動跑步機
    public static final int DEVICE_TYPE_ELLIPTICAL = 1; //橢圓機
    public static final int DEVICE_TYPE_UPRIGHT_BIKE = 2;//直立式腳踏車
    public static final int DEVICE_TYPE_RECUMBENT_BIKE = 3; //臥式腳踏車

    public static final int DEVICE_MODEL_CT1000ENT = 0;
    public static final int DEVICE_MODEL_CE1000ENT = 1;
    public static final int DEVICE_MODEL_CU1000ENT = 2;
    public static final int DEVICE_MODEL_CR1000ENT = 3;



    public static final int TV_DCI_OSD = 0;
    public static final int TV_IPTV = 1;

    public static final int NFC_GYM_KIT = 0;
    public static final int NFC_MEMBERSHIP = 1;


    public static final int PROTOCOL_CSAFE = 0;
    public static final int PROTOCOL_CAB = 1;

    public static final int VIDEO_STB = 0;
    public static final int VIDEO_TV = 1;
    public static final int VIDEO_NONE = 2;


    @IntDef({ DEVICE_TYPE_TREADMILL, DEVICE_TYPE_ELLIPTICAL, DEVICE_TYPE_UPRIGHT_BIKE, DEVICE_TYPE_RECUMBENT_BIKE})
    public @interface MachineType {
    }
}
