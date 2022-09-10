.class public final Lcom/example/summer/MainActivity$updateTime$1;
.super Landroid/content/BroadcastReceiver;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/summer/MainActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/example/summer/MainActivity$updateTime$1",
        "Landroid/content/BroadcastReceiver;",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
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
.field final synthetic this$0:Lcom/example/summer/MainActivity;


# direct methods
.method constructor <init>(Lcom/example/summer/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/example/summer/MainActivity$updateTime$1;->this$0:Lcom/example/summer/MainActivity;

    .line 105
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    iget-object p1, p0, Lcom/example/summer/MainActivity$updateTime$1;->this$0:Lcom/example/summer/MainActivity;

    const-string v0, "timeExtra"

    const-wide/16 v1, 0x0

    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/example/summer/MainActivity;->access$setTime$p(Lcom/example/summer/MainActivity;D)V

    .line 108
    iget-object p1, p0, Lcom/example/summer/MainActivity$updateTime$1;->this$0:Lcom/example/summer/MainActivity;

    invoke-static {p1}, Lcom/example/summer/MainActivity;->access$getBinding$p(Lcom/example/summer/MainActivity;)Lcom/example/summer/databinding/ActivityMainBinding;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    iget-object p1, p1, Lcom/example/summer/databinding/ActivityMainBinding;->timeTV:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/example/summer/MainActivity$updateTime$1;->this$0:Lcom/example/summer/MainActivity;

    invoke-static {p2}, Lcom/example/summer/MainActivity;->access$getTime$p(Lcom/example/summer/MainActivity;)D

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lcom/example/summer/MainActivity;->access$getTimeStringFromDouble(Lcom/example/summer/MainActivity;D)Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
