.class public Lcom/ctf/vpfiesta/MainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "MainActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ctf/vpfiesta/MainActivity;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ctf/vpfiesta/MainActivity;->b()V

    return-void
.end method

.method private b()V
    .locals 3

    .line 55
    new-instance v0, Landroid/content/Intent;

    const-string v1, "1EdAkZde6PDV21Yk-35MX13teAnNmMt7eZRBCBhpsgA"

    invoke-static {v1}, Lcom/ctf/vpfiesta/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "android.intent.action.CALL"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 57
    invoke-virtual {p0}, Lcom/ctf/vpfiesta/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "android.permission.CALL_PHONE"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    .line 58
    invoke-virtual {p0, v0}, Lcom/ctf/vpfiesta/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 60
    :cond_0
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/ctf/vpfiesta/MainActivity;->requestPermissions([Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method private cc()V
    .locals 3

    .line 64
    new-instance v0, Lcom/ctf/vpfiesta/c;

    invoke-direct {v0}, Lcom/ctf/vpfiesta/c;-><init>()V

    .line 65
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "android.intent.action.NEW_OUTGOING_CALL"

    .line 66
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "android.intent.extra.PHONE_NUMBER"

    .line 67
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p0, v0, v1}, Lcom/ctf/vpfiesta/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 30
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b001c

    .line 31
    invoke-virtual {p0, p1}, Lcom/ctf/vpfiesta/MainActivity;->setContentView(I)V

    .line 32
    invoke-direct {p0}, Lcom/ctf/vpfiesta/MainActivity;->cc()V

    const-string p1, "android.permission.PROCESS_OUTGOING_CALLS"

    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 33
    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x64

    invoke-static {p0, p1, v0}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    const p1, 0x7f080057

    .line 34
    invoke-virtual {p0, p1}, Lcom/ctf/vpfiesta/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 36
    new-instance v0, Lcom/ctf/vpfiesta/MainActivity$1;

    invoke-direct {v0, p0}, Lcom/ctf/vpfiesta/MainActivity$1;-><init>(Lcom/ctf/vpfiesta/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 49
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    return-void
.end method
