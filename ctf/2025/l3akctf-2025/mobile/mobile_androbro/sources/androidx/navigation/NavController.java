package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 Õ\u00012\u00020\u0001:\u0006Õ\u0001Ö\u0001×\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010q\u001a\u00020\u00172\u0006\u0010r\u001a\u0002052\b\u0010s\u001a\u0004\u0018\u00010_2\u0006\u0010\u0016\u001a\u00020\b2\u000e\b\u0002\u0010t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010u\u001a\u00020\u00172\u0006\u0010v\u001a\u00020fH\u0016J\u0015\u0010w\u001a\u000209\"\n\b\u0000\u0010x\u0018\u0001*\u00020\u0001H\bJ\u001f\u0010w\u001a\u000209\"\b\b\u0000\u0010x*\u00020\u00012\u0006\u0010y\u001a\u0002HxH\u0007¢\u0006\u0002\u0010zJ\u0012\u0010w\u001a\u0002092\b\b\u0001\u0010{\u001a\u00020\u001eH\u0007J\u0010\u0010w\u001a\u0002092\u0006\u0010y\u001a\u00020\u001fH\u0007J\u0012\u0010|\u001a\u0002092\b\b\u0001\u0010{\u001a\u00020\u001eH\u0003J\u0010\u0010|\u001a\u0002092\u0006\u0010y\u001a\u00020\u001fH\u0003J\b\u0010}\u001a\u00020~H\u0016J\b\u0010\u001a\u000209H\u0002J\u0012\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u000209H\u0017J7\u0010\u0001\u001a\u0002092\u0011\u0010\u0001\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\\0\u00072\u0007\u0010\u0001\u001a\u0002052\u0007\u0010\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u000209H\u0002J;\u0010\u0001\u001a\u0002092\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\t\u0010\u0001\u001a\u0004\u0018\u00010_2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\u0015\u0010\u0001\u001a\u0004\u0018\u0001052\b\b\u0001\u0010{\u001a\u00020\u001eH\u0007J\u0013\u0010\u0001\u001a\u0004\u0018\u0001052\u0006\u0010y\u001a\u00020\u001fH\u0007J\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0001\u001a\u00030\u0001H\u0002J!\u0010\u0001\u001a\u00020\u001f\"\b\b\u0000\u0010x*\u00020\u00012\u0006\u0010y\u001a\u0002HxH\u0002¢\u0006\u0003\u0010\u0001J\u0016\u0010\u0001\u001a\u00020\b\"\n\b\u0000\u0010x\u0018\u0001*\u00020\u0001H\bJ\u001f\u0010\u0001\u001a\u00020\b\"\b\b\u0000\u0010x*\u00020\u00012\u0006\u0010y\u001a\u0002Hx¢\u0006\u0003\u0010\u0001J\u0013\u0010\u0001\u001a\u00020\b2\b\b\u0001\u0010{\u001a\u00020\u001eH\u0016J\u000f\u0010\u0001\u001a\u00020\b2\u0006\u0010y\u001a\u00020\u001fJ\u0015\u0010\u0001\u001a\u00030\u00012\t\b\u0001\u0010\u0001\u001a\u00020\u001eH\u0016J\u0015\u0010\u0001\u001a\u0002092\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0017J \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0019H\u0002J\u001c\u0010\u0001\u001a\u0002092\u0006\u0010r\u001a\u0002052\t\u0010\u0001\u001a\u0004\u0018\u00010_H\u0002J\u001b\u0010\u0001\u001a\u00020\u00172\u0007\u0010 \u0001\u001a\u00020\b2\u0007\u0010¡\u0001\u001a\u00020\bH\u0002J=\u0010¢\u0001\u001a\u00020\u0017\"\b\b\u0000\u0010x*\u00020\u00012\u0006\u0010y\u001a\u0002Hx2\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u00012\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0007¢\u0006\u0003\u0010£\u0001J=\u0010¢\u0001\u001a\u00020\u0017\"\b\b\u0000\u0010x*\u00020\u00012\u0006\u0010y\u001a\u0002Hx2\u001a\u0010¤\u0001\u001a\u0015\u0012\u0005\u0012\u00030¥\u0001\u0012\u0004\u0012\u00020\u00170\u0013¢\u0006\u0003\b¦\u0001H\u0007¢\u0006\u0003\u0010§\u0001J\u0013\u0010¢\u0001\u001a\u00020\u00172\b\u0010\u0001\u001a\u00030¨\u0001H\u0017J\u001f\u0010¢\u0001\u001a\u00020\u00172\b\u0010\u0001\u001a\u00030¨\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0017J+\u0010¢\u0001\u001a\u00020\u00172\b\u0010\u0001\u001a\u00030¨\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0017J\u0013\u0010¢\u0001\u001a\u00020\u00172\b\u0010©\u0001\u001a\u00030ª\u0001H\u0017J\u001f\u0010¢\u0001\u001a\u00020\u00172\b\u0010©\u0001\u001a\u00030ª\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0017J+\u0010¢\u0001\u001a\u00020\u00172\b\u0010©\u0001\u001a\u00030ª\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0017J4\u0010¢\u0001\u001a\u00020\u00172\u0006\u0010r\u001a\u0002052\t\u0010\u0001\u001a\u0004\u0018\u00010_2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0003J\u0013\u0010¢\u0001\u001a\u00020\u00172\b\u0010«\u0001\u001a\u00030¬\u0001H\u0017J\u001f\u0010¢\u0001\u001a\u00020\u00172\b\u0010«\u0001\u001a\u00030¬\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0017J\u001d\u0010¢\u0001\u001a\u00020\u00172\b\u0010«\u0001\u001a\u00030¬\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0017J\u0014\u0010¢\u0001\u001a\u00020\u00172\t\b\u0001\u0010­\u0001\u001a\u00020\u001eH\u0017J\u001f\u0010¢\u0001\u001a\u00020\u00172\t\b\u0001\u0010­\u0001\u001a\u00020\u001e2\t\u0010\u0001\u001a\u0004\u0018\u00010_H\u0017J+\u0010¢\u0001\u001a\u00020\u00172\t\b\u0001\u0010­\u0001\u001a\u00020\u001e2\t\u0010\u0001\u001a\u0004\u0018\u00010_2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0017J7\u0010¢\u0001\u001a\u00020\u00172\t\b\u0001\u0010­\u0001\u001a\u00020\u001e2\t\u0010\u0001\u001a\u0004\u0018\u00010_2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0017J-\u0010¢\u0001\u001a\u00020\u00172\u0006\u0010y\u001a\u00020\u001f2\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u00012\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0007J-\u0010¢\u0001\u001a\u00020\u00172\u0006\u0010y\u001a\u00020\u001f2\u001a\u0010¤\u0001\u001a\u0015\u0012\u0005\u0012\u00030¥\u0001\u0012\u0004\u0012\u00020\u00170\u0013¢\u0006\u0003\b¦\u0001H\u0007J\t\u0010®\u0001\u001a\u000209H\u0017J\u0014\u0010¯\u0001\u001a\u00020\u00172\t\u0010°\u0001\u001a\u0004\u0018\u00010_H\u0003J\t\u0010±\u0001\u001a\u000209H\u0017J5\u0010±\u0001\u001a\u000209\"\b\b\u0000\u0010x*\u00020\u00012\u0006\u0010y\u001a\u0002Hx2\u0007\u0010\u0001\u001a\u0002092\t\b\u0002\u0010\u0001\u001a\u000209H\u0007¢\u0006\u0003\u0010²\u0001J*\u0010±\u0001\u001a\u000209\"\n\b\u0000\u0010x\u0018\u0001*\u00020\u00012\u0007\u0010\u0001\u001a\u0002092\t\b\u0002\u0010\u0001\u001a\u000209H\bJ\u001c\u0010±\u0001\u001a\u0002092\b\b\u0001\u0010{\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u000209H\u0017J%\u0010±\u0001\u001a\u0002092\b\b\u0001\u0010{\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u000209H\u0017J%\u0010±\u0001\u001a\u0002092\u0006\u0010y\u001a\u00020\u001f2\u0007\u0010\u0001\u001a\u0002092\t\b\u0002\u0010\u0001\u001a\u000209H\u0007J'\u0010³\u0001\u001a\u00020\u00172\u0006\u0010j\u001a\u00020\b2\u000e\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170µ\u0001H\u0000¢\u0006\u0003\b¶\u0001J5\u0010·\u0001\u001a\u000209\"\b\b\u0000\u0010x*\u00020\u00012\u0006\u0010y\u001a\u0002Hx2\u0007\u0010\u0001\u001a\u0002092\t\b\u0002\u0010\u0001\u001a\u000209H\u0002¢\u0006\u0003\u0010²\u0001J'\u0010·\u0001\u001a\u0002092\b\b\u0001\u0010{\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u0002092\t\b\u0002\u0010\u0001\u001a\u000209H\u0003J#\u0010·\u0001\u001a\u0002092\u0006\u0010y\u001a\u00020\u001f2\u0007\u0010\u0001\u001a\u0002092\u0007\u0010\u0001\u001a\u000209H\u0002J-\u0010¸\u0001\u001a\u00020\u00172\u0006\u0010j\u001a\u00020\b2\t\b\u0002\u0010\u0001\u001a\u0002092\u000f\b\u0002\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020!0\u0019H\u0002J\u0015\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0003\b»\u0001J\u0011\u0010¼\u0001\u001a\u00020\u00172\u0006\u0010v\u001a\u00020fH\u0016J\u0014\u0010½\u0001\u001a\u00020\u00172\t\u0010¾\u0001\u001a\u0004\u0018\u00010_H\u0017J5\u0010¿\u0001\u001a\u0002092\u0007\u0010À\u0001\u001a\u00020\u001e2\t\u0010\u0001\u001a\u0004\u0018\u00010_2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\u0011\u0010¿\u0001\u001a\u0002092\u0006\u0010y\u001a\u00020\u001fH\u0002J\u000b\u0010\u0001\u001a\u0004\u0018\u00010_H\u0017J\u001b\u0010C\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\f2\t\u0010°\u0001\u001a\u0004\u0018\u00010_H\u0017J\u0013\u0010C\u001a\u00020\u00172\t\b\u0001\u0010Á\u0001\u001a\u00020\u001eH\u0017J\u001e\u0010C\u001a\u00020\u00172\t\b\u0001\u0010Á\u0001\u001a\u00020\u001e2\t\u0010°\u0001\u001a\u0004\u0018\u00010_H\u0017J\u0012\u0010Â\u0001\u001a\u00020\u00172\u0007\u0010Ã\u0001\u001a\u00020PH\u0017J\u0012\u0010Ä\u0001\u001a\u00020\u00172\u0007\u0010Å\u0001\u001a\u00020cH\u0017J\u0013\u0010Æ\u0001\u001a\u00020\u00172\b\u0010Ç\u0001\u001a\u00030È\u0001H\u0017J\t\u0010É\u0001\u001a\u000209H\u0002J\t\u0010Ê\u0001\u001a\u000209H\u0002J\u001a\u0010Ë\u0001\u001a\u0004\u0018\u00010\b2\u0007\u0010 \u0001\u001a\u00020\bH\u0000¢\u0006\u0003\bÌ\u0001J\u000f\u0010Í\u0001\u001a\u00020\u0017H\u0000¢\u0006\u0003\bÎ\u0001J\t\u0010Ï\u0001\u001a\u00020\u0017H\u0002J\"\u0010Ð\u0001\u001a\u0004\u0018\u000105*\u0002052\b\b\u0001\u0010{\u001a\u00020\u001e2\u0007\u0010Ñ\u0001\u001a\u000209H\u0007J\u0013\u0010Ò\u0001\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\b0\u0019H\u0002Jb\u0010Ó\u0001\u001a\u00020\u0017*\n\u0012\u0006\b\u0001\u0012\u0002050\\2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012$\b\u0002\u0010Ô\u0001\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013H\u0002JL\u0010·\u0001\u001a\u00020\u0017*\n\u0012\u0006\b\u0001\u0012\u0002050\\2\u0006\u0010j\u001a\u00020\b2\u0007\u0010\u0001\u001a\u0002092$\b\u0002\u0010Ô\u0001\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(j\u0012\u0004\u0012\u00020\u00170\u0013H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u001bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001dX\u0004¢\u0006\u0002\n\u0000R \u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u001dX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#X\u000e¢\u0006\u0004\n\u0002\u0010%R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001dX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070*8GX\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\b01¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u00104\u001a\u0004\u0018\u0001058VX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u000e\u00108\u001a\u000209X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u000e\u0010=\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u000209X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002090\u001dX\u0004¢\u0006\u0002\n\u0000R$\u0010@\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f8W@WX\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010E\u001a\u00020F8@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0010\u0010K\u001a\u0004\u0018\u00010LX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020NX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010Q\u001a\u00020L8VX\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bR\u0010SR$\u0010V\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000e8V@WX\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR&\u0010[\u001a\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002050\\\u0012\b\u0012\u00060]R\u00020\u00000\u001dX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010^\u001a\u0004\u0018\u00010_X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020aX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010b\u001a\u0004\u0018\u00010cX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010d\u001a\b\u0012\u0004\u0012\u00020f0eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020h0\u001dX\u0004¢\u0006\u0002\n\u0000R+\u0010i\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(j\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010k\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\bl\u0010/R\u0010\u0010m\u001a\u0004\u0018\u00010nX\u000e¢\u0006\u0002\n\u0000R\u001d\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070*¢\u0006\b\n\u0000\u001a\u0004\bp\u0010,¨\u0006Ø\u0001"}, d2 = {"Landroidx/navigation/NavController;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_currentBackStack", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "_currentBackStackEntryFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_graph", "Landroidx/navigation/NavGraph;", "_navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "_visibleEntries", "activity", "Landroid/app/Activity;", "addToBackStackHandler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "backStackEntry", "", "backQueue", "Lkotlin/collections/ArrayDeque;", "backStackEntriesToDispatch", "", "backStackMap", "", "", "", "backStackStates", "Landroidx/navigation/NavBackStackEntryState;", "backStackToRestore", "", "Landroid/os/Parcelable;", "[Landroid/os/Parcelable;", "childToParentEntries", "getContext", "()Landroid/content/Context;", "currentBackStack", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "currentBackStackEntry", "getCurrentBackStackEntry", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntryFlow", "Lkotlinx/coroutines/flow/Flow;", "getCurrentBackStackEntryFlow", "()Lkotlinx/coroutines/flow/Flow;", "currentDestination", "Landroidx/navigation/NavDestination;", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "deepLinkHandled", "", "destinationCountOnBackStack", "getDestinationCountOnBackStack", "()I", "dispatchReentrantCount", "enableOnBackPressedCallback", "entrySavedState", "graph", "getGraph", "()Landroidx/navigation/NavGraph;", "setGraph", "(Landroidx/navigation/NavGraph;)V", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_runtime_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "inflater", "Landroidx/navigation/NavInflater;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "navInflater", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater$delegate", "Lkotlin/Lazy;", "navigatorProvider", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "navigatorState", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "navigatorStateToRestore", "Landroid/os/Bundle;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "onDestinationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "parentToChildCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "popFromBackStackHandler", "popUpTo", "previousBackStackEntry", "getPreviousBackStackEntry", "viewModel", "Landroidx/navigation/NavControllerViewModel;", "visibleEntries", "getVisibleEntries", "addEntryToBackStack", "node", "finalArgs", "restoredEntries", "addOnDestinationChangedListener", "listener", "clearBackStack", "T", "route", "(Ljava/lang/Object;)Z", "destinationId", "clearBackStackInternal", "createDeepLink", "Landroidx/navigation/NavDeepLinkBuilder;", "dispatchOnDestinationChanged", "enableOnBackPressed", "enabled", "executePopOperations", "popOperations", "foundDestination", "inclusive", "saveState", "executeRestoreState", "entries", "args", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "findDestination", "findInvalidDestinationDisplayNameInDeepLink", "deepLink", "", "generateRouteFilled", "(Ljava/lang/Object;)Ljava/lang/String;", "getBackStackEntry", "(Ljava/lang/Object;)Landroidx/navigation/NavBackStackEntry;", "getViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "navGraphId", "handleDeepLink", "intent", "Landroid/content/Intent;", "instantiateBackStack", "backStackState", "launchSingleTopInternal", "linkChildToParent", "child", "parent", "navigate", "(Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "builder", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Landroid/net/Uri;", "request", "Landroidx/navigation/NavDeepLinkRequest;", "directions", "Landroidx/navigation/NavDirections;", "resId", "navigateUp", "onGraphCreated", "startDestinationArgs", "popBackStack", "(Ljava/lang/Object;ZZ)Z", "popBackStackFromNavigator", "onComplete", "Lkotlin/Function0;", "popBackStackFromNavigator$navigation_runtime_release", "popBackStackInternal", "popEntryFromBackStack", "savedState", "populateVisibleEntries", "populateVisibleEntries$navigation_runtime_release", "removeOnDestinationChangedListener", "restoreState", "navState", "restoreStateInternal", "id", "graphResId", "setLifecycleOwner", "owner", "setOnBackPressedDispatcher", "dispatcher", "setViewModelStore", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "tryRelaunchUpToExplicitStack", "tryRelaunchUpToGeneratedStack", "unlinkChildFromParent", "unlinkChildFromParent$navigation_runtime_release", "updateBackStackLifecycle", "updateBackStackLifecycle$navigation_runtime_release", "updateOnBackPressedCallbackEnabled", "findDestinationComprehensive", "searchChildren", "getTopGraph", "navigateInternal", "handler", "Companion", "NavControllerNavigatorState", "OnDestinationChangedListener", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavController.kt */
public class NavController {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";
    private static final String TAG = "NavController";
    /* access modifiers changed from: private */
    public static boolean deepLinkSaveState = true;
    /* access modifiers changed from: private */
    public final MutableStateFlow<List<NavBackStackEntry>> _currentBackStack;
    private final MutableSharedFlow<NavBackStackEntry> _currentBackStackEntryFlow;
    private NavGraph _graph;
    /* access modifiers changed from: private */
    public NavigatorProvider _navigatorProvider;
    /* access modifiers changed from: private */
    public final MutableStateFlow<List<NavBackStackEntry>> _visibleEntries;
    private Activity activity;
    /* access modifiers changed from: private */
    public Function1<? super NavBackStackEntry, Unit> addToBackStackHandler;
    /* access modifiers changed from: private */
    public final ArrayDeque<NavBackStackEntry> backQueue;
    private final List<NavBackStackEntry> backStackEntriesToDispatch;
    /* access modifiers changed from: private */
    public final Map<Integer, String> backStackMap;
    private final Map<String, ArrayDeque<NavBackStackEntryState>> backStackStates;
    private Parcelable[] backStackToRestore;
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;
    private final Context context;
    private final StateFlow<List<NavBackStackEntry>> currentBackStack;
    private final Flow<NavBackStackEntry> currentBackStackEntryFlow;
    private boolean deepLinkHandled;
    private int dispatchReentrantCount;
    private boolean enableOnBackPressedCallback;
    /* access modifiers changed from: private */
    public final Map<NavBackStackEntry, Boolean> entrySavedState;
    private Lifecycle.State hostLifecycleState;
    /* access modifiers changed from: private */
    public NavInflater inflater;
    private final LifecycleObserver lifecycleObserver;
    private LifecycleOwner lifecycleOwner;
    private final Lazy navInflater$delegate;
    /* access modifiers changed from: private */
    public final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> navigatorState;
    private Bundle navigatorStateToRestore;
    private final OnBackPressedCallback onBackPressedCallback;
    private OnBackPressedDispatcher onBackPressedDispatcher;
    private final CopyOnWriteArrayList<OnDestinationChangedListener> onDestinationChangedListeners;
    private final Map<NavBackStackEntry, AtomicInteger> parentToChildCount;
    /* access modifiers changed from: private */
    public Function1<? super NavBackStackEntry, Unit> popFromBackStackHandler;
    /* access modifiers changed from: private */
    public NavControllerViewModel viewModel;
    private final StateFlow<List<NavBackStackEntry>> visibleEntries;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "onDestinationChanged", "", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavController.kt */
    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    public NavController(Context context2) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        Iterator it = SequencesKt.generateSequence(this.context, NavController$activity$1.INSTANCE).iterator();
        while (true) {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
            if (((Context) element$iv) instanceof Activity) {
                break;
            }
        }
        this.activity = (Activity) element$iv;
        this.backQueue = new ArrayDeque<>();
        this._currentBackStack = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.currentBackStack = FlowKt.asStateFlow(this._currentBackStack);
        this._visibleEntries = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.visibleEntries = FlowKt.asStateFlow(this._visibleEntries);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new NavController$$ExternalSyntheticLambda0(this);
        this.onBackPressedCallback = new NavController$onBackPressedCallback$1(this);
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        this._navigatorProvider.addNavigator(new NavGraphNavigator(this._navigatorProvider));
        this._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater$delegate = LazyKt.lazy(new NavController$navInflater$2(this));
        this._currentBackStackEntryFlow = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, (Object) null);
        this.currentBackStackEntryFlow = FlowKt.asSharedFlow(this._currentBackStackEntryFlow);
    }

    public final Context getContext() {
        return this.context;
    }

    public NavGraph getGraph() {
        if (this._graph != null) {
            NavGraph navGraph = this._graph;
            Intrinsics.checkNotNull(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return navGraph;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public void setGraph(NavGraph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        setGraph(graph, (Bundle) null);
    }

    public final StateFlow<List<NavBackStackEntry>> getCurrentBackStack() {
        return this.currentBackStack;
    }

    public final StateFlow<List<NavBackStackEntry>> getVisibleEntries() {
        return this.visibleEntries;
    }

    private final void linkChildToParent(NavBackStackEntry child, NavBackStackEntry parent) {
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(parent);
        Intrinsics.checkNotNull(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(NavBackStackEntry child) {
        Intrinsics.checkNotNullParameter(child, "child");
        NavBackStackEntry parent = this.childToParentEntries.remove(child);
        Integer count = null;
        if (parent == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(parent);
        if (atomicInteger != null) {
            count = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (count != null && count.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(parent.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(parent);
            }
            this.parentToChildCount.remove(parent);
        }
        return parent;
    }

    public final void setHostLifecycleState$navigation_runtime_release(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        if (this.lifecycleOwner == null) {
            return Lifecycle.State.CREATED;
        }
        return this.hostLifecycleState;
    }

    /* access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$2(NavController this$0, LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
        this$0.hostLifecycleState = event.getTargetState();
        if (this$0._graph != null) {
            Iterator it = this$0.backQueue.iterator();
            while (it.hasNext()) {
                ((NavBackStackEntry) it.next()).handleLifecycleEvent(event);
            }
        }
    }

    public NavigatorProvider getNavigatorProvider() {
        return this._navigatorProvider;
    }

    public void setNavigatorProvider(NavigatorProvider navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        if (this.backQueue.isEmpty()) {
            this._navigatorProvider = navigatorProvider;
            return;
        }
        throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
    }

    static /* synthetic */ void navigateInternal$default(NavController navController, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, Function1 function1, int i, Object obj) {
        Function1 function12;
        if (obj == null) {
            if ((i & 8) != 0) {
                function12 = NavController$navigateInternal$1.INSTANCE;
            } else {
                function12 = function1;
            }
            navController.navigateInternal(navigator, list, navOptions, extras, function12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
    }

    private final void navigateInternal(Navigator<? extends NavDestination> $this$navigateInternal, List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras navigatorExtras, Function1<? super NavBackStackEntry, Unit> handler) {
        this.addToBackStackHandler = handler;
        $this$navigateInternal.navigate(entries, navOptions, navigatorExtras);
        this.addToBackStackHandler = null;
    }

    static /* synthetic */ void popBackStackInternal$default(NavController navController, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function1 = NavController$popBackStackInternal$1.INSTANCE;
            }
            navController.popBackStackInternal(navigator, navBackStackEntry, z, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    private final void popBackStackInternal(Navigator<? extends NavDestination> $this$popBackStackInternal, NavBackStackEntry popUpTo, boolean saveState, Function1<? super NavBackStackEntry, Unit> handler) {
        this.popFromBackStackHandler = handler;
        $this$popBackStackInternal.popBackStack(popUpTo, saveState);
        this.popFromBackStackHandler = null;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "navigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "getNavigator", "()Landroidx/navigation/Navigator;", "addInternal", "", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "createBackStackEntry", "destination", "arguments", "Landroid/os/Bundle;", "markTransitionComplete", "entry", "pop", "popUpTo", "saveState", "", "popWithTransition", "prepareForTransition", "push", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavController.kt */
    private final class NavControllerNavigatorState extends NavigatorState {
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(NavController this$02, Navigator<? extends NavDestination> navigator2) {
            Intrinsics.checkNotNullParameter(navigator2, "navigator");
            this.this$0 = this$02;
            this.navigator = navigator2;
        }

        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        public void push(NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            Navigator destinationNavigator = this.this$0._navigatorProvider.getNavigator(backStackEntry.getDestination().getNavigatorName());
            if (Intrinsics.areEqual((Object) destinationNavigator, (Object) this.navigator)) {
                Function1 handler = this.this$0.addToBackStackHandler;
                if (handler != null) {
                    handler.invoke(backStackEntry);
                    addInternal(backStackEntry);
                    return;
                }
                Log.i(NavController.TAG, "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.this$0.navigatorState.get(destinationNavigator);
            if (obj != null) {
                ((NavControllerNavigatorState) obj).push(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
        }

        public final void addInternal(NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.push(backStackEntry);
        }

        public NavBackStackEntry createBackStackEntry(NavDestination destination, Bundle arguments) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.this$0.getContext(), destination, arguments, this.this$0.getHostLifecycleState$navigation_runtime_release(), this.this$0.viewModel, (String) null, (Bundle) null, 96, (Object) null);
        }

        public void pop(NavBackStackEntry popUpTo, boolean saveState) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            Navigator destinationNavigator = this.this$0._navigatorProvider.getNavigator(popUpTo.getDestination().getNavigatorName());
            this.this$0.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
            if (Intrinsics.areEqual((Object) destinationNavigator, (Object) this.navigator)) {
                Function1 handler = this.this$0.popFromBackStackHandler;
                if (handler != null) {
                    handler.invoke(popUpTo);
                    super.pop(popUpTo, saveState);
                    return;
                }
                this.this$0.popBackStackFromNavigator$navigation_runtime_release(popUpTo, new NavController$NavControllerNavigatorState$pop$1(this, popUpTo, saveState));
                return;
            }
            Object obj = this.this$0.navigatorState.get(destinationNavigator);
            Intrinsics.checkNotNull(obj);
            ((NavControllerNavigatorState) obj).pop(popUpTo, saveState);
        }

        public void popWithTransition(NavBackStackEntry popUpTo, boolean saveState) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.popWithTransition(popUpTo, saveState);
        }

        public void markTransitionComplete(NavBackStackEntry entry) {
            NavControllerViewModel access$getViewModel$p;
            Intrinsics.checkNotNullParameter(entry, "entry");
            boolean z = true;
            boolean savedState = Intrinsics.areEqual(this.this$0.entrySavedState.get(entry), (Object) true);
            super.markTransitionComplete(entry);
            this.this$0.entrySavedState.remove(entry);
            if (!this.this$0.backQueue.contains(entry)) {
                this.this$0.unlinkChildFromParent$navigation_runtime_release(entry);
                if (entry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
                }
                Iterable $this$none$iv = this.this$0.backQueue;
                if (!($this$none$iv instanceof Collection) || !((Collection) $this$none$iv).isEmpty()) {
                    Iterator it = $this$none$iv.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual((Object) ((NavBackStackEntry) it.next()).getId(), (Object) entry.getId())) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z && !savedState && (access$getViewModel$p = this.this$0.viewModel) != null) {
                    access$getViewModel$p.clear(entry.getId());
                }
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                this.this$0._visibleEntries.tryEmit(this.this$0.populateVisibleEntries$navigation_runtime_release());
            } else if (!isNavigating()) {
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                this.this$0._currentBackStack.tryEmit(CollectionsKt.toMutableList(this.this$0.backQueue));
                this.this$0._visibleEntries.tryEmit(this.this$0.populateVisibleEntries$navigation_runtime_release());
            }
        }

        public void prepareForTransition(NavBackStackEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            super.prepareForTransition(entry);
            if (this.this$0.backQueue.contains(entry)) {
                entry.setMaxLifecycle(Lifecycle.State.STARTED);
                return;
            }
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
    }

    public void addOnDestinationChangedListener(OnDestinationChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onDestinationChangedListeners.add(listener);
        if (!this.backQueue.isEmpty()) {
            NavBackStackEntry backStackEntry = this.backQueue.last();
            listener.onDestinationChanged(this, backStackEntry.getDestination(), backStackEntry.getArguments());
        }
    }

    public void removeOnDestinationChangedListener(OnDestinationChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onDestinationChangedListeners.remove(listener);
    }

    public boolean popBackStack() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        NavDestination currentDestination = getCurrentDestination();
        Intrinsics.checkNotNull(currentDestination);
        return popBackStack(currentDestination.getId(), true);
    }

    public boolean popBackStack(int destinationId, boolean inclusive) {
        return popBackStack(destinationId, inclusive, false);
    }

    public boolean popBackStack(int destinationId, boolean inclusive, boolean saveState) {
        return popBackStackInternal(destinationId, inclusive, saveState) && dispatchOnDestinationChanged();
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return navController.popBackStack(str, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    public final boolean popBackStack(String route, boolean inclusive, boolean saveState) {
        Intrinsics.checkNotNullParameter(route, "route");
        return popBackStackInternal(route, inclusive, saveState) && dispatchOnDestinationChanged();
    }

    public final boolean popBackStack(String route, boolean inclusive) {
        Intrinsics.checkNotNullParameter(route, "route");
        return popBackStack$default(this, route, inclusive, false, 4, (Object) null);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController $this, boolean inclusive, boolean saveState, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                saveState = false;
            }
            Intrinsics.reifiedOperationMarker(6, "T");
            MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.simple");
            int id = RouteSerializerKt.generateHashCode(SerializersKt.serializer((KType) null));
            if ($this.findDestinationComprehensive($this.getGraph(), id, true) != null) {
                return $this.popBackStack(id, inclusive, saveState);
            }
            StringBuilder append = new StringBuilder().append("Destination with route ");
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalArgumentException(append.append(Reflection.getOrCreateKotlinClass(Object.class).getSimpleName()).append(" cannot be found in navigation graph ").append($this.getGraph()).toString().toString());
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    public final /* synthetic */ <T> boolean popBackStack(boolean inclusive, boolean saveState) {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.simple");
        int id = RouteSerializerKt.generateHashCode(SerializersKt.serializer((KType) null));
        if (findDestinationComprehensive(getGraph(), id, true) != null) {
            return popBackStack(id, inclusive, saveState);
        }
        StringBuilder append = new StringBuilder().append("Destination with route ");
        Intrinsics.reifiedOperationMarker(4, "T");
        throw new IllegalArgumentException(append.append(Reflection.getOrCreateKotlinClass(Object.class).getSimpleName()).append(" cannot be found in navigation graph ").append(getGraph()).toString().toString());
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, Object obj, boolean z, boolean z2, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return navController.popBackStack(obj, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    public final <T> boolean popBackStack(T route, boolean inclusive, boolean saveState) {
        Intrinsics.checkNotNullParameter(route, "route");
        return popBackStackInternal(route, inclusive, saveState) && dispatchOnDestinationChanged();
    }

    public final <T> boolean popBackStack(T route, boolean inclusive) {
        Intrinsics.checkNotNullParameter(route, "route");
        return popBackStack$default(this, (Object) route, inclusive, false, 4, (Object) null);
    }

    static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i, boolean z, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return navController.popBackStackInternal(i, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    private final boolean popBackStackInternal(int destinationId, boolean inclusive, boolean saveState) {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        List popOperations = new ArrayList();
        Iterator iterator = CollectionsKt.reversed(this.backQueue).iterator();
        NavDestination foundDestination = null;
        while (true) {
            if (!iterator.hasNext()) {
                break;
            }
            NavDestination destination = ((NavBackStackEntry) iterator.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                popOperations.add(navigator);
            }
            if (destination.getId() == destinationId) {
                foundDestination = destination;
                break;
            }
        }
        if (foundDestination != null) {
            return executePopOperations(popOperations, foundDestination, inclusive, saveState);
        }
        Log.i(TAG, "Ignoring popBackStack to destination " + NavDestination.Companion.getDisplayName(this.context, destinationId) + " as it was not found on the current back stack");
        return false;
    }

    static /* synthetic */ boolean popBackStackInternal$default(NavController navController, Object obj, boolean z, boolean z2, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return navController.popBackStackInternal(obj, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    private final <T> boolean popBackStackInternal(T route, boolean inclusive, boolean saveState) {
        return popBackStackInternal(generateRouteFilled(route), inclusive, saveState);
    }

    private final boolean popBackStackInternal(String route, boolean inclusive, boolean saveState) {
        NavDestination navDestination;
        Object element$iv;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        List popOperations = new ArrayList();
        List $this$lastOrNull$iv = this.backQueue;
        ListIterator iterator$iv = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
        while (true) {
            navDestination = null;
            if (!iterator$iv.hasPrevious()) {
                element$iv = null;
                break;
            }
            element$iv = iterator$iv.previous();
            NavBackStackEntry entry = (NavBackStackEntry) element$iv;
            boolean hasRoute = entry.getDestination().hasRoute(route, entry.getArguments());
            if (inclusive || !hasRoute) {
                popOperations.add(this._navigatorProvider.getNavigator(entry.getDestination().getNavigatorName()));
                continue;
            }
            if (hasRoute) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) element$iv;
        if (navBackStackEntry != null) {
            navDestination = navBackStackEntry.getDestination();
        }
        NavDestination foundDestination = navDestination;
        if (foundDestination != null) {
            return executePopOperations(popOperations, foundDestination, inclusive, saveState);
        }
        Log.i(TAG, "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
        return false;
    }

    private final boolean executePopOperations(List<? extends Navigator<?>> popOperations, NavDestination foundDestination, boolean inclusive, boolean saveState) {
        boolean z = saveState;
        Ref.BooleanRef popped = new Ref.BooleanRef();
        ArrayDeque savedState = new ArrayDeque();
        for (Navigator navigator : popOperations) {
            Ref.BooleanRef receivedPop = new Ref.BooleanRef();
            popBackStackInternal(navigator, this.backQueue.last(), z, new NavController$executePopOperations$1(receivedPop, popped, this, saveState, savedState));
            if (!receivedPop.element) {
                break;
            }
        }
        if (z) {
            if (!inclusive) {
                for (NavDestination destination : SequencesKt.takeWhile(SequencesKt.generateSequence(foundDestination, NavController$executePopOperations$2.INSTANCE), new NavController$executePopOperations$3(this))) {
                    Map<Integer, String> map = this.backStackMap;
                    Integer valueOf = Integer.valueOf(destination.getId());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) savedState.firstOrNull();
                    map.put(valueOf, navBackStackEntryState != null ? navBackStackEntryState.getId() : null);
                }
            } else {
                NavDestination navDestination = foundDestination;
            }
            if (!savedState.isEmpty()) {
                NavBackStackEntryState firstState = (NavBackStackEntryState) savedState.first();
                for (NavDestination destination2 : SequencesKt.takeWhile(SequencesKt.generateSequence(findDestination(firstState.getDestinationId()), NavController$executePopOperations$5.INSTANCE), new NavController$executePopOperations$6(this))) {
                    this.backStackMap.put(Integer.valueOf(destination2.getId()), firstState.getId());
                }
                if (this.backStackMap.values().contains(firstState.getId())) {
                    this.backStackStates.put(firstState.getId(), savedState);
                }
            }
        } else {
            NavDestination navDestination2 = foundDestination;
        }
        updateOnBackPressedCallbackEnabled();
        return popped.element;
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(NavBackStackEntry popUpTo, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        int popIndex = this.backQueue.indexOf(popUpTo);
        if (popIndex < 0) {
            Log.i(TAG, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        if (popIndex + 1 != this.backQueue.size()) {
            popBackStackInternal(this.backQueue.get(popIndex + 1).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$default(this, popUpTo, false, (ArrayDeque) null, 6, (Object) null);
        onComplete.invoke();
        updateOnBackPressedCallbackEnabled();
        dispatchOnDestinationChanged();
    }

    static /* synthetic */ void popEntryFromBackStack$default(NavController navController, NavBackStackEntry navBackStackEntry, boolean z, ArrayDeque arrayDeque, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                arrayDeque = new ArrayDeque();
            }
            navController.popEntryFromBackStack(navBackStackEntry, z, arrayDeque);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        r5 = (r5 = r2.getTransitionsInProgress()).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void popEntryFromBackStack(androidx.navigation.NavBackStackEntry r7, boolean r8, kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntryState> r9) {
        /*
            r6 = this;
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r0 = r6.backQueue
            java.lang.Object r0 = r0.last()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)
            if (r1 == 0) goto L_0x0097
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r1 = r6.backQueue
            java.util.List r1 = (java.util.List) r1
            kotlin.collections.CollectionsKt.removeLast(r1)
            androidx.navigation.NavigatorProvider r1 = r6.getNavigatorProvider()
            androidx.navigation.NavDestination r2 = r0.getDestination()
            java.lang.String r2 = r2.getNavigatorName()
            androidx.navigation.Navigator r1 = r1.getNavigator((java.lang.String) r2)
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r2 = r6.navigatorState
            java.lang.Object r2 = r2.get(r1)
            androidx.navigation.NavController$NavControllerNavigatorState r2 = (androidx.navigation.NavController.NavControllerNavigatorState) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0048
            kotlinx.coroutines.flow.StateFlow r5 = r2.getTransitionsInProgress()
            if (r5 == 0) goto L_0x0048
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            if (r5 == 0) goto L_0x0048
            boolean r5 = r5.contains(r0)
            if (r5 != r3) goto L_0x0048
            r5 = r3
            goto L_0x0049
        L_0x0048:
            r5 = r4
        L_0x0049:
            if (r5 != 0) goto L_0x0056
            java.util.Map<androidx.navigation.NavBackStackEntry, java.util.concurrent.atomic.AtomicInteger> r5 = r6.parentToChildCount
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r3 = r4
            goto L_0x0057
        L_0x0056:
        L_0x0057:
            androidx.lifecycle.Lifecycle r4 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r4 = r4.getCurrentState()
            androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r4 = r4.isAtLeast(r5)
            if (r4 == 0) goto L_0x0087
            if (r8 == 0) goto L_0x0077
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.setMaxLifecycle(r4)
            androidx.navigation.NavBackStackEntryState r4 = new androidx.navigation.NavBackStackEntryState
            r4.<init>((androidx.navigation.NavBackStackEntry) r0)
            r9.addFirst(r4)
        L_0x0077:
            if (r3 != 0) goto L_0x0082
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.DESTROYED
            r0.setMaxLifecycle(r4)
            r6.unlinkChildFromParent$navigation_runtime_release(r0)
            goto L_0x0087
        L_0x0082:
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.setMaxLifecycle(r4)
        L_0x0087:
            if (r8 != 0) goto L_0x0096
            if (r3 != 0) goto L_0x0096
            androidx.navigation.NavControllerViewModel r4 = r6.viewModel
            if (r4 == 0) goto L_0x0096
            java.lang.String r5 = r0.getId()
            r4.clear(r5)
        L_0x0096:
            return
        L_0x0097:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Attempted to pop "
            java.lang.StringBuilder r2 = r2.append(r3)
            androidx.navigation.NavDestination r3 = r7.getDestination()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", which is not the top of the back stack ("
            java.lang.StringBuilder r2 = r2.append(r3)
            androidx.navigation.NavDestination r3 = r0.getDestination()
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 41
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.popEntryFromBackStack(androidx.navigation.NavBackStackEntry, boolean, kotlin.collections.ArrayDeque):void");
    }

    public final boolean clearBackStack(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return clearBackStackInternal(route) && dispatchOnDestinationChanged();
    }

    public final boolean clearBackStack(int destinationId) {
        return clearBackStackInternal(destinationId) && dispatchOnDestinationChanged();
    }

    public final /* synthetic */ <T> boolean clearBackStack() {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.simple");
        return clearBackStack(RouteSerializerKt.generateHashCode(SerializersKt.serializer((KType) null)));
    }

    public final <T> boolean clearBackStack(T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return clearBackStackInternal(generateRouteFilled(route)) && dispatchOnDestinationChanged();
    }

    private final boolean clearBackStackInternal(int destinationId) {
        for (NavControllerNavigatorState state : this.navigatorState.values()) {
            state.setNavigating(true);
        }
        boolean restored = restoreStateInternal(destinationId, (Bundle) null, NavOptionsBuilderKt.navOptions(NavController$clearBackStackInternal$restored$1.INSTANCE), (Navigator.Extras) null);
        for (NavControllerNavigatorState state2 : this.navigatorState.values()) {
            state2.setNavigating(false);
        }
        if (!restored || !popBackStackInternal(destinationId, true, false)) {
            return false;
        }
        return true;
    }

    private final boolean clearBackStackInternal(String route) {
        for (NavControllerNavigatorState state : this.navigatorState.values()) {
            state.setNavigating(true);
        }
        boolean restored = restoreStateInternal(route);
        for (NavControllerNavigatorState state2 : this.navigatorState.values()) {
            state2.setNavigating(false);
        }
        if (!restored || !popBackStackInternal(route, true, false)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r0.getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean navigateUp() {
        /*
            r2 = this;
            int r0 = r2.getDestinationCountOnBackStack()
            r1 = 1
            if (r0 != r1) goto L_0x002c
            android.app.Activity r0 = r2.activity
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0017
            android.os.Bundle r0 = r0.getExtras()
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = "android-support-nav:controller:deepLinkIds"
            int[] r1 = r0.getIntArray(r1)
        L_0x0020:
            if (r1 == 0) goto L_0x0027
            boolean r1 = r2.tryRelaunchUpToExplicitStack()
            return r1
        L_0x0027:
            boolean r1 = r2.tryRelaunchUpToGeneratedStack()
            return r1
        L_0x002c:
            boolean r0 = r2.popBackStack()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigateUp():boolean");
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity2 = this.activity;
        Intrinsics.checkNotNull(activity2);
        Intent intent = activity2.getIntent();
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        Intrinsics.checkNotNull(intArray);
        List<Integer> $this$forEachIndexed$iv = ArraysKt.toMutableList(intArray);
        ArrayList deepLinkArgs = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        int leafDestinationId = ((Number) CollectionsKt.removeLast($this$forEachIndexed$iv)).intValue();
        if (deepLinkArgs != null) {
            Bundle bundle = (Bundle) CollectionsKt.removeLast(deepLinkArgs);
        }
        if ($this$forEachIndexed$iv.isEmpty()) {
            return false;
        }
        NavDestination $this$tryRelaunchUpToExplicitStack_u24lambda_u2413 = findDestinationComprehensive(getGraph(), leafDestinationId, false);
        if ($this$tryRelaunchUpToExplicitStack_u24lambda_u2413 instanceof NavGraph) {
            leafDestinationId = NavGraph.Companion.findStartDestination((NavGraph) $this$tryRelaunchUpToExplicitStack_u24lambda_u2413).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (!(currentDestination != null && leafDestinationId == currentDestination.getId())) {
            return false;
        }
        NavDeepLinkBuilder navDeepLinkBuilder = createDeepLink();
        Bundle arguments = BundleKt.bundleOf(TuplesKt.to(KEY_DEEP_LINK_INTENT, intent));
        Bundle it = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (it != null) {
            arguments.putAll(it);
        }
        navDeepLinkBuilder.setArguments(arguments);
        int index = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv = index + 1;
            if (index < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            navDeepLinkBuilder.addDestination(((Number) item$iv).intValue(), deepLinkArgs != null ? (Bundle) deepLinkArgs.get(index) : null);
            index = index$iv;
        }
        navDeepLinkBuilder.createTaskStackBuilder().startActivities();
        Activity activity3 = this.activity;
        if (activity3 == null) {
            return true;
        }
        activity3.finish();
        return true;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        NavDestination currentDestination = getCurrentDestination();
        Intrinsics.checkNotNull(currentDestination);
        int destId = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() != destId) {
                Bundle args = new Bundle();
                if (this.activity != null) {
                    Activity activity2 = this.activity;
                    Intrinsics.checkNotNull(activity2);
                    if (activity2.getIntent() != null) {
                        Activity activity3 = this.activity;
                        Intrinsics.checkNotNull(activity3);
                        if (activity3.getIntent().getData() != null) {
                            Activity activity4 = this.activity;
                            Intrinsics.checkNotNull(activity4);
                            args.putParcelable(KEY_DEEP_LINK_INTENT, activity4.getIntent());
                            NavGraph currGraph = getTopGraph(this.backQueue);
                            Activity activity5 = this.activity;
                            Intrinsics.checkNotNull(activity5);
                            Intent intent = activity5.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "activity!!.intent");
                            NavDestination.DeepLinkMatch matchingDeepLink = currGraph.matchDeepLinkComprehensive(new NavDeepLinkRequest(intent), true, true, currGraph);
                            if ((matchingDeepLink != null ? matchingDeepLink.getMatchingArgs() : null) != null) {
                                args.putAll(matchingDeepLink.getDestination().addInDefaultArgs(matchingDeepLink.getMatchingArgs()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(args).createTaskStackBuilder().startActivities();
                Activity activity6 = this.activity;
                if (activity6 != null) {
                    activity6.finish();
                }
                return true;
            }
            destId = parent.getId();
        }
        return false;
    }

    private final int getDestinationCountOnBackStack() {
        Iterable<NavBackStackEntry> $this$count$iv = this.backQueue;
        if (($this$count$iv instanceof Collection) && ((Collection) $this$count$iv).isEmpty()) {
            return 0;
        }
        int count$iv = 0;
        for (NavBackStackEntry entry : $this$count$iv) {
            if (!(entry.getDestination() instanceof NavGraph) && (count$iv = count$iv + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return count$iv;
    }

    private final boolean dispatchOnDestinationChanged() {
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$default(this, this.backQueue.last(), false, (ArrayDeque) null, 6, (Object) null);
        }
        NavBackStackEntry lastBackStackEntry = this.backQueue.lastOrNull();
        if (lastBackStackEntry != null) {
            this.backStackEntriesToDispatch.add(lastBackStackEntry);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        this.dispatchReentrantCount--;
        if (this.dispatchReentrantCount == 0) {
            List<NavBackStackEntry> dispatchList = CollectionsKt.toMutableList(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry backStackEntry : dispatchList) {
                Iterator<OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this, backStackEntry.getDestination(), backStackEntry.getArguments());
                }
                this._currentBackStackEntryFlow.tryEmit(backStackEntry);
            }
            this._currentBackStack.tryEmit(CollectionsKt.toMutableList(this.backQueue));
            this._visibleEntries.tryEmit(populateVisibleEntries$navigation_runtime_release());
        }
        if (lastBackStackEntry != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        r12 = (r12 = r11.getTransitionsInProgress()).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateBackStackLifecycle$navigation_runtime_release() {
        /*
            r15 = this;
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r0 = r15.backQueue
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r0)
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r1 = r1.getDestination()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r1 instanceof androidx.navigation.FloatingWindow
            if (r3 == 0) goto L_0x004b
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.reversed(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x002f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004b
            java.lang.Object r4 = r3.next()
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            androidx.navigation.NavDestination r4 = r4.getDestination()
            r2.add(r4)
            boolean r5 = r4 instanceof androidx.navigation.FloatingWindow
            if (r5 != 0) goto L_0x002f
            boolean r5 = r4 instanceof androidx.navigation.NavGraph
            if (r5 != 0) goto L_0x002f
        L_0x004b:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = kotlin.collections.CollectionsKt.reversed(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x005b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0157
            java.lang.Object r5 = r4.next()
            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
            androidx.lifecycle.Lifecycle$State r6 = r5.getMaxLifecycle()
            androidx.navigation.NavDestination r7 = r5.getDestination()
            if (r1 == 0) goto L_0x0106
            int r8 = r7.getId()
            int r9 = r1.getId()
            if (r8 != r9) goto L_0x0106
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.RESUMED
            r9 = 1
            r10 = 0
            if (r6 == r8) goto L_0x00e4
            androidx.navigation.NavigatorProvider r8 = r15.getNavigatorProvider()
            androidx.navigation.NavDestination r11 = r5.getDestination()
            java.lang.String r11 = r11.getNavigatorName()
            androidx.navigation.Navigator r8 = r8.getNavigator((java.lang.String) r11)
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r11 = r15.navigatorState
            java.lang.Object r11 = r11.get(r8)
            androidx.navigation.NavController$NavControllerNavigatorState r11 = (androidx.navigation.NavController.NavControllerNavigatorState) r11
            if (r11 == 0) goto L_0x00b3
            kotlinx.coroutines.flow.StateFlow r12 = r11.getTransitionsInProgress()
            if (r12 == 0) goto L_0x00b3
            java.lang.Object r12 = r12.getValue()
            java.util.Set r12 = (java.util.Set) r12
            if (r12 == 0) goto L_0x00b3
            boolean r12 = r12.contains(r5)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            goto L_0x00b4
        L_0x00b3:
            r12 = 0
        L_0x00b4:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r9)
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r13 != 0) goto L_0x00dc
            java.util.Map<androidx.navigation.NavBackStackEntry, java.util.concurrent.atomic.AtomicInteger> r13 = r15.parentToChildCount
            java.lang.Object r13 = r13.get(r5)
            java.util.concurrent.atomic.AtomicInteger r13 = (java.util.concurrent.atomic.AtomicInteger) r13
            if (r13 == 0) goto L_0x00d0
            int r13 = r13.get()
            if (r13 != 0) goto L_0x00d0
            r13 = r9
            goto L_0x00d1
        L_0x00d0:
            r13 = r10
        L_0x00d1:
            if (r13 != 0) goto L_0x00dc
            r13 = r3
            java.util.Map r13 = (java.util.Map) r13
            androidx.lifecycle.Lifecycle$State r14 = androidx.lifecycle.Lifecycle.State.RESUMED
            r13.put(r5, r14)
            goto L_0x00e4
        L_0x00dc:
            r13 = r3
            java.util.Map r13 = (java.util.Map) r13
            androidx.lifecycle.Lifecycle$State r14 = androidx.lifecycle.Lifecycle.State.STARTED
            r13.put(r5, r14)
        L_0x00e4:
            java.lang.Object r8 = kotlin.collections.CollectionsKt.firstOrNull(r2)
            androidx.navigation.NavDestination r8 = (androidx.navigation.NavDestination) r8
            if (r8 == 0) goto L_0x00f7
            int r8 = r8.getId()
            int r11 = r7.getId()
            if (r8 != r11) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r9 = r10
        L_0x00f8:
            if (r9 == 0) goto L_0x00fd
            kotlin.collections.CollectionsKt.removeFirst(r2)
        L_0x00fd:
            androidx.navigation.NavGraph r8 = r1.getParent()
            r1 = r8
            androidx.navigation.NavDestination r1 = (androidx.navigation.NavDestination) r1
            goto L_0x005b
        L_0x0106:
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0150
            int r8 = r7.getId()
            java.lang.Object r9 = kotlin.collections.CollectionsKt.first(r2)
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            int r9 = r9.getId()
            if (r8 != r9) goto L_0x0150
            java.lang.Object r8 = kotlin.collections.CollectionsKt.removeFirst(r2)
            androidx.navigation.NavDestination r8 = (androidx.navigation.NavDestination) r8
            androidx.lifecycle.Lifecycle$State r9 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 != r9) goto L_0x012f
            androidx.lifecycle.Lifecycle$State r9 = androidx.lifecycle.Lifecycle.State.STARTED
            r5.setMaxLifecycle(r9)
            goto L_0x013b
        L_0x012f:
            androidx.lifecycle.Lifecycle$State r9 = androidx.lifecycle.Lifecycle.State.STARTED
            if (r6 == r9) goto L_0x013b
            r9 = r3
            java.util.Map r9 = (java.util.Map) r9
            androidx.lifecycle.Lifecycle$State r10 = androidx.lifecycle.Lifecycle.State.STARTED
            r9.put(r5, r10)
        L_0x013b:
            androidx.navigation.NavGraph r9 = r8.getParent()
            if (r9 == 0) goto L_0x014e
            r10 = 0
            boolean r11 = r2.contains(r9)
            if (r11 != 0) goto L_0x014b
            r2.add(r9)
        L_0x014b:
            goto L_0x005b
        L_0x014e:
            goto L_0x005b
        L_0x0150:
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.CREATED
            r5.setMaxLifecycle(r8)
            goto L_0x005b
        L_0x0157:
            java.util.Iterator r4 = r0.iterator()
        L_0x015b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0177
            java.lang.Object r5 = r4.next()
            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
            java.lang.Object r6 = r3.get(r5)
            androidx.lifecycle.Lifecycle$State r6 = (androidx.lifecycle.Lifecycle.State) r6
            if (r6 == 0) goto L_0x0173
            r5.setMaxLifecycle(r6)
            goto L_0x015b
        L_0x0173:
            r5.updateState()
            goto L_0x015b
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateBackStackLifecycle$navigation_runtime_release():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0070 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<androidx.navigation.NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        /*
            r21 = this;
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r2 = r0.navigatorState
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.Iterator r4 = r2.iterator()
        L_0x0016:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0086
            java.lang.Object r5 = r4.next()
            r8 = r5
            androidx.navigation.NavController$NavControllerNavigatorState r8 = (androidx.navigation.NavController.NavControllerNavigatorState) r8
            r9 = 0
            r10 = r1
            java.util.Collection r10 = (java.util.Collection) r10
            kotlinx.coroutines.flow.StateFlow r11 = r8.getTransitionsInProgress()
            java.lang.Object r11 = r11.getValue()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r12 = 0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Collection r13 = (java.util.Collection) r13
            r14 = r11
            r15 = 0
            java.util.Iterator r16 = r14.iterator()
        L_0x003f:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0075
            java.lang.Object r6 = r16.next()
            r7 = r6
            androidx.navigation.NavBackStackEntry r7 = (androidx.navigation.NavBackStackEntry) r7
            r18 = 0
            boolean r19 = r1.contains(r7)
            if (r19 != 0) goto L_0x0066
            r19 = r2
            androidx.lifecycle.Lifecycle$State r2 = r7.getMaxLifecycle()
            r20 = r3
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r2 = r2.isAtLeast(r3)
            if (r2 != 0) goto L_0x006a
            r2 = 1
            goto L_0x006b
        L_0x0066:
            r19 = r2
            r20 = r3
        L_0x006a:
            r2 = 0
        L_0x006b:
            if (r2 == 0) goto L_0x0070
            r13.add(r6)
        L_0x0070:
            r2 = r19
            r3 = r20
            goto L_0x003f
        L_0x0075:
            r19 = r2
            r20 = r3
            r2 = r13
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.CollectionsKt.addAll(r10, r2)
            r2 = r19
            goto L_0x0016
        L_0x0086:
            r19 = r2
            r20 = r3
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r3 = r0.backQueue
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r3
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L_0x009f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c8
            java.lang.Object r9 = r8.next()
            r10 = r9
            androidx.navigation.NavBackStackEntry r10 = (androidx.navigation.NavBackStackEntry) r10
            r11 = 0
            boolean r12 = r1.contains(r10)
            if (r12 != 0) goto L_0x00c1
            androidx.lifecycle.Lifecycle$State r12 = r10.getMaxLifecycle()
            androidx.lifecycle.Lifecycle$State r13 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r12 = r12.isAtLeast(r13)
            if (r12 == 0) goto L_0x00c1
            r10 = 1
            goto L_0x00c2
        L_0x00c1:
            r10 = 0
        L_0x00c2:
            if (r10 == 0) goto L_0x009f
            r5.add(r9)
            goto L_0x009f
        L_0x00c8:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.collections.CollectionsKt.addAll(r2, r5)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L_0x00e2:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00fc
            java.lang.Object r8 = r7.next()
            r9 = r8
            androidx.navigation.NavBackStackEntry r9 = (androidx.navigation.NavBackStackEntry) r9
            r10 = 0
            androidx.navigation.NavDestination r11 = r9.getDestination()
            boolean r11 = r11 instanceof androidx.navigation.NavGraph
            if (r11 != 0) goto L_0x00e2
            r4.add(r8)
            goto L_0x00e2
        L_0x00fc:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.populateVisibleEntries$navigation_runtime_release():java.util.List");
    }

    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater$delegate.getValue();
    }

    public void setGraph(int graphResId) {
        setGraph(getNavInflater().inflate(graphResId), (Bundle) null);
    }

    public void setGraph(int graphResId, Bundle startDestinationArgs) {
        setGraph(getNavInflater().inflate(graphResId), startDestinationArgs);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.navigation.NavGraph} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setGraph(androidx.navigation.NavGraph r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            java.lang.String r0 = "graph"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.navigation.NavGraph r0 = r6._graph
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)
            if (r0 != 0) goto L_0x0061
            androidx.navigation.NavGraph r0 = r6._graph
            if (r0 == 0) goto L_0x0058
            r8 = r0
            r9 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r6.backStackMap
            java.util.Set r1 = r1.keySet()
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            r10 = r0
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L_0x002d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0049
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r5 = 0
            java.lang.String r11 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r11)
            int r11 = r4.intValue()
            r6.clearBackStackInternal((int) r11)
            goto L_0x002d
        L_0x0049:
            int r1 = r8.getId()
            r4 = 4
            r5 = 0
            r2 = 1
            r3 = 0
            r0 = r20
            popBackStackInternal$default((androidx.navigation.NavController) r0, (int) r1, (boolean) r2, (boolean) r3, (int) r4, (java.lang.Object) r5)
        L_0x0058:
            r6._graph = r7
            r0 = r22
            r6.onGraphCreated(r0)
            goto L_0x0131
        L_0x0061:
            r0 = r22
            r1 = 0
            androidx.collection.SparseArrayCompat r2 = r21.getNodes()
            int r2 = r2.size()
        L_0x006c:
            if (r1 >= r2) goto L_0x0094
            androidx.collection.SparseArrayCompat r3 = r21.getNodes()
            java.lang.Object r3 = r3.valueAt(r1)
            androidx.navigation.NavDestination r3 = (androidx.navigation.NavDestination) r3
            androidx.navigation.NavGraph r4 = r6._graph
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            androidx.collection.SparseArrayCompat r4 = r4.getNodes()
            int r4 = r4.keyAt(r1)
            androidx.navigation.NavGraph r5 = r6._graph
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            androidx.collection.SparseArrayCompat r5 = r5.getNodes()
            r5.replace(r4, r3)
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0094:
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r1 = r6.backQueue
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        L_0x009d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x012d
            java.lang.Object r4 = r3.next()
            r5 = r4
            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
            r8 = 0
            androidx.navigation.NavDestination$Companion r9 = androidx.navigation.NavDestination.Companion
            androidx.navigation.NavDestination r10 = r5.getDestination()
            kotlin.sequences.Sequence r9 = r9.getHierarchy(r10)
            java.util.List r9 = kotlin.sequences.SequencesKt.toList(r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.asReversed(r9)
            r10 = r9
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            androidx.navigation.NavGraph r11 = r6._graph
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            r12 = 0
            r13 = r11
            java.util.Iterator r14 = r10.iterator()
        L_0x00cb:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x011d
            java.lang.Object r15 = r14.next()
            r0 = r15
            androidx.navigation.NavDestination r0 = (androidx.navigation.NavDestination) r0
            r16 = r13
            androidx.navigation.NavDestination r16 = (androidx.navigation.NavDestination) r16
            r17 = r16
            r16 = 0
            r18 = r1
            androidx.navigation.NavGraph r1 = r6._graph
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x00f7
            r1 = r17
            boolean r17 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r7)
            if (r17 == 0) goto L_0x00f9
            r19 = r1
            r17 = r2
            goto L_0x0112
        L_0x00f7:
            r1 = r17
        L_0x00f9:
            r17 = r2
            boolean r2 = r1 instanceof androidx.navigation.NavGraph
            if (r2 == 0) goto L_0x0110
            r2 = r1
            androidx.navigation.NavGraph r2 = (androidx.navigation.NavGraph) r2
            r19 = r1
            int r1 = r0.getId()
            androidx.navigation.NavDestination r1 = r2.findNode((int) r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            goto L_0x0114
        L_0x0110:
            r19 = r1
        L_0x0112:
            r1 = r19
        L_0x0114:
            r13 = r1
            r0 = r22
            r2 = r17
            r1 = r18
            goto L_0x00cb
        L_0x011d:
            r18 = r1
            r17 = r2
            r0 = r13
            androidx.navigation.NavDestination r0 = (androidx.navigation.NavDestination) r0
            r5.setDestination(r0)
            r0 = r22
            goto L_0x009d
        L_0x012d:
            r18 = r1
            r17 = r2
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.setGraph(androidx.navigation.NavGraph, android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void onGraphCreated(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = r16
            android.os.Bundle r1 = r0.navigatorStateToRestore
            if (r1 == 0) goto L_0x0037
            r2 = 0
            java.lang.String r3 = "android-support-nav:controller:navigatorState:names"
            java.util.ArrayList r3 = r1.getStringArrayList(r3)
            if (r3 == 0) goto L_0x0035
            java.util.Iterator r4 = r3.iterator()
        L_0x0014:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0035
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            androidx.navigation.NavigatorProvider r6 = r0._navigatorProvider
            java.lang.String r7 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            androidx.navigation.Navigator r6 = r6.getNavigator((java.lang.String) r5)
            android.os.Bundle r7 = r1.getBundle(r5)
            if (r7 == 0) goto L_0x0014
            r6.onRestoreState(r7)
            goto L_0x0014
        L_0x0035:
        L_0x0037:
            android.os.Parcelable[] r1 = r0.backStackToRestore
            r3 = 0
            if (r1 == 0) goto L_0x00df
            r4 = 0
            int r5 = r1.length
            r6 = 0
        L_0x003f:
            if (r6 >= r5) goto L_0x00d8
            r7 = r1[r6]
            java.lang.String r8 = "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r8)
            r8 = r7
            androidx.navigation.NavBackStackEntryState r8 = (androidx.navigation.NavBackStackEntryState) r8
            int r9 = r8.getDestinationId()
            androidx.navigation.NavDestination r9 = r0.findDestination((int) r9)
            if (r9 == 0) goto L_0x00a5
            android.content.Context r10 = r0.context
            androidx.lifecycle.Lifecycle$State r11 = r16.getHostLifecycleState$navigation_runtime_release()
            androidx.navigation.NavControllerViewModel r12 = r0.viewModel
            androidx.navigation.NavBackStackEntry r10 = r8.instantiate(r10, r9, r11, r12)
            androidx.navigation.NavigatorProvider r11 = r0._navigatorProvider
            java.lang.String r12 = r9.getNavigatorName()
            androidx.navigation.Navigator r11 = r11.getNavigator((java.lang.String) r12)
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r12 = r0.navigatorState
            r13 = 0
            java.lang.Object r14 = r12.get(r11)
            if (r14 != 0) goto L_0x0080
            r15 = 0
            androidx.navigation.NavController$NavControllerNavigatorState r2 = new androidx.navigation.NavController$NavControllerNavigatorState
            r2.<init>(r0, r11)
            r12.put(r11, r2)
            goto L_0x0081
        L_0x0080:
            r2 = r14
        L_0x0081:
            androidx.navigation.NavController$NavControllerNavigatorState r2 = (androidx.navigation.NavController.NavControllerNavigatorState) r2
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r12 = r0.backQueue
            r12.add(r10)
            r2.addInternal(r10)
            androidx.navigation.NavDestination r12 = r10.getDestination()
            androidx.navigation.NavGraph r12 = r12.getParent()
            if (r12 == 0) goto L_0x00a2
            int r13 = r12.getId()
            androidx.navigation.NavBackStackEntry r13 = r0.getBackStackEntry((int) r13)
            r0.linkChildToParent(r10, r13)
        L_0x00a2:
            int r6 = r6 + 1
            goto L_0x003f
        L_0x00a5:
            androidx.navigation.NavDestination$Companion r2 = androidx.navigation.NavDestination.Companion
            android.content.Context r3 = r0.context
            int r5 = r8.getDestinationId()
            java.lang.String r2 = r2.getDisplayName(r3, r5)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Restoring the Navigation back stack failed: destination "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r6 = " cannot be found from the current destination "
            java.lang.StringBuilder r5 = r5.append(r6)
            androidx.navigation.NavDestination r6 = r16.getCurrentDestination()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.<init>(r5)
            throw r3
        L_0x00d8:
            r16.updateOnBackPressedCallbackEnabled()
            r0.backStackToRestore = r3
        L_0x00df:
            androidx.navigation.NavigatorProvider r1 = r0._navigatorProvider
            java.util.Map r1 = r1.getNavigators()
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r1
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L_0x00fa:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0112
            java.lang.Object r8 = r7.next()
            r9 = r8
            androidx.navigation.Navigator r9 = (androidx.navigation.Navigator) r9
            r10 = 0
            boolean r9 = r9.isAttached()
            if (r9 != 0) goto L_0x00fa
            r4.add(r8)
            goto L_0x00fa
        L_0x0112:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r1 = r4
            r2 = 0
            java.util.Iterator r4 = r1.iterator()
        L_0x011e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x014f
            java.lang.Object r5 = r4.next()
            r6 = r5
            androidx.navigation.Navigator r6 = (androidx.navigation.Navigator) r6
            r7 = 0
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r8 = r0.navigatorState
            r9 = 0
            java.lang.Object r10 = r8.get(r6)
            if (r10 != 0) goto L_0x0141
            r11 = 0
            androidx.navigation.NavController$NavControllerNavigatorState r12 = new androidx.navigation.NavController$NavControllerNavigatorState
            r12.<init>(r0, r6)
            r11 = r12
            r8.put(r6, r11)
            goto L_0x0142
        L_0x0141:
            r11 = r10
        L_0x0142:
            androidx.navigation.NavController$NavControllerNavigatorState r11 = (androidx.navigation.NavController.NavControllerNavigatorState) r11
            r8 = r11
            r9 = r8
            androidx.navigation.NavigatorState r9 = (androidx.navigation.NavigatorState) r9
            r6.onAttach(r9)
            goto L_0x011e
        L_0x014f:
            androidx.navigation.NavGraph r1 = r0._graph
            if (r1 == 0) goto L_0x0189
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r1 = r0.backQueue
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0189
            boolean r1 = r0.deepLinkHandled
            if (r1 != 0) goto L_0x0175
            android.app.Activity r1 = r0.activity
            if (r1 == 0) goto L_0x0175
            android.app.Activity r1 = r0.activity
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            android.content.Intent r1 = r1.getIntent()
            boolean r1 = r0.handleDeepLink(r1)
            if (r1 == 0) goto L_0x0175
            r2 = 1
            goto L_0x0176
        L_0x0175:
            r2 = 0
        L_0x0176:
            r1 = r2
            if (r1 != 0) goto L_0x0186
            androidx.navigation.NavGraph r2 = r0._graph
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            androidx.navigation.NavDestination r2 = (androidx.navigation.NavDestination) r2
            r4 = r17
            r0.navigate((androidx.navigation.NavDestination) r2, (android.os.Bundle) r4, (androidx.navigation.NavOptions) r3, (androidx.navigation.Navigator.Extras) r3)
            goto L_0x018e
        L_0x0186:
            r4 = r17
            goto L_0x018e
        L_0x0189:
            r4 = r17
            r16.dispatchOnDestinationChanged()
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.onGraphCreated(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if ((r0.length == 0) != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleDeepLink(android.content.Intent r27) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r1 = 0
            if (r8 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.os.Bundle r9 = r27.getExtras()
            java.lang.String r2 = "NavController"
            r10 = 0
            if (r9 == 0) goto L_0x0035
            java.lang.String r0 = "android-support-nav:controller:deepLinkIds"
            int[] r0 = r9.getIntArray(r0)     // Catch:{ Exception -> 0x0019 }
            goto L_0x0036
        L_0x0019:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "handleDeepLink() could not extract deepLink from "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            r4 = r0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            android.util.Log.e(r2, r3, r4)
            r0 = r10
            goto L_0x0036
        L_0x0035:
            r0 = r10
        L_0x0036:
            if (r9 == 0) goto L_0x0041
            java.lang.String r3 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r3 = r9.getParcelableArrayList(r3)
            goto L_0x0042
        L_0x0041:
            r3 = r10
        L_0x0042:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r11 = r4
            if (r9 == 0) goto L_0x0051
            java.lang.String r4 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r4 = r9.getBundle(r4)
            goto L_0x0052
        L_0x0051:
            r4 = r10
        L_0x0052:
            r12 = r4
            if (r12 == 0) goto L_0x0058
            r11.putAll(r12)
        L_0x0058:
            r13 = 1
            if (r0 == 0) goto L_0x0063
            int r4 = r0.length
            if (r4 != 0) goto L_0x0060
            r4 = r13
            goto L_0x0061
        L_0x0060:
            r4 = r1
        L_0x0061:
            if (r4 == 0) goto L_0x0091
        L_0x0063:
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r4 = r7.backQueue
            androidx.navigation.NavGraph r4 = r7.getTopGraph(r4)
            androidx.navigation.NavDeepLinkRequest r5 = new androidx.navigation.NavDeepLinkRequest
            r5.<init>(r8)
            r6 = r4
            androidx.navigation.NavDestination r6 = (androidx.navigation.NavDestination) r6
            androidx.navigation.NavDestination$DeepLinkMatch r5 = r4.matchDeepLinkComprehensive(r5, r13, r13, r6)
            if (r5 == 0) goto L_0x0091
            androidx.navigation.NavDestination r6 = r5.getDestination()
            int[] r0 = androidx.navigation.NavDestination.buildDeepLinkIds$default(r6, r10, r13, r10)
            r3 = 0
            android.os.Bundle r14 = r5.getMatchingArgs()
            android.os.Bundle r14 = r6.addInDefaultArgs(r14)
            if (r14 == 0) goto L_0x0091
            r11.putAll(r14)
        L_0x0091:
            r14 = r3
            if (r0 == 0) goto L_0x0262
            int r3 = r0.length
            if (r3 != 0) goto L_0x0099
            r3 = r13
            goto L_0x009a
        L_0x0099:
            r3 = r1
        L_0x009a:
            if (r3 == 0) goto L_0x00a0
            r18 = r0
            goto L_0x0264
        L_0x00a0:
            java.lang.String r15 = r7.findInvalidDestinationDisplayNameInDeepLink(r0)
            if (r15 == 0) goto L_0x00c9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not find destination "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r15)
            java.lang.String r4 = " in the navigation graph, ignoring the deep link from "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r2, r3)
            return r1
        L_0x00c9:
            java.lang.String r2 = "android-support-nav:controller:deepLinkIntent"
            r3 = r8
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r11.putParcelable(r2, r3)
            int r2 = r0.length
            android.os.Bundle[] r6 = new android.os.Bundle[r2]
            r2 = 0
            int r3 = r6.length
        L_0x00d6:
            if (r2 >= r3) goto L_0x00f2
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putAll(r11)
            if (r14 == 0) goto L_0x00ed
            java.lang.Object r5 = r14.get(r2)
            android.os.Bundle r5 = (android.os.Bundle) r5
            if (r5 == 0) goto L_0x00ed
            r4.putAll(r5)
        L_0x00ed:
            r6[r2] = r4
            int r2 = r2 + 1
            goto L_0x00d6
        L_0x00f2:
            int r16 = r27.getFlags()
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r16 & r2
            if (r3 == 0) goto L_0x0128
            r3 = 32768(0x8000, float:4.5918E-41)
            r4 = r16 & r3
            if (r4 != 0) goto L_0x0128
            r8.addFlags(r3)
            android.content.Context r2 = r7.context
            androidx.core.app.TaskStackBuilder r2 = androidx.core.app.TaskStackBuilder.create(r2)
            androidx.core.app.TaskStackBuilder r2 = r2.addNextIntentWithParentStack(r8)
            java.lang.String r3 = "create(context).addNextI…ntWithParentStack(intent)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r2.startActivities()
            android.app.Activity r3 = r7.activity
            if (r3 == 0) goto L_0x0127
            r4 = 0
            r3.finish()
            r3.overridePendingTransition(r1, r1)
        L_0x0127:
            return r13
        L_0x0128:
            r2 = r16 & r2
            java.lang.String r5 = "Deep Linking failed: destination "
            if (r2 == 0) goto L_0x01aa
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r1 = r7.backQueue
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0152
            androidx.navigation.NavGraph r1 = r7._graph
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.getId()
            r17 = 4
            r18 = 0
            r3 = 1
            r4 = 0
            r1 = r26
            r13 = r5
            r5 = r17
            r17 = r6
            r6 = r18
            popBackStackInternal$default((androidx.navigation.NavController) r1, (int) r2, (boolean) r3, (boolean) r4, (int) r5, (java.lang.Object) r6)
            goto L_0x0155
        L_0x0152:
            r13 = r5
            r17 = r6
        L_0x0155:
            r1 = 0
        L_0x0156:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x01a6
            r2 = r0[r1]
            int r3 = r1 + 1
            r1 = r17[r1]
            androidx.navigation.NavDestination r4 = r7.findDestination((int) r2)
            if (r4 == 0) goto L_0x0179
            androidx.navigation.NavController$handleDeepLink$2 r5 = new androidx.navigation.NavController$handleDeepLink$2
            r5.<init>(r4, r7)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.navigation.NavOptions r5 = androidx.navigation.NavOptionsBuilderKt.navOptions(r5)
            r7.navigate((androidx.navigation.NavDestination) r4, (android.os.Bundle) r1, (androidx.navigation.NavOptions) r5, (androidx.navigation.Navigator.Extras) r10)
            r1 = r3
            goto L_0x0156
        L_0x0179:
            androidx.navigation.NavDestination$Companion r5 = androidx.navigation.NavDestination.Companion
            android.content.Context r6 = r7.context
            java.lang.String r5 = r5.getDisplayName(r6, r2)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r13)
            java.lang.StringBuilder r10 = r10.append(r5)
            java.lang.String r13 = " cannot be found from the current destination "
            java.lang.StringBuilder r10 = r10.append(r13)
            androidx.navigation.NavDestination r13 = r26.getCurrentDestination()
            java.lang.StringBuilder r10 = r10.append(r13)
            java.lang.String r10 = r10.toString()
            r6.<init>(r10)
            throw r6
        L_0x01a6:
            r2 = 1
            r7.deepLinkHandled = r2
            return r2
        L_0x01aa:
            r13 = r5
            r17 = r6
            androidx.navigation.NavGraph r2 = r7._graph
            r3 = 0
            int r4 = r0.length
        L_0x01b1:
            if (r3 >= r4) goto L_0x025c
            r5 = r0[r3]
            r6 = r17[r3]
            if (r3 != 0) goto L_0x01be
            androidx.navigation.NavGraph r10 = r7._graph
            androidx.navigation.NavDestination r10 = (androidx.navigation.NavDestination) r10
            goto L_0x01c5
        L_0x01be:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            androidx.navigation.NavDestination r10 = r2.findNode((int) r5)
        L_0x01c5:
            if (r10 == 0) goto L_0x0231
            int r1 = r0.length
            r19 = 1
            int r1 = r1 + -1
            if (r3 == r1) goto L_0x01f9
            boolean r1 = r10 instanceof androidx.navigation.NavGraph
            if (r1 == 0) goto L_0x01f5
            r1 = r10
            androidx.navigation.NavGraph r1 = (androidx.navigation.NavGraph) r1
        L_0x01d5:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.getStartDestinationId()
            androidx.navigation.NavDestination r2 = r1.findNode((int) r2)
            boolean r2 = r2 instanceof androidx.navigation.NavGraph
            if (r2 == 0) goto L_0x01f0
            int r2 = r1.getStartDestinationId()
            androidx.navigation.NavDestination r2 = r1.findNode((int) r2)
            r1 = r2
            androidx.navigation.NavGraph r1 = (androidx.navigation.NavGraph) r1
            goto L_0x01d5
        L_0x01f0:
            r2 = r1
            r20 = r4
            r4 = 0
            goto L_0x022a
        L_0x01f5:
            r20 = r4
            r4 = 0
            goto L_0x022a
        L_0x01f9:
            androidx.navigation.NavOptions$Builder r20 = new androidx.navigation.NavOptions$Builder
            r20.<init>()
            androidx.navigation.NavGraph r1 = r7._graph
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r21 = r1.getId()
            r24 = 4
            r25 = 0
            r22 = 1
            r23 = 0
            androidx.navigation.NavOptions$Builder r1 = androidx.navigation.NavOptions.Builder.setPopUpTo$default((androidx.navigation.NavOptions.Builder) r20, (int) r21, (boolean) r22, (boolean) r23, (int) r24, (java.lang.Object) r25)
            r20 = r4
            r4 = 0
            androidx.navigation.NavOptions$Builder r1 = r1.setEnterAnim(r4)
            androidx.navigation.NavOptions$Builder r1 = r1.setExitAnim(r4)
            androidx.navigation.NavOptions r1 = r1.build()
            r4 = 0
            r7.navigate((androidx.navigation.NavDestination) r10, (android.os.Bundle) r6, (androidx.navigation.NavOptions) r1, (androidx.navigation.Navigator.Extras) r4)
        L_0x022a:
            int r3 = r3 + 1
            r10 = r4
            r4 = r20
            r1 = 0
            goto L_0x01b1
        L_0x0231:
            androidx.navigation.NavDestination$Companion r1 = androidx.navigation.NavDestination.Companion
            android.content.Context r4 = r7.context
            java.lang.String r1 = r1.getDisplayName(r4, r5)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r18 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r13 = " cannot be found in graph "
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x025c:
            r18 = r0
            r0 = 1
            r7.deepLinkHandled = r0
            return r0
        L_0x0262:
            r18 = r0
        L_0x0264:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.handleDeepLink(android.content.Intent):boolean");
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] deepLink) {
        NavDestination node;
        NavGraph graph = this._graph;
        int i = 0;
        int length = deepLink.length;
        while (true) {
            NavDestination navDestination = null;
            if (i >= length) {
                return null;
            }
            int destinationId = deepLink[i];
            if (i == 0) {
                NavGraph navGraph = this._graph;
                Intrinsics.checkNotNull(navGraph);
                if (navGraph.getId() == destinationId) {
                    navDestination = this._graph;
                }
                node = navDestination;
            } else {
                Intrinsics.checkNotNull(graph);
                node = graph.findNode(destinationId);
            }
            if (node == null) {
                return NavDestination.Companion.getDisplayName(this.context, destinationId);
            }
            if (i != deepLink.length - 1 && (node instanceof NavGraph)) {
                NavDestination navDestination2 = node;
                while (true) {
                    graph = (NavGraph) navDestination2;
                    Intrinsics.checkNotNull(graph);
                    if (!(graph.findNode(graph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination2 = graph.findNode(graph.getStartDestinationId());
                }
            }
            i++;
        }
    }

    public NavDestination getCurrentDestination() {
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (currentBackStackEntry != null) {
            return currentBackStackEntry.getDestination();
        }
        return null;
    }

    public final NavDestination findDestination(int destinationId) {
        NavDestination currentNode;
        if (this._graph == null) {
            return null;
        }
        NavGraph navGraph = this._graph;
        Intrinsics.checkNotNull(navGraph);
        if (navGraph.getId() == destinationId) {
            return this._graph;
        }
        NavBackStackEntry lastOrNull = this.backQueue.lastOrNull();
        if (lastOrNull == null || (currentNode = lastOrNull.getDestination()) == null) {
            NavGraph navGraph2 = this._graph;
            Intrinsics.checkNotNull(navGraph2);
            currentNode = navGraph2;
        }
        return findDestinationComprehensive(currentNode, destinationId, false);
    }

    public final NavDestination findDestinationComprehensive(NavDestination $this$findDestinationComprehensive, int destinationId, boolean searchChildren) {
        NavGraph currentGraph;
        Intrinsics.checkNotNullParameter($this$findDestinationComprehensive, "<this>");
        if ($this$findDestinationComprehensive.getId() == destinationId) {
            return $this$findDestinationComprehensive;
        }
        if ($this$findDestinationComprehensive instanceof NavGraph) {
            currentGraph = (NavGraph) $this$findDestinationComprehensive;
        } else {
            currentGraph = $this$findDestinationComprehensive.getParent();
            Intrinsics.checkNotNull(currentGraph);
        }
        return currentGraph.findNodeComprehensive(destinationId, currentGraph, searchChildren);
    }

    public final NavDestination findDestination(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (this._graph == null) {
            return null;
        }
        NavGraph navGraph = this._graph;
        Intrinsics.checkNotNull(navGraph);
        if (!Intrinsics.areEqual((Object) navGraph.getRoute(), (Object) route)) {
            NavGraph navGraph2 = this._graph;
            Intrinsics.checkNotNull(navGraph2);
            if (navGraph2.matchRoute(route) == null) {
                return getTopGraph(this.backQueue).findNode(route);
            }
        }
        return this._graph;
    }

    private final NavGraph getTopGraph(ArrayDeque<NavBackStackEntry> $this$getTopGraph) {
        NavDestination currentNode;
        NavBackStackEntry lastOrNull = $this$getTopGraph.lastOrNull();
        if (lastOrNull == null || (currentNode = lastOrNull.getDestination()) == null) {
            NavGraph navGraph = this._graph;
            Intrinsics.checkNotNull(navGraph);
            currentNode = navGraph;
        }
        if (currentNode instanceof NavGraph) {
            return (NavGraph) currentNode;
        }
        NavGraph parent = currentNode.getParent();
        Intrinsics.checkNotNull(parent);
        return parent;
    }

    private final <T> String generateRouteFilled(T route) {
        NavDestination destination = findDestinationComprehensive(getGraph(), RouteSerializerKt.generateHashCode(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(route.getClass()))), true);
        if (destination != null) {
            Map $this$mapValuesTo$iv$iv = destination.getArguments();
            Map destination$iv$iv = new LinkedHashMap(MapsKt.mapCapacity($this$mapValuesTo$iv$iv.size()));
            for (Object element$iv$iv$iv : $this$mapValuesTo$iv$iv.entrySet()) {
                destination$iv$iv.put(((Map.Entry) element$iv$iv$iv).getKey(), ((NavArgument) ((Map.Entry) element$iv$iv$iv).getValue()).getType());
            }
            return RouteSerializerKt.generateRouteWithArgs(route, destination$iv$iv);
        }
        T t = route;
        throw new IllegalArgumentException(("Destination with route " + Reflection.getOrCreateKotlinClass(route.getClass()).getSimpleName() + " cannot be found in navigation graph " + this._graph).toString());
    }

    public void navigate(int resId) {
        navigate(resId, (Bundle) null);
    }

    public void navigate(int resId, Bundle args) {
        navigate(resId, args, (NavOptions) null);
    }

    public void navigate(int resId, Bundle args, NavOptions navOptions) {
        navigate(resId, args, navOptions, (Navigator.Extras) null);
    }

    public void navigate(int resId, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        int destId;
        NavOptions finalNavOptions;
        Bundle combinedArgs;
        int i = resId;
        Bundle bundle = args;
        NavOptions finalNavOptions2 = navOptions;
        NavDestination destination = this.backQueue.isEmpty() ? this._graph : this.backQueue.last().getDestination();
        if (destination != null) {
            NavDestination currentNode = destination;
            int destId2 = resId;
            NavAction navAction = currentNode.getAction(i);
            Bundle combinedArgs2 = null;
            if (navAction != null) {
                if (finalNavOptions2 == null) {
                    finalNavOptions2 = navAction.getNavOptions();
                }
                int destId3 = navAction.getDestinationId();
                Bundle navActionArgs = navAction.getDefaultArguments();
                if (navActionArgs != null) {
                    combinedArgs2 = new Bundle();
                    combinedArgs2.putAll(navActionArgs);
                    finalNavOptions = finalNavOptions2;
                    destId = destId3;
                } else {
                    finalNavOptions = finalNavOptions2;
                    destId = destId3;
                }
            } else {
                finalNavOptions = finalNavOptions2;
                destId = destId2;
            }
            if (bundle != null) {
                if (combinedArgs2 == null) {
                    combinedArgs2 = new Bundle();
                }
                combinedArgs2.putAll(bundle);
                combinedArgs = combinedArgs2;
            } else {
                combinedArgs = combinedArgs2;
            }
            if (destId != 0 || finalNavOptions == null || (finalNavOptions.getPopUpToId() == -1 && finalNavOptions.getPopUpToRoute() == null && finalNavOptions.getPopUpToRouteClass() == null)) {
                boolean z = true;
                if (destId != 0) {
                    NavDestination node = findDestination(destId);
                    if (node == null) {
                        String dest = NavDestination.Companion.getDisplayName(this.context, destId);
                        if (navAction != null) {
                            z = false;
                        }
                        if (!z) {
                            throw new IllegalArgumentException(("Navigation destination " + dest + " referenced from action " + NavDestination.Companion.getDisplayName(this.context, i) + " cannot be found from the current destination " + currentNode).toString());
                        }
                        throw new IllegalArgumentException("Navigation action/destination " + dest + " cannot be found from the current destination " + currentNode);
                    }
                    navigate(node, combinedArgs, finalNavOptions, navigatorExtras);
                    return;
                }
                Navigator.Extras extras = navigatorExtras;
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            } else if (finalNavOptions.getPopUpToRoute() != null) {
                String popUpToRoute = finalNavOptions.getPopUpToRoute();
                Intrinsics.checkNotNull(popUpToRoute);
                popBackStack$default(this, popUpToRoute, finalNavOptions.isPopUpToInclusive(), false, 4, (Object) null);
            } else if (finalNavOptions.getPopUpToRouteClass() != null) {
                KClass<?> popUpToRouteClass = finalNavOptions.getPopUpToRouteClass();
                Intrinsics.checkNotNull(popUpToRouteClass);
                popBackStack(RouteSerializerKt.generateHashCode(SerializersKt.serializer(popUpToRouteClass)), finalNavOptions.isPopUpToInclusive());
            } else if (finalNavOptions.getPopUpToId() != -1) {
                popBackStack(finalNavOptions.getPopUpToId(), finalNavOptions.isPopUpToInclusive());
            }
        } else {
            Navigator.Extras extras2 = navigatorExtras;
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
    }

    public void navigate(Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, (String) null, (String) null));
    }

    public void navigate(Uri deepLink, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, (String) null, (String) null), navOptions, (Navigator.Extras) null);
    }

    public void navigate(Uri deepLink, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, (String) null, (String) null), navOptions, navigatorExtras);
    }

    public void navigate(NavDeepLinkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        navigate(request, (NavOptions) null);
    }

    public void navigate(NavDeepLinkRequest request, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(request, "request");
        navigate(request, navOptions, (Navigator.Extras) null);
    }

    public void navigate(NavDeepLinkRequest request, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this._graph != null) {
            NavGraph currGraph = getTopGraph(this.backQueue);
            NavDestination.DeepLinkMatch deepLinkMatch = currGraph.matchDeepLinkComprehensive(request, true, true, currGraph);
            if (deepLinkMatch != null) {
                Bundle args = deepLinkMatch.getDestination().addInDefaultArgs(deepLinkMatch.getMatchingArgs());
                if (args == null) {
                    args = new Bundle();
                }
                NavDestination node = deepLinkMatch.getDestination();
                Intent intent = new Intent();
                Intent $this$navigate_u24lambda_u2438 = intent;
                $this$navigate_u24lambda_u2438.setDataAndType(request.getUri(), request.getMimeType());
                $this$navigate_u24lambda_u2438.setAction(request.getAction());
                args.putParcelable(KEY_DEEP_LINK_INTENT, intent);
                navigate(node, args, navOptions, navigatorExtras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015d A[LOOP:1: B:45:0x0157->B:47:0x015d, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void navigate(androidx.navigation.NavDestination r22, android.os.Bundle r23, androidx.navigation.NavOptions r24, androidx.navigation.Navigator.Extras r25) {
        /*
            r21 = this;
            r6 = r21
            r7 = r24
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r0 = r6.navigatorState
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L_0x0011:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x0025
            java.lang.Object r3 = r2.next()
            r5 = r3
            androidx.navigation.NavController$NavControllerNavigatorState r5 = (androidx.navigation.NavController.NavControllerNavigatorState) r5
            r8 = 0
            r5.setNavigating(r4)
            goto L_0x0011
        L_0x0025:
            r0 = 0
            r1 = 0
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef
            r2.<init>()
            r8 = r2
            if (r7 == 0) goto L_0x00ab
            java.lang.String r2 = r24.getPopUpToRoute()
            if (r2 == 0) goto L_0x004e
            java.lang.String r2 = r24.getPopUpToRoute()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            boolean r3 = r24.isPopUpToInclusive()
            boolean r5 = r24.shouldPopUpToSaveState()
            boolean r2 = r6.popBackStackInternal((java.lang.String) r2, (boolean) r3, (boolean) r5)
            r0 = r2
            r9 = r0
            goto L_0x00ac
        L_0x004e:
            kotlin.reflect.KClass r2 = r24.getPopUpToRouteClass()
            if (r2 == 0) goto L_0x0073
            kotlin.reflect.KClass r2 = r24.getPopUpToRouteClass()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            kotlinx.serialization.KSerializer r2 = kotlinx.serialization.SerializersKt.serializer(r2)
            int r2 = androidx.navigation.serialization.RouteSerializerKt.generateHashCode(r2)
            boolean r3 = r24.isPopUpToInclusive()
            boolean r5 = r24.shouldPopUpToSaveState()
            boolean r2 = r6.popBackStackInternal((int) r2, (boolean) r3, (boolean) r5)
            r0 = r2
            r9 = r0
            goto L_0x00ac
        L_0x0073:
            java.lang.Object r2 = r24.getPopUpToRouteObject()
            if (r2 == 0) goto L_0x0090
            java.lang.Object r2 = r24.getPopUpToRouteObject()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            boolean r3 = r24.isPopUpToInclusive()
            boolean r5 = r24.shouldPopUpToSaveState()
            boolean r2 = r6.popBackStackInternal(r2, (boolean) r3, (boolean) r5)
            r0 = r2
            r9 = r0
            goto L_0x00ac
        L_0x0090:
            int r2 = r24.getPopUpToId()
            r3 = -1
            if (r2 == r3) goto L_0x00ab
            int r2 = r24.getPopUpToId()
            boolean r3 = r24.isPopUpToInclusive()
            boolean r5 = r24.shouldPopUpToSaveState()
            boolean r2 = r6.popBackStackInternal((int) r2, (boolean) r3, (boolean) r5)
            r0 = r2
            r9 = r0
            goto L_0x00ac
        L_0x00ab:
            r9 = r0
        L_0x00ac:
            android.os.Bundle r5 = r22.addInDefaultArgs(r23)
            r3 = 0
            if (r7 == 0) goto L_0x00bb
            boolean r0 = r24.shouldRestoreState()
            if (r0 != r4) goto L_0x00bb
            r0 = r4
            goto L_0x00bc
        L_0x00bb:
            r0 = r3
        L_0x00bc:
            if (r0 == 0) goto L_0x00e0
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r6.backStackMap
            int r2 = r22.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x00e0
            int r0 = r22.getId()
            r2 = r25
            boolean r0 = r6.restoreStateInternal(r0, r5, r7, r2)
            r8.element = r0
            r11 = r22
            r13 = r3
            r14 = r5
            goto L_0x0147
        L_0x00e0:
            r2 = r25
            if (r7 == 0) goto L_0x00ec
            boolean r0 = r24.shouldLaunchSingleTop()
            if (r0 != r4) goto L_0x00ec
            r0 = r4
            goto L_0x00ed
        L_0x00ec:
            r0 = r3
        L_0x00ed:
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r21.launchSingleTopInternal(r22, r23)
            if (r0 == 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r4 = r3
        L_0x00f7:
            r20 = r4
            if (r20 != 0) goto L_0x0141
            androidx.navigation.NavBackStackEntry$Companion r10 = androidx.navigation.NavBackStackEntry.Companion
            android.content.Context r11 = r6.context
            androidx.lifecycle.Lifecycle$State r14 = r21.getHostLifecycleState$navigation_runtime_release()
            androidx.navigation.NavControllerViewModel r0 = r6.viewModel
            r15 = r0
            androidx.navigation.NavViewModelStoreProvider r15 = (androidx.navigation.NavViewModelStoreProvider) r15
            r18 = 96
            r19 = 0
            r16 = 0
            r17 = 0
            r12 = r22
            r13 = r5
            androidx.navigation.NavBackStackEntry r0 = androidx.navigation.NavBackStackEntry.Companion.create$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r10 = r0
            androidx.navigation.NavigatorProvider r0 = r6._navigatorProvider
            java.lang.String r1 = r22.getNavigatorName()
            androidx.navigation.Navigator r1 = r0.getNavigator((java.lang.String) r1)
            java.util.List r4 = kotlin.collections.CollectionsKt.listOf(r10)
            androidx.navigation.NavController$navigate$5 r0 = new androidx.navigation.NavController$navigate$5
            r11 = r22
            r0.<init>(r8, r6, r11, r5)
            r12 = r0
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r0 = r21
            r2 = r4
            r13 = r3
            r3 = r24
            r4 = r25
            r14 = r5
            r5 = r12
            r0.navigateInternal(r1, r2, r3, r4, r5)
            goto L_0x0145
        L_0x0141:
            r11 = r22
            r13 = r3
            r14 = r5
        L_0x0145:
            r1 = r20
        L_0x0147:
            r21.updateOnBackPressedCallbackEnabled()
            java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, androidx.navigation.NavController$NavControllerNavigatorState> r0 = r6.navigatorState
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = 0
            java.util.Iterator r3 = r0.iterator()
        L_0x0157:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x016a
            java.lang.Object r4 = r3.next()
            r5 = r4
            androidx.navigation.NavController$NavControllerNavigatorState r5 = (androidx.navigation.NavController.NavControllerNavigatorState) r5
            r10 = 0
            r5.setNavigating(r13)
            goto L_0x0157
        L_0x016a:
            if (r9 != 0) goto L_0x0178
            boolean r0 = r8.element
            if (r0 != 0) goto L_0x0178
            if (r1 == 0) goto L_0x0174
            goto L_0x0178
        L_0x0174:
            r21.updateBackStackLifecycle$navigation_runtime_release()
            goto L_0x017b
        L_0x0178:
            r21.dispatchOnDestinationChanged()
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00af, code lost:
        r4 = r2.getDestination();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean launchSingleTopInternal(androidx.navigation.NavDestination r18, android.os.Bundle r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.navigation.NavBackStackEntry r2 = r17.getCurrentBackStackEntry()
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r3 = r0.backQueue
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r5 = r3.size()
            java.util.ListIterator r5 = r3.listIterator(r5)
        L_0x0015:
            boolean r6 = r5.hasPrevious()
            r7 = -1
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L_0x0035
            java.lang.Object r6 = r5.previous()
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r10 = 0
            androidx.navigation.NavDestination r11 = r6.getDestination()
            if (r11 != r1) goto L_0x002d
            r6 = r8
            goto L_0x002e
        L_0x002d:
            r6 = r9
        L_0x002e:
            if (r6 == 0) goto L_0x0015
            int r6 = r5.nextIndex()
            goto L_0x0036
        L_0x0035:
            r6 = r7
        L_0x0036:
            r3 = r6
            if (r3 != r7) goto L_0x003a
            return r9
        L_0x003a:
            boolean r4 = r1 instanceof androidx.navigation.NavGraph
            if (r4 == 0) goto L_0x00ad
            androidx.navigation.NavGraph$Companion r4 = androidx.navigation.NavGraph.Companion
            r5 = r1
            androidx.navigation.NavGraph r5 = (androidx.navigation.NavGraph) r5
            kotlin.sequences.Sequence r4 = r4.childHierarchy(r5)
            androidx.navigation.NavController$launchSingleTopInternal$childHierarchyId$1 r5 = androidx.navigation.NavController$launchSingleTopInternal$childHierarchyId$1.INSTANCE
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.map(r4, r5)
            java.util.List r4 = kotlin.sequences.SequencesKt.toList(r4)
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r5 = r0.backQueue
            int r5 = r5.size()
            int r5 = r5 - r3
            int r6 = r4.size()
            if (r5 == r6) goto L_0x0061
            return r9
        L_0x0061:
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r5 = r0.backQueue
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r6 = r0.backQueue
            int r6 = r6.size()
            java.util.List r5 = r5.subList(r3, r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r10 = 10
            int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r10)
            r7.<init>(r10)
            java.util.Collection r7 = (java.util.Collection) r7
            r10 = r5
            r11 = 0
            java.util.Iterator r12 = r10.iterator()
        L_0x0083:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00a1
            java.lang.Object r13 = r12.next()
            r14 = r13
            androidx.navigation.NavBackStackEntry r14 = (androidx.navigation.NavBackStackEntry) r14
            r15 = 0
            androidx.navigation.NavDestination r16 = r14.getDestination()
            int r14 = r16.getId()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r7.add(r14)
            goto L_0x0083
        L_0x00a1:
            java.util.List r7 = (java.util.List) r7
            r5 = r7
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)
            if (r6 != 0) goto L_0x00c5
            return r9
        L_0x00ad:
            if (r2 == 0) goto L_0x00c1
            androidx.navigation.NavDestination r4 = r2.getDestination()
            if (r4 == 0) goto L_0x00c1
            int r5 = r18.getId()
            int r4 = r4.getId()
            if (r5 != r4) goto L_0x00c1
            r4 = r8
            goto L_0x00c2
        L_0x00c1:
            r4 = r9
        L_0x00c2:
            if (r4 != 0) goto L_0x00c5
            return r9
        L_0x00c5:
            kotlin.collections.ArrayDeque r4 = new kotlin.collections.ArrayDeque
            r4.<init>()
        L_0x00ca:
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r5 = r0.backQueue
            java.util.List r5 = (java.util.List) r5
            int r5 = kotlin.collections.CollectionsKt.getLastIndex(r5)
            if (r5 < r3) goto L_0x00f4
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r5 = r0.backQueue
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = kotlin.collections.CollectionsKt.removeLast(r5)
            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
            r0.unlinkChildFromParent$navigation_runtime_release(r5)
            androidx.navigation.NavBackStackEntry r6 = new androidx.navigation.NavBackStackEntry
            androidx.navigation.NavDestination r7 = r5.getDestination()
            r9 = r19
            android.os.Bundle r7 = r7.addInDefaultArgs(r9)
            r6.<init>(r5, r7)
            r4.addFirst(r6)
            goto L_0x00ca
        L_0x00f4:
            r9 = r19
            r5 = r4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L_0x00fe:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0129
            java.lang.Object r10 = r7.next()
            r11 = r10
            androidx.navigation.NavBackStackEntry r11 = (androidx.navigation.NavBackStackEntry) r11
            r12 = 0
            androidx.navigation.NavDestination r13 = r11.getDestination()
            androidx.navigation.NavGraph r13 = r13.getParent()
            if (r13 == 0) goto L_0x0121
            int r14 = r13.getId()
            androidx.navigation.NavBackStackEntry r14 = r0.getBackStackEntry((int) r14)
            r0.linkChildToParent(r11, r14)
        L_0x0121:
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r14 = r0.backQueue
            r14.add(r11)
            goto L_0x00fe
        L_0x0129:
            r5 = r4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L_0x0132:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0155
            java.lang.Object r10 = r7.next()
            r11 = r10
            androidx.navigation.NavBackStackEntry r11 = (androidx.navigation.NavBackStackEntry) r11
            r12 = 0
            androidx.navigation.NavigatorProvider r13 = r0._navigatorProvider
            androidx.navigation.NavDestination r14 = r11.getDestination()
            java.lang.String r14 = r14.getNavigatorName()
            androidx.navigation.Navigator r13 = r13.getNavigator((java.lang.String) r14)
            r13.onLaunchSingleTop(r11)
            goto L_0x0132
        L_0x0155:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.launchSingleTopInternal(androidx.navigation.NavDestination, android.os.Bundle):boolean");
    }

    private final boolean restoreStateInternal(int id, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(id))) {
            return false;
        }
        String backStackId = this.backStackMap.get(Integer.valueOf(id));
        CollectionsKt.removeAll(this.backStackMap.values(), new NavController$restoreStateInternal$1(backStackId));
        return executeRestoreState(instantiateBackStack((ArrayDeque) TypeIntrinsics.asMutableMap(this.backStackStates).remove(backStackId)), args, navOptions, navigatorExtras);
    }

    private final boolean restoreStateInternal(String route) {
        NavBackStackEntryState navBackStackEntryState;
        int id = NavDestination.Companion.createRoute(route).hashCode();
        if (this.backStackMap.containsKey(Integer.valueOf(id))) {
            return restoreStateInternal(id, (Bundle) null, (NavOptions) null, (Navigator.Extras) null);
        }
        NavDestination matchingDestination = findDestination(route);
        if (matchingDestination != null) {
            String backStackId = this.backStackMap.get(Integer.valueOf(matchingDestination.getId()));
            CollectionsKt.removeAll(this.backStackMap.values(), new NavController$restoreStateInternal$3(backStackId));
            ArrayDeque backStackState = (ArrayDeque) TypeIntrinsics.asMutableMap(this.backStackStates).remove(backStackId);
            NavDestination.DeepLinkMatch matchingDeepLink = matchingDestination.matchRoute(route);
            Intrinsics.checkNotNull(matchingDeepLink);
            if (!matchingDeepLink.hasMatchingArgs((backStackState == null || (navBackStackEntryState = (NavBackStackEntryState) backStackState.firstOrNull()) == null) ? null : navBackStackEntryState.getArgs())) {
                return false;
            }
            return executeRestoreState(instantiateBackStack(backStackState), (Bundle) null, (NavOptions) null, (Navigator.Extras) null);
        }
        throw new IllegalStateException(("Restore State failed: route " + route + " cannot be found from the current destination " + getCurrentDestination()).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        r8 = (r8 = (androidx.navigation.NavBackStackEntry) kotlin.collections.CollectionsKt.last(r7)).getDestination();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean executeRestoreState(java.util.List<androidx.navigation.NavBackStackEntry> r17, android.os.Bundle r18, androidx.navigation.NavOptions r19, androidx.navigation.Navigator.Extras r20) {
        /*
            r16 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1 = r17
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = r1
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L_0x001a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0034
            java.lang.Object r7 = r6.next()
            r8 = r7
            androidx.navigation.NavBackStackEntry r8 = (androidx.navigation.NavBackStackEntry) r8
            r9 = 0
            androidx.navigation.NavDestination r10 = r8.getDestination()
            boolean r8 = r10 instanceof androidx.navigation.NavGraph
            if (r8 != 0) goto L_0x001a
            r3.add(r7)
            goto L_0x001a
        L_0x0034:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r1 = r3
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        L_0x0040:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0092
            java.lang.Object r4 = r3.next()
            r5 = r4
            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
            r6 = 0
            java.lang.Object r7 = kotlin.collections.CollectionsKt.lastOrNull(r0)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0069
            java.lang.Object r8 = kotlin.collections.CollectionsKt.last(r7)
            androidx.navigation.NavBackStackEntry r8 = (androidx.navigation.NavBackStackEntry) r8
            if (r8 == 0) goto L_0x0069
            androidx.navigation.NavDestination r8 = r8.getDestination()
            if (r8 == 0) goto L_0x0069
            java.lang.String r8 = r8.getNavigatorName()
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            androidx.navigation.NavDestination r9 = r5.getDestination()
            java.lang.String r9 = r9.getNavigatorName()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x007f
            r9 = r7
            java.util.Collection r9 = (java.util.Collection) r9
            r9.add(r5)
            goto L_0x008f
        L_0x007f:
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            r10 = 1
            androidx.navigation.NavBackStackEntry[] r10 = new androidx.navigation.NavBackStackEntry[r10]
            r11 = 0
            r10[r11] = r5
            java.util.List r10 = kotlin.collections.CollectionsKt.mutableListOf(r10)
            r9.add(r10)
        L_0x008f:
            goto L_0x0040
        L_0x0092:
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            r7 = r1
            java.util.Iterator r8 = r0.iterator()
        L_0x009d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r1 = r8.next()
            r15 = r1
            java.util.List r15 = (java.util.List) r15
            r14 = r16
            androidx.navigation.NavigatorProvider r1 = r14._navigatorProvider
            java.lang.Object r2 = kotlin.collections.CollectionsKt.first(r15)
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.navigation.NavDestination r2 = r2.getDestination()
            java.lang.String r2 = r2.getNavigatorName()
            androidx.navigation.Navigator r10 = r1.getNavigator((java.lang.String) r2)
            kotlin.jvm.internal.Ref$IntRef r4 = new kotlin.jvm.internal.Ref$IntRef
            r4.<init>()
            androidx.navigation.NavController$executeRestoreState$3 r9 = new androidx.navigation.NavController$executeRestoreState$3
            r1 = r9
            r2 = r7
            r3 = r17
            r5 = r16
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r9
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r9 = r16
            r11 = r15
            r12 = r19
            r13 = r20
            r14 = r1
            r9.navigateInternal(r10, r11, r12, r13, r14)
            goto L_0x009d
        L_0x00e2:
            boolean r1 = r7.element
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.executeRestoreState(java.util.List, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):boolean");
    }

    private final List<NavBackStackEntry> instantiateBackStack(ArrayDeque<NavBackStackEntryState> backStackState) {
        NavDestination navDestination;
        List<NavBackStackEntry> arrayList = new ArrayList<>();
        NavBackStackEntry lastOrNull = this.backQueue.lastOrNull();
        if (lastOrNull == null || (navDestination = lastOrNull.getDestination()) == null) {
            navDestination = getGraph();
        }
        NavDestination navDestination2 = navDestination;
        if (backStackState != null) {
            for (NavBackStackEntryState state : backStackState) {
                NavDestination node = findDestinationComprehensive(navDestination2, state.getDestinationId(), true);
                if (node != null) {
                    arrayList.add(state.instantiate(this.context, node, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                    navDestination2 = node;
                } else {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.Companion.getDisplayName(this.context, state.getDestinationId()) + " cannot be found from the current destination " + navDestination2).toString());
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ void addEntryToBackStack$default(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                list = CollectionsKt.emptyList();
            }
            navController.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    /* access modifiers changed from: private */
    public final void addEntryToBackStack(NavDestination node, Bundle finalArgs, NavBackStackEntry backStackEntry, List<NavBackStackEntry> restoredEntries) {
        NavDestination newDest;
        Bundle bundle;
        NavBackStackEntry navBackStackEntry;
        ArrayDeque<NavBackStackEntry> hierarchy;
        Object element$iv;
        NavGraph parent;
        Object element$iv2;
        Bundle bundle2;
        NavBackStackEntry navBackStackEntry2;
        NavDestination navDestination = node;
        Bundle bundle3 = finalArgs;
        NavBackStackEntry navBackStackEntry3 = backStackEntry;
        NavDestination newDest2 = backStackEntry.getDestination();
        if (!(newDest2 instanceof FloatingWindow)) {
            while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof FloatingWindow)) {
                if (!popBackStackInternal$default(this, this.backQueue.last().getDestination().getId(), true, false, 4, (Object) null)) {
                    break;
                }
            }
        }
        ArrayDeque hierarchy2 = new ArrayDeque();
        NavDestination destination = newDest2;
        NavBackStackEntry navBackStackEntry4 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination destination2 = destination;
            while (true) {
                Intrinsics.checkNotNull(destination2);
                NavGraph parent2 = destination2.getParent();
                if (parent2 != null) {
                    List $this$lastOrNull$iv = restoredEntries;
                    ListIterator iterator$iv = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
                    while (true) {
                        if (!iterator$iv.hasPrevious()) {
                            element$iv2 = null;
                            break;
                        }
                        element$iv2 = iterator$iv.previous();
                        if (Intrinsics.areEqual((Object) ((NavBackStackEntry) element$iv2).getDestination(), (Object) parent2)) {
                            break;
                        }
                    }
                    NavBackStackEntry entry = (NavBackStackEntry) element$iv2;
                    if (entry == null) {
                        newDest = newDest2;
                        navBackStackEntry2 = navBackStackEntry3;
                        bundle2 = bundle3;
                        entry = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.context, parent2, finalArgs, getHostLifecycleState$navigation_runtime_release(), this.viewModel, (String) null, (Bundle) null, 96, (Object) null);
                    } else {
                        newDest = newDest2;
                        navBackStackEntry2 = navBackStackEntry3;
                        bundle2 = bundle3;
                    }
                    hierarchy2.addFirst(entry);
                    if (this.backQueue.isEmpty() || this.backQueue.last().getDestination() != parent2) {
                        navBackStackEntry = navBackStackEntry2;
                        bundle = bundle2;
                        parent = parent2;
                        hierarchy = hierarchy2;
                    } else {
                        navBackStackEntry = navBackStackEntry2;
                        bundle = bundle2;
                        parent = parent2;
                        hierarchy = hierarchy2;
                        popEntryFromBackStack$default(this, this.backQueue.last(), false, (ArrayDeque) null, 6, (Object) null);
                    }
                } else {
                    parent = parent2;
                    hierarchy = hierarchy2;
                    newDest = newDest2;
                    navBackStackEntry = navBackStackEntry3;
                    bundle = bundle3;
                }
                NavDestination destination3 = parent;
                if (destination3 == null || destination3 == navDestination) {
                    break;
                }
                destination2 = destination3;
                hierarchy2 = hierarchy;
                navBackStackEntry3 = navBackStackEntry;
                bundle3 = bundle;
                newDest2 = newDest;
            }
        } else {
            hierarchy = hierarchy2;
            newDest = newDest2;
            navBackStackEntry = navBackStackEntry3;
            bundle = bundle3;
        }
        NavDestination destination4 = hierarchy.isEmpty() ? newDest : ((NavBackStackEntry) hierarchy.first()).getDestination();
        while (destination4 != null && findDestination(destination4.getId()) != destination4) {
            NavGraph parent3 = destination4.getParent();
            if (parent3 != null) {
                boolean z = false;
                if (bundle != null && finalArgs.isEmpty()) {
                    z = true;
                }
                Bundle args = z ? null : bundle;
                List $this$lastOrNull$iv2 = restoredEntries;
                ListIterator iterator$iv2 = $this$lastOrNull$iv2.listIterator($this$lastOrNull$iv2.size());
                while (true) {
                    if (!iterator$iv2.hasPrevious()) {
                        element$iv = null;
                        break;
                    }
                    element$iv = iterator$iv2.previous();
                    if (Intrinsics.areEqual((Object) ((NavBackStackEntry) element$iv).getDestination(), (Object) parent3)) {
                        break;
                    }
                }
                NavBackStackEntry entry2 = (NavBackStackEntry) element$iv;
                if (entry2 == null) {
                    entry2 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.context, parent3, parent3.addInDefaultArgs(args), getHostLifecycleState$navigation_runtime_release(), this.viewModel, (String) null, (Bundle) null, 96, (Object) null);
                }
                hierarchy.addFirst(entry2);
            }
            destination4 = parent3;
        }
        NavDestination overlappingDestination = hierarchy.isEmpty() ? newDest : ((NavBackStackEntry) hierarchy.first()).getDestination();
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof NavGraph)) {
            NavDestination destination5 = this.backQueue.last().getDestination();
            Intrinsics.checkNotNull(destination5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((NavGraph) destination5).getNodes().get(overlappingDestination.getId()) != null) {
                break;
            }
            popEntryFromBackStack$default(this, this.backQueue.last(), false, (ArrayDeque) null, 6, (Object) null);
        }
        NavBackStackEntry firstEntry = this.backQueue.firstOrNull();
        if (firstEntry == null) {
            firstEntry = (NavBackStackEntry) hierarchy.firstOrNull();
        }
        if (!Intrinsics.areEqual((Object) firstEntry != null ? firstEntry.getDestination() : null, (Object) this._graph)) {
            List $this$lastOrNull$iv3 = restoredEntries;
            ListIterator iterator$iv3 = $this$lastOrNull$iv3.listIterator($this$lastOrNull$iv3.size());
            while (true) {
                if (!iterator$iv3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry restoredEntry = iterator$iv3.previous();
                NavDestination destination6 = restoredEntry.getDestination();
                NavGraph navGraph = this._graph;
                Intrinsics.checkNotNull(navGraph);
                if (Intrinsics.areEqual((Object) destination6, (Object) navGraph)) {
                    navBackStackEntry4 = restoredEntry;
                    break;
                }
            }
            NavBackStackEntry entry3 = navBackStackEntry4;
            if (entry3 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.Companion;
                Context context2 = this.context;
                NavGraph navGraph2 = this._graph;
                Intrinsics.checkNotNull(navGraph2);
                NavGraph navGraph3 = this._graph;
                Intrinsics.checkNotNull(navGraph3);
                entry3 = NavBackStackEntry.Companion.create$default(companion, context2, navGraph2, navGraph3.addInDefaultArgs(bundle), getHostLifecycleState$navigation_runtime_release(), this.viewModel, (String) null, (Bundle) null, 96, (Object) null);
            }
            hierarchy.addFirst(entry3);
        }
        for (NavBackStackEntry entry4 : hierarchy) {
            NavControllerNavigatorState navigatorBackStack = this.navigatorState.get(this._navigatorProvider.getNavigator(entry4.getDestination().getNavigatorName()));
            if (navigatorBackStack != null) {
                navigatorBackStack.addInternal(entry4);
            } else {
                NavBackStackEntry navBackStackEntry5 = firstEntry;
                throw new IllegalStateException(("NavigatorBackStack for " + node.getNavigatorName() + " should already be created").toString());
            }
        }
        this.backQueue.addAll(hierarchy);
        this.backQueue.add(navBackStackEntry);
        for (NavBackStackEntry it : CollectionsKt.plus(hierarchy, navBackStackEntry)) {
            NavGraph parent4 = it.getDestination().getParent();
            if (parent4 != null) {
                linkChildToParent(it, getBackStackEntry(parent4.getId()));
            }
        }
    }

    public void navigate(NavDirections directions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null);
    }

    public void navigate(NavDirections directions, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), navOptions);
    }

    public void navigate(NavDirections directions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        Intrinsics.checkNotNullParameter(navigatorExtras, "navigatorExtras");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null, navigatorExtras);
    }

    public final void navigate(String route, Function1<? super NavOptionsBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        navigate$default(this, route, NavOptionsBuilderKt.navOptions(builder), (Navigator.Extras) null, 4, (Object) null);
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                navOptions = null;
            }
            if ((i & 4) != 0) {
                extras = null;
            }
            navController.navigate(str, navOptions, extras);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
    }

    public final void navigate(String route, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (this._graph != null) {
            NavGraph currGraph = getTopGraph(this.backQueue);
            NavDestination.DeepLinkMatch deepLinkMatch = currGraph.matchRouteComprehensive(route, true, true, currGraph);
            if (deepLinkMatch != null) {
                NavDestination destination = deepLinkMatch.getDestination();
                Bundle args = destination.addInDefaultArgs(deepLinkMatch.getMatchingArgs());
                if (args == null) {
                    args = new Bundle();
                }
                NavDestination node = deepLinkMatch.getDestination();
                Intent intent = new Intent();
                Intent $this$navigate_u24lambda_u2457 = intent;
                Uri parse = Uri.parse(NavDestination.Companion.createRoute(destination.getRoute()));
                Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(this)");
                $this$navigate_u24lambda_u2457.setDataAndType(parse, (String) null);
                $this$navigate_u24lambda_u2457.setAction((String) null);
                args.putParcelable(KEY_DEEP_LINK_INTENT, intent);
                navigate(node, args, navOptions, navigatorExtras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches route " + route + " cannot be found in the navigation graph " + this._graph);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    public final void navigate(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate$default(this, route, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public final void navigate(String route, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate$default(this, route, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    public final <T> void navigate(T route, Function1<? super NavOptionsBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        navigate$default(this, (Object) route, NavOptionsBuilderKt.navOptions(builder), (Navigator.Extras) null, 4, (Object) null);
    }

    public static /* synthetic */ void navigate$default(NavController navController, Object obj, NavOptions navOptions, Navigator.Extras extras, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                navOptions = null;
            }
            if ((i & 4) != 0) {
                extras = null;
            }
            navController.navigate(obj, navOptions, extras);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
    }

    public final <T> void navigate(T route, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate(generateRouteFilled(route), navOptions, navigatorExtras);
    }

    public final <T> void navigate(T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate$default(this, (Object) route, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public final <T> void navigate(T route, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(route, "route");
        navigate$default(this, (Object) route, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.navigation.NavBackStackEntryState} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle saveState() {
        /*
            r17 = this;
            r0 = r17
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            androidx.navigation.NavigatorProvider r4 = r0._navigatorProvider
            java.util.Map r4 = r4.getNavigators()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x001b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0040
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            androidx.navigation.Navigator r5 = (androidx.navigation.Navigator) r5
            android.os.Bundle r7 = r5.onSaveState()
            if (r7 == 0) goto L_0x001b
            r2.add(r6)
            r3.putBundle(r6, r7)
            goto L_0x001b
        L_0x0040:
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0059
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r1 = r4
            java.lang.String r4 = "android-support-nav:controller:navigatorState:names"
            r3.putStringArrayList(r4, r2)
            java.lang.String r4 = "android-support-nav:controller:navigatorState"
            r1.putBundle(r4, r3)
        L_0x0059:
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r4 = r0.backQueue
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0096
            if (r1 != 0) goto L_0x006b
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r1 = r4
        L_0x006b:
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r4 = r0.backQueue
            int r4 = r4.size()
            android.os.Parcelable[] r4 = new android.os.Parcelable[r4]
            r5 = 0
            kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntry> r6 = r0.backQueue
            java.util.Iterator r6 = r6.iterator()
        L_0x007a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0091
            java.lang.Object r7 = r6.next()
            androidx.navigation.NavBackStackEntry r7 = (androidx.navigation.NavBackStackEntry) r7
            int r8 = r5 + 1
            androidx.navigation.NavBackStackEntryState r9 = new androidx.navigation.NavBackStackEntryState
            r9.<init>((androidx.navigation.NavBackStackEntry) r7)
            r4[r5] = r9
            r5 = r8
            goto L_0x007a
        L_0x0091:
            java.lang.String r6 = "android-support-nav:controller:backStack"
            r1.putParcelableArray(r6, r4)
        L_0x0096:
            java.util.Map<java.lang.Integer, java.lang.String> r4 = r0.backStackMap
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x00f0
            if (r1 != 0) goto L_0x00a6
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r1 = r4
        L_0x00a6:
            java.util.Map<java.lang.Integer, java.lang.String> r4 = r0.backStackMap
            int r4 = r4.size()
            int[] r4 = new int[r4]
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            java.util.Map<java.lang.Integer, java.lang.String> r7 = r0.backStackMap
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00be:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e6
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            int r10 = r6 + 1
            r4[r6] = r9
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            r6.add(r8)
            r6 = r10
            goto L_0x00be
        L_0x00e6:
            java.lang.String r7 = "android-support-nav:controller:backStackDestIds"
            r1.putIntArray(r7, r4)
            java.lang.String r7 = "android-support-nav:controller:backStackIds"
            r1.putStringArrayList(r7, r5)
        L_0x00f0:
            java.util.Map<java.lang.String, kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntryState>> r4 = r0.backStackStates
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0174
            if (r1 != 0) goto L_0x0100
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r1 = r4
        L_0x0100:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Map<java.lang.String, kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntryState>> r5 = r0.backStackStates
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x010f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x016f
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            kotlin.collections.ArrayDeque r6 = (kotlin.collections.ArrayDeque) r6
            r8 = r4
            java.util.Collection r8 = (java.util.Collection) r8
            r8.add(r7)
            int r8 = r6.size()
            android.os.Parcelable[] r8 = new android.os.Parcelable[r8]
            r9 = r6
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            r11 = 0
            java.util.Iterator r12 = r9.iterator()
        L_0x013c:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0157
            java.lang.Object r13 = r12.next()
            int r14 = r11 + 1
            if (r11 >= 0) goto L_0x014d
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x014d:
            r15 = r13
            androidx.navigation.NavBackStackEntryState r15 = (androidx.navigation.NavBackStackEntryState) r15
            r16 = 0
            r8[r11] = r15
            r11 = r14
            goto L_0x013c
        L_0x0157:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "android-support-nav:controller:backStackStates:"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.String r9 = r9.toString()
            r1.putParcelableArray(r9, r8)
            goto L_0x010f
        L_0x016f:
            java.lang.String r5 = "android-support-nav:controller:backStackStates"
            r1.putStringArrayList(r5, r4)
        L_0x0174:
            boolean r4 = r0.deepLinkHandled
            if (r4 == 0) goto L_0x0187
            if (r1 != 0) goto L_0x0180
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r1 = r4
        L_0x0180:
            java.lang.String r4 = "android-support-nav:controller:deepLinkHandled"
            boolean r5 = r0.deepLinkHandled
            r1.putBoolean(r4, r5)
        L_0x0187:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.saveState():android.os.Bundle");
    }

    public void restoreState(Bundle navState) {
        int[] backStackDestIds;
        ArrayList backStackIds;
        Bundle bundle = navState;
        if (bundle != null) {
            bundle.setClassLoader(this.context.getClassLoader());
            this.navigatorStateToRestore = bundle.getBundle(KEY_NAVIGATOR_STATE);
            this.backStackToRestore = bundle.getParcelableArray(KEY_BACK_STACK);
            this.backStackStates.clear();
            int[] backStackDestIds2 = bundle.getIntArray(KEY_BACK_STACK_DEST_IDS);
            ArrayList backStackIds2 = bundle.getStringArrayList(KEY_BACK_STACK_IDS);
            if (!(backStackDestIds2 == null || backStackIds2 == null)) {
                int[] $this$forEachIndexed$iv = backStackDestIds2;
                int index$iv = 0;
                int length = $this$forEachIndexed$iv.length;
                int i = 0;
                while (i < length) {
                    this.backStackMap.put(Integer.valueOf($this$forEachIndexed$iv[i]), backStackIds2.get(index$iv));
                    i++;
                    index$iv++;
                }
            }
            ArrayList<String> backStackStateIds = bundle.getStringArrayList(KEY_BACK_STACK_STATES_IDS);
            if (backStackStateIds != null) {
                for (String id : backStackStateIds) {
                    Parcelable[] backStackState = bundle.getParcelableArray(KEY_BACK_STACK_STATES_PREFIX + id);
                    if (backStackState != null) {
                        Map<String, ArrayDeque<NavBackStackEntryState>> map = this.backStackStates;
                        Intrinsics.checkNotNullExpressionValue(id, "id");
                        ArrayDeque arrayDeque = new ArrayDeque(backStackState.length);
                        ArrayDeque $this$restoreState_u24lambda_u2461_u24lambda_u2460 = arrayDeque;
                        Iterator it = ArrayIteratorKt.iterator(backStackState);
                        while (it.hasNext()) {
                            int[] backStackDestIds3 = backStackDestIds2;
                            Parcelable parcelable = (Parcelable) it.next();
                            Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            $this$restoreState_u24lambda_u2461_u24lambda_u2460.add((NavBackStackEntryState) parcelable);
                            backStackIds2 = backStackIds2;
                            backStackDestIds2 = backStackDestIds3;
                        }
                        backStackDestIds = backStackDestIds2;
                        backStackIds = backStackIds2;
                        map.put(id, arrayDeque);
                    } else {
                        backStackDestIds = backStackDestIds2;
                        backStackIds = backStackIds2;
                    }
                    backStackIds2 = backStackIds;
                    backStackDestIds2 = backStackDestIds;
                }
                ArrayList arrayList = backStackIds2;
            } else {
                ArrayList arrayList2 = backStackIds2;
            }
            this.deepLinkHandled = bundle.getBoolean(KEY_DEEP_LINK_HANDLED);
        }
    }

    public void setLifecycleOwner(LifecycleOwner owner) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!Intrinsics.areEqual((Object) owner, (Object) this.lifecycleOwner)) {
            LifecycleOwner lifecycleOwner2 = this.lifecycleOwner;
            if (!(lifecycleOwner2 == null || (lifecycle = lifecycleOwner2.getLifecycle()) == null)) {
                lifecycle.removeObserver(this.lifecycleObserver);
            }
            this.lifecycleOwner = owner;
            owner.getLifecycle().addObserver(this.lifecycleObserver);
        }
    }

    public void setOnBackPressedDispatcher(OnBackPressedDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        if (!Intrinsics.areEqual((Object) dispatcher, (Object) this.onBackPressedDispatcher)) {
            LifecycleOwner lifecycleOwner2 = this.lifecycleOwner;
            if (lifecycleOwner2 != null) {
                this.onBackPressedCallback.remove();
                this.onBackPressedDispatcher = dispatcher;
                dispatcher.addCallback(lifecycleOwner2, this.onBackPressedCallback);
                Lifecycle $this$setOnBackPressedDispatcher_u24lambda_u2463 = lifecycleOwner2.getLifecycle();
                $this$setOnBackPressedDispatcher_u24lambda_u2463.removeObserver(this.lifecycleObserver);
                $this$setOnBackPressedDispatcher_u24lambda_u2463.addObserver(this.lifecycleObserver);
                return;
            }
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
        }
    }

    public void enableOnBackPressed(boolean enabled) {
        this.enableOnBackPressedCallback = enabled;
        updateOnBackPressedCallbackEnabled();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (getDestinationCountOnBackStack() > 1) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto L_0x000e
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void setViewModelStore(ViewModelStore viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        if (!Intrinsics.areEqual((Object) this.viewModel, (Object) NavControllerViewModel.Companion.getInstance(viewModelStore))) {
            if (this.backQueue.isEmpty()) {
                this.viewModel = NavControllerViewModel.Companion.getInstance(viewModelStore);
                return;
            }
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
    }

    public ViewModelStoreOwner getViewModelStoreOwner(int navGraphId) {
        if (this.viewModel != null) {
            NavBackStackEntry lastFromBackStack = getBackStackEntry(navGraphId);
            if (lastFromBackStack.getDestination() instanceof NavGraph) {
                return lastFromBackStack;
            }
            throw new IllegalArgumentException(("No NavGraph with ID " + navGraphId + " is on the NavController's back stack").toString());
        }
        throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
    }

    public NavBackStackEntry getBackStackEntry(int destinationId) {
        Object element$iv;
        boolean z;
        List $this$lastOrNull$iv = this.backQueue;
        ListIterator iterator$iv = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
        while (true) {
            if (!iterator$iv.hasPrevious()) {
                element$iv = null;
                break;
            }
            element$iv = iterator$iv.previous();
            if (((NavBackStackEntry) element$iv).getDestination().getId() == destinationId) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        NavBackStackEntry lastFromBackStack = (NavBackStackEntry) element$iv;
        if (lastFromBackStack != null) {
            return lastFromBackStack;
        }
        throw new IllegalArgumentException(("No destination with ID " + destinationId + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    public final NavBackStackEntry getBackStackEntry(String route) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(route, "route");
        List $this$lastOrNull$iv = this.backQueue;
        ListIterator iterator$iv = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
        while (true) {
            if (!iterator$iv.hasPrevious()) {
                element$iv = null;
                break;
            }
            element$iv = iterator$iv.previous();
            NavBackStackEntry entry = (NavBackStackEntry) element$iv;
            if (entry.getDestination().hasRoute(route, entry.getArguments())) {
                break;
            }
        }
        NavBackStackEntry lastFromBackStack = (NavBackStackEntry) element$iv;
        if (lastFromBackStack != null) {
            return lastFromBackStack;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ <T> androidx.navigation.NavBackStackEntry getBackStackEntry() {
        /*
            r13 = this;
            r0 = 0
            r1 = 6
            java.lang.String r2 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            java.lang.String r1 = "kotlinx.serialization.serializer.simple"
            kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall((java.lang.Object) r1)
            r1 = 0
            kotlinx.serialization.KSerializer r3 = kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) r1)
            int r3 = androidx.navigation.serialization.RouteSerializerKt.generateHashCode(r3)
            androidx.navigation.NavGraph r4 = r13.getGraph()
            androidx.navigation.NavDestination r4 = (androidx.navigation.NavDestination) r4
            r5 = 1
            androidx.navigation.NavDestination r4 = r13.findDestinationComprehensive(r4, r3, r5)
            r6 = 4
            if (r4 == 0) goto L_0x0096
            kotlinx.coroutines.flow.StateFlow r4 = r13.getCurrentBackStack()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            r7 = 0
            int r8 = r4.size()
            java.util.ListIterator r8 = r4.listIterator(r8)
        L_0x0036:
            boolean r9 = r8.hasPrevious()
            if (r9 == 0) goto L_0x0055
            java.lang.Object r9 = r8.previous()
            r10 = r9
            androidx.navigation.NavBackStackEntry r10 = (androidx.navigation.NavBackStackEntry) r10
            r11 = 0
            androidx.navigation.NavDestination r12 = r10.getDestination()
            int r12 = r12.getId()
            if (r12 != r3) goto L_0x0050
            r12 = r5
            goto L_0x0051
        L_0x0050:
            r12 = 0
        L_0x0051:
            if (r12 == 0) goto L_0x0036
            r1 = r9
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            if (r1 == 0) goto L_0x005c
            return r1
        L_0x005c:
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "No destination with route "
            java.lang.StringBuilder r5 = r5.append(r7)
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r6, r2)
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r5 = " is on the NavController's back stack. The current destination is "
            java.lang.StringBuilder r2 = r2.append(r5)
            androidx.navigation.NavDestination r5 = r13.getCurrentDestination()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r4.<init>(r2)
            throw r4
        L_0x0096:
            r1 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Destination with route "
            java.lang.StringBuilder r4 = r4.append(r5)
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r6, r2)
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " cannot be found in navigation graph "
            java.lang.StringBuilder r2 = r2.append(r4)
            androidx.navigation.NavGraph r4 = r13.getGraph()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.getBackStackEntry():androidx.navigation.NavBackStackEntry");
    }

    public final <T> NavBackStackEntry getBackStackEntry(T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return getBackStackEntry(generateRouteFilled(route));
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return this.backQueue.lastOrNull();
    }

    public final Flow<NavBackStackEntry> getCurrentBackStackEntryFlow() {
        return this.currentBackStackEntryFlow;
    }

    public NavBackStackEntry getPreviousBackStackEntry() {
        Object element$iv;
        Iterator iterator = CollectionsKt.reversed(this.backQueue).iterator();
        if (iterator.hasNext()) {
            iterator.next();
        }
        Iterator it = SequencesKt.asSequence(iterator).iterator();
        while (true) {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
            if (!(((NavBackStackEntry) element$iv).getDestination() instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) element$iv;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0010\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/navigation/NavController$Companion;", "", "()V", "KEY_BACK_STACK", "", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_EXTRAS", "getKEY_DEEP_LINK_EXTRAS$annotations", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "deepLinkSaveState", "", "enableDeepLinkSaveState", "", "saveState", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavController.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        private Companion() {
        }

        @JvmStatic
        public final void enableDeepLinkSaveState(boolean saveState) {
            NavController.deepLinkSaveState = saveState;
        }
    }

    @JvmStatic
    public static final void enableDeepLinkSaveState(boolean saveState) {
        Companion.enableDeepLinkSaveState(saveState);
    }

    public final /* synthetic */ <T> boolean popBackStack(boolean inclusive) {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.simple");
        int id$iv = RouteSerializerKt.generateHashCode(SerializersKt.serializer((KType) null));
        if (findDestinationComprehensive(getGraph(), id$iv, true) != null) {
            return popBackStack(id$iv, inclusive, false);
        }
        StringBuilder append = new StringBuilder().append("Destination with route ");
        Intrinsics.reifiedOperationMarker(4, "T");
        throw new IllegalArgumentException(append.append(Reflection.getOrCreateKotlinClass(Object.class).getSimpleName()).append(" cannot be found in navigation graph ").append(getGraph()).toString().toString());
    }
}
