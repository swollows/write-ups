package androidx.core.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public final class LocationCompat {
    public static final String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final String EXTRA_IS_MOCK = "mockLocation";
    public static final String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";
    private static Field sFieldsMaskField;
    private static Integer sHasBearingAccuracyMask;
    private static Integer sHasSpeedAccuracyMask;
    private static Integer sHasVerticalAccuracyMask;
    private static Method sSetIsFromMockProviderMethod;

    private LocationCompat() {
    }

    public static long getElapsedRealtimeNanos(Location location) {
        return location.getElapsedRealtimeNanos();
    }

    public static long getElapsedRealtimeMillis(Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    public static boolean hasVerticalAccuracy(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasVerticalAccuracy(location);
        }
        return containsExtra(location, EXTRA_VERTICAL_ACCURACY);
    }

    public static float getVerticalAccuracyMeters(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getVerticalAccuracyMeters(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_VERTICAL_ACCURACY, 0.0f);
    }

    public static void setVerticalAccuracyMeters(Location location, float verticalAccuracyM) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setVerticalAccuracyMeters(location, verticalAccuracyM);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_VERTICAL_ACCURACY, verticalAccuracyM);
        }
    }

    public static void removeVerticalAccuracy(Location location) {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.removeVerticalAccuracy(location);
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.removeVerticalAccuracy(location);
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.removeVerticalAccuracy(location);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.removeVerticalAccuracy(location);
        } else {
            removeExtra(location, EXTRA_VERTICAL_ACCURACY);
        }
    }

    public static boolean hasSpeedAccuracy(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasSpeedAccuracy(location);
        }
        return containsExtra(location, EXTRA_SPEED_ACCURACY);
    }

    public static float getSpeedAccuracyMetersPerSecond(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getSpeedAccuracyMetersPerSecond(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_SPEED_ACCURACY, 0.0f);
    }

    public static void setSpeedAccuracyMetersPerSecond(Location location, float speedAccuracyMps) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setSpeedAccuracyMetersPerSecond(location, speedAccuracyMps);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_SPEED_ACCURACY, speedAccuracyMps);
        }
    }

    public static void removeSpeedAccuracy(Location location) {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.removeSpeedAccuracy(location);
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.removeSpeedAccuracy(location);
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.removeSpeedAccuracy(location);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.removeSpeedAccuracy(location);
        } else {
            removeExtra(location, EXTRA_SPEED_ACCURACY);
        }
    }

    public static boolean hasBearingAccuracy(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasBearingAccuracy(location);
        }
        return containsExtra(location, EXTRA_BEARING_ACCURACY);
    }

    public static float getBearingAccuracyDegrees(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getBearingAccuracyDegrees(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_BEARING_ACCURACY, 0.0f);
    }

    public static void setBearingAccuracyDegrees(Location location, float bearingAccuracyD) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setBearingAccuracyDegrees(location, bearingAccuracyD);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_BEARING_ACCURACY, bearingAccuracyD);
        }
    }

    public static void removeBearingAccuracy(Location location) {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.removeBearingAccuracy(location);
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.removeBearingAccuracy(location);
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.removeBearingAccuracy(location);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.removeBearingAccuracy(location);
        } else {
            removeExtra(location, EXTRA_BEARING_ACCURACY);
        }
    }

    public static double getMslAltitudeMeters(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getMslAltitudeMeters(location);
        }
        return getOrCreateExtras(location).getDouble(EXTRA_MSL_ALTITUDE);
    }

    public static void setMslAltitudeMeters(Location location, double mslAltitudeMeters) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setMslAltitudeMeters(location, mslAltitudeMeters);
        } else {
            getOrCreateExtras(location).putDouble(EXTRA_MSL_ALTITUDE, mslAltitudeMeters);
        }
    }

    public static boolean hasMslAltitude(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.hasMslAltitude(location);
        }
        return containsExtra(location, EXTRA_MSL_ALTITUDE);
    }

    public static void removeMslAltitude(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.removeMslAltitude(location);
        } else {
            removeExtra(location, EXTRA_MSL_ALTITUDE);
        }
    }

    public static float getMslAltitudeAccuracyMeters(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getMslAltitudeAccuracyMeters(location);
        }
        return getOrCreateExtras(location).getFloat(EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void setMslAltitudeAccuracyMeters(Location location, float mslAltitudeAccuracyMeters) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setMslAltitudeAccuracyMeters(location, mslAltitudeAccuracyMeters);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_MSL_ALTITUDE_ACCURACY, mslAltitudeAccuracyMeters);
        }
    }

    public static boolean hasMslAltitudeAccuracy(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.hasMslAltitudeAccuracy(location);
        }
        return containsExtra(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void removeMslAltitudeAccuracy(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.removeMslAltitudeAccuracy(location);
        } else {
            removeExtra(location, EXTRA_MSL_ALTITUDE_ACCURACY);
        }
    }

    public static boolean isMock(Location location) {
        return location.isFromMockProvider();
    }

    public static void setMock(Location location, boolean mock) {
        try {
            getSetIsFromMockProviderMethod().invoke(location, new Object[]{Boolean.valueOf(mock)});
        } catch (NoSuchMethodException e) {
            Error error = new NoSuchMethodError();
            error.initCause(e);
            throw error;
        } catch (IllegalAccessException e2) {
            Error error2 = new IllegalAccessError();
            error2.initCause(e2);
            throw error2;
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        static double getMslAltitudeMeters(Location location) {
            return location.getMslAltitudeMeters();
        }

        static void setMslAltitudeMeters(Location location, double mslAltitudeMeters) {
            location.setMslAltitudeMeters(mslAltitudeMeters);
        }

        static boolean hasMslAltitude(Location location) {
            return location.hasMslAltitude();
        }

        static void removeMslAltitude(Location location) {
            location.removeMslAltitude();
        }

        static float getMslAltitudeAccuracyMeters(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        static void setMslAltitudeAccuracyMeters(Location location, float mslAltitudeAccuracyMeters) {
            location.setMslAltitudeAccuracyMeters(mslAltitudeAccuracyMeters);
        }

        static boolean hasMslAltitudeAccuracy(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        static void removeMslAltitudeAccuracy(Location location) {
            location.removeMslAltitudeAccuracy();
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
        }

        static void removeVerticalAccuracy(Location location) {
            location.removeVerticalAccuracy();
        }

        static void removeSpeedAccuracy(Location location) {
            location.removeSpeedAccuracy();
        }

        static void removeBearingAccuracy(Location location) {
            location.removeBearingAccuracy();
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static void removeVerticalAccuracy(Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNs = location.getElapsedRealtimeUncertaintyNanos();
                Api28Impl.removeVerticalAccuracy(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNs);
            }
        }

        static void removeSpeedAccuracy(Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNs = location.getElapsedRealtimeUncertaintyNanos();
                Api28Impl.removeSpeedAccuracy(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNs);
            }
        }

        static void removeBearingAccuracy(Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNs = location.getElapsedRealtimeUncertaintyNanos();
                Api28Impl.removeBearingAccuracy(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNs);
            }
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static void removeVerticalAccuracy(Location location) {
            float bearing;
            float accuracy;
            float accuracy2;
            Location location2 = location;
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNs = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing2 = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float bearing3 = bearing2;
                float accuracy3 = location.getAccuracy();
                boolean hasSpeedAccuracy = location.hasSpeedAccuracy();
                float accuracy4 = accuracy3;
                float accuracy5 = location.getSpeedAccuracyMetersPerSecond();
                boolean hasBearingAccuracy = location.hasBearingAccuracy();
                float speedAccuracy = accuracy5;
                float bearingAccuracy = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location2.setProvider(provider);
                location2.setTime(time);
                location2.setElapsedRealtimeNanos(elapsedRealtimeNs);
                location2.setLatitude(latitude);
                location2.setLongitude(longitude);
                if (hasAltitude) {
                    location2.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location2.setSpeed(speed);
                }
                if (hasBearing) {
                    String str = provider;
                    bearing = bearing3;
                    location2.setBearing(bearing);
                } else {
                    bearing = bearing3;
                }
                if (hasAccuracy) {
                    float f = bearing;
                    accuracy = accuracy4;
                    location2.setAccuracy(accuracy);
                } else {
                    accuracy = accuracy4;
                }
                if (hasSpeedAccuracy) {
                    float f2 = accuracy;
                    accuracy2 = speedAccuracy;
                    location2.setSpeedAccuracyMetersPerSecond(accuracy2);
                } else {
                    accuracy2 = speedAccuracy;
                }
                if (hasBearingAccuracy) {
                    float f3 = accuracy2;
                    location2.setBearingAccuracyDegrees(bearingAccuracy);
                } else {
                    float speedAccuracy2 = accuracy2;
                    float speedAccuracy3 = bearingAccuracy;
                }
                if (extras != null) {
                    location2.setExtras(extras);
                }
            }
        }

        static void removeSpeedAccuracy(Location location) {
            float bearing;
            float accuracy;
            float accuracy2;
            Location location2 = location;
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNs = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing2 = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float bearing3 = bearing2;
                float accuracy3 = location.getAccuracy();
                boolean hasVerticalAccuracy = location.hasVerticalAccuracy();
                float accuracy4 = accuracy3;
                float accuracy5 = location.getVerticalAccuracyMeters();
                boolean hasBearingAccuracy = location.hasBearingAccuracy();
                float verticalAccuracy = accuracy5;
                float bearingAccuracy = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location2.setProvider(provider);
                location2.setTime(time);
                location2.setElapsedRealtimeNanos(elapsedRealtimeNs);
                location2.setLatitude(latitude);
                location2.setLongitude(longitude);
                if (hasAltitude) {
                    location2.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location2.setSpeed(speed);
                }
                if (hasBearing) {
                    String str = provider;
                    bearing = bearing3;
                    location2.setBearing(bearing);
                } else {
                    bearing = bearing3;
                }
                if (hasAccuracy) {
                    float f = bearing;
                    accuracy = accuracy4;
                    location2.setAccuracy(accuracy);
                } else {
                    accuracy = accuracy4;
                }
                if (hasVerticalAccuracy) {
                    float f2 = accuracy;
                    accuracy2 = verticalAccuracy;
                    location2.setVerticalAccuracyMeters(accuracy2);
                } else {
                    accuracy2 = verticalAccuracy;
                }
                if (hasBearingAccuracy) {
                    float f3 = accuracy2;
                    location2.setBearingAccuracyDegrees(bearingAccuracy);
                } else {
                    float verticalAccuracy2 = accuracy2;
                    float verticalAccuracy3 = bearingAccuracy;
                }
                if (extras != null) {
                    location2.setExtras(extras);
                }
            }
        }

        static void removeBearingAccuracy(Location location) {
            float bearing;
            float accuracy;
            float accuracy2;
            Location location2 = location;
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNs = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing2 = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float bearing3 = bearing2;
                float accuracy3 = location.getAccuracy();
                boolean hasVerticalAccuracy = location.hasVerticalAccuracy();
                float accuracy4 = accuracy3;
                float accuracy5 = location.getVerticalAccuracyMeters();
                boolean hasSpeedAccuracy = location.hasSpeedAccuracy();
                float verticalAccuracy = accuracy5;
                float speedAccuracy = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location2.setProvider(provider);
                location2.setTime(time);
                location2.setElapsedRealtimeNanos(elapsedRealtimeNs);
                location2.setLatitude(latitude);
                location2.setLongitude(longitude);
                if (hasAltitude) {
                    location2.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location2.setSpeed(speed);
                }
                if (hasBearing) {
                    String str = provider;
                    bearing = bearing3;
                    location2.setBearing(bearing);
                } else {
                    bearing = bearing3;
                }
                if (hasAccuracy) {
                    float f = bearing;
                    accuracy = accuracy4;
                    location2.setAccuracy(accuracy);
                } else {
                    accuracy = accuracy4;
                }
                if (hasVerticalAccuracy) {
                    float f2 = accuracy;
                    accuracy2 = verticalAccuracy;
                    location2.setVerticalAccuracyMeters(accuracy2);
                } else {
                    accuracy2 = verticalAccuracy;
                }
                if (hasSpeedAccuracy) {
                    float f3 = accuracy2;
                    location2.setBearingAccuracyDegrees(speedAccuracy);
                } else {
                    float verticalAccuracy2 = accuracy2;
                    float verticalAccuracy3 = speedAccuracy;
                }
                if (extras != null) {
                    location2.setExtras(extras);
                }
            }
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
        }

        static boolean hasVerticalAccuracy(Location location) {
            return location.hasVerticalAccuracy();
        }

        static float getVerticalAccuracyMeters(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static void setVerticalAccuracyMeters(Location location, float verticalAccuracyM) {
            location.setVerticalAccuracyMeters(verticalAccuracyM);
        }

        static void removeVerticalAccuracy(Location location) {
            try {
                LocationCompat.getFieldsMaskField().setByte(location, (byte) ((~LocationCompat.getHasVerticalAccuracyMask()) & LocationCompat.getFieldsMaskField().getByte(location)));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                Error error = new IllegalAccessError();
                error.initCause(e);
                throw error;
            }
        }

        static boolean hasSpeedAccuracy(Location location) {
            return location.hasSpeedAccuracy();
        }

        static float getSpeedAccuracyMetersPerSecond(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        static void setSpeedAccuracyMetersPerSecond(Location location, float speedAccuracyMps) {
            location.setSpeedAccuracyMetersPerSecond(speedAccuracyMps);
        }

        static void removeSpeedAccuracy(Location location) {
            try {
                LocationCompat.getFieldsMaskField().setByte(location, (byte) ((~LocationCompat.getHasSpeedAccuracyMask()) & LocationCompat.getFieldsMaskField().getByte(location)));
            } catch (NoSuchFieldException e) {
                Error error = new NoSuchFieldError();
                error.initCause(e);
                throw error;
            } catch (IllegalAccessException e2) {
                Error error2 = new IllegalAccessError();
                error2.initCause(e2);
                throw error2;
            }
        }

        static boolean hasBearingAccuracy(Location location) {
            return location.hasBearingAccuracy();
        }

        static float getBearingAccuracyDegrees(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static void setBearingAccuracyDegrees(Location location, float bearingAccuracyD) {
            location.setBearingAccuracyDegrees(bearingAccuracyD);
        }

        static void removeBearingAccuracy(Location location) {
            try {
                LocationCompat.getFieldsMaskField().setByte(location, (byte) ((~LocationCompat.getHasBearingAccuracyMask()) & LocationCompat.getFieldsMaskField().getByte(location)));
            } catch (NoSuchFieldException e) {
                Error error = new NoSuchFieldError();
                error.initCause(e);
                throw error;
            } catch (IllegalAccessException e2) {
                Error error2 = new IllegalAccessError();
                error2.initCause(e2);
                throw error2;
            }
        }
    }

    private static Method getSetIsFromMockProviderMethod() throws NoSuchMethodException {
        if (sSetIsFromMockProviderMethod == null) {
            sSetIsFromMockProviderMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", new Class[]{Boolean.TYPE});
            sSetIsFromMockProviderMethod.setAccessible(true);
        }
        return sSetIsFromMockProviderMethod;
    }

    static Field getFieldsMaskField() throws NoSuchFieldException {
        if (sFieldsMaskField == null) {
            sFieldsMaskField = Location.class.getDeclaredField("mFieldsMask");
            sFieldsMaskField.setAccessible(true);
        }
        return sFieldsMaskField;
    }

    static int getHasSpeedAccuracyMask() throws NoSuchFieldException, IllegalAccessException {
        if (sHasSpeedAccuracyMask == null) {
            Field hasSpeedAccuracyMaskField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            hasSpeedAccuracyMaskField.setAccessible(true);
            sHasSpeedAccuracyMask = Integer.valueOf(hasSpeedAccuracyMaskField.getInt((Object) null));
        }
        return sHasSpeedAccuracyMask.intValue();
    }

    static int getHasBearingAccuracyMask() throws NoSuchFieldException, IllegalAccessException {
        if (sHasBearingAccuracyMask == null) {
            Field hasBearingAccuracyMaskField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            hasBearingAccuracyMaskField.setAccessible(true);
            sHasBearingAccuracyMask = Integer.valueOf(hasBearingAccuracyMaskField.getInt((Object) null));
        }
        return sHasBearingAccuracyMask.intValue();
    }

    static int getHasVerticalAccuracyMask() throws NoSuchFieldException, IllegalAccessException {
        if (sHasVerticalAccuracyMask == null) {
            Field hasVerticalAccuracyMaskField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            hasVerticalAccuracyMaskField.setAccessible(true);
            sHasVerticalAccuracyMask = Integer.valueOf(hasVerticalAccuracyMaskField.getInt((Object) null));
        }
        return sHasVerticalAccuracyMask.intValue();
    }

    private static Bundle getOrCreateExtras(Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    private static boolean containsExtra(Location location, String key) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(key);
    }

    private static void removeExtra(Location location, String key) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(key);
            if (extras.isEmpty()) {
                location.setExtras((Bundle) null);
            }
        }
    }
}
