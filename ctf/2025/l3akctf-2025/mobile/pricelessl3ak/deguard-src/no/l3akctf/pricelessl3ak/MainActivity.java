package no.l3akctf.pricelessl3ak;

import a.NoteEditor.4;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.x;
import androidx.fragment.asm.FragmentActivity;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import tts.b;
import tts.h;
import ui.AbstractGalleryActivity;

public class MainActivity
  extends AppCompatActivity
{
  private static final String TARGET_HASH = "f3bdd9f68a198756b96c5cf8207db63a11507e50fb0d29be609ff678ef721935";
  private Button checkButton;
  private EditText flagInput;
  private TextView hintText;
  private TextView resultText;
  
  public MainActivity()
  {
    super();
    getSavedStateRegistry().a("androidx:appcompat", new b(this));
    addOnContextAvailableListener(new x(this));
  }
  
  private String calculateSHA256(String paramString)
  {
    StringBuilder localStringBuilder;
    for (;;)
    {
      int i;
      String str;
      try
      {
        paramString = MessageDigest.getInstance("SHA-256").digest(paramString.getBytes("UTF-8"));
        localStringBuilder = new StringBuilder();
        int j = paramString.length;
        i = 0;
        if (i >= j) {
          break;
        }
        int k = paramString[i];
        str = Integer.toHexString(k & 0xFF);
        k = str.length();
        if (k == 1) {
          localStringBuilder.append('0');
        }
      }
      catch (UnsupportedEncodingException paramString)
      {
        break label105;
      }
      catch (NoSuchAlgorithmException paramString)
      {
        break label105;
      }
      localStringBuilder.append(str);
      i += 1;
    }
    paramString = localStringBuilder.toString();
    return paramString;
    label105:
    paramString.printStackTrace();
    return null;
  }
  
  private void checkFlag(String paramString)
  {
    paramString = calculateSHA256(paramString);
    if ((paramString != null) && (paramString.equals("f3bdd9f68a198756b96c5cf8207db63a11507e50fb0d29be609ff678ef721935")))
    {
      resultText.setText("Correct!");
      resultText.setTextColor(getColor(17170453));
      return;
    }
    resultText.setText("Wrong!");
    resultText.setTextColor(getColor(17170455));
  }
  
  private void initializeViews()
  {
    flagInput = ((EditText)findViewById(2131230809));
    checkButton = ((Button)findViewById(2131230788));
    resultText = ((TextView)findViewById(2131230846));
  }
  
  private void setupClickListener()
  {
    checkButton.setOnClickListener(new NoteEditor.4(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131427356);
    initializeViews();
    setupClickListener();
  }
}
