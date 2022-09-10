.class public final Lcom/example/summer/MainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "MainActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0008\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J \u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\u0012\u0010\u001a\u001a\u00020\u000e2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0008\u0010\u001d\u001a\u00020\u000eH\u0002J\u0008\u0010\u001e\u001a\u00020\u000eH\u0002J\u0008\u0010\u001f\u001a\u00020\u000eH\u0002J\u0008\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/example/summer/MainActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "binding",
        "Lcom/example/summer/databinding/ActivityMainBinding;",
        "serviceIntent",
        "Landroid/content/Intent;",
        "time",
        "",
        "timerStarted",
        "",
        "updateTime",
        "Landroid/content/BroadcastReceiver;",
        "checkTime",
        "",
        "intent",
        "gen",
        "",
        "i",
        "generateFlag",
        "",
        "getTimeStringFromDouble",
        "makeTimeString",
        "hour",
        "min",
        "sec",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "resetTimer",
        "startStopTimer",
        "startTimer",
        "stopTimer",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private binding:Lcom/example/summer/databinding/ActivityMainBinding;

.field private serviceIntent:Landroid/content/Intent;

.field private time:D

.field private timerStarted:Z

.field private final updateTime:Landroid/content/BroadcastReceiver;


# direct methods
.method public static synthetic $r8$lambda$HLJ2Gj74xvOVJ1SXyit8kCFH4xI(Lcom/example/summer/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/example/summer/MainActivity;->onCreate$lambda-1(Lcom/example/summer/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$VhhU6230SoKJBVTxPkQBQNqMPuE(Lcom/example/summer/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/example/summer/MainActivity;->onCreate$lambda-2(Lcom/example/summer/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$pQFsgvFvnL1EpA_lUKdwtq9YK6U(Lcom/example/summer/MainActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/example/summer/MainActivity;->onCreate$lambda-0(Lcom/example/summer/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 105
    new-instance v0, Lcom/example/summer/MainActivity$updateTime$1;

    invoke-direct {v0, p0}, Lcom/example/summer/MainActivity$updateTime$1;-><init>(Lcom/example/summer/MainActivity;)V

    check-cast v0, Landroid/content/BroadcastReceiver;

    iput-object v0, p0, Lcom/example/summer/MainActivity;->updateTime:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lcom/example/summer/MainActivity;)Lcom/example/summer/databinding/ActivityMainBinding;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/example/summer/MainActivity;->binding:Lcom/example/summer/databinding/ActivityMainBinding;

    return-object p0
.end method

.method public static final synthetic access$getTime$p(Lcom/example/summer/MainActivity;)D
    .locals 2

    .line 20
    iget-wide v0, p0, Lcom/example/summer/MainActivity;->time:D

    return-wide v0
.end method

.method public static final synthetic access$getTimeStringFromDouble(Lcom/example/summer/MainActivity;D)Ljava/lang/String;
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/example/summer/MainActivity;->getTimeStringFromDouble(D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setTime$p(Lcom/example/summer/MainActivity;D)V
    .locals 0

    .line 20
    iput-wide p1, p0, Lcom/example/summer/MainActivity;->time:D

    return-void
.end method

.method private final checkTime(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "timeExtra"

    const-wide/16 v1, 0x0

    .line 42
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    double-to-int p1, v0

    const v0, 0x15180

    .line 43
    rem-int/2addr p1, v0

    div-int/lit16 p1, p1, 0xe10

    const/16 v0, 0x7a69

    if-lt p1, v0, :cond_0

    .line 45
    invoke-direct {p0}, Lcom/example/summer/MainActivity;->generateFlag()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "\ud50c\ub798\uadf8\ub97c \uc8fc\uae30\uc5d4 \uc544\uc9c1 \ub108\ubb34 \ub354\uc6b4\uac78..."

    .line 49
    :goto_0
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    check-cast p1, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private final gen(I)I
    .locals 5

    .line 63
    invoke-static {}, Lcom/example/summer/MainActivityKt;->getKEY()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 64
    invoke-static {}, Lcom/example/summer/MainActivityKt;->getKEY()Ljava/util/List;

    move-result-object v1

    rem-int v2, p1, v0

    add-int/lit8 v2, v2, 0x1

    sub-int/2addr v0, v2

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    int-to-double v1, p1

    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    .line 65
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-int p1, v1

    rem-int/lit16 p1, p1, 0x100

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->first(Ljava/lang/CharSequence;)C

    move-result v0

    xor-int/2addr p1, v0

    return p1
.end method

.method private final generateFlag()Ljava/lang/String;
    .locals 13

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 54
    invoke-static {}, Lcom/example/summer/MainActivityKt;->getFLAG()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 56
    invoke-static {}, Lcom/example/summer/MainActivityKt;->getFLAG()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {}, Lcom/example/summer/MainActivityKt;->getKEY()Ljava/util/List;

    move-result-object v5

    invoke-static {}, Lcom/example/summer/MainActivityKt;->getKEY()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    rem-int v6, v2, v6

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->first(Ljava/lang/CharSequence;)C

    move-result v5

    xor-int/2addr v4, v5

    invoke-direct {p0, v2}, Lcom/example/summer/MainActivity;->gen(I)I

    move-result v2

    sub-int/2addr v4, v2

    int-to-char v2, v4

    .line 57
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v2, v3

    goto :goto_0

    .line 59
    :cond_0
    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    const-string v0, ""

    move-object v5, v0

    check-cast v5, Ljava/lang/CharSequence;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3e

    const/4 v12, 0x0

    invoke-static/range {v4 .. v12}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getTimeStringFromDouble(D)Ljava/lang/String;
    .locals 1

    .line 113
    invoke-static {p1, p2}, Lkotlin/math/MathKt;->roundToInt(D)I

    move-result p1

    const p2, 0x15180

    .line 114
    rem-int/2addr p1, p2

    div-int/lit16 p2, p1, 0xe10

    .line 115
    rem-int/lit16 p1, p1, 0xe10

    div-int/lit8 v0, p1, 0x3c

    .line 116
    rem-int/lit8 p1, p1, 0x3c

    .line 118
    invoke-direct {p0, p2, v0, p1}, Lcom/example/summer/MainActivity;->makeTimeString(III)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final makeTimeString(III)Ljava/lang/String;
    .locals 3

    .line 121
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%02d:%02d:%02d"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(format, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final onCreate$lambda-0(Lcom/example/summer/MainActivity;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-direct {p0}, Lcom/example/summer/MainActivity;->startStopTimer()V

    return-void
.end method

.method private static final onCreate$lambda-1(Lcom/example/summer/MainActivity;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Lcom/example/summer/MainActivity;->resetTimer()V

    return-void
.end method

.method private static final onCreate$lambda-2(Lcom/example/summer/MainActivity;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object p1, p0, Lcom/example/summer/MainActivity;->serviceIntent:Landroid/content/Intent;

    if-nez p1, :cond_0

    const-string p1, "serviceIntent"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/example/summer/MainActivity;->checkTime(Landroid/content/Intent;)V

    return-void
.end method

.method private final resetTimer()V
    .locals 3

    const v0, 0x7f0800a0

    .line 69
    invoke-virtual {p0, v0}, Lcom/example/summer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(R.id.fan_higher)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    .line 70
    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 71
    invoke-direct {p0}, Lcom/example/summer/MainActivity;->stopTimer()V

    const-wide/16 v0, 0x0

    .line 72
    iput-wide v0, p0, Lcom/example/summer/MainActivity;->time:D

    .line 73
    iget-object v0, p0, Lcom/example/summer/MainActivity;->binding:Lcom/example/summer/databinding/ActivityMainBinding;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Lcom/example/summer/databinding/ActivityMainBinding;->timeTV:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/example/summer/MainActivity;->time:D

    invoke-direct {p0, v1, v2}, Lcom/example/summer/MainActivity;->getTimeStringFromDouble(D)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final startStopTimer()V
    .locals 3

    const v0, 0x7f0800a0

    .line 77
    invoke-virtual {p0, v0}, Lcom/example/summer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(R.id.fan_higher)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    .line 78
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const v2, 0x7f01001d

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 79
    iget-boolean v2, p0, Lcom/example/summer/MainActivity;->timerStarted:Z

    if-eqz v2, :cond_0

    .line 80
    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 81
    invoke-direct {p0}, Lcom/example/summer/MainActivity;->stopTimer()V

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    .line 84
    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 85
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 86
    invoke-direct {p0}, Lcom/example/summer/MainActivity;->startTimer()V

    :goto_0
    return-void
.end method

.method private final startTimer()V
    .locals 6

    .line 91
    iget-object v0, p0, Lcom/example/summer/MainActivity;->serviceIntent:Landroid/content/Intent;

    const-string v1, "serviceIntent"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    iget-wide v3, p0, Lcom/example/summer/MainActivity;->time:D

    const-string v5, "timeExtra"

    invoke-virtual {v0, v5, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 92
    iget-object v0, p0, Lcom/example/summer/MainActivity;->serviceIntent:Landroid/content/Intent;

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    invoke-virtual {p0, v0}, Lcom/example/summer/MainActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 93
    iget-object v0, p0, Lcom/example/summer/MainActivity;->binding:Lcom/example/summer/databinding/ActivityMainBinding;

    const-string v1, "binding"

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    iget-object v0, v0, Lcom/example/summer/databinding/ActivityMainBinding;->startStopButton:Lcom/google/android/material/button/MaterialButton;

    const-string v3, "Stop"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v3}, Lcom/google/android/material/button/MaterialButton;->setText(Ljava/lang/CharSequence;)V

    .line 94
    iget-object v0, p0, Lcom/example/summer/MainActivity;->binding:Lcom/example/summer/databinding/ActivityMainBinding;

    if-nez v0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, v0

    :goto_0
    iget-object v0, v2, Lcom/example/summer/databinding/ActivityMainBinding;->startStopButton:Lcom/google/android/material/button/MaterialButton;

    const v1, 0x7f070067

    invoke-virtual {p0, v1}, Lcom/example/summer/MainActivity;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setIcon(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x1

    .line 95
    iput-boolean v0, p0, Lcom/example/summer/MainActivity;->timerStarted:Z

    return-void
.end method

.method private final stopTimer()V
    .locals 4

    .line 99
    iget-object v0, p0, Lcom/example/summer/MainActivity;->serviceIntent:Landroid/content/Intent;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "serviceIntent"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {p0, v0}, Lcom/example/summer/MainActivity;->stopService(Landroid/content/Intent;)Z

    .line 100
    iget-object v0, p0, Lcom/example/summer/MainActivity;->binding:Lcom/example/summer/databinding/ActivityMainBinding;

    const-string v2, "binding"

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    iget-object v0, v0, Lcom/example/summer/databinding/ActivityMainBinding;->startStopButton:Lcom/google/android/material/button/MaterialButton;

    const-string v3, "Start"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v3}, Lcom/google/android/material/button/MaterialButton;->setText(Ljava/lang/CharSequence;)V

    .line 101
    iget-object v0, p0, Lcom/example/summer/MainActivity;->binding:Lcom/example/summer/databinding/ActivityMainBinding;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    iget-object v0, v1, Lcom/example/summer/databinding/ActivityMainBinding;->startStopButton:Lcom/google/android/material/button/MaterialButton;

    const v1, 0x7f070068

    invoke-virtual {p0, v1}, Lcom/example/summer/MainActivity;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setIcon(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x0

    .line 102
    iput-boolean v0, p0, Lcom/example/summer/MainActivity;->timerStarted:Z

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 27
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    invoke-virtual {p0}, Lcom/example/summer/MainActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lcom/example/summer/databinding/ActivityMainBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/example/summer/databinding/ActivityMainBinding;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/example/summer/MainActivity;->binding:Lcom/example/summer/databinding/ActivityMainBinding;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-nez p1, :cond_0

    .line 29
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, Lcom/example/summer/databinding/ActivityMainBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/example/summer/MainActivity;->setContentView(Landroid/view/View;)V

    const p1, 0x7f0800a8

    .line 30
    invoke-virtual {p0, p1}, Lcom/example/summer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 32
    iget-object v2, p0, Lcom/example/summer/MainActivity;->binding:Lcom/example/summer/databinding/ActivityMainBinding;

    if-nez v2, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v0

    :cond_1
    iget-object v2, v2, Lcom/example/summer/databinding/ActivityMainBinding;->startStopButton:Lcom/google/android/material/button/MaterialButton;

    new-instance v3, Lcom/example/summer/MainActivity$$ExternalSyntheticLambda2;

    invoke-direct {v3, p0}, Lcom/example/summer/MainActivity$$ExternalSyntheticLambda2;-><init>(Lcom/example/summer/MainActivity;)V

    invoke-virtual {v2, v3}, Lcom/google/android/material/button/MaterialButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    iget-object v2, p0, Lcom/example/summer/MainActivity;->binding:Lcom/example/summer/databinding/ActivityMainBinding;

    if-nez v2, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_0
    iget-object v0, v0, Lcom/example/summer/databinding/ActivityMainBinding;->resetButton:Lcom/google/android/material/button/MaterialButton;

    new-instance v1, Lcom/example/summer/MainActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/example/summer/MainActivity$$ExternalSyntheticLambda0;-><init>(Lcom/example/summer/MainActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/example/summer/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/example/summer/TimerService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/example/summer/MainActivity;->serviceIntent:Landroid/content/Intent;

    .line 36
    new-instance v0, Lcom/example/summer/MainActivity$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/example/summer/MainActivity$$ExternalSyntheticLambda1;-><init>(Lcom/example/summer/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    iget-object p1, p0, Lcom/example/summer/MainActivity;->updateTime:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "timerUpdated"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/example/summer/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method
