package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public abstract class ImageHelper
{
  public static TextClassifier showError(TextView paramTextView)
  {
    paramTextView = (TextClassificationManager)paramTextView.getContext().getSystemService(TextClassificationManager.class);
    if (paramTextView != null) {
      return paramTextView.getTextClassifier();
    }
    return TextClassifier.NO_OP;
  }
}
