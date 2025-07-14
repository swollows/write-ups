package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aA\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a+\u0010\f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nHHø\u0001\u0000¢\u0006\u0002\u0010\r\u001a+\u0010\f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nHHø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a+\u0010\u0010\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nHHø\u0001\u0000¢\u0006\u0002\u0010\r\u001a+\u0010\u0010\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nHHø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a+\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nHHø\u0001\u0000¢\u0006\u0002\u0010\r\u001a+\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nHHø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a3\u0010\u0012\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nHHø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a3\u0010\u0012\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nHHø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a3\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nHHø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"suspendWithStateAtLeastUnchecked", "R", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "dispatchNeeded", "", "lifecycleDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "block", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withCreated", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withResumed", "withStarted", "withStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withStateAtLeastUnchecked", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WithLifecycleState.kt */
public final class WithLifecycleStateKt {
    public static final <R> Object withStateAtLeast(Lifecycle $this$withStateAtLeast, Lifecycle.State state, Function0<? extends R> block, Continuation<? super R> $completion) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withStateAtLeast;
            MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
            boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
            if (!dispatchNeeded$iv) {
                if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                } else if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo(state) >= 0) {
                    return block.invoke();
                }
            }
            return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state, dispatchNeeded$iv, lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    private static final <R> Object withStateAtLeast$$forInline(Lifecycle $this$withStateAtLeast, Lifecycle.State state, Function0<? extends R> block, Continuation<? super R> $completion) {
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        Dispatchers.getMain().getImmediate();
        InlineMarker.mark(3);
        ? r4 = 0;
        r4.getContext();
        throw r4;
    }

    public static final <R> Object withCreated(Lifecycle $this$withCreated, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle.State state$iv = Lifecycle.State.CREATED;
        Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withCreated;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
        if (!dispatchNeeded$iv) {
            if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo(state$iv) >= 0) {
                return block.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    private static final <R> Object withCreated$$forInline(Lifecycle $this$withCreated, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        Dispatchers.getMain().getImmediate();
        InlineMarker.mark(3);
        ? r0 = 0;
        r0.getContext();
        throw r0;
    }

    public static final <R> Object withStarted(Lifecycle $this$withStarted, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle.State state$iv = Lifecycle.State.STARTED;
        Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withStarted;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
        if (!dispatchNeeded$iv) {
            if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo(state$iv) >= 0) {
                return block.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    private static final <R> Object withStarted$$forInline(Lifecycle $this$withStarted, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        Dispatchers.getMain().getImmediate();
        InlineMarker.mark(3);
        ? r0 = 0;
        r0.getContext();
        throw r0;
    }

    public static final <R> Object withResumed(Lifecycle $this$withResumed, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle.State state$iv = Lifecycle.State.RESUMED;
        Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withResumed;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
        if (!dispatchNeeded$iv) {
            if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo(state$iv) >= 0) {
                return block.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    private static final <R> Object withResumed$$forInline(Lifecycle $this$withResumed, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        Dispatchers.getMain().getImmediate();
        InlineMarker.mark(3);
        ? r0 = 0;
        r0.getContext();
        throw r0;
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner $this$withStateAtLeast, Lifecycle.State state, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle $this$withStateAtLeast$iv = $this$withStateAtLeast.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            Lifecycle $this$withStateAtLeastUnchecked$iv$iv = $this$withStateAtLeast$iv;
            MainCoroutineDispatcher lifecycleDispatcher$iv$iv = Dispatchers.getMain().getImmediate();
            boolean dispatchNeeded$iv$iv = lifecycleDispatcher$iv$iv.isDispatchNeeded($completion.getContext());
            if (!dispatchNeeded$iv$iv) {
                if ($this$withStateAtLeastUnchecked$iv$iv.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                } else if ($this$withStateAtLeastUnchecked$iv$iv.getCurrentState().compareTo(state) >= 0) {
                    return block.invoke();
                }
            }
            return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv$iv, state, dispatchNeeded$iv$iv, lifecycleDispatcher$iv$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner $this$withStateAtLeast, Lifecycle.State state, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle lifecycle = $this$withStateAtLeast.getLifecycle();
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        Dispatchers.getMain().getImmediate();
        InlineMarker.mark(3);
        ? r6 = 0;
        r6.getContext();
        throw r6;
    }

    public static final <R> Object withCreated(LifecycleOwner $this$withCreated, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withCreated.getLifecycle();
        Lifecycle.State state$iv = Lifecycle.State.CREATED;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
        if (!dispatchNeeded$iv) {
            if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo(state$iv) >= 0) {
                return block.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    private static final <R> Object withCreated$$forInline(LifecycleOwner $this$withCreated, Function0<? extends R> block, Continuation<? super R> $completion) {
        $this$withCreated.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        Dispatchers.getMain().getImmediate();
        InlineMarker.mark(3);
        ? r0 = 0;
        r0.getContext();
        throw r0;
    }

    public static final <R> Object withStarted(LifecycleOwner $this$withStarted, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withStarted.getLifecycle();
        Lifecycle.State state$iv = Lifecycle.State.STARTED;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
        if (!dispatchNeeded$iv) {
            if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo(state$iv) >= 0) {
                return block.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    private static final <R> Object withStarted$$forInline(LifecycleOwner $this$withStarted, Function0<? extends R> block, Continuation<? super R> $completion) {
        $this$withStarted.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        Dispatchers.getMain().getImmediate();
        InlineMarker.mark(3);
        ? r0 = 0;
        r0.getContext();
        throw r0;
    }

    public static final <R> Object withResumed(LifecycleOwner $this$withResumed, Function0<? extends R> block, Continuation<? super R> $completion) {
        Lifecycle $this$withStateAtLeastUnchecked$iv = $this$withResumed.getLifecycle();
        Lifecycle.State state$iv = Lifecycle.State.RESUMED;
        MainCoroutineDispatcher lifecycleDispatcher$iv = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded$iv = lifecycleDispatcher$iv.isDispatchNeeded($completion.getContext());
        if (!dispatchNeeded$iv) {
            if ($this$withStateAtLeastUnchecked$iv.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if ($this$withStateAtLeastUnchecked$iv.getCurrentState().compareTo(state$iv) >= 0) {
                return block.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked$iv, state$iv, dispatchNeeded$iv, lifecycleDispatcher$iv, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    private static final <R> Object withResumed$$forInline(LifecycleOwner $this$withResumed, Function0<? extends R> block, Continuation<? super R> $completion) {
        $this$withResumed.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        Dispatchers.getMain().getImmediate();
        InlineMarker.mark(3);
        ? r0 = 0;
        r0.getContext();
        throw r0;
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle $this$withStateAtLeastUnchecked, Lifecycle.State state, Function0<? extends R> block, Continuation<? super R> $completion) {
        MainCoroutineDispatcher lifecycleDispatcher = Dispatchers.getMain().getImmediate();
        boolean dispatchNeeded = lifecycleDispatcher.isDispatchNeeded($completion.getContext());
        if (!dispatchNeeded) {
            if ($this$withStateAtLeastUnchecked.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if ($this$withStateAtLeastUnchecked.getCurrentState().compareTo(state) >= 0) {
                return block.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked($this$withStateAtLeastUnchecked, state, dispatchNeeded, lifecycleDispatcher, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(block), $completion);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Throwable, kotlin.coroutines.Continuation] */
    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle $this$withStateAtLeastUnchecked, Lifecycle.State state, Function0<? extends R> block, Continuation<? super R> $completion) {
        Dispatchers.getMain().getImmediate();
        InlineMarker.mark(3);
        ? r0 = 0;
        r0.getContext();
        throw r0;
    }

    public static final <R> Object suspendWithStateAtLeastUnchecked(Lifecycle $this$suspendWithStateAtLeastUnchecked, Lifecycle.State state, boolean dispatchNeeded, CoroutineDispatcher lifecycleDispatcher, Function0<? extends R> block, Continuation<? super R> $completion) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted($completion), 1);
        cancellable$iv.initCancellability();
        CancellableContinuation co = cancellable$iv;
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 observer = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1(state, $this$suspendWithStateAtLeastUnchecked, co, block);
        if (dispatchNeeded) {
            lifecycleDispatcher.dispatch(EmptyCoroutineContext.INSTANCE, new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1($this$suspendWithStateAtLeastUnchecked, observer));
        } else {
            $this$suspendWithStateAtLeastUnchecked.addObserver(observer);
        }
        co.invokeOnCancellation(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(lifecycleDispatcher, $this$suspendWithStateAtLeastUnchecked, observer));
        Object result = cancellable$iv.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
        }
        return result;
    }
}
