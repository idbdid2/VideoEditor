package com.example.helloworld;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Video Editor");
        tv.setTextSize(24);
        tv.setGravity(Gravity.CENTER);
        setContentView(tv);
    }
}
