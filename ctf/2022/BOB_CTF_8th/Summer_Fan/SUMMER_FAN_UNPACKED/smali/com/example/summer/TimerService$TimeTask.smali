.class final Lcom/example/summer/TimerService$TimeTask;
.super Ljava/util/TimerTask;
.source "TimerService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/summer/TimerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "TimeTask"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/example/summer/TimerService$TimeTask;",
        "Ljava/util/TimerTask;",
        "time",
        "",
        "(Lcom/example/summer/TimerService;D)V",
        "run",
        "",
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
.field final synthetic this$0:Lcom/example/summer/TimerService;

.field private time:D


# direct methods
.method public constructor <init>(Lcom/example/summer/TimerService;D)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iput-object p1, p0, Lcom/example/summer/TimerService$TimeTask;->this$0:Lcom/example/summer/TimerService;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    iput-wide p2, p0, Lcom/example/summer/TimerService$TimeTask;->time:D

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 26
    new-instance v0, Landroid/content/Intent;

    const-string v1, "timerUpdated"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 27
    iget-wide v1, p0, Lcom/example/summer/TimerService$TimeTask;->time:D

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    add-double/2addr v1, v3

    iput-wide v1, p0, Lcom/example/summer/TimerService$TimeTask;->time:D

    const-string v3, "timeExtra"

    .line 28
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 29
    iget-object v1, p0, Lcom/example/summer/TimerService$TimeTask;->this$0:Lcom/example/summer/TimerService;

    invoke-virtual {v1, v0}, Lcom/example/summer/TimerService;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
