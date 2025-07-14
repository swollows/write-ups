package kotlinx.coroutines.debug.internal;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\bÀ\u0002\u0018\u00002\u00020\u0014:\u0002\u0001B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002J3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0017*\u00020\u00142\u001e\b\u0004\u0010\u001b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u0018H\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f¢\u0006\u0004\b \u0010\u0012J)\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\u0006\u0010!\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000f¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J5\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\u0006\u0010)\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b,\u0010-J?\u00102\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.012\u0006\u0010/\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b2\u00103J3\u00105\u001a\u00020.2\u0006\u00104\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020&2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\f¢\u0006\u0004\b?\u0010\u0002J%\u0010A\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\bA\u0010BJ\u001b\u0010D\u001a\u00020\f2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\bD\u0010EJ)\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010K\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010M\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\bL\u0010JJ'\u0010P\u001a\b\u0012\u0004\u0012\u00020\"0\u000f\"\b\b\u0000\u0010\u0003*\u00020N2\u0006\u0010O\u001a\u00028\u0000H\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\fH\u0002¢\u0006\u0004\bR\u0010\u0002J\u000f\u0010S\u001a\u00020\fH\u0002¢\u0006\u0004\bS\u0010\u0002J\r\u0010T\u001a\u00020\f¢\u0006\u0004\bT\u0010\u0002J\u001f\u0010V\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020U2\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bV\u0010WJ#\u0010X\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bX\u0010YJ/\u0010X\u001a\u00020\f2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030\u00192\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bX\u0010ZJ;\u0010b\u001a\u00020\f*\u00020;2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\\0[2\n\u0010`\u001a\u00060^j\u0002`_2\u0006\u0010a\u001a\u00020&H\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u000208*\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\bd\u0010eJ\u001d\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\bC\u0010fJ\u001a\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u00020UH\u0010¢\u0006\u0004\bC\u0010gJ\u0016\u0010h\u001a\u0004\u0018\u00010U*\u00020UH\u0010¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020&*\u00020\u0014H\u0002¢\u0006\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020&8\u0002XT¢\u0006\u0006\n\u0004\bn\u0010oR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\\0p8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001e\u0010v\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190s8BX\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR$\u0010w\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0004\u0012\u0002080p8\u0002X\u0004¢\u0006\u0006\n\u0004\bw\u0010rR\u0014\u0010y\u001a\u00020x8\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\"\u0010~\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f\u0018\u0001078\u0002X\u0004¢\u0006\u0006\n\u0004\b~\u0010R)\u0010\u0001\u001a\u0002088\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u0002088@X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u0002088\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u00020&*\u00020;8BX\u0004¢\u0006\u000f\u0012\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010>R\u001b\u0010\u0001\u001a\u000208*\u00020\"8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "<init>", "()V", "T", "Lkotlin/coroutines/Continuation;", "completion", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "frame", "createOwner", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/StackTraceFrame;)Lkotlin/coroutines/Continuation;", "Ljava/io/PrintStream;", "out", "", "dumpCoroutines", "(Ljava/io/PrintStream;)V", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "dumpCoroutinesInfo", "()Ljava/util/List;", "", "", "dumpCoroutinesInfoAsJsonAndReferences", "()[Ljava/lang/Object;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "Lkotlin/coroutines/CoroutineContext;", "create", "dumpCoroutinesInfoImpl", "(Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "dumpCoroutinesSynchronized", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "info", "Ljava/lang/StackTraceElement;", "coroutineTrace", "enhanceStackTraceWithThreadDump", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;Ljava/util/List;)Ljava/util/List;", "", "enhanceStackTraceWithThreadDumpAsJson", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;)Ljava/lang/String;", "state", "Ljava/lang/Thread;", "thread", "enhanceStackTraceWithThreadDumpImpl", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "actualTrace", "Lkotlin/Pair;", "findContinuationStartIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "findIndexOfFrame", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/Function1;", "", "getDynamicAttach", "()Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/Job;", "job", "hierarchyToString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "install", "frames", "printStackTrace", "(Ljava/io/PrintStream;Ljava/util/List;)V", "owner", "probeCoroutineCompleted", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)V", "probeCoroutineCreated$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "probeCoroutineCreated", "probeCoroutineResumed$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", "", "throwable", "sanitizeStackTrace", "(Ljava/lang/Throwable;)Ljava/util/List;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "uninstall", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateRunningState", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/String;)V", "updateState", "(Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "indent", "build", "(Lkotlinx/coroutines/Job;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "isFinished", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Z", "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "realCaller", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "toStackTraceFrame", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "toStringWithQuotes", "(Ljava/lang/Object;)Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/lang/String;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "callerInfoCache", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutines", "capturedCoroutinesMap", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "dynamicAttach", "Lkotlin/jvm/functions/Function1;", "enableCreationStackTraces", "Z", "getEnableCreationStackTraces", "()Z", "setEnableCreationStackTraces", "(Z)V", "installations", "I", "isInstalled$kotlinx_coroutines_core", "isInstalled", "sanitizeStackTraces", "getSanitizeStackTraces", "setSanitizeStackTraces", "weakRefCleanerThread", "Ljava/lang/Thread;", "getDebugString", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "debugString", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: DebugProbesImpl.kt */
public final class DebugProbesImpl {
    private static final String ARTIFICIAL_FRAME_MESSAGE = "Coroutine creation stacktrace";
    public static final DebugProbesImpl INSTANCE = new DebugProbesImpl();
    /* access modifiers changed from: private */
    public static final ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> callerInfoCache = new ConcurrentWeakMap<>(true);
    private static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, (DefaultConstructorMarker) null);
    private static final ReentrantReadWriteLock coroutineStateLock = new ReentrantReadWriteLock();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final /* synthetic */ SequenceNumberRefVolatile debugProbesImpl$SequenceNumberRefVolatile = new SequenceNumberRefVolatile(0);
    private static final Function1<Boolean, Unit> dynamicAttach = INSTANCE.getDynamicAttach();
    private static boolean enableCreationStackTraces = true;
    private static volatile int installations;
    private static boolean sanitizeStackTraces = true;
    private static final /* synthetic */ AtomicLongFieldUpdater sequenceNumber$FU = AtomicLongFieldUpdater.newUpdater(SequenceNumberRefVolatile.class, "sequenceNumber");
    private static Thread weakRefCleanerThread;

    /* synthetic */ class SequenceNumberRefVolatile {
        volatile long sequenceNumber;

        public SequenceNumberRefVolatile(long j) {
            this.sequenceNumber = j;
        }
    }

    private static /* synthetic */ void getDebugString$annotations(Job job) {
    }

    private DebugProbesImpl() {
    }

    private final Set<CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    public final boolean isInstalled$kotlinx_coroutines_core() {
        return installations > 0;
    }

    public final boolean getSanitizeStackTraces() {
        return sanitizeStackTraces;
    }

    public final void setSanitizeStackTraces(boolean z) {
        sanitizeStackTraces = z;
    }

    public final boolean getEnableCreationStackTraces() {
        return enableCreationStackTraces;
    }

    public final void setEnableCreationStackTraces(boolean z) {
        enableCreationStackTraces = z;
    }

    private final Function1<Boolean, Unit> getDynamicAttach() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            DebugProbesImpl debugProbesImpl = this;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            if (newInstance != null) {
                obj = Result.m281constructorimpl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(newInstance, 1));
                if (Result.m287isFailureimpl(obj)) {
                    obj = null;
                }
                return (Function1) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m281constructorimpl(ResultKt.createFailure(th));
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void install() {
        /*
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r4 = 0
            int r5 = installations     // Catch:{ all -> 0x006e }
            r6 = 1
            int r5 = r5 + r6
            installations = r5     // Catch:{ all -> 0x006e }
            int r5 = installations     // Catch:{ all -> 0x006e }
            if (r5 <= r6) goto L_0x003a
        L_0x002e:
            if (r3 >= r2) goto L_0x0036
            r1.lock()
            int r3 = r3 + 1
            goto L_0x002e
        L_0x0036:
            r0.unlock()
            return
        L_0x003a:
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = INSTANCE     // Catch:{ all -> 0x006e }
            r5.startWeakRefCleanerThread()     // Catch:{ all -> 0x006e }
            kotlinx.coroutines.debug.internal.AgentInstallationType r5 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE     // Catch:{ all -> 0x006e }
            boolean r5 = r5.isInstalledStatically$kotlinx_coroutines_core()     // Catch:{ all -> 0x006e }
            if (r5 == 0) goto L_0x0053
        L_0x0047:
            if (r3 >= r2) goto L_0x004f
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0047
        L_0x004f:
            r0.unlock()
            return
        L_0x0053:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r5 = dynamicAttach     // Catch:{ all -> 0x006e }
            if (r5 == 0) goto L_0x005e
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x006e }
            r5.invoke(r6)     // Catch:{ all -> 0x006e }
        L_0x005e:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006e }
        L_0x0062:
            if (r3 >= r2) goto L_0x006a
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0062
        L_0x006a:
            r0.unlock()
            return
        L_0x006e:
            r4 = move-exception
        L_0x006f:
            if (r3 >= r2) goto L_0x0077
            r1.lock()
            int r3 = r3 + 1
            goto L_0x006f
        L_0x0077:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugProbesImpl.install():void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void uninstall() {
        /*
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r4 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = INSTANCE     // Catch:{ all -> 0x008d }
            boolean r5 = r5.isInstalled$kotlinx_coroutines_core()     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x0080
            int r5 = installations     // Catch:{ all -> 0x008d }
            int r5 = r5 + -1
            installations = r5     // Catch:{ all -> 0x008d }
            int r5 = installations     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x0042
        L_0x0036:
            if (r3 >= r2) goto L_0x003e
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0036
        L_0x003e:
            r0.unlock()
            return
        L_0x0042:
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = INSTANCE     // Catch:{ all -> 0x008d }
            r5.stopWeakRefCleanerThread()     // Catch:{ all -> 0x008d }
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r5 = capturedCoroutinesMap     // Catch:{ all -> 0x008d }
            r5.clear()     // Catch:{ all -> 0x008d }
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r5 = callerInfoCache     // Catch:{ all -> 0x008d }
            r5.clear()     // Catch:{ all -> 0x008d }
            kotlinx.coroutines.debug.internal.AgentInstallationType r5 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE     // Catch:{ all -> 0x008d }
            boolean r5 = r5.isInstalledStatically$kotlinx_coroutines_core()     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x0065
        L_0x0059:
            if (r3 >= r2) goto L_0x0061
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0061:
            r0.unlock()
            return
        L_0x0065:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r5 = dynamicAttach     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x0070
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x008d }
            r5.invoke(r6)     // Catch:{ all -> 0x008d }
        L_0x0070:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x008d }
        L_0x0074:
            if (r3 >= r2) goto L_0x007c
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0074
        L_0x007c:
            r0.unlock()
            return
        L_0x0080:
            r5 = 0
            java.lang.String r6 = "Agent was not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008d }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x008d }
            r5.<init>(r6)     // Catch:{ all -> 0x008d }
            throw r5     // Catch:{ all -> 0x008d }
        L_0x008d:
            r4 = move-exception
        L_0x008e:
            if (r3 >= r2) goto L_0x0096
            r1.lock()
            int r3 = r3 + 1
            goto L_0x008e
        L_0x0096:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugProbesImpl.uninstall():void");
    }

    private final void startWeakRefCleanerThread() {
        weakRefCleanerThread = ThreadsKt.thread$default(false, true, (ClassLoader) null, "Coroutines Debugger Cleaner", 0, DebugProbesImpl$startWeakRefCleanerThread$1.INSTANCE, 21, (Object) null);
    }

    private final void stopWeakRefCleanerThread() {
        Thread thread = weakRefCleanerThread;
        if (thread != null) {
            weakRefCleanerThread = null;
            thread.interrupt();
            thread.join();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2 A[LOOP:4: B:41:0x00f0->B:42:0x00f2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String hierarchyToString(kotlinx.coroutines.Job r17) {
        /*
            r16 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            if (r2 != 0) goto L_0x0011
            int r2 = r0.getReadHoldCount()
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            r4 = 0
        L_0x0013:
            if (r4 >= r2) goto L_0x001b
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0013
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r0.writeLock()
            r4.lock()
            r0 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = INSTANCE     // Catch:{ all -> 0x00ec }
            boolean r5 = r5.isInstalled$kotlinx_coroutines_core()     // Catch:{ all -> 0x00ec }
            if (r5 == 0) goto L_0x00db
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = INSTANCE     // Catch:{ all -> 0x00ec }
            java.util.Set r5 = r5.getCapturedCoroutines()     // Catch:{ all -> 0x00ec }
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x00ec }
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00ec }
            r7.<init>()     // Catch:{ all -> 0x00ec }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x00ec }
            r8 = r5
            r9 = 0
            java.util.Iterator r10 = r8.iterator()     // Catch:{ all -> 0x00ec }
        L_0x0042:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x00ec }
            if (r11 == 0) goto L_0x0069
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x00ec }
            r12 = r11
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r12 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r12     // Catch:{ all -> 0x00ec }
            r13 = 0
            kotlin.coroutines.Continuation<T> r14 = r12.delegate     // Catch:{ all -> 0x00ec }
            kotlin.coroutines.CoroutineContext r14 = r14.getContext()     // Catch:{ all -> 0x00ec }
            kotlinx.coroutines.Job$Key r15 = kotlinx.coroutines.Job.Key     // Catch:{ all -> 0x00ec }
            kotlin.coroutines.CoroutineContext$Key r15 = (kotlin.coroutines.CoroutineContext.Key) r15     // Catch:{ all -> 0x00ec }
            kotlin.coroutines.CoroutineContext$Element r14 = r14.get(r15)     // Catch:{ all -> 0x00ec }
            if (r14 == 0) goto L_0x0062
            r14 = 1
            goto L_0x0063
        L_0x0062:
            r14 = 0
        L_0x0063:
            if (r14 == 0) goto L_0x0042
            r7.add(r11)     // Catch:{ all -> 0x00ec }
            goto L_0x0042
        L_0x0069:
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x00ec }
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x00ec }
            r5 = r7
            r6 = 0
            r7 = 10
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r7)     // Catch:{ all -> 0x00ec }
            int r7 = kotlin.collections.MapsKt.mapCapacity(r7)     // Catch:{ all -> 0x00ec }
            r8 = 16
            int r7 = kotlin.ranges.RangesKt.coerceAtLeast((int) r7, (int) r8)     // Catch:{ all -> 0x00ec }
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00ec }
            r8.<init>(r7)     // Catch:{ all -> 0x00ec }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x00ec }
            r9 = r5
            r10 = 0
            java.util.Iterator r11 = r9.iterator()     // Catch:{ all -> 0x00ec }
        L_0x008e:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x00ec }
            if (r12 == 0) goto L_0x00b0
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x00ec }
            r13 = r12
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r13 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r13     // Catch:{ all -> 0x00ec }
            r14 = 0
            kotlin.coroutines.Continuation<T> r15 = r13.delegate     // Catch:{ all -> 0x00ec }
            kotlin.coroutines.CoroutineContext r15 = r15.getContext()     // Catch:{ all -> 0x00ec }
            kotlinx.coroutines.Job r15 = kotlinx.coroutines.JobKt.getJob(r15)     // Catch:{ all -> 0x00ec }
            r13 = r12
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r13 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r13     // Catch:{ all -> 0x00ec }
            r14 = 0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = r13.info     // Catch:{ all -> 0x00ec }
            r8.put(r15, r3)     // Catch:{ all -> 0x00ec }
            goto L_0x008e
        L_0x00b0:
            r3 = r8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r5.<init>()     // Catch:{ all -> 0x00ec }
            r6 = r5
            r7 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r8 = INSTANCE     // Catch:{ all -> 0x00ec }
            java.lang.String r9 = ""
            r10 = r17
            r8.build(r10, r3, r6, r9)     // Catch:{ all -> 0x00ea }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ea }
            java.lang.String r6 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch:{ all -> 0x00ea }
            r3 = 0
        L_0x00cf:
            if (r3 >= r2) goto L_0x00d7
            r1.lock()
            int r3 = r3 + 1
            goto L_0x00cf
        L_0x00d7:
            r4.unlock()
            return r5
        L_0x00db:
            r10 = r17
            r3 = 0
            java.lang.String r5 = "Debug probes are not installed"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ea }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ea }
            r3.<init>(r5)     // Catch:{ all -> 0x00ea }
            throw r3     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            goto L_0x00ef
        L_0x00ec:
            r0 = move-exception
            r10 = r17
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            if (r3 >= r2) goto L_0x00f8
            r1.lock()
            int r3 = r3 + 1
            goto L_0x00f0
        L_0x00f8:
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugProbesImpl.hierarchyToString(kotlinx.coroutines.Job):java.lang.String");
    }

    private final void build(Job $this$build, Map<Job, DebugCoroutineInfoImpl> map, StringBuilder builder, String indent) {
        String newIndent;
        DebugCoroutineInfoImpl info = map.get($this$build);
        if (info != null) {
            builder.append(indent + getDebugString($this$build) + ", continuation is " + info.getState() + " at line " + ((StackTraceElement) CollectionsKt.firstOrNull(info.lastObservedStackTrace())) + 10);
            newIndent = indent + 9;
        } else if (!($this$build instanceof ScopeCoroutine)) {
            builder.append(indent + getDebugString($this$build) + 10);
            newIndent = indent + 9;
        } else {
            newIndent = indent;
        }
        for (Job child : $this$build.getChildren()) {
            build(child, map, builder, newIndent);
        }
    }

    private final String getDebugString(Job $this$debugString) {
        return $this$debugString instanceof JobSupport ? ((JobSupport) $this$debugString).toDebugString() : $this$debugString.toString();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private final <R> java.util.List<R> dumpCoroutinesInfoImpl(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, ? super kotlin.coroutines.CoroutineContext, ? extends R> r11) {
        /*
            r10 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r3 = r1.getWriteHoldCount()
            r4 = 0
            if (r3 != 0) goto L_0x0013
            int r3 = r1.getReadHoldCount()
            goto L_0x0014
        L_0x0013:
            r3 = r4
        L_0x0014:
            r5 = r4
        L_0x0015:
            if (r5 >= r3) goto L_0x001d
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x0015
        L_0x001d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            r5 = 0
            r6 = 1
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = INSTANCE     // Catch:{ all -> 0x0075 }
            boolean r7 = r7.isInstalled$kotlinx_coroutines_core()     // Catch:{ all -> 0x0075 }
            if (r7 == 0) goto L_0x0068
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = INSTANCE     // Catch:{ all -> 0x0075 }
            java.util.Set r7 = r7.getCapturedCoroutines()     // Catch:{ all -> 0x0075 }
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x0075 }
            kotlin.sequences.Sequence r7 = kotlin.collections.CollectionsKt.asSequence(r7)     // Catch:{ all -> 0x0075 }
            r8 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1 r9 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1     // Catch:{ all -> 0x0075 }
            r9.<init>()     // Catch:{ all -> 0x0075 }
            java.util.Comparator r9 = (java.util.Comparator) r9     // Catch:{ all -> 0x0075 }
            kotlin.sequences.Sequence r9 = kotlin.sequences.SequencesKt.sortedWith(r7, r9)     // Catch:{ all -> 0x0075 }
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$1$3 r7 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$1$3     // Catch:{ all -> 0x0075 }
            r7.<init>(r11)     // Catch:{ all -> 0x0075 }
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7     // Catch:{ all -> 0x0075 }
            kotlin.sequences.Sequence r7 = kotlin.sequences.SequencesKt.mapNotNull(r9, r7)     // Catch:{ all -> 0x0075 }
            java.util.List r7 = kotlin.sequences.SequencesKt.toList(r7)     // Catch:{ all -> 0x0075 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
        L_0x0059:
            if (r4 >= r3) goto L_0x0061
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0059
        L_0x0061:
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            return r7
        L_0x0068:
            r7 = 0
            java.lang.String r8 = "Debug probes are not installed"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0075 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0075 }
            r7.<init>(r8)     // Catch:{ all -> 0x0075 }
            throw r7     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r5 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
        L_0x0079:
            if (r4 >= r3) goto L_0x0081
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0079
        L_0x0081:
            r1.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfoImpl(kotlin.jvm.functions.Function2):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        r8 = r8.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        /*
            r15 = this;
            java.util.List r0 = r15.dumpCoroutinesInfo()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r5 = r0.iterator()
        L_0x001b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00d2
            java.lang.Object r6 = r5.next()
            kotlinx.coroutines.debug.internal.DebugCoroutineInfo r6 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfo) r6
            kotlin.coroutines.CoroutineContext r7 = r6.getContext()
            kotlinx.coroutines.CoroutineName$Key r8 = kotlinx.coroutines.CoroutineName.Key
            kotlin.coroutines.CoroutineContext$Key r8 = (kotlin.coroutines.CoroutineContext.Key) r8
            kotlin.coroutines.CoroutineContext$Element r8 = r7.get(r8)
            kotlinx.coroutines.CoroutineName r8 = (kotlinx.coroutines.CoroutineName) r8
            r9 = 0
            if (r8 == 0) goto L_0x0043
            java.lang.String r8 = r8.getName()
            if (r8 == 0) goto L_0x0043
            java.lang.String r8 = r15.toStringWithQuotes(r8)
            goto L_0x0044
        L_0x0043:
            r8 = r9
        L_0x0044:
            kotlinx.coroutines.CoroutineDispatcher$Key r10 = kotlinx.coroutines.CoroutineDispatcher.Key
            kotlin.coroutines.CoroutineContext$Key r10 = (kotlin.coroutines.CoroutineContext.Key) r10
            kotlin.coroutines.CoroutineContext$Element r10 = r7.get(r10)
            kotlinx.coroutines.CoroutineDispatcher r10 = (kotlinx.coroutines.CoroutineDispatcher) r10
            if (r10 == 0) goto L_0x0055
            java.lang.String r10 = r15.toStringWithQuotes(r10)
            goto L_0x0056
        L_0x0055:
            r10 = r9
        L_0x0056:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "\n                {\n                    \"name\": "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r8)
            java.lang.String r12 = ",\n                    \"id\": "
            java.lang.StringBuilder r11 = r11.append(r12)
            kotlinx.coroutines.CoroutineId$Key r12 = kotlinx.coroutines.CoroutineId.Key
            kotlin.coroutines.CoroutineContext$Key r12 = (kotlin.coroutines.CoroutineContext.Key) r12
            kotlin.coroutines.CoroutineContext$Element r12 = r7.get(r12)
            kotlinx.coroutines.CoroutineId r12 = (kotlinx.coroutines.CoroutineId) r12
            if (r12 == 0) goto L_0x0082
            long r12 = r12.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
        L_0x0082:
            java.lang.StringBuilder r9 = r11.append(r9)
            java.lang.String r11 = ",\n                    \"dispatcher\": "
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r11 = ",\n                    \"sequenceNumber\": "
            java.lang.StringBuilder r9 = r9.append(r11)
            long r11 = r6.getSequenceNumber()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = ",\n                    \"state\": \""
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = r6.getState()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = "\"\n                } \n                "
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = kotlin.text.StringsKt.trimIndent(r9)
            r4.add(r9)
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r9 = r6.getLastObservedFrame()
            r3.add(r9)
            java.lang.Thread r9 = r6.getLastObservedThread()
            r2.add(r9)
            goto L_0x001b
        L_0x00d2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 91
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = r4
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r13 = 63
            r14 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r6 = kotlin.collections.CollectionsKt.joinToString$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = 93
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = 0
            r8 = r6
            r9 = 0
            java.lang.Thread[] r10 = new java.lang.Thread[r9]
            java.lang.Object[] r10 = r8.toArray(r10)
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r10 == 0) goto L_0x013c
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = 0
            r8 = r6
            kotlin.coroutines.jvm.internal.CoroutineStackFrame[] r12 = new kotlin.coroutines.jvm.internal.CoroutineStackFrame[r9]
            java.lang.Object[] r12 = r8.toArray(r12)
            if (r12 == 0) goto L_0x0136
            r6 = r0
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = 0
            r8 = r6
            kotlinx.coroutines.debug.internal.DebugCoroutineInfo[] r9 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfo[r9]
            java.lang.Object[] r9 = r8.toArray(r9)
            if (r9 == 0) goto L_0x0130
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r10, r12, r9}
            return r5
        L_0x0130:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r11)
            throw r5
        L_0x0136:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r11)
            throw r5
        L_0x013c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r11)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfoAsJsonAndReferences():java.lang.Object[]");
    }

    public final String enhanceStackTraceWithThreadDumpAsJson(DebugCoroutineInfo info) {
        List stackTraceElements = enhanceStackTraceWithThreadDump(info, info.lastObservedStackTrace());
        List stackTraceElementsInfoAsJson = new ArrayList();
        for (StackTraceElement element : stackTraceElements) {
            StringBuilder append = new StringBuilder().append("\n                {\n                    \"declaringClass\": \"").append(element.getClassName()).append("\",\n                    \"methodName\": \"").append(element.getMethodName()).append("\",\n                    \"fileName\": ");
            String fileName = element.getFileName();
            stackTraceElementsInfoAsJson.add(StringsKt.trimIndent(append.append(fileName != null ? toStringWithQuotes(fileName) : null).append(",\n                    \"lineNumber\": ").append(element.getLineNumber()).append("\n                }\n                ").toString()));
        }
        return '[' + CollectionsKt.joinToString$default(stackTraceElementsInfoAsJson, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + ']';
    }

    private final String toStringWithQuotes(Object $this$toStringWithQuotes) {
        return new StringBuilder().append(Typography.quote).append($this$toStringWithQuotes).append(Typography.quote).toString();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final java.util.List<kotlinx.coroutines.debug.internal.DebugCoroutineInfo> dumpCoroutinesInfo() {
        /*
            r10 = this;
            r0 = r10
            r1 = 0
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.readLock()
            int r4 = r2.getWriteHoldCount()
            r5 = 0
            if (r4 != 0) goto L_0x0014
            int r4 = r2.getReadHoldCount()
            goto L_0x0015
        L_0x0014:
            r4 = r5
        L_0x0015:
            r6 = r5
        L_0x0016:
            if (r6 >= r4) goto L_0x001e
            r3.unlock()
            int r6 = r6 + 1
            goto L_0x0016
        L_0x001e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.lock()
            r6 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = INSTANCE     // Catch:{ all -> 0x0071 }
            boolean r7 = r7.isInstalled$kotlinx_coroutines_core()     // Catch:{ all -> 0x0071 }
            if (r7 == 0) goto L_0x0064
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = INSTANCE     // Catch:{ all -> 0x0071 }
            java.util.Set r7 = r7.getCapturedCoroutines()     // Catch:{ all -> 0x0071 }
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x0071 }
            kotlin.sequences.Sequence r7 = kotlin.collections.CollectionsKt.asSequence(r7)     // Catch:{ all -> 0x0071 }
            r8 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1 r9 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1     // Catch:{ all -> 0x0071 }
            r9.<init>()     // Catch:{ all -> 0x0071 }
            java.util.Comparator r9 = (java.util.Comparator) r9     // Catch:{ all -> 0x0071 }
            kotlin.sequences.Sequence r9 = kotlin.sequences.SequencesKt.sortedWith(r7, r9)     // Catch:{ all -> 0x0071 }
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1 r7 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1     // Catch:{ all -> 0x0071 }
            r7.<init>()     // Catch:{ all -> 0x0071 }
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7     // Catch:{ all -> 0x0071 }
            kotlin.sequences.Sequence r7 = kotlin.sequences.SequencesKt.mapNotNull(r9, r7)     // Catch:{ all -> 0x0071 }
            java.util.List r7 = kotlin.sequences.SequencesKt.toList(r7)     // Catch:{ all -> 0x0071 }
        L_0x0057:
            if (r5 >= r4) goto L_0x005f
            r3.lock()
            int r5 = r5 + 1
            goto L_0x0057
        L_0x005f:
            r2.unlock()
            return r7
        L_0x0064:
            r7 = 0
            java.lang.String r8 = "Debug probes are not installed"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0071 }
            r7.<init>(r8)     // Catch:{ all -> 0x0071 }
            throw r7     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r6 = move-exception
        L_0x0072:
            if (r5 >= r4) goto L_0x007a
            r3.lock()
            int r5 = r5 + 1
            goto L_0x0072
        L_0x007a:
            r2.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfo():java.util.List");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final java.util.List<kotlinx.coroutines.debug.internal.DebuggerInfo> dumpDebuggerInfo() {
        /*
            r10 = this;
            r0 = r10
            r1 = 0
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = coroutineStateLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.readLock()
            int r4 = r2.getWriteHoldCount()
            r5 = 0
            if (r4 != 0) goto L_0x0014
            int r4 = r2.getReadHoldCount()
            goto L_0x0015
        L_0x0014:
            r4 = r5
        L_0x0015:
            r6 = r5
        L_0x0016:
            if (r6 >= r4) goto L_0x001e
            r3.unlock()
            int r6 = r6 + 1
            goto L_0x0016
        L_0x001e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.lock()
            r6 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = INSTANCE     // Catch:{ all -> 0x0071 }
            boolean r7 = r7.isInstalled$kotlinx_coroutines_core()     // Catch:{ all -> 0x0071 }
            if (r7 == 0) goto L_0x0064
            kotlinx.coroutines.debug.internal.DebugProbesImpl r7 = INSTANCE     // Catch:{ all -> 0x0071 }
            java.util.Set r7 = r7.getCapturedCoroutines()     // Catch:{ all -> 0x0071 }
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x0071 }
            kotlin.sequences.Sequence r7 = kotlin.collections.CollectionsKt.asSequence(r7)     // Catch:{ all -> 0x0071 }
            r8 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1 r9 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$lambda-12$$inlined$sortedBy$1     // Catch:{ all -> 0x0071 }
            r9.<init>()     // Catch:{ all -> 0x0071 }
            java.util.Comparator r9 = (java.util.Comparator) r9     // Catch:{ all -> 0x0071 }
            kotlin.sequences.Sequence r9 = kotlin.sequences.SequencesKt.sortedWith(r7, r9)     // Catch:{ all -> 0x0071 }
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1 r7 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1     // Catch:{ all -> 0x0071 }
            r7.<init>()     // Catch:{ all -> 0x0071 }
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7     // Catch:{ all -> 0x0071 }
            kotlin.sequences.Sequence r7 = kotlin.sequences.SequencesKt.mapNotNull(r9, r7)     // Catch:{ all -> 0x0071 }
            java.util.List r7 = kotlin.sequences.SequencesKt.toList(r7)     // Catch:{ all -> 0x0071 }
        L_0x0057:
            if (r5 >= r4) goto L_0x005f
            r3.lock()
            int r5 = r5 + 1
            goto L_0x0057
        L_0x005f:
            r2.unlock()
            return r7
        L_0x0064:
            r7 = 0
            java.lang.String r8 = "Debug probes are not installed"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0071 }
            r7.<init>(r8)     // Catch:{ all -> 0x0071 }
            throw r7     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r6 = move-exception
        L_0x0072:
            if (r5 >= r4) goto L_0x007a
            r3.lock()
            int r5 = r5 + 1
            goto L_0x0072
        L_0x007a:
            r2.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpDebuggerInfo():java.util.List");
    }

    public final void dumpCoroutines(PrintStream out) {
        synchronized (out) {
            INSTANCE.dumpCoroutinesSynchronized(out);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: private */
    public final boolean isFinished(CoroutineOwner<?> $this$isFinished) {
        Job job;
        CoroutineContext context = $this$isFinished.info.getContext();
        if (context == null || (job = (Job) context.get(Job.Key)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove($this$isFinished);
        return true;
    }

    /* JADX INFO: finally extract failed */
    private final void dumpCoroutinesSynchronized(PrintStream out) {
        String state;
        PrintStream printStream = out;
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i = 0; i < readHoldCount; i++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        int i2 = 0;
        try {
            if (INSTANCE.isInstalled$kotlinx_coroutines_core()) {
                printStream.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
                for (CoroutineOwner owner : SequencesKt.sortedWith(SequencesKt.filter(CollectionsKt.asSequence(INSTANCE.getCapturedCoroutines()), DebugProbesImpl$dumpCoroutinesSynchronized$1$2.INSTANCE), new DebugProbesImpl$dumpCoroutinesSynchronized$lambda19$$inlined$sortedBy$1())) {
                    DebugCoroutineInfoImpl info = owner.info;
                    List observedStackTrace = info.lastObservedStackTrace();
                    List enhancedStackTrace = INSTANCE.enhanceStackTraceWithThreadDumpImpl(info.getState(), info.lastObservedThread, observedStackTrace);
                    if (!Intrinsics.areEqual((Object) info.getState(), (Object) DebugCoroutineInfoImplKt.RUNNING) || enhancedStackTrace != observedStackTrace) {
                        state = info.getState();
                    } else {
                        state = info.getState() + " (Last suspension stacktrace, not an actual stacktrace)";
                    }
                    int i3 = i2;
                    printStream.print("\n\nCoroutine " + owner.delegate + ", state: " + state);
                    if (observedStackTrace.isEmpty()) {
                        printStream.print("\n\tat " + StackTraceRecoveryKt.artificialFrame(ARTIFICIAL_FRAME_MESSAGE));
                        INSTANCE.printStackTrace(printStream, info.getCreationStackTrace());
                    } else {
                        INSTANCE.printStackTrace(printStream, enhancedStackTrace);
                    }
                    i2 = i3;
                }
                int i4 = i2;
                Unit unit = Unit.INSTANCE;
                for (int i5 = 0; i5 < readHoldCount; i5++) {
                    readLock.lock();
                }
                writeLock.unlock();
                return;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } catch (Throwable th) {
            for (int i6 = 0; i6 < readHoldCount; i6++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    private final void printStackTrace(PrintStream out, List<StackTraceElement> frames) {
        for (StackTraceElement frame : frames) {
            out.print("\n\tat " + frame);
        }
    }

    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(DebugCoroutineInfo info, List<StackTraceElement> coroutineTrace) {
        return enhanceStackTraceWithThreadDumpImpl(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String state, Thread thread, List<StackTraceElement> coroutineTrace) {
        Object obj;
        if (!Intrinsics.areEqual((Object) state, (Object) DebugCoroutineInfoImplKt.RUNNING) || thread == null) {
            return coroutineTrace;
        }
        try {
            Result.Companion companion = Result.Companion;
            DebugProbesImpl debugProbesImpl = this;
            obj = Result.m281constructorimpl(thread.getStackTrace());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m281constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m287isFailureimpl(obj)) {
            obj = null;
        }
        StackTraceElement[] actualTrace = (StackTraceElement[]) obj;
        if (actualTrace == null) {
            return coroutineTrace;
        }
        StackTraceElement[] stackTraceElementArr = actualTrace;
        int index$iv = 0;
        int length = stackTraceElementArr.length;
        while (true) {
            if (index$iv >= length) {
                index$iv = -1;
                break;
            }
            StackTraceElement it = stackTraceElementArr[index$iv];
            if (Intrinsics.areEqual((Object) it.getClassName(), (Object) "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && Intrinsics.areEqual((Object) it.getMethodName(), (Object) "resumeWith") && Intrinsics.areEqual((Object) it.getFileName(), (Object) "ContinuationImpl.kt")) {
                break;
            }
            index$iv++;
        }
        int indexOfResumeWith = index$iv;
        Pair<Integer, Integer> findContinuationStartIndex = findContinuationStartIndex(indexOfResumeWith, actualTrace, coroutineTrace);
        int continuationStartFrame = findContinuationStartIndex.component1().intValue();
        int delta = findContinuationStartIndex.component2().intValue();
        if (continuationStartFrame == -1) {
            return coroutineTrace;
        }
        ArrayList result = new ArrayList((((coroutineTrace.size() + indexOfResumeWith) - continuationStartFrame) - 1) - delta);
        int i = indexOfResumeWith - delta;
        for (int index = 0; index < i; index++) {
            result.add(actualTrace[index]);
        }
        int size = coroutineTrace.size();
        for (int index2 = continuationStartFrame + 1; index2 < size; index2++) {
            result.add(coroutineTrace.get(index2));
        }
        return result;
    }

    private final Pair<Integer, Integer> findContinuationStartIndex(int indexOfResumeWith, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        for (int i = 0; i < 3; i++) {
            int it = i;
            int result = INSTANCE.findIndexOfFrame((indexOfResumeWith - 1) - it, actualTrace, coroutineTrace);
            if (result != -1) {
                return TuplesKt.to(Integer.valueOf(result), Integer.valueOf(it));
            }
        }
        return TuplesKt.to(-1, 0);
    }

    private final int findIndexOfFrame(int frameIndex, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        StackTraceElement continuationFrame = (StackTraceElement) ArraysKt.getOrNull((T[]) actualTrace, frameIndex);
        if (continuationFrame == null) {
            return -1;
        }
        int index$iv = 0;
        for (StackTraceElement it : coroutineTrace) {
            if (Intrinsics.areEqual((Object) it.getFileName(), (Object) continuationFrame.getFileName()) && Intrinsics.areEqual((Object) it.getClassName(), (Object) continuationFrame.getClassName()) && Intrinsics.areEqual((Object) it.getMethodName(), (Object) continuationFrame.getMethodName())) {
                return index$iv;
            }
            index$iv++;
        }
        return -1;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(Continuation<?> frame) {
        updateState(frame, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(Continuation<?> frame) {
        updateState(frame, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    private final void updateState(Continuation<?> frame, String state) {
        if (isInstalled$kotlinx_coroutines_core()) {
            if (!Intrinsics.areEqual((Object) state, (Object) DebugCoroutineInfoImplKt.RUNNING) || !KotlinVersion.CURRENT.isAtLeast(1, 3, 30)) {
                CoroutineOwner owner = owner(frame);
                if (owner != null) {
                    updateState(owner, frame, state);
                    return;
                }
                return;
            }
            CoroutineStackFrame stackFrame = frame instanceof CoroutineStackFrame ? (CoroutineStackFrame) frame : null;
            if (stackFrame != null) {
                updateRunningState(stackFrame, state);
            }
        }
    }

    private final void updateRunningState(CoroutineStackFrame frame, String state) {
        DebugCoroutineInfoImpl info;
        ReentrantReadWriteLock.ReadLock readLock = coroutineStateLock.readLock();
        readLock.lock();
        try {
            if (INSTANCE.isInstalled$kotlinx_coroutines_core()) {
                DebugCoroutineInfoImpl cached = callerInfoCache.remove(frame);
                if (cached != null) {
                    info = cached;
                } else {
                    CoroutineOwner<?> owner = INSTANCE.owner(frame);
                    if (owner != null) {
                        DebugCoroutineInfoImpl debugCoroutineInfoImpl = owner.info;
                        if (debugCoroutineInfoImpl != null) {
                            info = debugCoroutineInfoImpl;
                            CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = info.getLastObservedFrame$kotlinx_coroutines_core();
                            CoroutineStackFrame realCaller = lastObservedFrame$kotlinx_coroutines_core != null ? INSTANCE.realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                            if (realCaller != null) {
                                callerInfoCache.remove(realCaller);
                            }
                        }
                    }
                    readLock.unlock();
                    return;
                }
                info.updateState$kotlinx_coroutines_core(state, (Continuation) frame);
                CoroutineStackFrame caller = INSTANCE.realCaller(frame);
                if (caller == null) {
                    readLock.unlock();
                    return;
                }
                callerInfoCache.put(caller, info);
                Unit unit = Unit.INSTANCE;
                readLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }

    private final CoroutineStackFrame realCaller(CoroutineStackFrame $this$realCaller) {
        CoroutineStackFrame caller = $this$realCaller;
        do {
            caller = caller.getCallerFrame();
            if (caller == null) {
                return null;
            }
        } while (caller.getStackTraceElement() == null);
        return caller;
    }

    private final void updateState(CoroutineOwner<?> owner, Continuation<?> frame, String state) {
        ReentrantReadWriteLock.ReadLock readLock = coroutineStateLock.readLock();
        readLock.lock();
        try {
            if (INSTANCE.isInstalled$kotlinx_coroutines_core()) {
                owner.info.updateState$kotlinx_coroutines_core(state, frame);
                Unit unit = Unit.INSTANCE;
                readLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }

    private final CoroutineOwner<?> owner(Continuation<?> $this$owner) {
        CoroutineStackFrame coroutineStackFrame = $this$owner instanceof CoroutineStackFrame ? (CoroutineStackFrame) $this$owner : null;
        if (coroutineStackFrame != null) {
            return owner(coroutineStackFrame);
        }
        return null;
    }

    private final CoroutineOwner<?> owner(CoroutineStackFrame $this$owner) {
        CoroutineStackFrame coroutineStackFrame = $this$owner;
        while (!(coroutineStackFrame instanceof CoroutineOwner)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (CoroutineOwner) coroutineStackFrame;
    }

    public final <T> Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(Continuation<? super T> completion) {
        StackTraceFrame frame;
        if (!isInstalled$kotlinx_coroutines_core() || owner((Continuation<?>) completion) != null) {
            return completion;
        }
        if (enableCreationStackTraces) {
            frame = toStackTraceFrame(sanitizeStackTrace(new Exception()));
        } else {
            frame = null;
            StackTraceFrame stackTraceFrame = null;
        }
        return createOwner(completion, frame);
    }

    private final StackTraceFrame toStackTraceFrame(List<StackTraceElement> $this$toStackTraceFrame) {
        List $this$foldRight$iv = $this$toStackTraceFrame;
        StackTraceFrame acc = null;
        if (!$this$foldRight$iv.isEmpty()) {
            ListIterator iterator$iv = $this$foldRight$iv.listIterator($this$foldRight$iv.size());
            while (iterator$iv.hasPrevious()) {
                acc = new StackTraceFrame(acc, iterator$iv.previous());
            }
        }
        return acc;
    }

    private final <T> Continuation<T> createOwner(Continuation<? super T> completion, StackTraceFrame frame) {
        if (!isInstalled$kotlinx_coroutines_core()) {
            return completion;
        }
        CoroutineOwner owner = new CoroutineOwner(completion, new DebugCoroutineInfoImpl(completion.getContext(), frame, sequenceNumber$FU.incrementAndGet(debugProbesImpl$SequenceNumberRefVolatile)), frame);
        capturedCoroutinesMap.put(owner, true);
        if (!isInstalled$kotlinx_coroutines_core()) {
            capturedCoroutinesMap.clear();
        }
        return owner;
    }

    /* access modifiers changed from: private */
    public final void probeCoroutineCompleted(CoroutineOwner<?> owner) {
        CoroutineStackFrame caller;
        capturedCoroutinesMap.remove(owner);
        CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = owner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core != null && (caller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) != null) {
            callerInfoCache.remove(caller);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "frame", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: DebugProbesImpl.kt */
    private static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {
        public final Continuation<T> delegate;
        private final CoroutineStackFrame frame;
        public final DebugCoroutineInfoImpl info;

        public CoroutineContext getContext() {
            return this.delegate.getContext();
        }

        public CoroutineOwner(Continuation<? super T> delegate2, DebugCoroutineInfoImpl info2, CoroutineStackFrame frame2) {
            this.delegate = delegate2;
            this.info = info2;
            this.frame = frame2;
        }

        public CoroutineStackFrame getCallerFrame() {
            CoroutineStackFrame coroutineStackFrame = this.frame;
            if (coroutineStackFrame != null) {
                return coroutineStackFrame.getCallerFrame();
            }
            return null;
        }

        public StackTraceElement getStackTraceElement() {
            CoroutineStackFrame coroutineStackFrame = this.frame;
            if (coroutineStackFrame != null) {
                return coroutineStackFrame.getStackTraceElement();
            }
            return null;
        }

        public void resumeWith(Object result) {
            DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(result);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int size = stackTrace.length;
        StackTraceElement[] stackTraceElementArr = stackTrace;
        int i = -1;
        int length = stackTraceElementArr.length - 1;
        if (length >= 0) {
            while (true) {
                int index$iv = length;
                length--;
                if (!Intrinsics.areEqual((Object) stackTraceElementArr[index$iv].getClassName(), (Object) "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    if (length < 0) {
                        break;
                    }
                } else {
                    i = index$iv;
                    break;
                }
            }
        }
        int probeIndex = i;
        if (!sanitizeStackTraces) {
            int i2 = size - probeIndex;
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                int it = i3;
                arrayList.add(it == 0 ? StackTraceRecoveryKt.artificialFrame(ARTIFICIAL_FRAME_MESSAGE) : stackTrace[it + probeIndex]);
            }
            return arrayList;
        }
        ArrayList result = new ArrayList((size - probeIndex) + 1);
        result.add(StackTraceRecoveryKt.artificialFrame(ARTIFICIAL_FRAME_MESSAGE));
        int i4 = probeIndex + 1;
        while (i4 < size) {
            if (isInternalMethod(stackTrace[i4])) {
                result.add(stackTrace[i4]);
                int j = i4 + 1;
                while (j < size && isInternalMethod(stackTrace[j])) {
                    j++;
                }
                int k = j - 1;
                while (k > i4 && stackTrace[k].getFileName() == null) {
                    k--;
                }
                if (k > i4 && k < j - 1) {
                    result.add(stackTrace[k]);
                }
                result.add(stackTrace[j - 1]);
                i4 = j;
            } else {
                result.add(stackTrace[i4]);
                i4++;
            }
        }
        return result;
    }

    private final boolean isInternalMethod(StackTraceElement $this$isInternalMethod) {
        return StringsKt.startsWith$default($this$isInternalMethod.getClassName(), "kotlinx.coroutines", false, 2, (Object) null);
    }
}
