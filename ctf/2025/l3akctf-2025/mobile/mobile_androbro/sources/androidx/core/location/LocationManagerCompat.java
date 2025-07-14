package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.collection.SimpleArrayMap;
import androidx.core.location.GnssStatusCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class LocationManagerCompat {
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static Field sContextField;
    private static Method sGnssRequestBuilderBuildMethod;
    private static Class<?> sGnssRequestBuilderClass;
    static final WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> sLocationListeners = new WeakHashMap<>();
    private static Method sRegisterGnssMeasurementsCallbackMethod;

    public static boolean isLocationEnabled(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.isLocationEnabled(locationManager);
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    public static boolean hasProvider(LocationManager locationManager, String provider) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.hasProvider(locationManager, provider);
        }
        if (locationManager.getAllProviders().contains(provider)) {
            return true;
        }
        try {
            if (locationManager.getProvider(provider) != null) {
                return true;
            }
            return false;
        } catch (SecurityException e) {
            return false;
        }
    }

    @Deprecated
    public static void getCurrentLocation(LocationManager locationManager, String provider, CancellationSignal cancellationSignal, Executor executor, Consumer<Location> consumer) {
        android.os.CancellationSignal cancellationSignal2;
        if (cancellationSignal != null) {
            cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
        } else {
            cancellationSignal2 = null;
        }
        getCurrentLocation(locationManager, provider, cancellationSignal2, executor, consumer);
    }

    public static void getCurrentLocation(LocationManager locationManager, String provider, android.os.CancellationSignal cancellationSignal, Executor executor, Consumer<Location> consumer) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.getCurrentLocation(locationManager, provider, cancellationSignal, executor, consumer);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Location location = locationManager.getLastKnownLocation(provider);
        if (location == null || SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(location) >= MAX_CURRENT_LOCATION_AGE_MS) {
            CancellableLocationListener listener = new CancellableLocationListener(locationManager, executor, consumer);
            locationManager.requestLocationUpdates(provider, 0, 0.0f, listener, Looper.getMainLooper());
            if (cancellationSignal != null) {
                Objects.requireNonNull(listener);
                cancellationSignal.setOnCancelListener(new LocationManagerCompat$$ExternalSyntheticLambda1(listener));
            }
            listener.startTimeout(GET_CURRENT_LOCATION_TIMEOUT_MS);
            return;
        }
        executor.execute(new LocationManagerCompat$$ExternalSyntheticLambda0(consumer, location));
    }

    public static void requestLocationUpdates(LocationManager locationManager, String provider, LocationRequestCompat locationRequest, Executor executor, LocationListenerCompat listener) {
        if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.requestLocationUpdates(locationManager, provider, locationRequest.toLocationRequest(), executor, listener);
        } else if (Build.VERSION.SDK_INT < 30 || !Api30Impl.tryRequestLocationUpdates(locationManager, provider, locationRequest, executor, listener)) {
            LocationListenerTransport transport = new LocationListenerTransport(new LocationListenerKey(provider, listener), executor);
            if (!Api19Impl.tryRequestLocationUpdates(locationManager, provider, locationRequest, transport)) {
                synchronized (sLocationListeners) {
                    locationManager.requestLocationUpdates(provider, locationRequest.getIntervalMillis(), locationRequest.getMinUpdateDistanceMeters(), transport, Looper.getMainLooper());
                    registerLocationListenerTransport(locationManager, transport);
                }
            }
        }
    }

    static void registerLocationListenerTransport(LocationManager locationManager, LocationListenerTransport transport) {
        WeakReference<LocationListenerTransport> oldRef = sLocationListeners.put(transport.getKey(), new WeakReference(transport));
        LocationListenerTransport oldTransport = oldRef != null ? (LocationListenerTransport) oldRef.get() : null;
        if (oldTransport != null) {
            oldTransport.unregister();
            locationManager.removeUpdates(oldTransport);
        }
    }

    public static void requestLocationUpdates(LocationManager locationManager, String provider, LocationRequestCompat locationRequest, LocationListenerCompat listener, Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.requestLocationUpdates(locationManager, provider, locationRequest.toLocationRequest(), ExecutorCompat.create(new Handler(looper)), listener);
        } else if (!Api19Impl.tryRequestLocationUpdates(locationManager, provider, locationRequest, listener, looper)) {
            locationManager.requestLocationUpdates(provider, locationRequest.getIntervalMillis(), locationRequest.getMinUpdateDistanceMeters(), listener, looper);
        }
    }

    public static void removeUpdates(LocationManager locationManager, LocationListenerCompat listener) {
        synchronized (sLocationListeners) {
            ArrayList<LocationListenerKey> cleanup = null;
            for (WeakReference<LocationListenerTransport> transportRef : sLocationListeners.values()) {
                LocationListenerTransport transport = (LocationListenerTransport) transportRef.get();
                if (transport != null) {
                    LocationListenerKey key = transport.getKey();
                    if (key.mListener == listener) {
                        if (cleanup == null) {
                            cleanup = new ArrayList<>();
                        }
                        cleanup.add(key);
                        transport.unregister();
                        locationManager.removeUpdates(transport);
                    }
                }
            }
            if (cleanup != null) {
                Iterator<LocationListenerKey> it = cleanup.iterator();
                while (it.hasNext()) {
                    sLocationListeners.remove(it.next());
                }
            }
        }
        locationManager.removeUpdates(listener);
    }

    public static String getGnssHardwareModelName(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getGnssHardwareModelName(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getGnssYearOfHardware(locationManager);
        }
        return 0;
    }

    private static class GnssListenersHolder {
        static final SimpleArrayMap<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> sGnssMeasurementListeners = new SimpleArrayMap<>();
        static final SimpleArrayMap<Object, Object> sGnssStatusListeners = new SimpleArrayMap<>();

        private GnssListenersHolder() {
        }
    }

    public static boolean registerGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback, Handler handler) {
        if (Build.VERSION.SDK_INT > 30) {
            return Api24Impl.registerGnssMeasurementsCallback(locationManager, callback, handler);
        }
        if (Build.VERSION.SDK_INT == 30) {
            return registerGnssMeasurementsCallbackOnR(locationManager, ExecutorCompat.create(handler), callback);
        }
        synchronized (GnssListenersHolder.sGnssMeasurementListeners) {
            unregisterGnssMeasurementsCallback(locationManager, callback);
            if (!Api24Impl.registerGnssMeasurementsCallback(locationManager, callback, handler)) {
                return false;
            }
            GnssListenersHolder.sGnssMeasurementListeners.put(callback, callback);
            return true;
        }
    }

    public static boolean registerGnssMeasurementsCallback(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT > 30) {
            return Api31Impl.registerGnssMeasurementsCallback(locationManager, executor, callback);
        }
        if (Build.VERSION.SDK_INT == 30) {
            return registerGnssMeasurementsCallbackOnR(locationManager, executor, callback);
        }
        synchronized (GnssListenersHolder.sGnssMeasurementListeners) {
            GnssMeasurementsTransport newTransport = new GnssMeasurementsTransport(callback, executor);
            unregisterGnssMeasurementsCallback(locationManager, callback);
            if (!Api24Impl.registerGnssMeasurementsCallback(locationManager, newTransport)) {
                return false;
            }
            GnssListenersHolder.sGnssMeasurementListeners.put(callback, newTransport);
            return true;
        }
    }

    public static void unregisterGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api24Impl.unregisterGnssMeasurementsCallback(locationManager, callback);
            return;
        }
        synchronized (GnssListenersHolder.sGnssMeasurementListeners) {
            GnssMeasurementsEvent.Callback transport = GnssListenersHolder.sGnssMeasurementListeners.remove(callback);
            if (transport != null) {
                if (transport instanceof GnssMeasurementsTransport) {
                    ((GnssMeasurementsTransport) transport).unregister();
                }
                Api24Impl.unregisterGnssMeasurementsCallback(locationManager, transport);
            }
        }
    }

    private static boolean registerGnssMeasurementsCallbackOnR(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT == 30) {
            try {
                if (sGnssRequestBuilderClass == null) {
                    sGnssRequestBuilderClass = Class.forName("android.location.GnssRequest$Builder");
                }
                if (sGnssRequestBuilderBuildMethod == null) {
                    sGnssRequestBuilderBuildMethod = sGnssRequestBuilderClass.getDeclaredMethod("build", new Class[0]);
                    sGnssRequestBuilderBuildMethod.setAccessible(true);
                }
                if (sRegisterGnssMeasurementsCallbackMethod == null) {
                    sRegisterGnssMeasurementsCallbackMethod = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", new Class[]{Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class});
                    sRegisterGnssMeasurementsCallbackMethod.setAccessible(true);
                }
                Object success = sRegisterGnssMeasurementsCallbackMethod.invoke(locationManager, new Object[]{sGnssRequestBuilderBuildMethod.invoke(sGnssRequestBuilderClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), executor, callback});
                if (success == null || !((Boolean) success).booleanValue()) {
                    return false;
                }
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public static boolean registerGnssStatusCallback(LocationManager locationManager, GnssStatusCompat.Callback callback, Handler handler) {
        if (Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, ExecutorCompat.create(handler), callback);
        }
        return registerGnssStatusCallback(locationManager, (Executor) new InlineHandlerExecutor(handler), callback);
    }

    public static boolean registerGnssStatusCallback(LocationManager locationManager, Executor executor, GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, (Handler) null, executor, callback);
        }
        Looper looper = Looper.myLooper();
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        return registerGnssStatusCallback(locationManager, new Handler(looper), executor, callback);
    }

    private static boolean registerGnssStatusCallback(LocationManager locationManager, Handler baseHandler, Executor executor, GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.registerGnssStatusCallback(locationManager, baseHandler, executor, callback);
        }
        return Api24Impl.registerGnssStatusCallback(locationManager, baseHandler, executor, callback);
    }

    public static void unregisterGnssStatusCallback(LocationManager locationManager, GnssStatusCompat.Callback callback) {
        synchronized (GnssListenersHolder.sGnssStatusListeners) {
            Object transport = GnssListenersHolder.sGnssStatusListeners.remove(callback);
            if (transport != null) {
                Api24Impl.unregisterGnssStatusCallback(locationManager, transport);
            }
        }
    }

    private LocationManagerCompat() {
    }

    private static class LocationListenerKey {
        final LocationListenerCompat mListener;
        final String mProvider;

        LocationListenerKey(String provider, LocationListenerCompat listener) {
            this.mProvider = (String) ObjectsCompat.requireNonNull(provider, "invalid null provider");
            this.mListener = (LocationListenerCompat) ObjectsCompat.requireNonNull(listener, "invalid null listener");
        }

        public boolean equals(Object o) {
            if (!(o instanceof LocationListenerKey)) {
                return false;
            }
            LocationListenerKey that = (LocationListenerKey) o;
            if (!this.mProvider.equals(that.mProvider) || !this.mListener.equals(that.mListener)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mProvider, this.mListener);
        }
    }

    private static class LocationListenerTransport implements LocationListener {
        final Executor mExecutor;
        volatile LocationListenerKey mKey;

        LocationListenerTransport(LocationListenerKey key, Executor executor) {
            this.mKey = key;
            this.mExecutor = executor;
        }

        public LocationListenerKey getKey() {
            return (LocationListenerKey) ObjectsCompat.requireNonNull(this.mKey);
        }

        public void unregister() {
            this.mKey = null;
        }

        public void onLocationChanged(Location location) {
            if (this.mKey != null) {
                this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3(this, location));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onLocationChanged$0$androidx-core-location-LocationManagerCompat$LocationListenerTransport  reason: not valid java name */
        public /* synthetic */ void m118lambda$onLocationChanged$0$androidxcorelocationLocationManagerCompat$LocationListenerTransport(Location location) {
            LocationListenerKey key = this.mKey;
            if (key != null) {
                key.mListener.onLocationChanged(location);
            }
        }

        public void onLocationChanged(List<Location> locations) {
            if (this.mKey != null) {
                this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2(this, locations));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onLocationChanged$1$androidx-core-location-LocationManagerCompat$LocationListenerTransport  reason: not valid java name */
        public /* synthetic */ void m119lambda$onLocationChanged$1$androidxcorelocationLocationManagerCompat$LocationListenerTransport(List locations) {
            LocationListenerKey key = this.mKey;
            if (key != null) {
                key.mListener.onLocationChanged(locations);
            }
        }

        public void onFlushComplete(int requestCode) {
            if (this.mKey != null) {
                this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda4(this, requestCode));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onFlushComplete$2$androidx-core-location-LocationManagerCompat$LocationListenerTransport  reason: not valid java name */
        public /* synthetic */ void m117lambda$onFlushComplete$2$androidxcorelocationLocationManagerCompat$LocationListenerTransport(int requestCode) {
            LocationListenerKey key = this.mKey;
            if (key != null) {
                key.mListener.onFlushComplete(requestCode);
            }
        }

        public void onStatusChanged(String provider, int status, Bundle extras) {
            if (this.mKey != null) {
                this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda5(this, provider, status, extras));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onStatusChanged$3$androidx-core-location-LocationManagerCompat$LocationListenerTransport  reason: not valid java name */
        public /* synthetic */ void m122lambda$onStatusChanged$3$androidxcorelocationLocationManagerCompat$LocationListenerTransport(String provider, int status, Bundle extras) {
            LocationListenerKey key = this.mKey;
            if (key != null) {
                key.mListener.onStatusChanged(provider, status, extras);
            }
        }

        public void onProviderEnabled(String provider) {
            if (this.mKey != null) {
                this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0(this, provider));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onProviderEnabled$4$androidx-core-location-LocationManagerCompat$LocationListenerTransport  reason: not valid java name */
        public /* synthetic */ void m121lambda$onProviderEnabled$4$androidxcorelocationLocationManagerCompat$LocationListenerTransport(String provider) {
            LocationListenerKey key = this.mKey;
            if (key != null) {
                key.mListener.onProviderEnabled(provider);
            }
        }

        public void onProviderDisabled(String provider) {
            if (this.mKey != null) {
                this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1(this, provider));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onProviderDisabled$5$androidx-core-location-LocationManagerCompat$LocationListenerTransport  reason: not valid java name */
        public /* synthetic */ void m120lambda$onProviderDisabled$5$androidxcorelocationLocationManagerCompat$LocationListenerTransport(String provider) {
            LocationListenerKey key = this.mKey;
            if (key != null) {
                key.mListener.onProviderDisabled(provider);
            }
        }
    }

    private static class GnssMeasurementsTransport extends GnssMeasurementsEvent.Callback {
        final GnssMeasurementsEvent.Callback mCallback;
        volatile Executor mExecutor;

        GnssMeasurementsTransport(GnssMeasurementsEvent.Callback callback, Executor executor) {
            this.mCallback = callback;
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }

        public void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda0(this, executor, gnssMeasurementsEvent));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onGnssMeasurementsReceived$0$androidx-core-location-LocationManagerCompat$GnssMeasurementsTransport  reason: not valid java name */
        public /* synthetic */ void m111lambda$onGnssMeasurementsReceived$0$androidxcorelocationLocationManagerCompat$GnssMeasurementsTransport(Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (this.mExecutor == executor) {
                this.mCallback.onGnssMeasurementsReceived(gnssMeasurementsEvent);
            }
        }

        public void onStatusChanged(int status) {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda1(this, executor, status));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onStatusChanged$1$androidx-core-location-LocationManagerCompat$GnssMeasurementsTransport  reason: not valid java name */
        public /* synthetic */ void m112lambda$onStatusChanged$1$androidxcorelocationLocationManagerCompat$GnssMeasurementsTransport(Executor executor, int status) {
            if (this.mExecutor == executor) {
                this.mCallback.onStatusChanged(status);
            }
        }
    }

    private static class GnssStatusTransport extends GnssStatus.Callback {
        final GnssStatusCompat.Callback mCallback;

        GnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        public void onStarted() {
            this.mCallback.onStarted();
        }

        public void onStopped() {
            this.mCallback.onStopped();
        }

        public void onFirstFix(int ttffMillis) {
            this.mCallback.onFirstFix(ttffMillis);
        }

        public void onSatelliteStatusChanged(GnssStatus status) {
            this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(status));
        }
    }

    private static class PreRGnssStatusTransport extends GnssStatus.Callback {
        final GnssStatusCompat.Callback mCallback;
        volatile Executor mExecutor;

        PreRGnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        public void register(Executor executor) {
            boolean z = true;
            Preconditions.checkArgument(executor != null, "invalid null executor");
            if (this.mExecutor != null) {
                z = false;
            }
            Preconditions.checkState(z);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }

        public void onStarted() {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda3(this, executor));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onStarted$0$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport  reason: not valid java name */
        public /* synthetic */ void m125lambda$onStarted$0$androidxcorelocationLocationManagerCompat$PreRGnssStatusTransport(Executor executor) {
            if (this.mExecutor == executor) {
                this.mCallback.onStarted();
            }
        }

        public void onStopped() {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda2(this, executor));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onStopped$1$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport  reason: not valid java name */
        public /* synthetic */ void m126lambda$onStopped$1$androidxcorelocationLocationManagerCompat$PreRGnssStatusTransport(Executor executor) {
            if (this.mExecutor == executor) {
                this.mCallback.onStopped();
            }
        }

        public void onFirstFix(int ttffMillis) {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0(this, executor, ttffMillis));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onFirstFix$2$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport  reason: not valid java name */
        public /* synthetic */ void m123lambda$onFirstFix$2$androidxcorelocationLocationManagerCompat$PreRGnssStatusTransport(Executor executor, int ttffMillis) {
            if (this.mExecutor == executor) {
                this.mCallback.onFirstFix(ttffMillis);
            }
        }

        public void onSatelliteStatusChanged(GnssStatus status) {
            Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda1(this, executor, status));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onSatelliteStatusChanged$3$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport  reason: not valid java name */
        public /* synthetic */ void m124lambda$onSatelliteStatusChanged$3$androidxcorelocationLocationManagerCompat$PreRGnssStatusTransport(Executor executor, GnssStatus status) {
            if (this.mExecutor == executor) {
                this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(status));
            }
        }
    }

    private static class GpsStatusTransport implements GpsStatus.Listener {
        final GnssStatusCompat.Callback mCallback;
        volatile Executor mExecutor;
        private final LocationManager mLocationManager;

        GpsStatusTransport(LocationManager locationManager, GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mLocationManager = locationManager;
            this.mCallback = callback;
        }

        public void register(Executor executor) {
            Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }

        public void onGpsStatusChanged(int event) {
            Executor executor = this.mExecutor;
            if (executor != null) {
                switch (event) {
                    case 1:
                        executor.execute(new LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0(this, executor));
                        return;
                    case 2:
                        executor.execute(new LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1(this, executor));
                        return;
                    case 3:
                        GpsStatus gpsStatus = this.mLocationManager.getGpsStatus((GpsStatus) null);
                        if (gpsStatus != null) {
                            executor.execute(new LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2(this, executor, gpsStatus.getTimeToFirstFix()));
                            return;
                        }
                        return;
                    case 4:
                        GpsStatus gpsStatus2 = this.mLocationManager.getGpsStatus((GpsStatus) null);
                        if (gpsStatus2 != null) {
                            executor.execute(new LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3(this, executor, GnssStatusCompat.wrap(gpsStatus2)));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onGpsStatusChanged$0$androidx-core-location-LocationManagerCompat$GpsStatusTransport  reason: not valid java name */
        public /* synthetic */ void m113lambda$onGpsStatusChanged$0$androidxcorelocationLocationManagerCompat$GpsStatusTransport(Executor executor) {
            if (this.mExecutor == executor) {
                this.mCallback.onStarted();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onGpsStatusChanged$1$androidx-core-location-LocationManagerCompat$GpsStatusTransport  reason: not valid java name */
        public /* synthetic */ void m114lambda$onGpsStatusChanged$1$androidxcorelocationLocationManagerCompat$GpsStatusTransport(Executor executor) {
            if (this.mExecutor == executor) {
                this.mCallback.onStopped();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onGpsStatusChanged$2$androidx-core-location-LocationManagerCompat$GpsStatusTransport  reason: not valid java name */
        public /* synthetic */ void m115lambda$onGpsStatusChanged$2$androidxcorelocationLocationManagerCompat$GpsStatusTransport(Executor executor, int ttff) {
            if (this.mExecutor == executor) {
                this.mCallback.onFirstFix(ttff);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onGpsStatusChanged$3$androidx-core-location-LocationManagerCompat$GpsStatusTransport  reason: not valid java name */
        public /* synthetic */ void m116lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport(Executor executor, GnssStatusCompat gnssStatus) {
            if (this.mExecutor == executor) {
                this.mCallback.onSatelliteStatusChanged(gnssStatus);
            }
        }
    }

    private static final class CancellableLocationListener implements LocationListener {
        private Consumer<Location> mConsumer;
        private final Executor mExecutor;
        private final LocationManager mLocationManager;
        private final Handler mTimeoutHandler = new Handler(Looper.getMainLooper());
        Runnable mTimeoutRunnable;
        private boolean mTriggered;

        CancellableLocationListener(LocationManager locationManager, Executor executor, Consumer<Location> consumer) {
            this.mLocationManager = locationManager;
            this.mExecutor = executor;
            this.mConsumer = consumer;
        }

        public void cancel() {
            synchronized (this) {
                if (!this.mTriggered) {
                    this.mTriggered = true;
                    cleanup();
                }
            }
        }

        public void startTimeout(long timeoutMs) {
            synchronized (this) {
                if (!this.mTriggered) {
                    this.mTimeoutRunnable = new LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0(this);
                    this.mTimeoutHandler.postDelayed(this.mTimeoutRunnable, timeoutMs);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$startTimeout$0$androidx-core-location-LocationManagerCompat$CancellableLocationListener  reason: not valid java name */
        public /* synthetic */ void m110lambda$startTimeout$0$androidxcorelocationLocationManagerCompat$CancellableLocationListener() {
            this.mTimeoutRunnable = null;
            Location location = null;
            onLocationChanged((Location) null);
        }

        public void onStatusChanged(String provider, int status, Bundle extras) {
        }

        public void onProviderEnabled(String provider) {
        }

        public void onProviderDisabled(String p) {
            Location location = null;
            onLocationChanged((Location) null);
        }

        public void onLocationChanged(Location location) {
            synchronized (this) {
                if (!this.mTriggered) {
                    this.mTriggered = true;
                    this.mExecutor.execute(new LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda1(this.mConsumer, location));
                    cleanup();
                }
            }
        }

        private void cleanup() {
            this.mConsumer = null;
            this.mLocationManager.removeUpdates(this);
            if (this.mTimeoutRunnable != null) {
                this.mTimeoutHandler.removeCallbacks(this.mTimeoutRunnable);
                this.mTimeoutRunnable = null;
            }
        }
    }

    private static final class InlineHandlerExecutor implements Executor {
        private final Handler mHandler;

        InlineHandlerExecutor(Handler handler) {
            this.mHandler = (Handler) Preconditions.checkNotNull(handler);
        }

        public void execute(Runnable command) {
            if (Looper.myLooper() == this.mHandler.getLooper()) {
                command.run();
            } else if (!this.mHandler.post((Runnable) Preconditions.checkNotNull(command))) {
                throw new RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
        }

        static boolean hasProvider(LocationManager locationManager, String provider) {
            return locationManager.hasProvider(provider);
        }

        static void requestLocationUpdates(LocationManager locationManager, String provider, LocationRequest locationRequest, Executor executor, LocationListener listener) {
            locationManager.requestLocationUpdates(provider, locationRequest, executor, listener);
        }

        static boolean registerGnssMeasurementsCallback(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }
    }

    private static class Api30Impl {
        private static Class<?> sLocationRequestClass;
        private static Method sRequestLocationUpdatesExecutorMethod;

        private Api30Impl() {
        }

        static void getCurrentLocation(LocationManager locationManager, String provider, android.os.CancellationSignal cancellationSignal, Executor executor, Consumer<Location> consumer) {
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(provider, cancellationSignal, executor, new LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0(consumer));
        }

        public static boolean tryRequestLocationUpdates(LocationManager locationManager, String provider, LocationRequestCompat locationRequest, Executor executor, LocationListenerCompat listener) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (sLocationRequestClass == null) {
                        sLocationRequestClass = Class.forName("android.location.LocationRequest");
                    }
                    if (sRequestLocationUpdatesExecutorMethod == null) {
                        sRequestLocationUpdatesExecutorMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{sLocationRequestClass, Executor.class, LocationListener.class});
                        sRequestLocationUpdatesExecutorMethod.setAccessible(true);
                    }
                    Object request = locationRequest.toLocationRequest(provider);
                    if (request != null) {
                        sRequestLocationUpdatesExecutorMethod.invoke(locationManager, new Object[]{request, executor, listener});
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException e) {
                }
            }
            return false;
        }

        public static boolean registerGnssStatusCallback(LocationManager locationManager, Handler baseHandler, Executor executor, GnssStatusCompat.Callback callback) {
            synchronized (GnssListenersHolder.sGnssStatusListeners) {
                GnssStatusTransport transport = (GnssStatusTransport) GnssListenersHolder.sGnssStatusListeners.get(callback);
                if (transport == null) {
                    transport = new GnssStatusTransport(callback);
                }
                if (!locationManager.registerGnssStatusCallback(executor, transport)) {
                    return false;
                }
                GnssListenersHolder.sGnssStatusListeners.put(callback, transport);
                return true;
            }
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static boolean isLocationEnabled(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }

        static String getGnssHardwareModelName(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        static int getGnssYearOfHardware(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }
    }

    static class Api19Impl {
        private static Class<?> sLocationRequestClass;
        private static Method sRequestLocationUpdatesLooperMethod;

        private Api19Impl() {
        }

        static boolean tryRequestLocationUpdates(LocationManager locationManager, String provider, LocationRequestCompat locationRequest, LocationListenerTransport transport) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = Class.forName("android.location.LocationRequest");
                }
                if (sRequestLocationUpdatesLooperMethod == null) {
                    sRequestLocationUpdatesLooperMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{sLocationRequestClass, LocationListener.class, Looper.class});
                    sRequestLocationUpdatesLooperMethod.setAccessible(true);
                }
                LocationRequest request = locationRequest.toLocationRequest(provider);
                if (request != null) {
                    synchronized (LocationManagerCompat.sLocationListeners) {
                        sRequestLocationUpdatesLooperMethod.invoke(locationManager, new Object[]{request, transport, Looper.getMainLooper()});
                        LocationManagerCompat.registerLocationListenerTransport(locationManager, transport);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException e) {
            }
            return false;
        }

        static boolean tryRequestLocationUpdates(LocationManager locationManager, String provider, LocationRequestCompat locationRequest, LocationListenerCompat listener, Looper looper) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = Class.forName("android.location.LocationRequest");
                }
                if (sRequestLocationUpdatesLooperMethod == null) {
                    sRequestLocationUpdatesLooperMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{sLocationRequestClass, LocationListener.class, Looper.class});
                    sRequestLocationUpdatesLooperMethod.setAccessible(true);
                }
                LocationRequest request = locationRequest.toLocationRequest(provider);
                if (request != null) {
                    sRequestLocationUpdatesLooperMethod.invoke(locationManager, new Object[]{request, listener, looper});
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException e) {
            }
            return false;
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean registerGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        static boolean registerGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback, Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        static void unregisterGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        static boolean registerGnssStatusCallback(LocationManager locationManager, Handler baseHandler, Executor executor, GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(baseHandler != null);
            synchronized (GnssListenersHolder.sGnssStatusListeners) {
                PreRGnssStatusTransport transport = (PreRGnssStatusTransport) GnssListenersHolder.sGnssStatusListeners.get(callback);
                if (transport == null) {
                    transport = new PreRGnssStatusTransport(callback);
                } else {
                    transport.unregister();
                }
                transport.register(executor);
                if (!locationManager.registerGnssStatusCallback(transport, baseHandler)) {
                    return false;
                }
                GnssListenersHolder.sGnssStatusListeners.put(callback, transport);
                return true;
            }
        }

        static void unregisterGnssStatusCallback(LocationManager locationManager, Object callback) {
            if (callback instanceof PreRGnssStatusTransport) {
                ((PreRGnssStatusTransport) callback).unregister();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) callback);
        }
    }
}
