package ctf.l3akctf.pricelessl3ak;

import Q.a;
import X.d;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.j;
import androidx.appcompat.app.k;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends k {
   private static final String TARGET_HASH = "f3bdd9f68a198756b96c5cf8207db63a11507e50fb0d29be609ff678ef721935";
   private Button checkButton;
   private EditText flagInput;
   private TextView hintText;
   private TextView resultText;

   public MainActivity() {
      this.getSavedStateRegistry().c("androidx:appcompat", new a(this));
      this.addOnContextAvailableListener(new j(this));
   }

   private String calculateSHA256(String var1) {
      Object var15;
      label55: {
         NoSuchAlgorithmException var16;
         label54: {
            UnsupportedEncodingException var10000;
            label57: {
               int var3;
               byte[] var5;
               StringBuilder var14;
               boolean var10001;
               try {
                  var5 = MessageDigest.getInstance("SHA-256").digest(var1.getBytes("UTF-8"));
                  var14 = new StringBuilder();
                  var3 = var5.length;
               } catch (NoSuchAlgorithmException var12) {
                  var16 = var12;
                  var10001 = false;
                  break label54;
               } catch (UnsupportedEncodingException var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label57;
               }

               int var2 = 0;

               while(true) {
                  if (var2 >= var3) {
                     try {
                        var1 = var14.toString();
                        return var1;
                     } catch (NoSuchAlgorithmException var6) {
                        var16 = var6;
                        var10001 = false;
                        break label54;
                     } catch (UnsupportedEncodingException var7) {
                        var10000 = var7;
                        var10001 = false;
                        break;
                     }
                  }

                  String var4;
                  try {
                     var4 = Integer.toHexString(var5[var2] & 255);
                     if (var4.length() == 1) {
                        var14.append('0');
                     }
                  } catch (NoSuchAlgorithmException var10) {
                     var16 = var10;
                     var10001 = false;
                     break label54;
                  } catch (UnsupportedEncodingException var11) {
                     var10000 = var11;
                     var10001 = false;
                     break;
                  }

                  try {
                     var14.append(var4);
                  } catch (NoSuchAlgorithmException var8) {
                     var16 = var8;
                     var10001 = false;
                     break label54;
                  } catch (UnsupportedEncodingException var9) {
                     var10000 = var9;
                     var10001 = false;
                     break;
                  }

                  ++var2;
               }
            }

            var15 = var10000;
            break label55;
         }

         var15 = var16;
      }

      ((Throwable)var15).printStackTrace();
      return null;
   }

   private void checkFlag(String var1) {
      var1 = this.calculateSHA256(var1);
      if (var1 != null && var1.equals("f3bdd9f68a198756b96c5cf8207db63a11507e50fb0d29be609ff678ef721935")) {
         this.resultText.setText("Correct!");
         this.resultText.setTextColor(this.getColor(17170453));
      } else {
         this.resultText.setText("Wrong!");
         this.resultText.setTextColor(this.getColor(17170455));
      }

   }

   // $FF: synthetic method
   public static void d(MainActivity var0, View var1) {
      var0.lambda$setupClickListener$0(var1);
   }

   private void initializeViews() {
      this.flagInput = (EditText)this.findViewById(2131230809);
      this.checkButton = (Button)this.findViewById(2131230788);
      this.resultText = (TextView)this.findViewById(2131230846);
   }

   // $FF: synthetic method
   private void lambda$setupClickListener$0(View var1) {
      String var2 = this.flagInput.getText().toString().trim();
      if (!var2.isEmpty()) {
         this.checkFlag(var2);
      }

   }

   private void setupClickListener() {
      this.checkButton.setOnClickListener(new d(this));
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2131427356);
      this.initializeViews();
      this.setupClickListener();
   }
}
