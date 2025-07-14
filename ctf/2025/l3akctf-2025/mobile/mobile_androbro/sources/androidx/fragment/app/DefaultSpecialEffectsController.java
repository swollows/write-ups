package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003*+,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J(\u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\u000e\u001a\u00020\fH\u0002J@\u0010\u0018\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u001fH\u0002JL\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\b2\b\u0010$\u001a\u0004\u0018\u00010\bH\u0002J\u0016\u0010%\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002J&\u0010&\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170)H\u0002¨\u0006-"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "applyContainerChanges", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "captureTransitioningViews", "transitioningViews", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "view", "executeOperations", "operations", "", "isPop", "", "findNamedViews", "namedViews", "", "", "startAnimations", "animationInfos", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "awaitingContainerChanges", "", "startedAnyTransition", "startedTransitions", "", "startTransitions", "transitionInfos", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "firstOut", "lastIn", "syncAnimations", "retainMatchingViews", "Landroidx/collection/ArrayMap;", "names", "", "AnimationInfo", "SpecialEffectsInfo", "TransitionInfo", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DefaultSpecialEffectsController.kt */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public void executeOperations(List<? extends SpecialEffectsController.Operation> operations, boolean isPop) {
        Object element$iv;
        SpecialEffectsController.Operation operation;
        boolean z;
        boolean z2;
        List<? extends SpecialEffectsController.Operation> $this$firstOrNull$iv = operations;
        boolean z3 = isPop;
        Intrinsics.checkNotNullParameter($this$firstOrNull$iv, "operations");
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) element$iv;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = operation2.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            if (companion.asOperationState(view) != SpecialEffectsController.Operation.State.VISIBLE || operation2.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        SpecialEffectsController.Operation firstOut = (SpecialEffectsController.Operation) element$iv;
        List $this$lastOrNull$iv = operations;
        ListIterator iterator$iv = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
        while (true) {
            if (!iterator$iv.hasPrevious()) {
                operation = null;
                break;
            }
            Object previous = iterator$iv.previous();
            SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) previous;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation3.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            if (companion2.asOperationState(view2) == SpecialEffectsController.Operation.State.VISIBLE || operation3.getFinalState() != SpecialEffectsController.Operation.State.VISIBLE) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                operation = previous;
                break;
            }
        }
        SpecialEffectsController.Operation lastIn = operation;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Executing operations from " + firstOut + " to " + lastIn);
        }
        List animations = new ArrayList();
        List transitions = new ArrayList();
        List awaitingContainerChanges = CollectionsKt.toMutableList($this$firstOrNull$iv);
        syncAnimations(operations);
        for (SpecialEffectsController.Operation operation4 : operations) {
            CancellationSignal animCancellationSignal = new CancellationSignal();
            operation4.markStartedSpecialEffect(animCancellationSignal);
            animations.add(new AnimationInfo(operation4, animCancellationSignal, z3));
            CancellationSignal transitionCancellationSignal = new CancellationSignal();
            operation4.markStartedSpecialEffect(transitionCancellationSignal);
            transitions.add(new TransitionInfo(operation4, transitionCancellationSignal, z3, !z3 ? operation4 == lastIn : operation4 == firstOut));
            operation4.addCompletionListener(new DefaultSpecialEffectsController$$ExternalSyntheticLambda2(awaitingContainerChanges, operation4, this));
        }
        List<SpecialEffectsController.Operation> awaitingContainerChanges2 = awaitingContainerChanges;
        List list = transitions;
        Map startedTransitions = startTransitions(transitions, awaitingContainerChanges, isPop, firstOut, lastIn);
        startAnimations(animations, awaitingContainerChanges2, startedTransitions.containsValue(true), startedTransitions);
        for (SpecialEffectsController.Operation operation5 : awaitingContainerChanges2) {
            applyContainerChanges(operation5);
        }
        awaitingContainerChanges2.clear();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Completed executing operations from " + firstOut + " to " + lastIn);
        }
    }

    /* access modifiers changed from: private */
    public static final void executeOperations$lambda$2(List $awaitingContainerChanges, SpecialEffectsController.Operation $operation, DefaultSpecialEffectsController this$0) {
        Intrinsics.checkNotNullParameter($awaitingContainerChanges, "$awaitingContainerChanges");
        Intrinsics.checkNotNullParameter($operation, "$operation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ($awaitingContainerChanges.contains($operation)) {
            $awaitingContainerChanges.remove($operation);
            this$0.applyContainerChanges($operation);
        }
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> operations) {
        Fragment lastOpFragment = ((SpecialEffectsController.Operation) CollectionsKt.last(operations)).getFragment();
        for (SpecialEffectsController.Operation operation : operations) {
            operation.getFragment().mAnimationInfo.mEnterAnim = lastOpFragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = lastOpFragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = lastOpFragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = lastOpFragment.mAnimationInfo.mPopExitAnim;
        }
    }

    private final void startAnimations(List<AnimationInfo> animationInfos, List<SpecialEffectsController.Operation> awaitingContainerChanges, boolean startedAnyTransition, Map<SpecialEffectsController.Operation, Boolean> startedTransitions) {
        boolean startedAnyAnimator;
        Context context = getContainer().getContext();
        List<AnimationInfo> animationsToRun = new ArrayList<>();
        boolean startedAnyAnimator2 = false;
        Iterator<AnimationInfo> it = animationInfos.iterator();
        while (it.hasNext()) {
            AnimationInfo animationInfo = it.next();
            if (animationInfo.isVisibilityUnchanged()) {
                animationInfo.completeSpecialEffect();
                Map<SpecialEffectsController.Operation, Boolean> map = startedTransitions;
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                FragmentAnim.AnimationOrAnimator anim = animationInfo.getAnimation(context);
                if (anim == null) {
                    animationInfo.completeSpecialEffect();
                    Map<SpecialEffectsController.Operation, Boolean> map2 = startedTransitions;
                } else {
                    Animator animator = anim.animator;
                    if (animator == null) {
                        animationsToRun.add(animationInfo);
                        Map<SpecialEffectsController.Operation, Boolean> map3 = startedTransitions;
                    } else {
                        SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        boolean z = true;
                        if (Intrinsics.areEqual((Object) startedTransitions.get(operation), (Object) true)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            if (operation.getFinalState() != SpecialEffectsController.Operation.State.GONE) {
                                z = false;
                            }
                            boolean isHideOperation = z;
                            if (isHideOperation) {
                                awaitingContainerChanges.remove(operation);
                            } else {
                                List<SpecialEffectsController.Operation> list = awaitingContainerChanges;
                            }
                            View viewToAnimate = fragment.mView;
                            getContainer().startViewTransition(viewToAnimate);
                            View viewToAnimate2 = viewToAnimate;
                            Fragment fragment2 = fragment;
                            Iterator<AnimationInfo> it2 = it;
                            SpecialEffectsController.Operation operation2 = operation;
                            animator.addListener(new DefaultSpecialEffectsController$startAnimations$1(this, viewToAnimate2, isHideOperation, operation, animationInfo));
                            animator.setTarget(viewToAnimate2);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animator from operation " + operation2 + " has started.");
                            }
                            animationInfo.getSignal().setOnCancelListener(new DefaultSpecialEffectsController$$ExternalSyntheticLambda0(animator, operation2));
                            startedAnyAnimator2 = true;
                            it = it2;
                        }
                    }
                }
            }
        }
        for (AnimationInfo animationInfo2 : animationsToRun) {
            SpecialEffectsController.Operation operation3 = animationInfo2.getOperation();
            Fragment fragment3 = operation3.getFragment();
            if (startedAnyTransition) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment3 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo2.completeSpecialEffect();
            } else if (startedAnyAnimator2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment3 + " as Animations cannot run alongside Animators.");
                }
                animationInfo2.completeSpecialEffect();
            } else {
                View viewToAnimate3 = fragment3.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                FragmentAnim.AnimationOrAnimator animation = animationInfo2.getAnimation(context);
                if (animation != null) {
                    Animation anim2 = animation.animation;
                    if (anim2 != null) {
                        if (operation3.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                            viewToAnimate3.startAnimation(anim2);
                            animationInfo2.completeSpecialEffect();
                            startedAnyAnimator = startedAnyAnimator2;
                        } else {
                            getContainer().startViewTransition(viewToAnimate3);
                            Animation animation2 = new FragmentAnim.EndViewTransitionAnimation(anim2, getContainer(), viewToAnimate3);
                            animation2.setAnimationListener(new DefaultSpecialEffectsController$startAnimations$3(operation3, this, viewToAnimate3, animationInfo2));
                            viewToAnimate3.startAnimation(animation2);
                            if (FragmentManager.isLoggingEnabled(2)) {
                                startedAnyAnimator = startedAnyAnimator2;
                                Log.v(FragmentManager.TAG, "Animation from operation " + operation3 + " has started.");
                            } else {
                                startedAnyAnimator = startedAnyAnimator2;
                            }
                        }
                        animationInfo2.getSignal().setOnCancelListener(new DefaultSpecialEffectsController$$ExternalSyntheticLambda1(viewToAnimate3, this, animationInfo2, operation3));
                        startedAnyAnimator2 = startedAnyAnimator;
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void startAnimations$lambda$3(Animator $animator, SpecialEffectsController.Operation $operation) {
        Intrinsics.checkNotNullParameter($operation, "$operation");
        $animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + $operation + " has been canceled.");
        }
    }

    /* access modifiers changed from: private */
    public static final void startAnimations$lambda$4(View $viewToAnimate, DefaultSpecialEffectsController this$0, AnimationInfo $animationInfo, SpecialEffectsController.Operation $operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter($animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter($operation, "$operation");
        $viewToAnimate.clearAnimation();
        this$0.getContainer().endViewTransition($viewToAnimate);
        $animationInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + $operation + " has been cancelled.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x06d6, code lost:
        if (r1 == r47) goto L_0x06db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x06fb  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0734  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> startTransitions(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r43, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r44, boolean r45, androidx.fragment.app.SpecialEffectsController.Operation r46, androidx.fragment.app.SpecialEffectsController.Operation r47) {
        /*
            r42 = this;
            r0 = r42
            r1 = r45
            r2 = r46
            r3 = r47
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Map r4 = (java.util.Map) r4
            r5 = r43
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r5
            r9 = 0
            java.util.Iterator r10 = r8.iterator()
        L_0x0021:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0039
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r12 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r12
            r13 = 0
            boolean r12 = r12.isVisibilityUnchanged()
            if (r12 != 0) goto L_0x0021
            r7.add(r11)
            goto L_0x0021
        L_0x0039:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r5 = r7
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r5
            r9 = 0
            java.util.Iterator r10 = r8.iterator()
        L_0x004e:
            boolean r11 = r10.hasNext()
            r13 = 0
            if (r11 == 0) goto L_0x006c
            java.lang.Object r11 = r10.next()
            r14 = r11
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r14 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r14
            r15 = 0
            androidx.fragment.app.FragmentTransitionImpl r16 = r14.getHandlingImpl()
            if (r16 == 0) goto L_0x0065
            r12 = 1
            goto L_0x0066
        L_0x0065:
            r12 = r13
        L_0x0066:
            if (r12 == 0) goto L_0x004e
            r7.add(r11)
            goto L_0x004e
        L_0x006c:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r5 = 0
            r6 = r7
            r7 = 0
            r8 = r5
            java.util.Iterator r9 = r6.iterator()
        L_0x007a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00da
            java.lang.Object r10 = r9.next()
            r11 = r10
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r11 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r11
            r14 = r8
            r15 = 0
            androidx.fragment.app.FragmentTransitionImpl r12 = r11.getHandlingImpl()
            if (r14 == 0) goto L_0x0095
            if (r12 != r14) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            r17 = r13
            goto L_0x0097
        L_0x0095:
            r17 = 1
        L_0x0097:
            if (r17 == 0) goto L_0x009c
            r8 = r12
            goto L_0x007a
        L_0x009c:
            r9 = 0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r17 = r5
            java.lang.String r5 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            java.lang.StringBuilder r5 = r13.append(r5)
            androidx.fragment.app.SpecialEffectsController$Operation r13 = r11.getOperation()
            androidx.fragment.app.Fragment r13 = r13.getFragment()
            java.lang.StringBuilder r5 = r5.append(r13)
            java.lang.String r13 = " returned Transition "
            java.lang.StringBuilder r5 = r5.append(r13)
            java.lang.Object r13 = r11.getTransition()
            java.lang.StringBuilder r5 = r5.append(r13)
            java.lang.String r13 = " which uses a different Transition type than other Fragments."
            java.lang.StringBuilder r5 = r5.append(r13)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r9.<init>(r5)
            throw r9
        L_0x00da:
            r17 = r5
            r5 = r8
            if (r5 != 0) goto L_0x0100
            java.util.Iterator r6 = r43.iterator()
        L_0x00e4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00ff
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r7 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r7
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r7.getOperation()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r13)
            r4.put(r8, r9)
            r7.completeSpecialEffect()
            goto L_0x00e4
        L_0x00ff:
            return r4
        L_0x0100:
            android.view.View r6 = new android.view.View
            android.view.ViewGroup r7 = r42.getContainer()
            android.content.Context r7 = r7.getContext()
            r6.<init>(r7)
            r7 = 0
            r8 = 0
            r9 = 0
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
            r14.<init>()
            java.util.Iterator r15 = r43.iterator()
        L_0x0128:
            boolean r17 = r15.hasNext()
            r26 = 2
            java.lang.String r13 = "FragmentManager"
            if (r17 == 0) goto L_0x0504
            java.lang.Object r17 = r15.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r17 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r17
            boolean r27 = r17.hasSharedElementTransition()
            if (r27 == 0) goto L_0x04e5
            if (r2 == 0) goto L_0x04e5
            if (r3 == 0) goto L_0x04e5
            r28 = r15
            java.lang.Object r15 = r17.getSharedElementTransition()
            java.lang.Object r15 = r5.cloneTransition(r15)
            java.lang.Object r7 = r5.wrapTransitionInSet(r15)
            androidx.fragment.app.Fragment r15 = r47.getFragment()
            java.util.ArrayList r15 = r15.getSharedElementSourceNames()
            r29 = r8
            java.lang.String r8 = "lastIn.fragment.sharedElementSourceNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r8)
            r8 = r15
            androidx.fragment.app.Fragment r15 = r46.getFragment()
            java.util.ArrayList r15 = r15.getSharedElementSourceNames()
            r30 = r9
            java.lang.String r9 = "firstOut.fragment.sharedElementSourceNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r9)
            r9 = r15
            androidx.fragment.app.Fragment r15 = r46.getFragment()
            java.util.ArrayList r15 = r15.getSharedElementTargetNames()
            r31 = r4
            java.lang.String r4 = "firstOut.fragment.sharedElementTargetNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r4)
            r4 = r15
            r15 = 0
            r18 = r15
            int r15 = r4.size()
            r32 = r6
            r6 = r18
        L_0x018c:
            r33 = r10
            if (r6 >= r15) goto L_0x01ab
            java.lang.Object r10 = r4.get(r6)
            int r10 = r8.indexOf(r10)
            r34 = r4
            r4 = -1
            if (r10 == r4) goto L_0x01a4
            java.lang.Object r4 = r9.get(r6)
            r8.set(r10, r4)
        L_0x01a4:
            int r6 = r6 + 1
            r10 = r33
            r4 = r34
            goto L_0x018c
        L_0x01ab:
            r34 = r4
            androidx.fragment.app.Fragment r4 = r47.getFragment()
            java.util.ArrayList r4 = r4.getSharedElementTargetNames()
            java.lang.String r6 = "lastIn.fragment.sharedElementTargetNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            if (r1 != 0) goto L_0x01d1
            androidx.fragment.app.Fragment r6 = r46.getFragment()
            androidx.core.app.SharedElementCallback r6 = r6.getExitTransitionCallback()
            androidx.fragment.app.Fragment r10 = r47.getFragment()
            androidx.core.app.SharedElementCallback r10 = r10.getEnterTransitionCallback()
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r10)
            goto L_0x01e5
        L_0x01d1:
            androidx.fragment.app.Fragment r6 = r46.getFragment()
            androidx.core.app.SharedElementCallback r6 = r6.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r10 = r47.getFragment()
            androidx.core.app.SharedElementCallback r10 = r10.getExitTransitionCallback()
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r10)
        L_0x01e5:
            java.lang.Object r10 = r6.component1()
            androidx.core.app.SharedElementCallback r10 = (androidx.core.app.SharedElementCallback) r10
            java.lang.Object r6 = r6.component2()
            androidx.core.app.SharedElementCallback r6 = (androidx.core.app.SharedElementCallback) r6
            int r15 = r8.size()
            r19 = 0
            r35 = r9
            r9 = r19
        L_0x01fb:
            if (r9 >= r15) goto L_0x0222
            java.lang.Object r19 = r8.get(r9)
            r36 = r15
            r15 = r19
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r19 = r4.get(r9)
            r37 = r5
            r5 = r19
            java.lang.String r5 = (java.lang.String) r5
            r38 = r7
            r7 = r14
            java.util.Map r7 = (java.util.Map) r7
            r7.put(r15, r5)
            int r9 = r9 + 1
            r15 = r36
            r5 = r37
            r7 = r38
            goto L_0x01fb
        L_0x0222:
            r37 = r5
            r38 = r7
            r36 = r15
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r26)
            if (r5 == 0) goto L_0x0284
            java.lang.String r5 = ">>> entering view names <<<"
            android.util.Log.v(r13, r5)
            java.util.Iterator r5 = r4.iterator()
        L_0x0237:
            boolean r7 = r5.hasNext()
            java.lang.String r9 = "Name: "
            if (r7 == 0) goto L_0x025a
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.StringBuilder r9 = r15.append(r9)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r13, r9)
            goto L_0x0237
        L_0x025a:
            java.lang.String r5 = ">>> exiting view names <<<"
            android.util.Log.v(r13, r5)
            java.util.Iterator r5 = r8.iterator()
        L_0x0263:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0284
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.StringBuilder r15 = r15.append(r9)
            java.lang.StringBuilder r15 = r15.append(r7)
            java.lang.String r15 = r15.toString()
            android.util.Log.v(r13, r15)
            goto L_0x0263
        L_0x0284:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            r7 = r5
            java.util.Map r7 = (java.util.Map) r7
            androidx.fragment.app.Fragment r9 = r46.getFragment()
            android.view.View r9 = r9.mView
            java.lang.String r15 = "firstOut.fragment.mView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r15)
            r0.findNamedViews(r7, r9)
            r7 = r8
            java.util.Collection r7 = (java.util.Collection) r7
            r5.retainAll(r7)
            if (r10 == 0) goto L_0x0317
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r26)
            if (r7 == 0) goto L_0x02bf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Executing exit callback for operation "
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r13, r7)
        L_0x02bf:
            r7 = r8
            java.util.List r7 = (java.util.List) r7
            r9 = r5
            java.util.Map r9 = (java.util.Map) r9
            r10.onMapSharedElements(r7, r9)
            int r7 = r8.size()
            r9 = -1
            int r7 = r7 + r9
            if (r7 < 0) goto L_0x0314
        L_0x02d0:
            r15 = r7
            int r7 = r7 + r9
            java.lang.Object r9 = r8.get(r15)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r19 = r5.get(r9)
            android.view.View r19 = (android.view.View) r19
            if (r19 != 0) goto L_0x02e8
            r14.remove(r9)
            r39 = r10
            r21 = r15
            goto L_0x030d
        L_0x02e8:
            r39 = r10
            java.lang.String r10 = androidx.core.view.ViewCompat.getTransitionName(r19)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 != 0) goto L_0x0309
            java.lang.Object r10 = r14.remove(r9)
            java.lang.String r10 = (java.lang.String) r10
            r20 = r9
            r9 = r14
            java.util.Map r9 = (java.util.Map) r9
            r21 = r15
            java.lang.String r15 = androidx.core.view.ViewCompat.getTransitionName(r19)
            r9.put(r15, r10)
            goto L_0x030d
        L_0x0309:
            r20 = r9
            r21 = r15
        L_0x030d:
            if (r7 >= 0) goto L_0x0310
            goto L_0x0322
        L_0x0310:
            r10 = r39
            r9 = -1
            goto L_0x02d0
        L_0x0314:
            r39 = r10
            goto L_0x0322
        L_0x0317:
            r39 = r10
            java.util.Set r7 = r5.keySet()
            java.util.Collection r7 = (java.util.Collection) r7
            r14.retainAll(r7)
        L_0x0322:
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            r9 = r7
            java.util.Map r9 = (java.util.Map) r9
            androidx.fragment.app.Fragment r10 = r47.getFragment()
            android.view.View r10 = r10.mView
            java.lang.String r15 = "lastIn.fragment.mView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r15)
            r0.findNamedViews(r9, r10)
            r9 = r4
            java.util.Collection r9 = (java.util.Collection) r9
            r7.retainAll(r9)
            java.util.Collection r9 = r14.values()
            r7.retainAll(r9)
            if (r6 == 0) goto L_0x03ce
            boolean r9 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r26)
            if (r9 == 0) goto L_0x0364
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Executing enter callback for operation "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r13, r9)
        L_0x0364:
            r9 = r4
            java.util.List r9 = (java.util.List) r9
            r10 = r7
            java.util.Map r10 = (java.util.Map) r10
            r6.onMapSharedElements(r9, r10)
            int r9 = r4.size()
            r10 = -1
            int r9 = r9 + r10
            if (r9 < 0) goto L_0x03cb
        L_0x0375:
            r13 = r9
            int r9 = r9 + r10
            java.lang.Object r15 = r4.get(r13)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r18 = r7.get(r15)
            android.view.View r18 = (android.view.View) r18
            java.lang.String r10 = "name"
            if (r18 != 0) goto L_0x039d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r10)
            java.lang.String r10 = androidx.fragment.app.FragmentTransition.findKeyForValue(r14, r15)
            if (r10 == 0) goto L_0x0398
            r14.remove(r10)
            r40 = r6
            r20 = r13
            goto L_0x03c4
        L_0x0398:
            r40 = r6
            r20 = r13
            goto L_0x03c4
        L_0x039d:
            r40 = r6
            java.lang.String r6 = androidx.core.view.ViewCompat.getTransitionName(r18)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r6)
            if (r6 != 0) goto L_0x03c2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r10)
            java.lang.String r6 = androidx.fragment.app.FragmentTransition.findKeyForValue(r14, r15)
            if (r6 == 0) goto L_0x03bf
            r10 = r14
            java.util.Map r10 = (java.util.Map) r10
            r20 = r13
            java.lang.String r13 = androidx.core.view.ViewCompat.getTransitionName(r18)
            r10.put(r6, r13)
            goto L_0x03c4
        L_0x03bf:
            r20 = r13
            goto L_0x03c4
        L_0x03c2:
            r20 = r13
        L_0x03c4:
            if (r9 >= 0) goto L_0x03c7
            goto L_0x03d3
        L_0x03c7:
            r6 = r40
            r10 = -1
            goto L_0x0375
        L_0x03cb:
            r40 = r6
            goto L_0x03d3
        L_0x03ce:
            r40 = r6
            androidx.fragment.app.FragmentTransition.retainValues(r14, r7)
        L_0x03d3:
            java.util.Set r6 = r14.keySet()
            java.lang.String r9 = "sharedElementNameMapping.keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r9)
            java.util.Collection r6 = (java.util.Collection) r6
            r0.retainMatchingViews(r5, r6)
            java.util.Collection r6 = r14.values()
            java.lang.String r9 = "sharedElementNameMapping.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r9)
            r0.retainMatchingViews(r7, r6)
            boolean r6 = r14.isEmpty()
            if (r6 == 0) goto L_0x040e
            r6 = 0
            r11.clear()
            r12.clear()
            r7 = r6
            r15 = r28
            r8 = r29
            r9 = r30
            r4 = r31
            r6 = r32
            r10 = r33
            r5 = r37
            r13 = 0
            goto L_0x0128
        L_0x040e:
            androidx.fragment.app.Fragment r6 = r47.getFragment()
            androidx.fragment.app.Fragment r9 = r46.getFragment()
            r10 = 1
            androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r6, r9, r1, r5, r10)
            android.view.ViewGroup r6 = r42.getContainer()
            android.view.View r6 = (android.view.View) r6
            androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda3 r9 = new androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda3
            r9.<init>(r3, r2, r1, r7)
            androidx.core.view.OneShotPreDrawListener.add(r6, r9)
            java.util.Collection r6 = r5.values()
            r11.addAll(r6)
            r6 = r8
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0451
            r6 = 0
            java.lang.Object r9 = r8.get(r6)
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r9 = r5.get(r6)
            android.view.View r9 = (android.view.View) r9
            r10 = r37
            r13 = r38
            r10.setEpicenter((java.lang.Object) r13, (android.view.View) r9)
            r29 = r9
            goto L_0x0455
        L_0x0451:
            r10 = r37
            r13 = r38
        L_0x0455:
            java.util.Collection r6 = r7.values()
            r12.addAll(r6)
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x049f
            r6 = 0
            java.lang.Object r9 = r4.get(r6)
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r9 = r7.get(r6)
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L_0x0496
            r15 = 1
            r18 = r10
            android.view.ViewGroup r19 = r42.getContainer()
            r1 = r19
            android.view.View r1 = (android.view.View) r1
            r37 = r4
            androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda4 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda4
            r38 = r5
            r5 = r33
            r41 = r18
            r18 = r6
            r6 = r41
            r4.<init>(r6, r9, r5)
            androidx.core.view.OneShotPreDrawListener.add(r1, r4)
            r9 = r15
            goto L_0x04a7
        L_0x0496:
            r37 = r4
            r38 = r5
            r18 = r6
            r5 = r33
            goto L_0x04a5
        L_0x049f:
            r37 = r4
            r38 = r5
            r5 = r33
        L_0x04a5:
            r9 = r30
        L_0x04a7:
            r1 = r32
            r10.setSharedElementTargets(r13, r1, r11)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r18 = r10
            r19 = r13
            r24 = r13
            r25 = r12
            r18.scheduleRemoveTargets(r19, r20, r21, r22, r23, r24, r25)
            r4 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r15 = r31
            r15.put(r2, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r15.put(r3, r6)
            r6 = r1
            r7 = r13
            r4 = r15
            r15 = r28
            r8 = r29
            r13 = 0
            r1 = r45
            r41 = r10
            r10 = r5
            r5 = r41
            goto L_0x0128
        L_0x04e5:
            r1 = r6
            r29 = r8
            r30 = r9
            r28 = r15
            r15 = r4
            r41 = r10
            r10 = r5
            r5 = r41
            r6 = r1
            r4 = r15
            r15 = r28
            r8 = r29
            r9 = r30
            r13 = 0
            r1 = r45
            r41 = r10
            r10 = r5
            r5 = r41
            goto L_0x0128
        L_0x0504:
            r15 = r4
            r1 = r6
            r29 = r8
            r30 = r9
            r41 = r10
            r10 = r5
            r5 = r41
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
            r8 = 0
            java.util.Iterator r9 = r43.iterator()
        L_0x051a:
            boolean r17 = r9.hasNext()
            if (r17 == 0) goto L_0x0667
            java.lang.Object r17 = r9.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r17 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r17
            boolean r18 = r17.isVisibilityUnchanged()
            if (r18 == 0) goto L_0x0543
            r27 = r9
            androidx.fragment.app.SpecialEffectsController$Operation r9 = r17.getOperation()
            r28 = r14
            r18 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r18)
            r15.put(r9, r14)
            r17.completeSpecialEffect()
            r32 = r13
            goto L_0x0575
        L_0x0543:
            r27 = r9
            r28 = r14
            java.lang.Object r9 = r17.getTransition()
            java.lang.Object r9 = r10.cloneTransition(r9)
            androidx.fragment.app.SpecialEffectsController$Operation r14 = r17.getOperation()
            if (r7 == 0) goto L_0x055c
            if (r14 == r2) goto L_0x0559
            if (r14 != r3) goto L_0x055c
        L_0x0559:
            r18 = 1
            goto L_0x055e
        L_0x055c:
            r18 = 0
        L_0x055e:
            r31 = r18
            if (r9 != 0) goto L_0x057c
            if (r31 != 0) goto L_0x0573
            r32 = r13
            r18 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r18)
            r15.put(r14, r13)
            r17.completeSpecialEffect()
            goto L_0x0575
        L_0x0573:
            r32 = r13
        L_0x0575:
            r9 = r27
            r14 = r28
            r13 = r32
            goto L_0x051a
        L_0x057c:
            r32 = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            androidx.fragment.app.Fragment r3 = r14.getFragment()
            android.view.View r3 = r3.mView
            r33 = r7
            java.lang.String r7 = "operation.fragment.mView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            r0.captureTransitioningViews(r13, r3)
            if (r31 == 0) goto L_0x05b0
            if (r14 != r2) goto L_0x05a4
            r3 = r11
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r3 = kotlin.collections.CollectionsKt.toSet(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r13.removeAll(r3)
            goto L_0x05b0
        L_0x05a4:
            r3 = r12
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r3 = kotlin.collections.CollectionsKt.toSet(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r13.removeAll(r3)
        L_0x05b0:
            boolean r3 = r13.isEmpty()
            if (r3 == 0) goto L_0x05bc
            r10.addTarget(r9, r1)
            r3 = r44
            goto L_0x0610
        L_0x05bc:
            r10.addTargets(r9, r13)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r18 = r10
            r19 = r9
            r20 = r9
            r21 = r13
            r18.scheduleRemoveTargets(r19, r20, r21, r22, r23, r24, r25)
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r14.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r3 != r7) goto L_0x060e
            r3 = r44
            r3.remove(r14)
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = r13
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            r0 = r7
            androidx.fragment.app.Fragment r7 = r14.getFragment()
            android.view.View r7 = r7.mView
            r0.remove(r7)
            androidx.fragment.app.Fragment r7 = r14.getFragment()
            android.view.View r7 = r7.mView
            r10.scheduleHideFragmentView(r9, r7, r0)
            android.view.ViewGroup r7 = r42.getContainer()
            android.view.View r7 = (android.view.View) r7
            r18 = r0
            androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda5 r0 = new androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda5
            r0.<init>(r13)
            androidx.core.view.OneShotPreDrawListener.add(r7, r0)
            goto L_0x0610
        L_0x060e:
            r3 = r44
        L_0x0610:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r14.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r0 != r7) goto L_0x0629
            r0 = r13
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            if (r30 == 0) goto L_0x0626
            r10.setEpicenter((java.lang.Object) r9, (android.graphics.Rect) r5)
            r0 = r29
            goto L_0x062e
        L_0x0626:
            r0 = r29
            goto L_0x062e
        L_0x0629:
            r0 = r29
            r10.setEpicenter((java.lang.Object) r9, (android.view.View) r0)
        L_0x062e:
            r29 = r0
            r7 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r15.put(r14, r0)
            boolean r0 = r17.isOverlapAllowed()
            r7 = 0
            if (r0 == 0) goto L_0x0653
            java.lang.Object r6 = r10.mergeTransitionsTogether(r6, r9, r7)
            r0 = r42
            r3 = r47
            r9 = r27
            r14 = r28
            r13 = r32
            r7 = r33
            goto L_0x051a
        L_0x0653:
            java.lang.Object r8 = r10.mergeTransitionsTogether(r8, r9, r7)
            r0 = r42
            r3 = r47
            r9 = r27
            r14 = r28
            r13 = r32
            r7 = r33
            goto L_0x051a
        L_0x0667:
            r3 = r44
            r33 = r7
            r32 = r13
            r28 = r14
            java.lang.Object r0 = r10.mergeTransitionsInSequence(r6, r8, r7)
            if (r0 != 0) goto L_0x0678
            return r15
        L_0x0678:
            r6 = r43
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r9 = 0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Collection r13 = (java.util.Collection) r13
            r14 = r6
            r17 = 0
            java.util.Iterator r18 = r14.iterator()
        L_0x068b:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L_0x06a9
            r24 = r1
            java.lang.Object r1 = r18.next()
            r19 = r1
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r19 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r19
            r20 = 0
            boolean r19 = r19.isVisibilityUnchanged()
            if (r19 != 0) goto L_0x06a6
            r13.add(r1)
        L_0x06a6:
            r1 = r24
            goto L_0x068b
        L_0x06a9:
            r24 = r1
            r1 = r13
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r6 = 0
            java.util.Iterator r9 = r1.iterator()
        L_0x06b7:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x075e
            java.lang.Object r13 = r9.next()
            r14 = r13
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r14 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r14
            r17 = 0
            java.lang.Object r18 = r14.getTransition()
            r19 = r1
            androidx.fragment.app.SpecialEffectsController$Operation r1 = r14.getOperation()
            if (r7 == 0) goto L_0x06de
            if (r1 == r2) goto L_0x06d9
            r2 = r47
            if (r1 != r2) goto L_0x06e0
            goto L_0x06db
        L_0x06d9:
            r2 = r47
        L_0x06db:
            r20 = 1
            goto L_0x06e2
        L_0x06de:
            r2 = r47
        L_0x06e0:
            r20 = 0
        L_0x06e2:
            if (r18 != 0) goto L_0x06ef
            if (r20 == 0) goto L_0x06e8
            goto L_0x06ef
        L_0x06e8:
            r33 = r5
            r21 = r6
            r3 = r32
            goto L_0x074f
        L_0x06ef:
            android.view.ViewGroup r21 = r42.getContainer()
            android.view.View r21 = (android.view.View) r21
            boolean r21 = androidx.core.view.ViewCompat.isLaidOut(r21)
            if (r21 != 0) goto L_0x0734
            boolean r21 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r26)
            if (r21 == 0) goto L_0x072a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SpecialEffectsController: Container "
            java.lang.StringBuilder r2 = r2.append(r3)
            android.view.ViewGroup r3 = r42.getContainer()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " has not been laid out. Completing operation "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            r3 = r32
            android.util.Log.v(r3, r2)
            goto L_0x072c
        L_0x072a:
            r3 = r32
        L_0x072c:
            r14.completeSpecialEffect()
            r33 = r5
            r21 = r6
            goto L_0x074f
        L_0x0734:
            r3 = r32
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r14.getOperation()
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            r33 = r5
            androidx.core.os.CancellationSignal r5 = r14.getSignal()
            r21 = r6
            androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda6 r6 = new androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda6
            r6.<init>(r14, r1)
            r10.setListenerForTransitionEnd(r2, r0, r5, r6)
        L_0x074f:
            r2 = r46
            r32 = r3
            r1 = r19
            r6 = r21
            r5 = r33
            r3 = r44
            goto L_0x06b7
        L_0x075e:
            r19 = r1
            r33 = r5
            r21 = r6
            r3 = r32
            android.view.ViewGroup r1 = r42.getContainer()
            android.view.View r1 = (android.view.View) r1
            boolean r1 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r1 != 0) goto L_0x0773
            return r15
        L_0x0773:
            r1 = r4
            java.util.List r1 = (java.util.List) r1
            r2 = 4
            androidx.fragment.app.FragmentTransition.setViewVisibility(r1, r2)
            java.util.ArrayList r1 = r10.prepareSetNameOverridesReordered(r12)
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r26)
            if (r2 == 0) goto L_0x0807
            java.lang.String r2 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r3, r2)
            java.lang.String r2 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r3, r2)
            java.util.Iterator r2 = r11.iterator()
        L_0x0792:
            boolean r5 = r2.hasNext()
            java.lang.String r6 = " Name: "
            java.lang.String r9 = "View: "
            if (r5 == 0) goto L_0x07ca
            java.lang.Object r5 = r2.next()
            java.lang.String r13 = "sharedElementFirstOutViews"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r13)
            android.view.View r5 = (android.view.View) r5
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r9 = r13.append(r9)
            java.lang.StringBuilder r9 = r9.append(r5)
            java.lang.StringBuilder r6 = r9.append(r6)
            java.lang.String r9 = androidx.core.view.ViewCompat.getTransitionName(r5)
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r3, r6)
            goto L_0x0792
        L_0x07ca:
            java.lang.String r2 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r3, r2)
            java.util.Iterator r2 = r12.iterator()
        L_0x07d3:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0807
            java.lang.Object r5 = r2.next()
            java.lang.String r13 = "sharedElementLastInViews"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r13)
            android.view.View r5 = (android.view.View) r5
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r13 = r13.append(r9)
            java.lang.StringBuilder r13 = r13.append(r5)
            java.lang.StringBuilder r13 = r13.append(r6)
            java.lang.String r14 = androidx.core.view.ViewCompat.getTransitionName(r5)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.util.Log.v(r3, r13)
            goto L_0x07d3
        L_0x0807:
            android.view.ViewGroup r2 = r42.getContainer()
            r10.beginDelayedTransition(r2, r0)
            android.view.ViewGroup r2 = r42.getContainer()
            r19 = r2
            android.view.View r19 = (android.view.View) r19
            r23 = r28
            java.util.Map r23 = (java.util.Map) r23
            r18 = r10
            r20 = r11
            r21 = r12
            r22 = r1
            r18.setNameOverridesReordered(r19, r20, r21, r22, r23)
            r2 = r4
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            androidx.fragment.app.FragmentTransition.setViewVisibility(r2, r3)
            r10.swapSharedElementTargets(r7, r11, r12)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.startTransitions(java.util.List, java.util.List, boolean, androidx.fragment.app.SpecialEffectsController$Operation, androidx.fragment.app.SpecialEffectsController$Operation):java.util.Map");
    }

    /* access modifiers changed from: private */
    public static final void startTransitions$lambda$9(SpecialEffectsController.Operation $lastIn, SpecialEffectsController.Operation $firstOut, boolean $isPop, ArrayMap $lastInViews) {
        Intrinsics.checkNotNullParameter($lastInViews, "$lastInViews");
        FragmentTransition.callSharedElementStartEnd($lastIn.getFragment(), $firstOut.getFragment(), $isPop, $lastInViews, false);
    }

    /* access modifiers changed from: private */
    public static final void startTransitions$lambda$10(FragmentTransitionImpl $impl, View $lastInEpicenterView, Rect $lastInEpicenterRect) {
        Intrinsics.checkNotNullParameter($impl, "$impl");
        Intrinsics.checkNotNullParameter($lastInEpicenterRect, "$lastInEpicenterRect");
        $impl.getBoundsOnScreen($lastInEpicenterView, $lastInEpicenterRect);
    }

    /* access modifiers changed from: private */
    public static final void startTransitions$lambda$11(ArrayList $transitioningViews) {
        Intrinsics.checkNotNullParameter($transitioningViews, "$transitioningViews");
        FragmentTransition.setViewVisibility($transitioningViews, 4);
    }

    /* access modifiers changed from: private */
    public static final void startTransitions$lambda$14$lambda$13(TransitionInfo $transitionInfo, SpecialEffectsController.Operation $operation) {
        Intrinsics.checkNotNullParameter($transitionInfo, "$transitionInfo");
        Intrinsics.checkNotNullParameter($operation, "$operation");
        $transitionInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Transition for operation " + $operation + " has completed");
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> $this$retainMatchingViews, Collection<String> names) {
        Set<Map.Entry<String, View>> entrySet = $this$retainMatchingViews.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "entries");
        CollectionsKt.retainAll(entrySet, new DefaultSpecialEffectsController$retainMatchingViews$1(names));
    }

    private final void captureTransitioningViews(ArrayList<View> transitioningViews, View view) {
        if (view instanceof ViewGroup) {
            if (!ViewGroupCompat.isTransitionGroup((ViewGroup) view)) {
                int count = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < count; i++) {
                    View child = ((ViewGroup) view).getChildAt(i);
                    if (child.getVisibility() == 0) {
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        captureTransitioningViews(transitioningViews, child);
                    }
                }
            } else if (!transitioningViews.contains(view)) {
                transitioningViews.add(view);
            }
        } else if (transitioningViews.contains(view) == 0) {
            transitioningViews.add(view);
        }
    }

    private final void findNamedViews(Map<String, View> namedViews, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            namedViews.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            int count = ((ViewGroup) view).getChildCount();
            for (int i = 0; i < count; i++) {
                View child = ((ViewGroup) view).getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    findNamedViews(namedViews, child);
                }
            }
        }
    }

    private final void applyContainerChanges(SpecialEffectsController.Operation operation) {
        View view = operation.getFragment().mView;
        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        finalState.applyState(view);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;)V", "isVisibilityUnchanged", "", "()Z", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "getSignal", "()Landroidx/core/os/CancellationSignal;", "completeSpecialEffect", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: DefaultSpecialEffectsController.kt */
    private static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation operation;
        private final CancellationSignal signal;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation2, CancellationSignal signal2) {
            Intrinsics.checkNotNullParameter(operation2, "operation");
            Intrinsics.checkNotNullParameter(signal2, "signal");
            this.operation = operation2;
            this.signal = signal2;
        }

        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final CancellationSignal getSignal() {
            return this.signal;
        }

        public final boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = this.operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State currentState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            return currentState == finalState || !(currentState == SpecialEffectsController.Operation.State.VISIBLE || finalState == SpecialEffectsController.Operation.State.VISIBLE);
        }

        public final void completeSpecialEffect() {
            this.operation.completeSpecialEffect(this.signal);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "isPop", "", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;Z)V", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "getAnimation", "context", "Landroid/content/Context;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: DefaultSpecialEffectsController.kt */
    private static final class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, CancellationSignal signal, boolean isPop2) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.isPop = isPop2;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator it = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = it;
            this.isAnimLoaded = true;
            return it;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010\u0016\u001a\u00020\u0007R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "isPop", "", "providesSharedElementTransition", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;ZZ)V", "handlingImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "isOverlapAllowed", "()Z", "sharedElementTransition", "", "getSharedElementTransition", "()Ljava/lang/Object;", "transition", "getTransition", "hasSharedElementTransition", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: DefaultSpecialEffectsController.kt */
    private static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        private final Object sharedElementTransition;
        private final Object transition;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, CancellationSignal signal, boolean isPop, boolean providesSharedElementTransition) {
            super(operation, signal);
            Object obj;
            boolean z;
            Object obj2;
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                Fragment fragment = operation.getFragment();
                obj = isPop ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                obj = isPop ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = obj;
            if (operation.getFinalState() != SpecialEffectsController.Operation.State.VISIBLE) {
                z = true;
            } else if (isPop) {
                z = operation.getFragment().getAllowReturnTransitionOverlap();
            } else {
                z = operation.getFragment().getAllowEnterTransitionOverlap();
            }
            this.isOverlapAllowed = z;
            if (!providesSharedElementTransition) {
                obj2 = null;
            } else if (isPop) {
                obj2 = operation.getFragment().getSharedElementReturnTransition();
            } else {
                obj2 = operation.getFragment().getSharedElementEnterTransition();
            }
            this.sharedElementTransition = obj2;
        }

        public final Object getTransition() {
            return this.transition;
        }

        public final boolean isOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl transitionImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl sharedElementTransitionImpl = getHandlingImpl(this.sharedElementTransition);
            if (transitionImpl == null || sharedElementTransitionImpl == null || transitionImpl == sharedElementTransitionImpl) {
                return transitionImpl == null ? sharedElementTransitionImpl : transitionImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        private final FragmentTransitionImpl getHandlingImpl(Object transition2) {
            if (transition2 == null) {
                return null;
            }
            if (FragmentTransition.PLATFORM_IMPL != null && FragmentTransition.PLATFORM_IMPL.canHandle(transition2)) {
                return FragmentTransition.PLATFORM_IMPL;
            }
            if (FragmentTransition.SUPPORT_IMPL != null && FragmentTransition.SUPPORT_IMPL.canHandle(transition2)) {
                return FragmentTransition.SUPPORT_IMPL;
            }
            throw new IllegalArgumentException("Transition " + transition2 + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
