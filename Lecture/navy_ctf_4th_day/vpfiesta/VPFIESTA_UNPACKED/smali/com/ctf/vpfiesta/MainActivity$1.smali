.class Lcom/ctf/vpfiesta/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ctf/vpfiesta/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ctf/vpfiesta/MainActivity;


# direct methods
.method constructor <init>(Lcom/ctf/vpfiesta/MainActivity;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ctf/vpfiesta/MainActivity$1;->this$0:Lcom/ctf/vpfiesta/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 40
    iget-object p1, p0, Lcom/ctf/vpfiesta/MainActivity$1;->this$0:Lcom/ctf/vpfiesta/MainActivity;

    invoke-static {p1}, Lcom/ctf/vpfiesta/MainActivity;->access$000(Lcom/ctf/vpfiesta/MainActivity;)V

    .line 41
    iget-object p1, p0, Lcom/ctf/vpfiesta/MainActivity$1;->this$0:Lcom/ctf/vpfiesta/MainActivity;

    invoke-virtual {p1}, Lcom/ctf/vpfiesta/MainActivity;->finish()V

    return-void
.end method
