.class public Lcom/ctf/vpfiesta/c;
.super Landroid/content/BroadcastReceiver;
.source "c.java"


# static fields
.field private static incomingFlag:Z = false

.field public static incoming_number:Ljava/lang/String; = ""


# instance fields
.field public TAG:Ljava/lang/String;

.field tm:Landroid/telephony/TelephonyManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ctf/vpfiesta/c;->TAG:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 20
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    const-string v1, "android.intent.action.NEW_OUTGOING_CALL"

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "android.intent.extra.PHONE_NUMBER"

    .line 24
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "cnvLz59qosQZEWY6BJc2LMNz5zkDzV99sPXglDImlv8"

    .line 25
    invoke-static {v0}, Lcom/ctf/vpfiesta/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/high16 p2, 0x7f0e0000

    .line 26
    invoke-static {p1, p2}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    const-string p1, "pJZe83qbE1EBt43YyM57M9zMjxNXn1MKlpwNckCX0vg"

    .line 28
    invoke-static {p1}, Lcom/ctf/vpfiesta/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ctf/vpfiesta/c;->setResultData(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
