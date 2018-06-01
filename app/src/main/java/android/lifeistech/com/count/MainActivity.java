package android.lifeistech.com.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.lifeistech.com.count.R.id.textView;
import static android.lifeistech.com.count.R.id.textView2;
import static android.lifeistech.com.count.R.id.textView3;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    TextView textview2;
    TextView textview3;

    int count;
    int count2;
    int count3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView)findViewById(textView);
        count = 0;

        textview2 = (TextView)findViewById(textView2);
        count2 = 0;

        textview3 = (TextView)findViewById(textView3);
        count3 = 0;
    }



 public void add(View v) {
     count = count + 1;

     textview.setText(count + "回ボタンが押されました");
 }


   public void minus(View v){
        count = count - 1;

        textview.setText(count + "回ボタンが押されました");
    }

 public void add1(View v){
    count2 = count2 + 1;

    textview2.setText(count2+"回ボタンが押されました");

}
  public void add3(View v){
      count3 = count + count2;

      textview3.setText(count3 + "回ボタンが押されました");

  }
       }
